package advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*
 * 이번 문제에서는 어떤 출력값도 나오면 안됨
 * 
 * 객체지향에서 중요한 개념은 open/closed principle임
 * 	which means writing code that is open to extension 
 * 	but closed to modification
 * In other words, new functionality should be added 
 * 	by writing an extension for the existing code 
 * 	rather then modifying it 
 * 	and potentially breaking other code that uses it
 * 
 * Visitor Design Pattern을 활용해볼 거
 * 
 * Part 1 : Impelment Three Different Visitors
 * 	getResult()
 * 		SumInLeavesVisitor
 * 		ProductRedNodesVisitor
 * 		FancyVisitor
 * 	visitNode(TreeNode node)
 * 	visitLeaft(TreeLeaf leaf)
 * 
 * Part 2 : Read and Build the Tree
 * 
 * 2 <= n <= 10^5	트리에서 노드의 수
 * 1 <= xi <= 10^3	노드의 value
 * ci <= {0,1}	노드의 컬러 (0 red 1 green)
 * 1 <= vi,ui <= n	(ui vi 노드들의 edge)
 * rooted at node 1을 보장
 */

/*
 * 어려워서 풀이보면서 문제 해결
 * 추후에 다시 풀어보던지 해야함 
 * 오랜만에 DFS (재귀호출) 만남 익숙해질 필요 있음
 */

enum Color {
	RED, GREEN
}

abstract class Tree {
	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public int getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
	private ArrayList<Tree> children = new ArrayList<>();

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitNode(this);

		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
}

class TreeLeaf extends Tree {
	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {

	int sumInLeaves = 0;

	@Override
	public int getResult() {
		return sumInLeaves;
	}

	@Override
	public void visitNode(TreeNode node) {
		// empty return
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		sumInLeaves += leaf.getValue();
	}

}

class ProductOfRedNodesVisitor extends TreeVis {

	long productOfRedNodes = 1L;

	void multiply(Tree tree) {
		if (tree.getColor() == Color.RED)
			productOfRedNodes = (productOfRedNodes * tree.getValue()) % (1000000007);
	}

	@Override
	public int getResult() {
		return (int) (productOfRedNodes);
	}

	@Override
	public void visitNode(TreeNode node) {
		multiply(node);
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		multiply(leaf);
	}

}

class FancyVisitor extends TreeVis {
	int sumOfValuesNonLeafEvenDepth = 0;
	int sumOfValuesGreenLeaf = 0;

	@Override
	public int getResult() {
		return Math.abs(sumOfValuesGreenLeaf - sumOfValuesNonLeafEvenDepth);
	}

	@Override
	public void visitNode(TreeNode node) {
		if (node.getDepth() % 2 != 0)
			return;
		sumOfValuesNonLeafEvenDepth += node.getValue();
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		if (leaf.getColor() != Color.GREEN)
			return;
		sumOfValuesGreenLeaf += leaf.getValue();
	}

}

public class JavaVisitorPattern {
	static Map<Integer, Tree> tree = new HashMap<>();

	public static Tree solve() {
		// read the tree from STDIN
		// and return its root as a return value of this function
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// node의 value와 color를 담는 map 자료구조
		Map<Integer, Object[]> nodeAtts = new HashMap<Integer, Object[]>();

		for (int i = 0; i < n; i++)
			nodeAtts.put(i + 1, new Object[] { sc.nextInt(), null });

		for (int i = 0; i < n; i++)
			nodeAtts.get(i + 1)[1] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;

		Map<Integer, ArrayList<Integer>> edges = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 1; i <= n; i++)
			edges.put(i, new ArrayList<Integer>());

		for (int i = 1; i < n; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			edges.get(u).add(v);
			edges.get(v).add(u);
		}

		sc.close();
		
		Tree root = new TreeNode((Integer) nodeAtts.get(1)[0], (Color) nodeAtts.get(1)[1], 0);
		tree.put(1, root);

		DFS(n, edges, nodeAtts);
		return tree.get(1);
	}

	private static void DFS(int n, Map<Integer, ArrayList<Integer>> edges, Map<Integer, Object[]> nodeAtts) {
		boolean[] visited = new boolean[n + 1];
		TreeNode parent = (TreeNode) tree.get(1);
		DFSUtil(parent, 1, visited, edges, nodeAtts);
	}

	private static void DFSUtil(TreeNode parent, int v, boolean[] visited, 
			Map<Integer, ArrayList<Integer>> edges,
			Map<Integer, Object[]> nodeAtts) {
		visited[v] = true;
		if(edges.get(v).size() == 1 && v != 1) {
			TreeLeaf treeLeaf = new TreeLeaf(
					(Integer) nodeAtts.get(v)[0],
					(Color) nodeAtts.get(v)[1],
					parent.getDepth() + 1);
			parent.addChild(treeLeaf);
			tree.put(v, treeLeaf);
			return;
		}
		
		TreeNode treeNode;
		if(v != 1) {
			treeNode = new TreeNode(
					(Integer) nodeAtts.get(v)[0],
					(Color) nodeAtts.get(v)[1],
					parent.getDepth() + 1);
			parent.addChild(treeNode);
			tree.put(v, treeNode);
					
		}
		else
			treeNode = (TreeNode) tree.get(1);
		
		Iterator<Integer> iterator = edges.get(v).iterator();
		while(iterator.hasNext()) {
			int n = iterator.next();
			if(!visited[n]) {
				DFSUtil(treeNode, n, visited, edges, nodeAtts);
			}
		}
	}

	public static void main(String[] args) {
		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}

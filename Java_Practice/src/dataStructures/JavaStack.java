package dataStructures;

import java.util.Scanner;
import java.util.Stack;

/*
 * In computer science, a stack or LIFO (last in, first out) 
 * 	is an abstract data type that serves as a collection of elements,
 * 	with two principal operations: 
 * 	push, which adds an element to the collection,
 * 	and pop, which removes the last element that was added. (Wikipedia)
 * 
 * parentheses 괄호
 * 	 
 * 괄호가 올바르게 되었는지 스택으로 확인하기
 * ex)
 * {}() [{()}] ({()})
 * 
 * end-of-file까지 읽어야함
 * string 받아서 balanced하면 true 아니면 false 출력
 */

public class JavaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();

			Stack<Character> stack = new Stack<>();

			boolean isBalanced = true;
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				switch (c) {
				case '[': // 대괄호
				case '{': // 중괄호
				case '(': // 소괄호
					stack.push(c);
					break;
				case ']':
				case '}':
				case ')':
					if (stack.isEmpty())
						isBalanced = false;
					else if ((c == ']' && stack.peek() == '[') || 
							(c == '}' && stack.peek() == '{') || 
							(c == ')' && stack.peek() == '('))
						stack.pop();
					else
						isBalanced = false;
					break;
				}
				if (isBalanced == false)
					break;
			}
			if (stack.isEmpty() == false)
				isBalanced = false;

			System.out.println(isBalanced ? "true" : "false");

		}
	}

}
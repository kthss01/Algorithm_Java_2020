package introduction;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kay
 * End Of File (commonly abbreviated EOF) is a condition in a computer operating system
 * where no more data can be read from a data source
 * 
 * read n lines of input until you reach EOF, then number and print all n lines of content.
 * 	Hint: Java's Scanner.hasNext() method is helpful for this problem
 * 
 * Input 
 * 	n lines
 * Output
 * 	print the line number, followed by a single space, 
 * 	and then the line content received as input
 * 
 * ex)
 * 	Hello world
 *	I am a file
 *	Read me until end-of-file.
 *
 *	1 Hello world
 *	2 I am a file
 *	3 Read me until end-of-file.
 * 
 */

public class End_Of_File {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> str = new ArrayList<String>();
		
		while (scan.hasNext())
		{
			str.add(scan.nextLine());
		}
		
		for (int i = 0; i < str.size(); i++) {
			System.out.printf(i+1 + " %s\n", str.get(i));
		}
		
		scan.close();
	}

}

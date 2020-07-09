package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * In computer science, a priority queue is an abstract data type 
 * 	which is like a regular queue, 
 * but where additionally each element has a "priority" associated with it.
 * In a priority queue, 
 * 	an element with high priority 
 * 	is served before an element with low priority. - wikipedia
 * 
 * 우선순위 큐 써볼 것
 * 
 * 문제
 * 학교의 수 많은 학생들이 served(급식, 배식) 를 기다리고 있음
 * Two types of events
 * ENTER SERVED
 * 
 * ENTER : A student with some priority enters the queue to be served.
 * SERVED : The student with highest priority is served (removed) from queue.
 * 
 * A unique id is assigned to each student entering the queue.
 * The queue serves the students based on the following criteria (priority criteria)
 * 
 * 우선순위는 다음과 같음
 * 	the highest Cumulative Grade Point Average(CGPA) is served first
 * 	Any students having the same CGPA will be served by name in
 * 		ascending case-sensitive alphabetical order.
 * 	Any students having the same CGPA and name will be served in
 * 		ascending order of the id.
 * 
 * 2 <= n <= 1000
 * 0 <= CGPA <= 4.00
 * 1 <= id <= 10^5
 * 2 <= |name| <= 30
 * 
 * 만약 SERVED 했는데 Queue 비어잇으면 EMPTY 출력
 */

class Student2 {
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	int id;
	String name;
	double cgpa;

	Student2(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
}

class Priorities {

}

public class JavaPriorityQueue {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student2> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student2 st : students) {
				System.out.println(st.getName());
			}
		}
	}

}

package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

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

class StudentComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if (o1.getCgpa() == o2.getCgpa()) {
			if (o1.getName().equals(o2.getName())) {
				// 오름차순
				return Integer.compare(o1.getId(), o2.getId());
			}
			// 알파벳순
			return o1.getName().compareTo(o2.getName());
		} else {
			// 내림차순
			return Double.compare(o2.getCgpa(), o1.getCgpa());
		}
	}

}

class Priorities {
	public List<Student2> getStudents(List<String> events) {
		
//		PriorityQueue<Student2> pq = new PriorityQueue<Student2>(events.size(), new StudentComparator());
		// 방법2
		PriorityQueue<Student2> pq = new PriorityQueue<>(
				Comparator.comparing(Student2::getCgpa).reversed()
				.thenComparing(Student2::getName)
				.thenComparing(Student2::getId));
		
		for (String event : events) {
			String parts[] = event.split(" ");
			
			if(parts[0].equals("ENTER")) {
				Student2 stu = new Student2(
						Integer.parseInt(parts[3]), 
						parts[1], 
						Double.parseDouble(parts[2]));
				pq.add(stu);
			} else {
				if(!pq.isEmpty()) {
					pq.poll();
				}
			}
		}
		
		List<Student2> students = new ArrayList<>();
		while(!pq.isEmpty()) {
			students.add(pq.poll());
		}
		
		return students;
	}
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
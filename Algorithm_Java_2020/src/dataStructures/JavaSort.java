package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 학생 정보 리스트를 받을 때 (ID, FirstName, and CGPA) 
 * CGPA (cumulative(누적) gpa 즉 총 평점)
 * CGPA에 따라 내림차순으로 정렬해야함
 * 	만약 두 학생의 CGPA가 같으면 이름 알파벳 순으로 정렬
 * 	만약 두 학생의 성까지 같으면 ID로 정렬
 * 	(ID는 같을 수 없음)
 * 	
 * 	You cans use comparators to sort a list of objects
 * 
 * 2 <= N <= 1000 학생 수
 * 	ID Name CGPA 순으로 입력 받음
 * 	0 <= ID <= 100000 ID contains only integer numbers without leading zeros
 *  5 <= |Name| <= 30 name contains only lowercase English letters
 *  0 <= CGPA <= 4.00 CGPA contain at most, 2 digits after the decimal point
 *  
 *  이름 쭉 출력
 * ex)
 * 5
 * 33 Rumpa 3.68
 * 85 Ashis 3.85
 * 56 Samiha 3.75
 * 19 Samara 3.75
 * 22 Fahim 3.76
 *  	
 * Ashis
 * Fahim
 * Samara
 * Samiha
 * Rumpa
 */

class Student implements Comparable {
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	@Override
	public int compareTo(Object obj) {
		Student otherSt = (Student) obj;

		// 이건 오름차순 내림차순은 반대로
//		if (this.cgpa != otherSt.cgpa)
//			return Double.compare(cgpa, otherSt.getCgpa());
//		else if (this.fname != otherSt.getFname()) {
//			return fname.compareTo(otherSt.getFname());
//		} else
//			return Integer.compare(id, getId());
		if (this.cgpa != otherSt.cgpa)
			return Double.compare(otherSt.getCgpa(), cgpa);
		else if (this.fname != otherSt.getFname()) {
			return fname.compareTo(otherSt.getFname());
		} else
			return Integer.compare(getId(), id);
	}

}

public class JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList);

		for (Student student : studentList) {
			System.out.println(student.getFname());
		}
	}

}

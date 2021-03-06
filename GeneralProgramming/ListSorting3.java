package GeneralProgramming;
import java.util.ArrayList;
import java.util.Collections;

//we sort an ArrayList of Student objects. To do this, Student class must implement Comparable interface and override compareTo() method
// Sort An ArrayList Of Custom Objects

public class ListSorting3 {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(123, "Student1", 62));
		listOfStudents.add(new Student(231, "Student2", 81));
		listOfStudents.add(new Student(85, "Student3", 79));
		listOfStudents.add(new Student(478, "Student4", 94));
		listOfStudents.add(new Student(365, "Student5", 62));
		System.out.println("listOfStudents Before Sorting :");
		System.out.println(listOfStudents);
		Collections.sort(listOfStudents);
		System.out.println("listOfStudents After Sorting :");
		System.out.println(listOfStudents);
	}
}

class Student implements Comparable<Student> {
	int id;
	String name;
	int percentage;

	public Student(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student s) {
		return this.id - s.id; // Sorts the objects in ascending order
		// return s.id - this.id; //Sorts the objects in descending order
	}

	@Override
	public String toString() {
		return "{ID : " + id + ", Name : " + name + ", Percentage : " + percentage + "}";
	}
}
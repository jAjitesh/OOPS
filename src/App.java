import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


public class App {

	public static void main(String[] args) {
		
		//ArrayList<Student> students = new ArrayList<Student>(); // Array list or linkedlist -> know which one to use when
		HashSet<Student> students = new HashSet<Student>();
		
		students.add(new Student("Bob", "CS", "0000", 25));
		students.add(new Student("Mary", "CS", "1111", 27));
		students.add(new Student("John", "CS", "2222", 21));
		students.add(new Student("Joey", "CS", "3333", 22));
		students.add(new Student("Ross", "CS", "4444", 24));
		students.add(new Student("Ross", "CS", "4444", 24));
		students.add(new Student("Ross", "CS", "4444", 24));
		//Collections.sort(students);
	 
		
		for(Student s: students){
		 System.out.println(s.toString());
	 }
	 
	 
	 
	}

}

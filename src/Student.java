
public class Student implements Comparable<Student> {
String name, department, id;
int age;
public Student(String name, String department, String id, int age) {
	super();
	this.name = name;
	this.department = department;
	this.id = id;
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", department=" + department + ", id="
			+ id + ", age=" + age + "]";
}
@Override
public int compareTo(Student o) {
	if(this.age > o.age){
		return 1;
	}
	else if(this.age < o.age){
		return -1;
	}
	return 0;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}

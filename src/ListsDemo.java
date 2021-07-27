import java.util.ArrayList;
import java.util.List;

class Student
{
	private String id;
	private String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}


public class ListsDemo 
{
	public static void main(String[] args) 
	{
		List ar=new ArrayList(); //List:interface, ArrayList():class
		Student s1=new Student("S001","Anna");
		Student s2=new Student("S002","Ram");
		ar.add(s1);
		ar.add(s2);
		System.out.println(ar);
	}

}
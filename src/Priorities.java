import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
	public List<Student> getStudents(List<String> events){
		PriorityQueue < Student > studentPQ = new PriorityQueue(Comparator.comparing(
				Student::getCgpa).reversed().
				thenComparing(Student::getName).
				thenComparing(Student::getId));
		
		List <Student> studentList = new ArrayList <Student>();
		String[] strArray = new String[4];
		
		 for (String line: events)	{	
				try {
					strArray = line.split(" ");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				String event = strArray[0];
				if (event.equals("ENTER")) {
					String name = strArray[1];
					Double cgpa = Double.parseDouble(strArray[2]);
					int id = Integer.parseInt(strArray[3]);

					Student student = new Student(id, name, cgpa);
					studentPQ.add(student);
					
				} else if (event.equals("SERVED")) {
					Student first = studentPQ.poll();
					studentPQ.remove(first);			
				} 
			}
			
		    Student student = studentPQ.poll();
			while (student != null) {
				    studentList.add(student);
					student = studentPQ.poll();
			}
		   		
		return studentList;
	}
}

class Student {
	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.name = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
}

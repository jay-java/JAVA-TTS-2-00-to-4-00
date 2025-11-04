package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student1 {
	@Id
	private int id;
	private String name;
	private long contact;

	@ManyToMany
	private List<Course1> courses;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<Course1> getCourses() {
		return courses;
	}

	public void setCourses(List<Course1> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", contact=" + contact + ", courses=" + courses + "]";
	}

}

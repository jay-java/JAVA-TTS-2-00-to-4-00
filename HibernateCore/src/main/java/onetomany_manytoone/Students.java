package onetomany_manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Students {

	@Id
	private int sid;
	private String name;

	@OneToMany
	private List<Courses> courses;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", courses=" + courses + "]";
	}

}

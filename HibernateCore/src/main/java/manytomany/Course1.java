package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course1 {
	@Id
	private int cid;
	private String cname;

	@ManyToMany
	private List<Student1> students;

	public Course1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course1(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student1> getStudents() {
		return students;
	}

	public void setStudents(List<Student1> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course1 [cid=" + cid + ", cname=" + cname + ", students=" + students + "]";
	}

}

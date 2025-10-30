package onetomany_manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses {

	@Id
	private int cid;
	private String cname;
	@ManyToOne
	private Students student;

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

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", student=" + student + "]";
	}

}

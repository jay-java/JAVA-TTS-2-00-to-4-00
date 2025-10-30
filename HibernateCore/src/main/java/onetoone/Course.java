package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	private String cduration;
	private long fees;
	@OneToOne
	@JoinColumn(name = "student_id")
	private Student sid;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, String cduration, long fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
		this.fees = fees;
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

	public String getCduration() {
		return cduration;
	}

	public void setCduration(String cduration) {
		this.cduration = cduration;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public Student getSid() {
		return sid;
	}

	public void setSid(Student sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + ", fees=" + fees + ", sid="
				+ sid + "]";
	}

}

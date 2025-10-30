package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String addres;
	@OneToOne(mappedBy = "sid")
//	@JoinColumn(name="course_id")
	private Course cid;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String addres) {
		super();
		this.id = id;
		this.name = name;
		this.addres = addres;
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

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public Course getCid() {
		return cid;
	}

	public void setCid(Course cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addres=" + addres + ", cid=" + cid + "]";
	}

}

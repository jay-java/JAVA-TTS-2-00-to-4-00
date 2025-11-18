package setter_cons_injections;

public class User {

	private int id;
	private String name;
	private long contact;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, long contact) {
		System.out.println("data set by cons");
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		System.out.println("Id set by setter");
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		System.out.println("name set by setter");
//		this.name = name;
//	}
//
//	public long getContact() {
//		return contact;
//	}
//
//	public void setContact(long contact) {
//		System.out.println("Contact set by setter");
//		this.contact = contact;
//	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}

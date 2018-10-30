package spring.boot.base.crud.model;

public class Employee {
	
	private int id;
	private String name;
	private String contact;
	private String email;
	private String work;
	private String city;
	
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, String contact, String email, String work, String city) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.work = work;
		this.city = city;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getwork() {
		return work;
	}
	public void setwork(String work) {
		this.work = work;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}

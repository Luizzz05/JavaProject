package model;

public class People {
	private String name;
	private String lastName;
	private String cpf;
	private int age;
	private String birtday;
	private String phoneNumber;
	
	
	public People() {
		super();

	}
	
	public People(String name, String lastName, String cpf, int age, String birtday, String phoneNumber) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
		this.age = age;
		this.birtday = birtday;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirtday() {
		return birtday;
	}
	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

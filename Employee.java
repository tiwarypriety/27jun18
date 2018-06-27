package file;

import java.io.BufferedReader;
import java.io.FileReader;

public class Employee{
	int id;
	String words[] = new String[20];
	String name,salary,designation,dept,address1,address2,email,hireDate;
	
public int getId() {
		return id;
	}

	public String[] getWords() {
		return words;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDept() {
		return dept;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getEmail() {
		return email;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	Employee() throws Exception
	{
	
		BufferedReader br = new BufferedReader(new FileReader("d:/EmployeeData.txt"));
		String x;
		while((x = br.readLine())!=null)
		{
			setId(Integer.parseInt(x.split("~")[0]));		
			setName(x.split("~")[1]);
			setSalary(x.split("~")[2]);
			setDesignation(x.split("~")[3]);
			setDept(x.split("~")[4]);
			setAddress1(x.split("~")[5]);
			setAddress2(x.split("~")[6]);
			setEmail(x.split("~")[7]);
			setHireDate(x.split("~")[8]);
	
		}
	}
}

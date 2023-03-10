package in.vanna.binding;

import java.util.Date;

import com.github.javafaker.Faker;

import lombok.Data;

@Data
public class Employee {
	private Integer empId;
	private String name;
	private String designation;
	private double salary;
	private String location;
	private Date DOB;
	public Employee() {
		super();
		Faker feku = new Faker();
		this.empId = (int) feku.number().randomNumber();
		this.name = feku.name().fullName();
		this.designation = feku.job().position();
		this.salary = feku.number().randomDouble(6,100000 , 1000000000);
		this.location=feku.address().fullAddress();
		this.DOB=feku.date().birthday();
	}
	
	
}

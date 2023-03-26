
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


class Employee implements Serializable {

	int id;
	String name;
	float salary;
	long contact_no;
	String email_id;

	public Employee(int id, String name, float salary, long contact_no, String email_id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact_no = contact_no;
		this.email_id = email_id;
	}

	public String toString() {
		return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " +
				this.salary + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id;
	}

}
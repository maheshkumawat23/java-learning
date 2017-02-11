import java.io.*;
public class Employee {
	private String name;
	private int age;
	private int salary;
	
    public void read(){
		Console con = System.console();
		System.out.println("Enter your name");
		name=con.readLine();
		System.out.println("Enter your age");
		age = Integer.parseInt(con.readLine());
		System.out.println("Enter your Salary");
		salary = Integer.parseInt(con.readLine());
	}
	public void show(){
		System.out.println("Your name is "+name+" Your age is "+age+" Your salary is"+ salary);
	}
}
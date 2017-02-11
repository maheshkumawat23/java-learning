import java.io.*;
/*
Constructor are the special methods called when object of the class is created.

Constructor have the same name as Class name
constructor don't have return type.
Three types of constructor -
1. Default constructor
2. parametrized constructor
3. Copy constructor


*/
public class Money {
	
	private int rs;
	private int paisa;
	
	public Money(){
		rs =0;
		paisa=0;
		
	}
	public Money(int rs,int paisa){
		this.rs = rs;
		this.paisa= paisa;
	}
	public Money(Money m){
		this.rs = m.rs;
		this.paisa =m.paisa;
	}
	public void set(int rs,int paisa){
		this.rs = rs;
		this.paisa = paisa;
	}
	public void show(){
		System.out.println(rs+"."+paisa);
	}
	
}
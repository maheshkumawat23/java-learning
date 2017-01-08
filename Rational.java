import java.io.*;

public class Rational {
	
	int numerator;
	int denominator;
	
	public void set (int num, int den){
		
		this.numerator = num;
		this.denominator = den;
	}
	public void show(){
		System.out.println("your Rational no is" + numerator + "\\"+denominator);
	}
}
public class UseMoney {
	
	public static void main(String args[]){
		
		Money m1= new Money(); //Default Constructor
		m1.show();
		
		Money m2 = new Money(12,45); // Parametrized Constructor
		m2.show();
		
		Money m3= new Money(m2); // Copy COnstructor
		
		m3.show();
		
		Money m4 = new Money();
		m4.set(32,45);
		m4.show();
	}
}
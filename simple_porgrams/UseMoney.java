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
		
		Money arr[] = new Money[4];
		
		arr[0] = new Money(10,20);
		arr[0].show();
		arr[1] = new Money();
		arr[1].show();
		arr[2] = new Money(arr[0]);
		arr[2].show();
		arr[3]= new Money();
		arr[3].set(45,45);
		arr[3].show();
	}
}
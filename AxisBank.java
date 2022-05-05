package week3.day1;

public class AxisBank extends Bankinfo {
	public void deposit()
	{
		System.out.println("Deposit method of AxisBank ");
	}
	
	public static void main(String[] args) {
		

		AxisBank axisbank = new AxisBank();
		axisbank.deposit();
		
	}

}

package week3.day1;

public class Automation implements Language,TestTool{
	
	public void Selenium()
	{
		this.Java();
		System.out.println("Testing Tool is Selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Language is Java");
		
		
	}
	
	public static void main(String[] args) {
		
		Automation automation = new Automation();
		
		automation.Selenium();
		
	}

}

package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("It is a desktop size method");
	}
	public static void main(String[] args) 
	{
	
		Desktop dktop = new Desktop();
		dktop.computerModel();
		dktop.desktopSize();
		
	}  
	
	
}

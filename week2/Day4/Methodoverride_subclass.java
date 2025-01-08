package week2.Day4;

public class Methodoverride_subclass extends Methodoverride_HA {
	
	public void performCommonTasks() {
		
		System.out.println("this is override method from parent class");
	}
	
	

	public static void main(String[] args) {
		
		Methodoverride_subclass obj= new Methodoverride_subclass();
		
		obj.findElement();
		obj.clickElement();
		obj.enterText();
		obj.performCommonTasks();

		
		
	}

}

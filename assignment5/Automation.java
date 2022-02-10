package week3day1.assignment5;

public class Automation extends MultipleLanguage implements language ,TestTool  {

	static String saran="Java";
	public void Java() {
		
	
		System.out.println("This Java method");
			
	}
	public void Selenium() {
		saran="Selenium";
		System.out.println("This is Selenium method");
		System.out.println("Static variables "+saran);
		this.ruby();
	}
		public void ruby() {
			System.out.println("This is Ruby method");
			System.out.println("The value of final variable"+finalvar);
			
		
	}
	
		public static void main(String[] args) {
			Automation Auto=new Automation();
			Auto.Java();
			Auto.Selenium();
			
		}
}

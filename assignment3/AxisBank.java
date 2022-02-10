package week3day1.assignment3;

public class AxisBank extends Bankinfo {
	public void deposit() {
		System.out.println("Deposit Amount is 1500");
		
	}
	public void superdeposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		Bankinfo bki = new Bankinfo();
	    AxisBank axb = new AxisBank();
	    bki.deposit();
	    bki.fixed();
	    bki.saving();
	    axb.deposit();
	    axb.superdeposit();

	}

}

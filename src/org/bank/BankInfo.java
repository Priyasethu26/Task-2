package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("Saving");
}
	private void fixed() {
		// TODO Auto-generated method stub
System.out.println("Fixed");
	}
	public static void main(String[] args) {
		BankInfo zz=new BankInfo();
		zz.saving();
		zz.fixed();
		zz.Deposit();
	}
	

}

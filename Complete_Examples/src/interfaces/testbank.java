package interfaces;

public class testbank {
	public static void main(String args[]){
		bank b=new Hsbc_bank();
		//bank n=new bank(); not allowed bz cannot allowed to create object for an interface
		b.credit();
		b.debit();
		b.transfermoney();
		//b.internationalbank() not there in interface.java
		System.out.println(bank.min_bal);
		//bank.min_bal=897; not possible to change the value of variable which is declared in interface.variable which  are declared under interface are final.
		Hsbc_bank x=new Hsbc_bank();
		x.credit();
		x.debit();
		x.transfermoney();
		x.internationalbanking();
	}

}

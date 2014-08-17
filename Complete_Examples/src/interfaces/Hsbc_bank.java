package interfaces;
//it is mandatory to implement all methods of interface class in hsbc_bank.java
public class Hsbc_bank implements bank {
	public void transfermoney(){
		System.out.println("transfer money");
	}

	public void credit(){
		System.out.println("Hsbc credit money");
	}
	public void debit(){
		System.out.println("Hsbc debit money");
	}
	public void internationalbanking(){
		System.out.println("Hsbc international banking");
	}
}

package org.sample;

public class Bank extends Client {
 public void bankAddress() {
	System.out.println("Bank address : Tambaram");

}

 public static void main(String[] args) {
	Bank b=new Bank();
	b.bankAddress();
	b.clientLocation();
	b.empName();
}
}

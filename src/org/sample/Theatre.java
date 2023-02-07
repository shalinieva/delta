package org.sample;

public class Theatre {

	public void movie() {
	System.out.println("Movie name : Master");
	}
	
	public void movie(String Hname, String Hrname)
	{
		System.out.println("Master movie Hero name  : " + Hname);
		System.out.println("Master movie Heroine name : " + Hrname);
	}
	 public void movie(String Hname, int age)
	 {
		 System.out.println("Hero " + Hname + " age is "+ age );
	 }
	 
	 public void movie(long budget)
	 {
		 System.out.println("Movie budget is :" + budget);
	 }
	 
	 public void movie(String vname)
	 {
		 System.out.println("Master movie vilian is: " + vname);
	 }
	 
	 public static void main(String[] args) {
		Theatre t= new Theatre();
		t.movie();
		t.movie(50000000);
		t.movie("vijay", "Malvika");
		t.movie("Vijay", 45);
		t.movie("VJS");
		
	}
}

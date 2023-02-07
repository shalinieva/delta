package org.sample;

public class ChildDetail extends Details {
	@Override
	void test1() {
		System.out.println("I am abstract method");
		
	}
 public void methodDetail() {
	System.out.println("I am non abstarct method from child class");

}
 public static void main(String[] args) {
	ChildDetail c=new ChildDetail();
	c.test();
	c.test1();
	c.methodDetail();
}

}

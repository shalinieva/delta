package org.sample;

public class Childclass implements Classroom {
	
	@Override
	public void students() {
		System.out.println("Students");
		
	}
	@Override
	public void mentors() {
		System.out.println("mentors");
		
	}
	@Override
	public void scores() {
		System.out.println("Scores");
	}

	public static void main(String[] args) {
		Childclass c=new Childclass();
		c.students();
		c.mentors();
		c.scores();
	}
}

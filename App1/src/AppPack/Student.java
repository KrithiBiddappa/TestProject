package AppPack;

import java.io.Serializable;

public class Student implements Serializable {

	public String firstname;
	public int classin;
	public char grade;
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the classin
	 */
	public int getClassin() {
		return classin;
	}
	/**
	 * @param classin the classin to set
	 */
	public void setClassin(int classin) {
		this.classin = classin;
	}
	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
}

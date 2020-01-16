package jp.dcnet.ssstest;

public class Student {

	private String id;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;

	public Student(String id,int subject1,int subject2,int subject3,int subject4,int subject5){
		this.id = id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
	}
	public boolean isPass(){
		double avg = (double)(subject1+subject2+subject3+subject4+subject5)/5.0;
		return avg >= 50;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getSubject4() {
		return subject4;
	}
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}
	public int getSubject5() {
		return subject5;
	}
	public void setSubject5(int subject5) {
		this.subject5 = subject5;
	}


}

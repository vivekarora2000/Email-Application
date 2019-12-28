import java.util.*;

public class Email {
	String firstName;
	String lastName;
	String department;
	String password;
	String email;
	private static final int PASSWORD_LENGTH=10;
	private String alternativeEmail;
	private int mailBoxCapacity = 500;
	private static final String COMPANY_SUFFIX = "starkindustries.com";
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=setDepartment();
		this.password=makeRandomPassword(PASSWORD_LENGTH);
		email=this.firstName.toLowerCase()+this.lastName.toLowerCase()+"@"+this.department.toLowerCase()+"."+COMPANY_SUFFIX;
	}
	
	private String setDepartment() {
		Scanner in = new Scanner(System.in);
		return in.next();
		
	}
	
	private String makeRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()?/<>";
		char[] temp = new char[length];
		for(int i =0;i<length;i++) {
			temp[i]=passwordSet.charAt((int)(Math.random()*passwordSet.length()));
		}
		return new String(temp);
	}
	private void setMailCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	private void setAlternateEmail(String altEmail){
		this.alternativeEmail=altEmail;
	}
	
	private void changePassword(String newPassword) {
		this.password=newPassword;
	}
	private int getMailCapacity() {
		return this.mailBoxCapacity;
	}
	private String getEmail() {
		return this.email;
	}
	
	private String getAlternateEmail(){
		return this.alternativeEmail;
	}
	private String getName() {
		return this.firstName+" "+this.lastName;
	}
	public String showInfo() {
		return "Name: "+this.getName()+"\n"+"Company Email: "+this.getEmail()+"\n"+"Mailbox Capacity: "+ this.getMailCapacity();
	}
	

	
}

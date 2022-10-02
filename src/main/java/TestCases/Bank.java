package TestCases;

public class Bank {
	
	// Encapsulation ---> varibles +methods --> together in single unit ---> CLass
	
	  //how to acheive :
		//1. declare varibles as private
	    // 2. to modify and view the value varibles ---> public getter and setter methods 
	
	    //data hiding+Abstarction=Encapsulation
	
	
	private int Balance;
	
	//check the balance 
	
	public int getBalance() {
		return Balance;
	}
	
	// set 
	
	public void setBalance(int Balance) {
		
		this.Balance=this.Balance+Balance;
	}

}

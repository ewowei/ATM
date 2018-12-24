Please refer to http://java.com/licensereadme


import java.util.Scanner;

public class ATMTRANSACTION {
	
	public static int NewTransaction;
    
     static Scanner s = new Scanner(System.in);
    
   
    
	public static void main(String[] args) {
		
		System.out.println("Welcome to PENBY Bank! Please Enter Your Login details: ");
	
        String username, password;
        
		
        System.out.print("Enter Your Username: ");
		
		username = s.next();
		
		 System.out.print("Enter Your Passcode: ");
		password = s.next();
		
		if(username.equals("Nick")  && (password.equals("1234"))) {
			
			System.out.println(".........................");
			
			System.out.println("");
			
			System.out.println("You are Welcome!  " + username);
			
			System.out.println(".........................");
			
			System.out.println("");
		}
		
		else {
			
			System.out.println("Incorrect details! Try Again");
			
			 System.exit(0);
		}
		

		System.out.println(" ");
		
		Transaction();
	}
		
		private static void Transaction() { 
			
		// This is where you create your Transaction process;
			

		System.out.println("Welcome to ATM TRANSACTION UNIT: ");
		
		System.out.println("");
		System.out.println("Press 0 to check Account_balance: ");
		System.out.println("Press 1 to Deposit: ");
		System.out.println("Press 2 to Withdraw: ");
		System.out.println("Press 3 to Exit: ");
		
		// UserClass P = new UserClass(1236, "Nick");
		
		int  Action_Selection;
		 double Current_balance = 2040;
		 double amount;
		 Action_Selection = s.nextInt();
		 
		 switch(Action_Selection) {
		 
		 case 0:
			 
		
			System.out.println("The current_balance is: " + Current_balance);
			NewTransaction();
		 
			break;
			
		 case 1:
			 
				System.out.println("Please Enter the amount you will like to Deposit: ");
					 amount = s.nextInt();
				System.out.println("The amount Deposited is: " + amount);
					Current_balance += amount;
				System.out.println("The current_balance is: " + Current_balance);
				NewTransaction();
				break;
				
		 case 2:
			 
				System.out.println("Please Enter the amount you will like to withdraw: ");
					 amount = s.nextInt();
					 if (amount == 0 || amount >=(Current_balance+1)) {
						 
						 System.out.println("Sorry, The Requested operation can't be completed, Please select different amount ");
						 NewTransaction();
					 }
					 
					 
				System.out.println("The amount withdrew is: " + amount);
					Current_balance -= amount;
				System.out.println("The current_balance is: " + Current_balance);
				NewTransaction();
				break;
				
		 case 3:
			 
			 System.out.println("Thanks for using Penby Bank! Goodbye!");
			break;	
			
			default:
				System.out.println("Have a good day ");
		 }	
		 
	}
		
   private static void NewTransaction(){
		
	System.out.println("Would You like to make a new transaction?. ");
	System.out.println("Press 1 for YES or 2 for NO. ");
	NewTransaction = s.nextInt();
	if(NewTransaction == 1) {
		Transaction();
	}
	else if(NewTransaction ==2) {
		
		System.out.println("Thanks for using our ATM Machine, GOODBYE. ");
		
	}
	else {
		
		System.out.println(" Invalid Option ");
		Transaction();
	}

	}
		  

}
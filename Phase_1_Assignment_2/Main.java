package Phase_2_Assignment_2 ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String args[])
   {
	   ArrayList<User> users=new ArrayList<>();
	   
	   Scanner scan=new Scanner(System.in);
	  
	   // Get the UserName
	   System.out.println("Enter Your Name : ");
	   String username=scan.nextLine();
	 
	   // Get the Bank
	   System.out.println("Select Bank : ");
	   Bank.BankName();
	   String bankName=Bank.banks.get(scan.nextInt()-1);
	 
	   // Get the LoanType
	   System.out.println("Select Loan Type : ");
	   Loan.printLoanType();
	   String LoanName=Loan.loantypes.get(scan.nextInt()-1);
	   boolean goldLoan=false;
	   double grams=0;
	 
	   //if Loan type is Gold get the Grams
	   if(LoanName=="Gold Loan")
	   {
		   goldLoan=true;
		   System.out.println("Enter the Grams");
		   grams=scan.nextDouble();
	   }
	  
	   //Get the Amount
	   System.out.println("Enter the Amount($) you Required : ");
	   double amount=scan.nextDouble();
	   
	   //Predict the Period of Repay
	    double iar[]=getIntrestRepayMonth(amount);
	    
	    System.out.println("Enter the Month require to repay :");
	    iar[0]=scan.nextDouble();
	    
	    //add the user details in arrayList DataType: user
	    User user = new User(username, bankName, LoanName, amount,  grams,iar[1],iar[0],goldLoan);
	    user.toString();
	    users.add(user);
	    
	    System.out.println(user);
	    
	    
   }  
   public static double[] getIntrestRepayMonth(double amount)
   {
	   double arr[]=new double[2];
	  
	   
	  
     //	 arr[0]  repayMonth
    //	 arr[1]  intrest
	   if(amount<10000)
	   {
		   arr[0]=6;
		   arr[1]=amount*.02;
	   }
	   else
	   {
		   arr[0]=6;
		   arr[1]=amount*.04;
	   }
	   return arr;
   }
}

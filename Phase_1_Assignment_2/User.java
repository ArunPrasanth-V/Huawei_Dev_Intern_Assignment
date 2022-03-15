package Phase_1_Assignment_2;
;

public class User {
	   // POJO for user
   private String userName;
   private  String bankName;
   private String LoanType;
   private double loanAmount;
   private double goldGram;
   private double intrest;
   private double repay;
   private boolean isGoldLoan;
public User(String userName, String bankName, String loanType, double loanAmount, double goldGram, double intrest,double repay,boolean isGoldLoan) {
	super();
	this.userName = userName;
	this.bankName = bankName;
	LoanType = loanType;
	this.loanAmount = loanAmount;
	this.goldGram = goldGram;
	this.intrest = intrest;
	this.repay=repay;
	this.isGoldLoan=isGoldLoan;
}



@Override
public String toString() {
	if(!isGoldLoan)
	return "****"+bankName+"***\n"+"UserName = " + userName +"\nLoanType = " + LoanType + "\nLoanAmount($) = "
			+ loanAmount + "\nIntrest = " + intrest +"\nRepay = "+repay+" month";
	
	return "****"+bankName+"***\n"+"userName="+ "userName = " + userName + "\nLoanType=" + LoanType + "\nLoanAmount($)="
	+ loanAmount + "\nGoldGram = " + goldGram + "\nIntrest = " + intrest+"\nRepay = "+repay+" month";
}

}

package Phase_2_Assignment_1 ;

public class User {
	   // POJO for User
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
	return "userName=" + userName + ", bankName=" + bankName + ", LoanType=" + LoanType + ", loanAmount($)="
			+ loanAmount + " , intrest=" + intrest ;
	
	return "userName=" + userName + ", bankName=" + bankName + ", LoanType=" + LoanType + ", loanAmount($)="
	+ loanAmount + ", goldGram=" + goldGram + ", intrest=" + intrest ;
}

}

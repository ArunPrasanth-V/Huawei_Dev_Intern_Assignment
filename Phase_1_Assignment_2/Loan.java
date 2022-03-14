package Phase_2_Assignment_1 ;

import java.util.ArrayList;

public class Loan {
    private String loanType;
    private double amount;
    private double goldGrams;
    
    static ArrayList<String> loantypes=new ArrayList<>();
    static {
    	loantypes.add("Personal Loan");
    	loantypes.add("Housing Loan");
    	loantypes.add("Educational Loan");
    	loantypes.add("Gold Loan");
    }
    
	public Loan(String loanType, double amount, double goldGrams) {
		super();
		this.loanType = loanType;
		this.amount = amount;
		this.goldGrams = goldGrams;
	}
	public Loan(String loanType, double amount) {
		super();
		this.loanType = loanType;
		this.amount = amount;
	}
    public static void printLoanType()
    {
    	for(int i=0;i<loantypes.size();i++)
		{
			System.out.println(i+1+") "+loantypes.get(i));
		}
    }
}

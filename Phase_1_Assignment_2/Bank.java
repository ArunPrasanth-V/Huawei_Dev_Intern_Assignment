package Bank;

import java.util.ArrayList;

public class Bank {
	
	static ArrayList<String> banks=new ArrayList<>();
	static{
		banks.add("Royal Bank of Canada.");
		banks.add("Bank of Montreal");
		banks.add("Bank of Nova Scotia.");
		banks.add("Canadian Imperial Bank of Commerce");
		banks.add("Toronto Dominion Bank");
		banks.add("Canadian Banks");
	}
	private String bankName;
	private String LoanType;
	private String userName;
	private double loanamount;
	
	public Bank(String bankName, String loanType, String userName, double loanamount) {
		super();
		this.bankName = bankName;
		LoanType = loanType;
		this.userName = userName;
		this.loanamount = loanamount;
	}
	public boolean addBank(String name) {
		if(!banks.contains(name))
		{
			banks.add(name);
			return true;
		}
		return false;
	}
	public static void BankName()
	{
		
		for(int i=0;i<banks.size();i++)
		{
			System.out.println(i+1+") "+banks.get(i));
		}
	}
}

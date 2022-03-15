package Phase_1_Assignment_2;

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
	
	public Bank(String bankName) {
		super();
		this.bankName=bankName;
			banks.add(bankName);

	}
	public static void BankName()
	{
		
		for(int i=0;i<banks.size();i++)
		{
			System.out.println(i+1+") "+banks.get(i));
		}
	}
}

package dol;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	private String bankName;
	private List<CurrentAccount> currentAccounts;
	private List<SavingsAccount> savingsAccounts;
	
	
	public Catalog() {
		currentAccounts = new ArrayList<CurrentAccount>();
		savingsAccounts = new ArrayList<SavingsAccount>();
	}


	public Catalog(String bankName, List<CurrentAccount> currentAccounts, List<SavingsAccount> savingsAccounts) {
		super();
		this.bankName = bankName;
		this.currentAccounts = currentAccounts;
		this.savingsAccounts = savingsAccounts;
	}


	public Catalog(String bankName) {
		super();
		this.bankName = bankName;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public List<CurrentAccount> getCurrentAccounts() {
		return currentAccounts;
	}


	public void setCurrentAccounts(List<CurrentAccount> currentAccounts) {
		this.currentAccounts = currentAccounts;
	}


	public List<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}


	public void setSavingsAccounts(List<SavingsAccount> savingsAccounts) {
		this.savingsAccounts = savingsAccounts;
	}
	

	public void addSavingsAccount(SavingsAccount sa) {
		this.savingsAccounts.add(sa);
	}
	
	public void addCurrentAccount(CurrentAccount ca) {
		this.currentAccounts.add(ca);
	}
	
	
	//metodo para mostrar todas las cuentas.
	public void showAllAccountsAsATable() {
		
		
	}
	
	//metodo para mostrar solo las cuentas corrientes.
	public void showCurrentAccountsAsATable() {
		
		
	}
	
	//metodo para mostrar solo las cuentas de ahorros.
	public void showSavingAccountsAsATable() {
		
		
		
	}
	
		
		
		

}

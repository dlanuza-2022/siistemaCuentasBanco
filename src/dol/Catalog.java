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
	
	
	public Catalog(String bankName) {
		super();
		this.bankName = bankName;
		currentAccounts = new ArrayList<CurrentAccount>();
		savingsAccounts = new ArrayList<SavingsAccount>();
		
	}


	public Catalog(String bankName, List<CurrentAccount> currentAccounts, List<SavingsAccount> savingsAccounts) {
		super();
		this.bankName = bankName;
		this.currentAccounts = currentAccounts;
		this.savingsAccounts = savingsAccounts;
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
	
	
	public void setSavingsAccount(SavingsAccount sa) {
		this.savingsAccounts.add(sa);
	}
	
	public void setCurrentAccount(CurrentAccount ca) {
		this.currentAccounts.add(ca);
	}
	
	
	public SavingsAccount getSavingsAccount() {
		//Hay que hacer el metodo para buscar
	}
	
	public CurrentAccount getCurrentAccount() {
		this.currentAccounts.add(ca);
	}
	
	
	/*
	 * Mostrar las cuentas como una tabla.
	*/
	

	public void showAllAccountsAsATable() {
		
		System.out.println("________________________________________________________________________________________\\n");
		System.out.printf("                    Listado de todas las cuentas del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		
		
        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<currentAccounts.size();i++) {
			currentAccounts.get(i).showDataAsForm();
		}
		

        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<savingsAccounts.size();i++) {
			savingsAccounts.get(i).showDataAsForm();
		}
		
		
	}
	
	//metodo para mostrar solo las cuentas corrientes.
	public void showCurrentAccountsAsATable() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.printf("\n              Listado de las cuentas corrientes del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			currentAccounts.get(i).showDataAsForm();
		}
		
	}
	
	//metodo para mostrar solo las cuentas de ahorros.
	public void showSavingAccountsAsATable() {
		
		System.out.println("_______________________________________________________________________________________");
		System.out.printf("\n               Listado de las cuentas de ahorro del banco %s\n", bankName);
		System.out.println("_______________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			currentAccounts.get(i).showDataAsForm();
		}
		
		
	}
	
		
	
	/*
	 * Mostrar las cuentas como un listado.
	 */
	
    public void showAllAccountsAsAList() {
		
		System.out.println("________________________________________________________________________________________\\n");
		System.out.printf("                    Listado de todas las cuentas del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		
		
        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<currentAccounts.size();i++) {
			currentAccounts.get(i).showDataAsRow();
		}
		

        System.out.println();
		System.out.println("________________________________________________________________________________________\n");
		System.out.println("===================================Cuentas corrientes===================================");
		System.out.println("________________________________________________________________________________________\n");
		for(int i=0; i<savingsAccounts.size();i++) {
			savingsAccounts.get(i).showDataAsRow();
		}
		
		
	}
	
	//metodo para mostrar solo las cuentas corrientes.
	public void showCurrentAccountsAsAList() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.printf("\n              Listado de las cuentas corrientes del banco %s\n", bankName);
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			currentAccounts.get(i).showDataAsRow();
		}
		
	}
	
	//metodo para mostrar solo las cuentas de ahorros.
	public void showSavingAccountsAsAList() {
		
		System.out.println("_______________________________________________________________________________________");
		System.out.printf("\n               Listado de las cuentas de ahorro del banco %s\n", bankName);
		System.out.println("_______________________________________________________________________________________");
		for(int i=0; i<currentAccounts.size();i++) {
			currentAccounts.get(i).showDataAsRow();
		}
		
		
	}	
		

}

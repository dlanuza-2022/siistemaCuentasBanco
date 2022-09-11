package bll;

import java.util.List;

import dol.Catalog;
import dol.CurrentAccount;
import dol.SavingsAccount;
import ui.FormAccount;

public class Application {
	
	
	static Catalog ctl = new Catalog();	
	
	
	
	public static void addCurrentAccount(CurrentAccount ca) {
		ctl.addCurrentAccount(ca);
		
	}
	
	public static void catchCurrentAccount() {
		FormAccount fa = new FormAccount();
		addCurrentAccount(fa.catchCurrentAccount());
	}
	
	public static void showCurrentAccountsAsTable() {
		
	}
	
	
	public static void addSavingsAccount(SavingsAccount sa) {
		ctl.addSavingsAccount(sa);
		
	}
	
	public static void catchSavingsAccount() {
		FormAccount fa = new FormAccount();
		addSavingsAccount(fa.catchSavingsAccount());
	
	}
	
	public static List<CurrentAccount> getCurrentAccounts() {
		
		return ctl.getCurrentAccounts();
	}
	
    public static List<SavingsAccount> getSavingsAccounts() {
		
		return ctl.getSavingsAccounts();
	}
	
	public static void setCurrentAccounts(List<CurrentAccount> currentAccounts) {
		
		ctl.setCurrentAccounts(currentAccounts);
		
	}
	
    public static void setSavingsAccounts(List<SavingsAccount> savingsAccounts) {
		
    	ctl.setSavingsAccounts(savingsAccounts);
	}
}

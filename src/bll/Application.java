package bll;

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
	
	
	
}

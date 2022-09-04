package dol;

import java.util.Date;

public class SavingsAccount extends Account implements IAccount, ISavingsAccount {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, long accountNumber, String holderFirstName, String holderMiddleName,
			String holderSurname, String holderSecondSurname, String holderID, int telephoneNumber,
			String holderDepartment, String holderMunicipality, String holderNeighborhood, String exactAdddress,
			Date creationDate, String currency) {
		super(balance, accountNumber, holderFirstName, holderMiddleName, holderSurname, holderSecondSurname, holderID,
				telephoneNumber, holderDepartment, holderMunicipality, holderNeighborhood, exactAdddress, creationDate,
				currency);
	}

	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}

	@Override
	public long getAccountNumber() {
		// TODO Auto-generated method stub
		return super.getAccountNumber();
	}

	@Override
	public void setAccountNumber(long accountNumber) {
		// TODO Auto-generated method stub
		super.setAccountNumber(accountNumber);
	}

	@Override
	public String getHolderFirstName() {
		// TODO Auto-generated method stub
		return super.getHolderFirstName();
	}

	@Override
	public void setHolderFirstName(String holderFirstName) {
		// TODO Auto-generated method stub
		super.setHolderFirstName(holderFirstName);
	}

	@Override
	public String getHolderMiddleName() {
		// TODO Auto-generated method stub
		return super.getHolderMiddleName();
	}

	@Override
	public void setHolderMiddleName(String holderMiddleName) {
		// TODO Auto-generated method stub
		super.setHolderMiddleName(holderMiddleName);
	}

	@Override
	public String getHolderSurname() {
		// TODO Auto-generated method stub
		return super.getHolderSurname();
	}

	@Override
	public void setHolderSurname(String holderSurname) {
		// TODO Auto-generated method stub
		super.setHolderSurname(holderSurname);
	}

	@Override
	public String getHolderSecondSurname() {
		// TODO Auto-generated method stub
		return super.getHolderSecondSurname();
	}

	@Override
	public void setHolderSecondSurname(String holderSecondSurname) {
		// TODO Auto-generated method stub
		super.setHolderSecondSurname(holderSecondSurname);
	}

	@Override
	public String getHolderID() {
		// TODO Auto-generated method stub
		return super.getHolderID();
	}

	@Override
	public void setHolderID(String holderID) {
		// TODO Auto-generated method stub
		super.setHolderID(holderID);
	}

	@Override
	public Date getCreationDate() {
		// TODO Auto-generated method stub
		return super.getCreationDate();
	}

	@Override
	public void setCreationDate(Date creationDate) {
		// TODO Auto-generated method stub
		super.setCreationDate(creationDate);
	}

	@Override
	public String getCurrency() {
		// TODO Auto-generated method stub
		return super.getCurrency();
	}

	@Override
	public void setCurrency(String currency) {
		// TODO Auto-generated method stub
		super.setCurrency(currency);
	}

	@Override
	public int getTelephoneNumber() {
		// TODO Auto-generated method stub
		return super.getTelephoneNumber();
	}

	@Override
	public void setTelephoneNumber(int telephoneNumber) {
		// TODO Auto-generated method stub
		super.setTelephoneNumber(telephoneNumber);
	}

	@Override
	public String getHolderDepartment() {
		// TODO Auto-generated method stub
		return super.getHolderDepartment();
	}

	@Override
	public void setHolderDepartment(String holderDepartment) {
		// TODO Auto-generated method stub
		super.setHolderDepartment(holderDepartment);
	}

	@Override
	public String getHolderMunicipality() {
		// TODO Auto-generated method stub
		return super.getHolderMunicipality();
	}

	@Override
	public void setHolderMunicipality(String holderMunicipality) {
		// TODO Auto-generated method stub
		super.setHolderMunicipality(holderMunicipality);
	}

	@Override
	public String getHolderNeighborhood() {
		// TODO Auto-generated method stub
		return super.getHolderNeighborhood();
	}

	@Override
	public void setHolderNeighborhood(String holderNeighborhood) {
		// TODO Auto-generated method stub
		super.setHolderNeighborhood(holderNeighborhood);
	}

	@Override
	public String getExactAdddress() {
		// TODO Auto-generated method stub
		return super.getExactAdddress();
	}

	@Override
	public void setExactAdddress(String exactAdddress) {
		// TODO Auto-generated method stub
		super.setExactAdddress(exactAdddress);
	}

	@Override
	public String getTransactionHistory() {
		// TODO Auto-generated method stub
		return super.getTransactionHistory();
	}

	@Override
	public void setTransactionHistory(String transactionHistory) {
		// TODO Auto-generated method stub
		super.setTransactionHistory(transactionHistory);
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		super.withdrawMoney();
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		super.depositMoney();
	}

	
	
	@Override
	public void showDataAsRow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showDataAsForm() {
		// TODO Auto-generated method stub
		
	}
		
	
	
	

}

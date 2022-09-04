package dol;

import java.util.Date;

public class CurrentAccount extends Account implements IAccount {
	
	public CurrentAccount() {
		super();
	}

	//Creo que falta un metodo constructor.
	

	public CurrentAccount(double balance, long accountNumber, String holderFirstName, String holderMiddleName,
			String holderSurname, String holderSecondSurname, String holderID, int landlinePhoneNumber,
			int mobilPhoneNumber, String holderDepartment, String holderMunicipality, String holderNeighborhood,
			String exactAdddress, Date creationDate, String currency, String transactionHistory) {
		super(balance, accountNumber, holderFirstName, holderMiddleName, holderSurname, holderSecondSurname, holderID,
				landlinePhoneNumber, mobilPhoneNumber, holderDepartment, holderMunicipality, holderNeighborhood, exactAdddress,
				creationDate, currency, transactionHistory);
	}
	


	@Override
	public double getBalance() {
		return super.getBalance();
	}


	@Override
	public void setBalance(double balance) {
		super.setBalance(balance);
	}

	@Override
	public long getAccountNumber() {
		return super.getAccountNumber();
	}

	@Override
	public void setAccountNumber(long accountNumber) {
		super.setAccountNumber(accountNumber);
	}

	@Override
	public String getHolderFirstName() {
		return super.getHolderFirstName();
	}

	@Override
	public void setHolderFirstName(String holderFirstName) {
		super.setHolderFirstName(holderFirstName);
	}

	@Override
	public String getHolderMiddleName() {
		return super.getHolderMiddleName();
	}

	@Override
	public void setHolderMiddleName(String holderMiddleName) {
		super.setHolderMiddleName(holderMiddleName);
	}

	@Override
	public String getHolderSurname() {
		return super.getHolderSurname();
	}

	@Override
	public void setHolderSurname(String holderSurname) {
		super.setHolderSurname(holderSurname);
	}

	@Override
	public String getHolderSecondSurname() {
		return super.getHolderSecondSurname();
	}

	@Override
	public void setHolderSecondSurname(String holderSecondSurname) {
		super.setHolderSecondSurname(holderSecondSurname);
	}

	@Override
	public String getHolderID() {
		return super.getHolderID();
	}

	@Override
	public void setHolderID(String holderID) {
		super.setHolderID(holderID);
	}

	@Override
	public Date getCreationDate() {
		return super.getCreationDate();
	}

	@Override
	public void setCreationDate(Date creationDate) {
		super.setCreationDate(creationDate);
	}

	@Override
	public String getCurrency() {
		return super.getCurrency();
	}

	@Override
	public void setCurrency(String currency) {
		super.setCurrency(currency);
	}

		
	@Override
	public int getLandlinePhoneNumber() {
		// TODO Auto-generated method stub
		return super.getLandlinePhoneNumber();
	}

	@Override
	public void setLandlinePhoneNumber(int landlinePhoneNumber) {
		// TODO Auto-generated method stub
		super.setLandlinePhoneNumber(landlinePhoneNumber);
	}

	@Override
	public int getMobilPhoneNumber() {
		// TODO Auto-generated method stub
		return super.getMobilPhoneNumber();
	}

	@Override
	public void setMobilPhoneNumber(int mobilPhoneNumber) {
		// TODO Auto-generated method stub
		super.setMobilPhoneNumber(mobilPhoneNumber);
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
		
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
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

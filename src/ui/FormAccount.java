package ui;

import dol.SavingsAccount;

import java.time.LocalDateTime;
import java.util.Scanner;
import misc.ExceptionScanner;
import dol.Currency;
import dol.CurrentAccount;


public class FormAccount {
	
	/*
	 * Clase donde se atrapan los datos de las nuevas cuentas.
	 */
	
	Scanner sc = new Scanner(System.in);
	ExceptionScanner es = new ExceptionScanner();
	
	
	
	
	
	
	
	public CurrentAccount catchCurrentAccount() {
		CurrentAccount ca = new CurrentAccount();
	    short op = 0;
		
		do {
			System.out.println();
			displayCurrencyTypes();
			System.out.println();
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				ca.setCurrency(Currency.CORDOVAS);
				break;
			case 2:
				ca.setCurrency(Currency.DOLARS);
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
		}while( op!= 1 || op !=2);
		
		
		System.out.print("Ingrese el número de la cuenta: ");
		ca.setAccountNumber(sc.nextLong());
		
		System.out.print("Primer nombre del titular: ");
		ca.setHolderFirstName(sc.next());
		
		System.out.print("Segundo nombre del titular: ");
		ca.setHolderMiddleName(sc.next());
		
		System.out.print("Primer apellido del titular: ");
		ca.setHolderSurname(sc.next());
		
		System.out.print("Segundo apellido del titular: ");
		ca.setHolderSecondSurname(sc.next());
		
		System.out.print("Cédula del titular: ");
		ca.setHolderID(sc.next());
		
		System.out.print("Número telefónico de línea fija: ");
		ca.setLandlinePhoneNumber(es.catchValidLandlinePhoneNumber());
		
		System.out.print("Número de telefono móvil: ");
		ca.setMobilPhoneNumber(es.catchValidMobilePhoneNumber());
		
		System.out.print("Departamento de residencia: ");
		ca.setHolderDepartment(sc.next());
		
		System.out.print("Municipio de residencia: ");
		ca.setHolderMunicipality(sc.next());
		
		System.out.print("Barrio de residencia: ");
		ca.setHolderNeighborhood(sc.nextLine());
		
		System.out.print("Dirección exacta: ");
		ca.setExactAddress(sc.nextLine());
		
		ca.setCreationDate(LocalDateTime.now());
		
		return ca;
	}
	
	
	public SavingsAccount catchSavingsAccount() {
		SavingsAccount sa = new SavingsAccount();
		short op = 0;
		
		do {
			System.out.println();
			displayCurrencyTypes();
			System.out.println();
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				sa.setCurrency(Currency.CORDOVAS);
				break;
			case 2:
				sa.setCurrency(Currency.DOLARS);
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
		}while( op!= 1 || op !=2);
		
		System.out.print("Ingrese el número de la cuenta: ");
		sa.setAccountNumber(sc.nextLong());
		
		System.out.print("Primer nombre del titular: ");
		sa.setHolderFirstName(sc.next());
		
		System.out.print("Segundo nombre del titular: ");
		sa.setHolderMiddleName(sc.next());
		
		System.out.print("Primer apellido del titular: ");
		sa.setHolderSurname(sc.next());
		
		System.out.print("Segundo apellido del titular: ");
		sa.setHolderSecondSurname(sc.next());
		
		System.out.print("Cédula del titular: ");
		sa.setHolderID(sc.next());
		
		System.out.print("Número telefónico de línea fija: ");
		sa.setLandlinePhoneNumber(es.catchValidLandlinePhoneNumber());
		
		System.out.print("Número de telefono móvil: ");
		sa.setMobilPhoneNumber(es.catchValidMobilePhoneNumber());
		
		System.out.print("Departamento de residencia: ");
		sa.setHolderDepartment(sc.next());
		
		System.out.print("Municipio de residencia: ");
		sa.setHolderMunicipality(sc.next());
		
		System.out.print("Barrio de residencia: ");
		sa.setHolderNeighborhood(sc.nextLine());
		
		System.out.print("Dirección exacta: ");
		sa.setExactAddress(sc.nextLine());
		
		sa.setCreationDate(LocalDateTime.now());
		
		return sa;
		
	}
	
	
	 public void displayCurrencyTypes() {
		 System.out.println("Tipo de moneda de la cuenta: ");
		 System.out.println("1. Córdobas. ");
		 System.out.println("2. Dólares. ");
		 
	 }
	

}

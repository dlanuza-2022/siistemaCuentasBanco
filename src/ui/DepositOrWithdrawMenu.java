package ui;

import java.util.Scanner;

import bll.Application;
import dol.Currency;
import misc.BalanceCatcher;
import misc.ExchangeRates;
import misc.IndexValidator;

public class DepositOrWithdrawMenu implements IMenu {

Scanner sc = new Scanner(System.in);

	
	@Override
	public void show() {
		short op = 0;
		short op2 = 0;
		short op3 = 0;
		short op4 = 0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();

			switch(op) {
			case 1:
				
				System.out.println("\n1. Cuenta corriente.");
				System.out.println("2. Cuenta de ahorros.\n");
				op2 = sc.nextShort();
				
				switch(op2) {
				
				case 1:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
						IndexValidator iv = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							
							tempIndex = Application.selectCurrentAccountByCatalog();
							
							if(iv.indexValidatorCA(tempIndex)) {
								
								
								if(Application.getCurrentAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS) {
									
									System.out.println("Tipo de moneda: ");
									System.out.println("1. Córdoba.");
									System.out.println("2. Dólar.");
									
									op4 = sc.nextShort();
									switch(op4) {
									
									case 1:
										

										System.out.print("Igrese el monto a depositar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										Application.depositInCA(tempIndex, tempAmount);

										tempValidator = true;
										
										break;
										
									case 2:
										
										System.out.print("Ingrese el monto a depositar: ");
										double tempAmount2 = BalanceCatcher.catchAmount();
										tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
										Application.depositInCA(tempIndex, tempAmount2);
										
										tempValidator = true;
										break;
									default:
										System.out.println("Opción inválida.");
										break;
									
									}
									
									
								}else {
									

									System.out.println("Tipo de moneda: ");
									System.out.println("1. Córdoba.");
									System.out.println("2. Dólar.");
									
									op4 = sc.nextShort();
									switch(op4) {
									
									case 1:
										

										System.out.print("Igrese el monto a depositar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
										
										Application.depositInCA(tempIndex, tempAmount);
										

										tempValidator = true;
										
										break;
										
									case 2:
										
										System.out.print("Ingrese el monto a depositar: ");
										double tempAmount2 = BalanceCatcher.catchAmount();
										
										Application.depositInCA(tempIndex, tempAmount2);
													
										tempValidator = true;
										break;
									default:
										System.out.println("Opción inválida.");
										break;
									
									}
									
									
									
								}
								
								
								
								
								
							}else {
								System.out.println("Indíce inválido.");
								
							}
							
							
						}while(tempValidator = false);
								
						
						
						
						
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.currentAccountExists(tempAccountNumber)) {
							
							if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
						
								System.out.println("Tipo de moneda: ");
								System.out.println("1. Córdoba.");
								System.out.println("2. Dólar.");
								
								op4 = sc.nextShort();
								switch(op4) {
								
								case 1:
									

									System.out.print("Igrese el monto a depositar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									
																
									Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
									

									tempValidator = true;
									
									break;
									
								case 2:
									
									System.out.print("Ingrese el monto a depositar: ");
									double tempAmount2 = BalanceCatcher.catchAmount();
									
									tempAmount2 = ExchangeRates.dolarToCordova(tempAmount2);
									
									Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount2);
																		
									break;
								default:
									System.out.println("Opción inválida.");
									break;
								
								}
								
								
								
							}else {
								

								System.out.println("Tipo de moneda: ");
								System.out.println("1. Córdoba.");
								System.out.println("2. Dólar.");
								
								op4 = sc.nextShort();
								switch(op4) {
								
								case 1:
									

									System.out.print("Igrese el monto a depositar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									
								    tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
									
									Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
									

									tempValidator = true;
									
									break;
									
								case 2:
									
									System.out.print("Ingrese el monto a depositar: ");
									double tempAmount2 = BalanceCatcher.catchAmount();
									
															
									Application.depositInCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount2);
																		
									break;
								default:
									System.out.println("Opción inválida.");
									break;
								
								}
							}
							
														
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				case 2:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
                        IndexValidator iv2 = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							
							tempIndex = Application.selectSavingsAccountByCatalog();
							
							if(Application.getSavingsAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS) {
								
								System.out.println("Moneda a depositar: ");
								System.out.println("1. Cordoba");
								System.out.println("2. Dolar");
								op4 = sc.nextShort();
								
								switch(op4) {
								case 1:
									if(iv2.indexValidatorSA(tempIndex)) {
										System.out.print("Igrese el monto a depositar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										Application.depositInSA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
									
									break;
								case 2:
									if(iv2.indexValidatorSA(tempIndex)) {
										System.out.print("Igrese el monto a depositar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										tempAmount = ExchangeRates.dolarToCordova(tempAmount);
										Application.depositInSA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
									
									
									break;
								
								
								}
								 
							}
							
							
							
							
							
						}while(tempValidator = false);
						
						
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
												
						if(Application.savingsAccountExists(tempAccountNumber)) {
							
							System.out.println("Moneda a depositar: ");
							System.out.println("1. Cordoba");
							System.out.println("2. Dolar");
							op4 = sc.nextShort();
							
							switch(op4) {
							
							case 1:
								if(Application.getSavingsAccountByIndex(Application.getSavingsAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
									
									System.out.println("Ingrese el monto a depositar: ");
									double monto = BalanceCatcher.catchAmount();
									
									Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), monto);
									
								}
								else {
									
									System.out.println("Ingrese el monto a depositar: ");
									double monto = BalanceCatcher.catchAmount();
									monto = ExchangeRates.cordovaToDolar(monto);
									Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), monto);
									
								}
								
								
								break;
							case 2:
                                    if(Application.getSavingsAccountByIndex(Application.getSavingsAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS) {
									
									System.out.println("Ingrese el monto a depositar: ");
									double monto = BalanceCatcher.catchAmount();
									monto = ExchangeRates.dolarToCordova(monto);
									Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), monto);
									
								}
								else {
									
									System.out.println("Ingrese el monto a depositar: ");
									double monto = BalanceCatcher.catchAmount();
									
									Application.depositInSA(Application.getSavingsAccountIndex(tempAccountNumber), monto);
									
								}
								
								
								
								break;
							}
							
													
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				
				default:
					System.out.println("Opción inválida.");
					break;
				
				}
				
				
				break;
				
				//Retirar
			case 2:
				System.out.println("\n1. Cuenta corriente.");
				System.out.println("2. Cuenta de ahorros.\n");
				op2 = sc.nextShort();
				
				switch(op2) {
				
				case 1:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						
						IndexValidator iv3 = new IndexValidator();
						
						int tempIndex = 0;
						boolean tempValidator = false;
						
						do {
							tempIndex = Application.selectCurrentAccountByCatalog();
							System.out.println("Moneda a retirar: ");
							System.out.println("1. Cordoba");
							System.out.println("2. Dolar");
							op4 = sc.nextShort();
							
							switch(op4) {
							
							case 1:
								
								if(Application.getCurrentAccountByIndex(tempIndex).getCurrency()== Currency.CORDOVAS) {
									

									if(iv3.indexValidatorCA(tempIndex)) {
										System.out.print("Igrese el monto a retirar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										Application.withdrawFromCA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
									
								}else {
									

									if(iv3.indexValidatorCA(tempIndex)) {
										System.out.print("Igrese el monto a retirar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
										Application.withdrawFromCA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
									
								}

								
								
								
								break;
							case 2:
								
	                                if(Application.getCurrentAccountByIndex(tempIndex).getCurrency()== Currency.CORDOVAS) {
									

									if(iv3.indexValidatorCA(tempIndex)) {
										System.out.print("Igrese el monto a retirar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										tempAmount = ExchangeRates.dolarToCordova(tempAmount);
										Application.withdrawFromCA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
									
								}else {
									

									if(iv3.indexValidatorCA(tempIndex)) {
										System.out.print("Igrese el monto a retirar: ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										Application.withdrawFromCA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
									
								}
								
								
								
								
								
								break;
							}
							
							
							
							
							
						}while(tempValidator = false);
								
						
						
						
						
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.currentAccountExists(tempAccountNumber)) {
							
							System.out.println("Ingrese la moneda de retiro: ");
							System.out.println("1. Cordoba");
							System.out.println("2. Dolar");
							op4 = sc.nextShort();
							
							switch(op4) {
							case 1:
								if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS ) {
									System.out.print("Ingrese el mono a retirar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									
									Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
									
									
								}else {
									System.out.print("Ingrese el mono a retirar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
									Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
									
									
									
								}
								
								break;
							case 2:
								if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency() == Currency.CORDOVAS ) {
									System.out.print("Ingrese el mono a retirar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									tempAmount = ExchangeRates.dolarToCordova(tempAmount);
									Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
									
									
								}else {
									System.out.print("Ingrese el mono a retirar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									
									Application.withdrawFromCA(Application.getCurrentAccountIndex(tempAccountNumber), tempAmount);
									
									
									
								}
								break;
							}
							
							
							
							
							
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				case 2:
					System.out.println("\n1. Buscar en el catálogo.");
					System.out.println("2. Buscar por número de cuenta.");
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
						int tempIndex = Application.selectSavingsAccountByCatalog();
                        IndexValidator iv4 = new IndexValidator();
						
						
						boolean tempValidator = false;
						
						
						do {	
							
							System.out.println("Moneda de retiro: ");
							System.out.println("1. Cordoba");
							System.out.println("2. Dolar");
							op4 = sc.nextShort();
							
							switch(op4) {
							case 1:
								if(Application.getSavingsAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS){
									if(iv4.indexValidatorSA(tempIndex)) {
										System.out.print("Igrese el monto a ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										Application.withdrawFromSA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
								}else {
									
									if(iv4.indexValidatorSA(tempIndex)) {
										System.out.print("Igrese el monto a ");
										double tempAmount = BalanceCatcher.catchAmount();
										tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
										
										Application.withdrawFromSA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
								}
								
								
								
								break;
							case 2:
								if(Application.getSavingsAccountByIndex(tempIndex).getCurrency() == Currency.CORDOVAS){
									if(iv4.indexValidatorSA(tempIndex)) {
										System.out.print("Igrese el monto a ");
										double tempAmount = BalanceCatcher.catchAmount();
										tempAmount = ExchangeRates.dolarToCordova(tempAmount);
										Application.withdrawFromSA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
								}else {
									
									if(iv4.indexValidatorSA(tempIndex)) {
										System.out.print("Igrese el monto a ");
										double tempAmount = BalanceCatcher.catchAmount();
										
										
										Application.withdrawFromSA(tempIndex, tempAmount);

										tempValidator = true;
									}else {
										System.out.println("Indíce inválido.");
										
									}
								}
								
								break;
							}
							
							
							
						}while(tempValidator = false);
						
						
						break;
					case 2:
						System.out.print("Ingrese el número de cuenta: ");
						long tempAccountNumber = sc.nextLong();
						
						if(Application.savingsAccountExists(tempAccountNumber)) {
							
							System.out.println("Moneda de retiro: ");
							System.out.println("1. Cordoba");
							System.out.println("2. Dolar");
							op4 = sc.nextShort();
							
							switch(op4) {
							case 1:
								if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency()== Currency.CORDOVAS) {
									System.out.print("Ingrese el mono a depositar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									
									Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
									
								}else {		
									System.out.print("Ingrese el mono a depositar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									tempAmount = ExchangeRates.cordovaToDolar(tempAmount);
									Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
									
									
								}
								
								break;
							case 2:
								
                                 if(Application.getCurrentAccountByIndex(Application.getCurrentAccountIndex(tempAccountNumber)).getCurrency()== Currency.CORDOVAS) {
                                	System.out.print("Ingrese el mono a depositar: ");
 									double tempAmount = BalanceCatcher.catchAmount();
 									tempAmount = ExchangeRates.dolarToCordova(tempAmount);
 									Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
 									
								}else {		
									System.out.print("Ingrese el mono a depositar: ");
									double tempAmount = BalanceCatcher.catchAmount();
									
									Application.withdrawFromSA(Application.getSavingsAccountIndex(tempAccountNumber), tempAmount);
									
								}
							    break;
								
							}
									
							
							
						}else {
							System.out.println("No existe ninguna cuenta con ese número de cuenta.");
						}
						break;
					
					}
					
					break;
					
				
				default:
					System.out.println("Opción inválida.");
					break;
				
				}
				
				
				break;
				
				
			case 3:
				Menu menu = new Menu();
				menu.show();
				break;
			default:
				System.out.println("Opción inválida.");
			
			}
			
		}while(op!=3);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("1. Depositar dinero.");
		System.out.println("2. Retirar dinero.");
		System.out.println("3. Volver al menú principal.");
	}

}

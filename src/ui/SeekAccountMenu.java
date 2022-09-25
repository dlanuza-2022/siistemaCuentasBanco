package ui;

import java.util.Scanner;

import bll.Application;
 

public class SeekAccountMenu implements IMenu {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void show() {
		short op = 0;
		short op2 = 0;
		short op3 = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			
			op = sc.nextShort();
			
			switch(op) {
			case 1:
				System.out.println();
				System.out.println("1. Buscar cuenta corriente.");
				System.out.println("2. Buscar cuenta de ahorros.");
				System.out.println();
				
				op2 = sc.nextShort();
				
				switch(op2) {
				
				case 1: 
					
					int caIndex = Application.selectCurrentAccount();
					System.out.println(Application.getCurrentAccountByIndex(caIndex));
					
					System.out.println();
					System.out.println("1. Editar cuenta.");
					System.out.println("2. Eliminar cuenta.");
					System.out.println();
					
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
					case 2:
					case 3:
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
					
					break;
					
				case 2:
					int saIndex = Application.selectSavingsAccount();
					
					System.out.println(Application.getSavingsAccountByIndex(saIndex));
					
					System.out.println();
					System.out.println("1. Editar cuenta.");
					System.out.println("2. Eliminar cuenta.");
					System.out.println();
					
					op3 = sc.nextShort();
					
					switch(op3) {
					
					case 1:
					case 2:
					case 3:
					default:
						System.out.println("Opción inválida.");
						break;
					
					}
					
					
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				
				}
				
				
				break;
			case 2:
				
				
				
				
				break;
			case 3:
				Menu menu = new Menu();
				menu.show();
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
					
			
		}while(op != 3);
		
		
	}

	@Override
	public void displayOptions() {
		System.out.println("==Buscar cuenta==");
		System.out.println("1. Seleccionar una cuenta del catálogo.");
		System.out.println("2. Buscar una cuenta por número de cuenta.");
		System.out.println("3. Volver al menú principal.");
	}

}

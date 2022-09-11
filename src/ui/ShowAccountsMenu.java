package ui;

import java.util.Scanner;

public class ShowAccountsMenu implements IMenu {
Scanner sc = new Scanner(System.in);

	
	@Override
	public void show() {
		short op = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			op = sc.nextShort();

			switch(op) {
			case 1:
		
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
			
				break;
		
			default:
				System.out.println("Opción inválida.");
				break;
		
			}
			
		}while(op!=5);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("1. Mostrar todas las cuentas.");
		System.out.println("2. Mostrar las cuentas corrientes.");
		System.out.println("3. Mostrar las cuentas de ahorro.");
		System.out.println("4. Buscar cuenta por medio de un número de cuenta.");
		System.out.println("5. Volver al menú principal.");
		
	}
	
	

}

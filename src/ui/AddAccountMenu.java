package ui;

import java.util.Scanner;

public class AddAccountMenu implements IMenu {
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
		System.out.println("Agregar nueva cuenta corriente.");
		System.out.println("Agregar nueva cuenta de ahorros.");
		System.out.println("Volver al menú principal.");
	
	}

}

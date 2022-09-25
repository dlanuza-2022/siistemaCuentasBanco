package ui;

import java.util.Scanner;

public class EditOrDeleteAccountMenu implements IMenu {

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
				EditMenu em = new EditMenu();
				em.show();
				
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
		System.out.println("1. Editar una cuenta.");
		System.out.println("2. Eliminar una cuenta.");
		System.out.println("3. Volver al menú principal.");
		
	}

}

package ui;

import java.util.Scanner;

public class EditMenu implements IMenu {

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
				EditOrDeleteAccountMenu priorMenu = new EditOrDeleteAccountMenu();
				priorMenu.show();
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
		}while(op != 3);
		
		
		
		
	}

	//Esto puede ser puesto en un menu superior para ahorrar codigo.
	@Override
	public void displayOptions() {
		
		System.out.println("===Menu de edición de cuentas===");
		System.out.println("1. Seleccionar una cuenta del catalogo.");
		System.out.println("2. Buscar una cuenta.");
		System.out.println("3. Volver.");
		
		
	}

}

package ui;

import java.util.Scanner;

public class Menu implements IMenu {
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
				DepositOrWithdrawMenu submenu1 = new DepositOrWithdrawMenu();
				submenu1.show();
				break;
			case 2:
				AddAccountMenu submenu2 = new AddAccountMenu();
				submenu2.show();
				break;
			case 3:
				ShowAccountsMenu submenu3 = new ShowAccountsMenu();
				submenu3.show();
				break;
			case 4:
				
				break;
			case 5:
			
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			
			}
			
		}while(op!=6);
		
	}

	@Override
	public void displayOptions() {
		System.out.println("====Menú de opciones====\n");
		
		System.out.println("1. Depositar o retirar dinero.");
		System.out.println("2. Agregar una nueva cuenta.");
		System.out.println("3. Mostrar cuentas.");
		System.out.println("4. Editar o eliminar una cuenta.");
		System.out.println("5. Agregar interes a las cuentas de ahorro.");
		System.out.println("6. Salir del programa.");
		
	}
	

	
}

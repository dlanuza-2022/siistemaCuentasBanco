package ui;

import java.util.Scanner;

import dol.CurrentAccount;
import dol.SavingsAccount;

public class EditAccount implements IMenu {
	Scanner sc = new Scanner(System.in);
	
	
	public CurrentAccount editCurrentAccount(CurrentAccount ca) {
		
		show();
		
		return ca;
	}
	
	
    public SavingsAccount editSavingsAccount(SavingsAccount sa) {
       	
    	show();
    	
    	return sa;
    }
	

    
    @Override
    public void displayOptions() {
    	System.out.println("==Opciones de modificación==");
    	System.out.println("1. Número telefónico línea fija.");
    	System.out.println("2. Número de teléfono móvil.");
    	System.out.println("3. Dirección del titular.");
    	System.out.println("4. Finalizar la edición.");
    }


    
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
			default:
				System.out.println("Opción inválida.");
				break;
			}
			
			
			
		}while(op != 4);
		
	}
}

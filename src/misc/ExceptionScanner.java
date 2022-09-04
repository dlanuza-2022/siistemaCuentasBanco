package misc;

import java.util.Scanner;

public class ExceptionScanner {
	Scanner sc;
	
	
	public ExceptionScanner() {
		sc = new Scanner(System.in);
	}
	
	
	
	//Try catch posible.
	public long catchValidWholePart() {
		long output = 0;
		do {
			System.out.print("Ingrese el valor: ");
			output = sc.nextInt();
			if(output<=0) {
				System.out.println("Monto inválido.");
			}
		}while(output <= 0);
		
		return output;	
	}
	
	public float catchValidCents() {
		float output = 0;
		
		do {
			System.out.print("Monto de los centavos: ");
			output = sc.nextFloat();
			if(output<0 || output > 0.99) {
				System.out.println("Monto de centavos inválido.");
			}
		
		}while(output<0 || output > 0.99);
		
		return output;
	}
	
	public int catchValidMobilePhoneNumber() {
		int output = 0;
		boolean isAPhoneNumber = false;
		do {
			System.out.print("Ingrese el número: ");
			output = sc.nextInt();
			
			if(output > 81000000 && output < 90000000) {
				isAPhoneNumber = true;
			}else if(output > 57000000 && output < 59000000){
					isAPhoneNumber = true;
				}else if(output > 77000000 && output < 79000000){
						isAPhoneNumber = true;
					}else {
						System.out.println("Número de telefono móvil invalido.");
					}
			
		}while(isAPhoneNumber == false);
		
		return output;
	}
	
	
	public int catchValidLandlinePhoneNumber() {
		int output = 0;
		
		do {
			System.out.print("Ingrese el número: ");
			output = sc.nextInt();
			
			if(output > 20000000 && output < 20000000) {
				System.out.println("Número inválido.");
			}
		}while(output > 20000000 && output < 20000000);
		
		return output;
		
	}
		
		
}

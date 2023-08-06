
import java.util.Scanner;

public class Ex15
{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Seu Salario Joao: ");
	
	int salario = scanner.nextInt();
	
	System.out.println("Conta 1: ");
	
	int cont1 = scanner.nextInt();
	
	System.out.println("Conta 2: ");
	
	int cont2 = scanner.nextInt();
	
	scanner.close();
	
	int Tot;
	
	Tot = salario - cont1 + 2/100 - cont2 + 2/100;
	
	System.out.println("Restara: "+ Tot);
	
    
    
    
    
    
    

	}
}


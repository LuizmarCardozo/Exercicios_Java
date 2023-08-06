
import java.util.Scanner;

public class Ex14
{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
    System.out.println("Digite seu ano de Nascimento: ");
    int Nascimento = scanner.nextInt();
    
    System.out.println("Digite o ano Atual: ");
    int Ano = scanner.nextInt();
    
    scanner.close();
    
    int idade = Ano - Nascimento;
    
    int meses = Ano * 12; 
    
    int dias = Ano * 365;
    
    int sem = dias /7;
    
    System.out.println("Sua idade: " + idade);
    System.out.println("Meses: "+ meses);
    System.out.println("Dias: "+ dias);
    System.out.println("Semanas: "+ sem);
    
    
    
    
    
    

	}
}


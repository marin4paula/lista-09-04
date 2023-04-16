package lista0903;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=0,numero=54;
		do{
		System.out.println("Adivinhe o numero que foi escolhido entre 1 e 100");
		a=input.nextInt();
		if(a<numero) {
			System.out.println("mumero menor que o escolhido");
		}
		
		if(a>numero) {
			System.out.println("numero maior que o escolhido");
		}	
		}while(a!=numero);
		System.out.println("numero correto");
		
	}

}

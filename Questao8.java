package lista0903;
import java.util.Scanner;
public class Questao8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		int direito=0, esquerdo=0;
	
		System.out.println("digite a expressão");
		a=input.nextLine();
		
		
		for(int i=0; i< a.length(); i++) {
			if(a.charAt(i)=='(') {
	        esquerdo++;
			}
			if(a.charAt(i)==')') {
		    direito++;
			}
            if(a.charAt(i)=='{') {
			esquerdo++;
			}
            if(a.charAt(i)=='}') {
			direito++;
			}
            if(a.charAt(i)=='[') {
	        esquerdo++;
            }
            if(a.charAt(i)==']') {
	        direito++;
            }
			
		}
		
		if(direito==esquerdo) {
			System.out.println("expressão correta");
		}
		else {
			System.out.println("expressão incorreta");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}

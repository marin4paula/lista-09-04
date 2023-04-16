package lista0903;
import java.util.Scanner;
public class Questao7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=0,cont=0,indice=0;
		System.out.println("escolha um numero positivo");
		a=input.nextInt();
		int vetor[]=new int[a];
		if(a>2) {
		for(int i=2; i<a; i++) {
			for(int j=1; j<=i;j++) {
				if(i%j==0) {
					cont++;
				}
			}
			if(cont==2) {
				vetor[indice]=i;
				indice++;
			}
			cont=0;
		}
		if (a==1 || a==2 || a==0) {
			 System.out.println("nao existe numero primo menor que esse numero");
		}
			 
			
			
			System.out.println(vetor[indice-1]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

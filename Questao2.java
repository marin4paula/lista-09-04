package lista0903;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor[]=new int[50];
		int i,a,j=0,soma=0;
		 System.out.println("digite uma sequencia de valores");
		for(i=0; i<vetor.length; i++) {
			a=input.nextInt();
			if(a>0) {
				vetor[j]=a;
				j++;
			}
			if(a<0) {
				break;
			}
		}
		
		for(i=0; i<vetor.length; i++){
			soma=soma+vetor[i];
		}
		System.out.println(soma);
	} 
}

	package lista0903;
	import java.util.Scanner;
	public class Questao5 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a,indice=0,cont=0;
			System.out.println("digite uma numero qualquer positivo e diferente de zero");
			a=input.nextInt();
			cont=(a+1)*(a+1);
			int vetor[]=new int[cont];
			int vet[]=new int[cont];
			for(int i=0;i<=a;i++) {
				for(int j=0;j<=a;j++) {
			     vetor[indice]=j;
			     indice++;
			     }		
			
			}
			
			indice=0;
			for(int i=0;i<=a;i++) {
				for(int j=0;j<=a;j++) {
			     vet[indice]=i;
			     indice++;
			     }
			     }
				
			
	       for(int i=0;i<cont;i++) {
	    	   System.out.println(vetor[i] +"|"+vet[i]);
	       }
			
			
			
		}}
	

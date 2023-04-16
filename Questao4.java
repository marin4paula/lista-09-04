package lista0903;
import java.util.Scanner;
public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=0,cont=0,i=0;
		System.out.println("escolha um numero de 1 a 10");
		a=input.nextInt();
		while(i<=10){
		System.out.println(a+" x "+i+" = "+ a*i);
			i++;
		}	
		
	}
}

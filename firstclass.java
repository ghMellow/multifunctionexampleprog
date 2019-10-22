import java.util.Scanner;
public class firstclass {
	public static void main(String[] args){
		
		for (int i = 1; i<=9; i++){
			System.out.println(i + (i==1?" pompiere":" pompieri") + " + 1 pompiere = " + (1 + i) + " pompieri");
		}
		
		Scanner myObj = new Scanner(System.in);  // Crea un oggetto Scanner, serve per l'input
		System.out.print("Inserisci il numero di pompieri: ");

		int nPompieri = myObj.nextInt();  // Read user input
		System.out.println(nPompieri + "pompieri" + " + 1 pompiere = " + (nPompieri + 1));  // Output user input
		//print("hello world!");
	}
}
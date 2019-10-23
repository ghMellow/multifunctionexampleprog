import java.util.Scanner;
public class firstclass {
	public static void main(String[] args){
		int selection;
		  do{
      System.out.println("1\tfilastrocca completa ");
      System.out.println("2\tnumero di pompieri");
	  System.out.println("3\tnumero di topi");
      System.out.println("Cosa vuoi fare? -> ");
      selection = Integer.parseInt(System.console().readLine());  // Read user input
      if(selection == 1){
        filastrocca();
      }else if(selection == 2){
        inputIntFilastrocca();
      }else if(selection == 3){
		  filastroccaTopi();
	  }
    }while(selection != 0  selection>3  selection <0);



        //print("hello world!");
    }
	public static void filastrocca(){
		for (int i = 1; i<=9; i++){
			System.out.println(i + (i==1?" pompiere":" pompieri") + " + 1 pompiere = " + (1 + i) + " pompieri");
		}
	}
	  public static void filastroccaTopi(){
        for (int i = 1; i<=9; i++){
            System.out.println(i + (i==1?" topo":" topi") + " + 1 topo = " + (1 + i) + " pifferaio");
        }
	}
  public static void inputIntFilastrocca(){
    Scanner myObj = new Scanner(System.in);
         // Crea un oggetto Scanner, serve per l'input
        System.out.print("Inserisci il numero di pompieri: ");

        int nPompieri = myObj.nextInt();  // Read user input
        System.out.println(nPompieri + "pompieri" + " + 1 pompiere = " + (nPompieri + 1));  // Output user input
  }
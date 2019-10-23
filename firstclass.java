import java.util.Scanner;
public class firstclass {
	public static void main(String[] args){
		int selection;
	do{
      System.out.println("1\tfilastrocca completa ");
      System.out.println("2\tnumero di pompieri");
	  System.out.println("3\tnumero di topi");
	  System.out.println("4\tinput numero di topi");
	  System.out.println("5\tla vita di pascoli");
	  System.out.println("6\tse vuoi uscire premi 6");
      System.out.println("Cosa vuoi fare? -> ");
      selection = Integer.parseInt(System.console().readLine());  // Read user input
      if(selection == 1){
        filastrocca();
      }else if(selection == 2){
        inputIntFilastrocca();
      }else if(selection == 3){
		  filastroccaTopi();
	  }else if(selection == 4){
		  inputIntFilastroccaTopi();
	  }else if(selection == 5){
		  pascoli();
	  }else if(selection == 6){
		  selection=0;
		  System.out.println("ciao e grazie per aver usato");
	  }	  
    }while(selection != 0 || selection>6 || selection <0);



        //print("hello world!");
    }
		public static void pascoli(){
		for (int i = 1; i<=20; i++){
			System.out.println(i + (i==1?" pascoli":" poeta italiano") + " + 1 pascoli = " + (1 + i) + " poeta italiano");
		}
		System.out.println("rip e ciao");
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
    public static void inputIntFilastroccaTopi(){
    Scanner myObj = new Scanner(System.in);
         // Crea un oggetto Scanner, serve per l'input
        System.out.print("Inserisci il numero di topi: ");

        int nTopi = myObj.nextInt();  // Read user input
        System.out.println(nTopi + "topi" + " + 1 topo = " + (nTopi + 1));  // Output user input
  }
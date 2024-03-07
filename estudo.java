import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	Scanner myScanner = new Scanner (System.in);
	  System.out.print ("Diga o sexo: ");
	String a = myScanner.nextLine ();

	if (a.equals ("m"))
	  {
		System.out.print ("Seu sexo C) Masculino");


	  }
	else if (a.equals ("f"))
	  {
		System.out.print ("Seu sexo C) Feminina");
	  }
	else
	  {
		System.out.print ("Sexo invalidado");
	  }



  }
}

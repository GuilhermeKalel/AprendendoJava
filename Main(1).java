import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	Scanner myScanner = new Scanner (System.in);
	  System.out.print ("Sua Nota: ");
	float a = myScanner.nextFloat ();



	if (a >= 7)
	  {
		System.out.print ("Passou Direto! ParabC)ns! ");
	  }
	else if (7 > a && a > 5)
	  {
		System.out.print ("Direito a fazer RecuperaC'C#o: ");
	  }
	else
	  {
		System.out.print ("reprovado!");

	  }
  }
}

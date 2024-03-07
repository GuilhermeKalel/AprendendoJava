import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	Scanner myScanner = new Scanner (System.in);
	  System.out.print ("Peso que o elevador suporta: ");
	float a = myScanner.nextFloat ();
	  System.out.print ("Peso da primeira pessoa: ");
	float p1 = myScanner.nextFloat ();
	  System.out.print ("Peso da segunda pessoa: ");
	float p2 = myScanner.nextFloat ();
	  System.out.print ("Peso da terceira pessoa: ");
	float p3 = myScanner.nextFloat ();
	  System.out.print ("Peso da quarta pessoa: ");
	float p4 = myScanner.nextFloat ();
	  System.out.print ("Peso da quinta pessoa: ");
	float p5 = myScanner.nextFloat ();
	float soma = p1 + p2 + p3 + p4 + p5;

	if (a >= soma)
	  {
		System.out.print ("Peso Suportado " + soma + " Esta liberado: ");
	  }
	else
	  {
		System.out.print ("Peso nC#o Suportado, " + soma +
						  " NC#o Esta Liberado: ");
	  }
  }
}

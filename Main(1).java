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
/*• Crie um programa que recebe uma nota ( pela classe Scanner) e checa se
//você passou direto, ficou de recuperação ou foi reprovado na matéria.
//A regra é a seguinte:
//• Nota 7 ou mais: passou direto
//• Entre 5 e 7: tem direito de fazer uma prova de recuperação
• Abaixo de 5: reprovado direto*/

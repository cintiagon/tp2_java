package ejer2;
import java.util.Scanner;
public class ejer2 {
	
		private Scanner teclado;
	    private int num;

	public void IngreseNumero() {
	    teclado = new Scanner(System.in);
	    System.out.print("Ingrese un numero: ");
	    num = teclado.nextInt();
	}
	public void CalculoDeNumero() {
	    if (num < 10) {
	        System.out.println(num);
	        System.out.println("tiene un solo dígito.");
	    }
	    else if ((num >= 10) && (num < 100))
	    {
	      System.out.println(num);
	      System.out.println("tiene dos dígitos.");
	    }
	    else
	    {
	      System.out.println(num);
	      System.out.println("tiene tres o más dígitos.");
	    }
	}
	public static void main(String[] ar){
		ejer2 prueba1 = new ejer2();
	    prueba1.IngreseNumero();
	    prueba1.CalculoDeNumero();
	  }
	}

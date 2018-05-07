package ejer3;
import java.util.Scanner;
public class ejer3 {
	private Scanner teclado;
    private int f = 0; 
    private int p = 0;
    private int i = 0;
    private int num;

public void Ingresar_Y_Contar() {
    for (f = 0; f < 10; f++)
    {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese un numero entero: ");
    num = teclado.nextInt();
        if (num % 2 == 0) {
            p++;
        } else {
            i++;
        }
    }
}

public void MostrarPar_Impar() {
    System.out.print("La cantidad de numeros pares es: " +p);
    System.out.print("\n"+ "La cantidad de numeros  impares es: " +i);
}

public static void main(String[] ar){
	ejer3 prueba1 = new ejer3();
    prueba1.Ingresar_Y_Contar();
    prueba1.MostrarPar_Impar();
  }
}

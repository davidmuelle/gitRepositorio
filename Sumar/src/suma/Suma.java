package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		suma();
	}
//creando conflicto en master
	public static void suma() {
		int a,b, resultado;
		String respuesta="s";
		try 
		{
		Scanner teclado =new Scanner(System.in);
		while (respuesta=="s"){
			System.out.println("Introduce un número positivo:");
			a=teclado.nextInt();
			System.out.println("Introduce otro número positivo:");
			b=teclado.nextInt();
			if ((a > 0) && (b >0)) {
				resultado= a+b;
				System.out.println("El resultado es " + resultado);
				
			}
			else {
				System.out.println("No positivos");
				System.out.println("estás equivocado");
				
			}
			System.out.println("¿Quieres seguir sumando? s/n");
			//estoy modificando la rama de pruebas
			//estoy modificando la rama de pruebas
			respuesta=teclado.next();
		}
		teclado.close();
		
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
	
	}


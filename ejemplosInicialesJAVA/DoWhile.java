package ejemplosInicialesJAVA;

public class DoWhile {

	public static void main(String[] args) {

		// Descripción del ejercicio
		System.out.println("Contador de numeros hasta el 10");

		int num=1;
		System.out.println("Contando...");


		do{
			System.out.println("Vamos por el n?mero "+num);
			num++;
		}while(num<=10);

		System.out.println("Fin de la cuenta");
	}

}

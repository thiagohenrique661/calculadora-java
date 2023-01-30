import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		System.out.print("DIGITE O PRIMEIRO VALOR: ");

		int num1 = entrada.nextInt();

		System.out.print("DIGITE O SEGUNDO VALOR: ");

		int num2 = entrada.nextInt();

		System.out.println("DIGITE UMA OPERAÇÃO: ");
		String opc = entrada.next();

		switch(opc){
		case "+":

			int soma = num1 + num2;
			System.out.println("A soma é: "+soma);
			break;

		case "-":

			int diminui = num1 - num2;
			System.out.println("A subtração é: "+diminui);
			break;

		case "*":

			int multiplica = num1 * num2;

			System.out.println("A multiplicação é: "+multiplica);
			break;

		case "/":

			if (num1 < num2){
				System.out.println("Impossivel realizar cálculo! \n");
			}
			else
			{
				int divide = num1 / num2;

				System.out.println("A divisao e: "+divide);
			}
			break;

		default:

			System.out.print("Operação inválida!");
			break;
		}
	}
}




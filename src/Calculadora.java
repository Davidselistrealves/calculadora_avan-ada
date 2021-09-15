import java.util.Scanner;
// declaração dos atributos (variáveis)
public class Calculadora {
	double valor1;
	double valor2;
	double resultado;
		
	// cria um Objeto da classe Scanner
	Scanner input = new Scanner(System.in);
	
	//Métodos
	//somar
	public void somar() {
		//atribuição e valores (ENTRADA)
		System.out.println("Informe o primeiro valor da soma");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da soma");
		valor2 = input.nextDouble();
		
		
		
		//Cálculo (PROCESSAMENTO)
		resultado = valor1 + valor2;
		
		
		
		
		// Mostra o resultado na tela (SAÍDA)
		System.out.println("A soma é: " + resultado);
		
		
		
	}
	
	//subtrair
	
	public void subtrair() {
		System.out.println("Informe o primeiro valor da subtração");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da subtração");
		valor2 = input.nextDouble();
		resultado = valor1 - valor2;
		
		System.out.println("A subtração é: " + resultado);
		
		
	}
	//dividir
	public void dividir() {
		System.out.println("Informe o primeiro valor da divisão");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da divisão");
		valor2 = input.nextDouble();
		resultado = valor1 / valor2;
		System.out.println("A divisão é: " + resultado);
	}
	
	//multiplicar
	public void multiplicar() {
		System.out.println("Informe o primeiro valor da multiplicação");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da multiplicação");
		valor2 = input.nextDouble();
		resultado = valor1 * valor2;
		
		System.out.println("A multiplicação é: " + resultado);
	}
	
}

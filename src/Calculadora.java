import java.util.Scanner;
// declara��o dos atributos (vari�veis)
public class Calculadora {
	double valor1;
	double valor2;
	double resultado;
		
	// cria um Objeto da classe Scanner
	Scanner input = new Scanner(System.in);
	
	//M�todos
	//somar
	public void somar() {
		//atribui��o e valores (ENTRADA)
		System.out.println("Informe o primeiro valor da soma");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da soma");
		valor2 = input.nextDouble();
		
		
		
		//C�lculo (PROCESSAMENTO)
		resultado = valor1 + valor2;
		
		
		
		
		// Mostra o resultado na tela (SA�DA)
		System.out.println("A soma �: " + resultado);
		
		
		
	}
	
	//subtrair
	
	public void subtrair() {
		System.out.println("Informe o primeiro valor da subtra��o");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da subtra��o");
		valor2 = input.nextDouble();
		resultado = valor1 - valor2;
		
		System.out.println("A subtra��o �: " + resultado);
		
		
	}
	//dividir
	public void dividir() {
		System.out.println("Informe o primeiro valor da divis�o");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da divis�o");
		valor2 = input.nextDouble();
		resultado = valor1 / valor2;
		System.out.println("A divis�o �: " + resultado);
	}
	
	//multiplicar
	public void multiplicar() {
		System.out.println("Informe o primeiro valor da multiplica��o");
		valor1 = input.nextDouble();
		
		System.out.println("Informe o segundo valor da multiplica��o");
		valor2 = input.nextDouble();
		resultado = valor1 * valor2;
		
		System.out.println("A multiplica��o �: " + resultado);
	}
	
}

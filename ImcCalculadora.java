package iniciante;

import java.util.Scanner;

public class ImcCalculadora {
	
	public static void main(String[] args) {
	Scanner imc = new Scanner(System.in);

	{	
	System.out.print("Peso: ");
	float peso = imc.nextFloat();
	System.out.print("Altura: ");
	float altura = imc.nextFloat();
	float divisao = peso / (altura * altura);
	System.out.println("O IMC é: " + divisao);

	float resto = divisao;
	if(resto > 18.5 && resto < 25)
		System.out.println("Você está no peso ideal");
	else
	if(resto > 25) 
		System.out.println("Você está acima do peso ideal");
	else
	if(resto < 18.5 )
		System.out.println("Você está abaixo do peso ideal");
	}
	
	imc.close();
		
	}
	
}

	
	
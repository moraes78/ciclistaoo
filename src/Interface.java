import java.util.Scanner;

import codigos.*;

public class Interface {
	
	static Interpreta valoresInterpretados = new Interpreta();
	static Calcula valores= new Calcula();
	public static void main(String[] args) throws CiclistaException {
		Scanner entrada = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Informe distancia e tempo: ");
				String entradaString = entrada.nextLine();
				double[] valoresConvertidos = valoresInterpretados.interpretarValoresDeVelocidadeTempo(entradaString);
				double velocidadeMedia = valores.calcularVelocidadeMedia(valoresConvertidos[0],valoresConvertidos[1]);
						
				if (velocidadeMedia == 0.0) {
					System.out.println("Você não percorreu nenhuma distancia !!");
							
				} else {
					System.out.println("A velocidade media é : "+ velocidadeMedia + " Km/h");			
				}
				
			} catch (Exception CiclistaException) {
				System.out.println("Tempo não pode ser menor ou igual a zero!!");
						
			}
		}
	}

}

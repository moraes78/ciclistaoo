package codigos;

public class Interpreta {
	
	public static double[] interpretarValoresDeVelocidadeTempo(String entradaString)
			throws CiclistaException {
		double[] informacao = new double[2];
		if (!entradaString.equals("")) {
			String[] informacaoSeparada = entradaString.split(" ");
			informacao[0] = Double.parseDouble(informacaoSeparada[0]);
			informacao[1] = Double.parseDouble(informacaoSeparada[1]);

			return informacao;
		} else {
			throw new CiclistaException();
		}
	}

}

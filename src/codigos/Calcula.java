package codigos;

public class Calcula {
	public static double calcularVelocidadeMedia(double d, double t)
			throws CiclistaException {
		if (t > 0.0 && d >= 0) {
			return d / t;
		} else {
			throw new CiclistaException();
		}
	}

}

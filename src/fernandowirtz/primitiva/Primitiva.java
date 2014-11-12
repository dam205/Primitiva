package fernandowirtz.primitiva;

import java.util.Random;

public class Primitiva {

	private int[] numeros = new int[6];
	private String resultado = "";
	boolean repetido;

	public String calcular() {
		Random aleatorio = new Random();
		for (int f = 0; f < numeros.length; f++) {
			repetido = false;
			numeros[f] = aleatorio.nextInt(48) + 1;
			for (int i = 0; i < f; i++) {
				if (numeros[f] == numeros[i]) {
					f--;
					repetido = true;
				}
			}
			if (repetido == false) {
				resultado = resultado + (String.valueOf(numeros[f]) + " ");
			}
		}
		return resultado;
	}

}
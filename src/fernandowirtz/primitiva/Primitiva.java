package fernandowirtz.primitiva;

import java.util.Random;

public class Primitiva {

	private int[] numeros = new int[6];
	private String resultado = "";

	public String calcular() {
		Random aleatorio = new Random();
		for (int f=0;f<numeros.length;f++) {
			numeros[f] = aleatorio.nextInt(48) + 1;
			resultado = resultado + (String.valueOf(numeros[f])+" ");
		}
		return resultado;
	}
	

}
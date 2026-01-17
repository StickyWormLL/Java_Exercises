package Viajando_Siglo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		String[] datosEntrada = entrada.readLine().split(" ");
		
		short casos = Short.parseShort(datosEntrada[0]);
		
		StringBuilder resultado = new StringBuilder();
		
		short[] multiplicadores = { 12, 9, 18, 12 };
		
		for (short i = 1; i <= casos; i++) {
			String[] entradaSplit = entrada.readLine().split(" ");
			
			int peniques = 0;
			for (short j = 0; j < 4; j++) {
				peniques += Short.parseShort(entradaSplit[j]) * multiplicadores[j];
			}
			
			short chelines = (short) (peniques / 12);
			short centavos = (short) (peniques % 12);
			
			resultado.append(chelines / 20).append(" ").append(chelines % 20).append(" ").append(centavos).append("\n");
		}
		
		System.out.print(resultado);
	}
}
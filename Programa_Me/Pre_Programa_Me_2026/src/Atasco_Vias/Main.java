package Atasco_Vias;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		String[] datosEntrada = entrada.readLine().split(" ");
		
		short casos = Short.parseShort(datosEntrada[0]);
		
		StringBuilder resultado = new StringBuilder();
		
		for (short i = 1; i <= casos; i++) {
			String[] entradaSplit = entrada.readLine().split(" ");
			
			resultado.append("\n");
		}
		
		System.out.print(resultado);
	}
}

package Ordenando_Ramales;

//EMPEZADO: EL 18/12/25
//ACABADO: EL 19/12/25

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String[] history = new String[0];
		
		while (true) {

			int num_ramales = Integer.parseInt(input.readLine());

			if (num_ramales == 0) { break; }

			Ramales[] array_ramales = new Ramales[num_ramales];

			for (int i = 0; i < num_ramales; i++) {
				String[] user_input = input.readLine().split(" ");
				array_ramales[i] = new Ramales(user_input[0], user_input[1], Integer.parseInt(user_input[2]));
			}
		    
		    for (int i = 0; i < array_ramales.length; i++) {
		      for (int j = 0; j < array_ramales.length; j++) {
		        if ((array_ramales[i].getDistancia() == array_ramales[j].getDistancia()) && array_ramales[i].getTipo().equals("I")) {
		          Ramales temp = array_ramales[i];
		          array_ramales[i] = array_ramales[j];
		          array_ramales[j] = temp;
		        } else if (array_ramales[i].getDistancia() < array_ramales[j].getDistancia()) {
			          Ramales temp = array_ramales[i];
			          array_ramales[i] = array_ramales[j];
			          array_ramales[j] = temp;
		        }
		      }
		    }
		    
		    for (int i = 0; i < array_ramales.length; i++) {
			      String[] copy_history = Arrays.copyOf(history, history.length + 1);
			      copy_history[copy_history.length - 1] = array_ramales[i].getNombre();
			      history = copy_history;
			}
		    
		    String[] copy_history = Arrays.copyOf(history, history.length + 1);
		    copy_history[copy_history.length - 1] = "---";
		    history = copy_history;
		}
		
	    for (int i = 0; i < history.length; i++) {
		      System.out.println(history[i]);
		}

	}

	public static class Ramales {
		private String nombre;
		private int distancia;
		private String tipo;

		public Ramales(String nombre, String tipo, int distancia) {
			this.nombre = nombre;
			this.distancia = distancia;
			this.tipo = tipo;
		}

		public int getDistancia() {
			return distancia;
		}

		public String getTipo() {
			return tipo;
		}

		public String getNombre() {
			return nombre;
		}

	}

}

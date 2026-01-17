package No_Me_Da_La_Vida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder end_text = new StringBuilder();
		
		while (true) {

			int cases = 1001;
			
			while (cases > 1000) {
				cases = Integer.parseInt(input.readLine());
			}

			if (cases == 0) { break; }
			
			String[] time_videos = input.readLine().split(" ");
			
			int total_secods = 0;
			
			for (int i = 0; i < cases; i++) {
				total_secods += Integer.parseInt(time_videos[i]);
			}

			int horas = total_secods / 3600;
			int minutos = (total_secods % 3600) / 60;
			int segundos = total_secods % 60;

			String result = String.format("%02d:%02d:%02d", horas, minutos, segundos);
			
			end_text.append(result).append("\n");
		}
		
		System.out.print(end_text);
	}

}

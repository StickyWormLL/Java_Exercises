package Antiguos_Grados_Celsius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(input.readLine());
		
		StringBuilder end_text = new StringBuilder();
		
		for (int i = 1; i <= cases; i++) {
			int grads = 1001;
			
			while (grads > 1000) {
				grads = Integer.parseInt(input.readLine());
			}
			
			int real_grads = 100 - grads;
			
			end_text.append(real_grads + "\n");
		}
		
		System.out.print(end_text);
	}

}

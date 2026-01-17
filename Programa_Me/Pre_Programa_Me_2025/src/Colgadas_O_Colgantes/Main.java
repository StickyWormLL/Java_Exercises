package Colgadas_O_Colgantes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(input.readLine());

        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < casos; i++) {

            String word = (input.readLine()).toLowerCase();

            if (word.equals("colgadas")) {
                sb1.append("Bien\n");
            } else {
                sb1.append("Mal\n");
            }

        }

        System.out.println(sb1);
    }

}

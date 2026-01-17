package Anillamiento_Albufera;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        StringBuffer resultat = new StringBuffer();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int casos = Integer.parseInt(input.readLine());

            if (casos == 0) break;

            int contador = 0;
            for (int i = 0; i < casos; i++) {

                String[] s1 = (input.readLine()).split(" ");

                int resta = (Integer.parseInt(s1[0])) - (Integer.parseInt(s1[1]));
                contador += resta;

            }
            resultat.append(contador + "\n");

        }

        System.out.println(resultat);

    }

}

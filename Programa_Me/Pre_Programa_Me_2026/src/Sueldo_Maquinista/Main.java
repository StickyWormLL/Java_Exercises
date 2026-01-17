package Sueldo_Maquinista;

//EMPEZADO: EL 17/12/25
// HECHO EL 18/12/25

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int casosDePrueba = Integer.parseInt(entrada.readLine());

        for (int i = 0; i < casosDePrueba; i++) {

            String entradaUsuario = entrada.readLine();
            String[] entradaArr = entradaUsuario.split(" ");

            int toneladas = Integer.parseInt(entradaArr[0]);
            int distancia = Integer.parseInt(entradaArr[1]);
            int peniques = Integer.parseInt(entradaArr[2]);
            int gastos = Integer.parseInt(entradaArr[3]);
            int coste = Integer.parseInt(entradaArr[4]);
            int salario = Integer.parseInt(entradaArr[5]);

            int rentabilidad = (toneladas * distancia * peniques) - ((gastos * distancia * 2) + coste + salario);
            System.out.println(rentabilidad);

        }

    }

}
package br.com.dio.fundamentoaritimetico;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Desafio003 {

    public static void main(String[] args) throws IOException {
//declare suas variaveis corretamente
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int numero;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//continue a solução
        for (int i=0;i<5;i++) {
            numero = Integer.parseInt(br.readLine());
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero > 0) positivos++;
            if (numero < 0) negativos++;
        }
//insira suas variaveis corretamente
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }

}

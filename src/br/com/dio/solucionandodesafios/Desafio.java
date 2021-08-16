package br.com.dio.solucionandodesafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double soma = 0.0;


        int n = leitor.nextInt();

        while (n > 0) {
            soma += n;
            cont++;

            n = leitor.nextInt();
        }

        double media = soma / cont;
        System.out.println(String.format("%.2f", media));

    }

}
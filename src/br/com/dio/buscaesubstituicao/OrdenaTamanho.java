package br.com.dio.buscaesubstituicao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenaTamanho {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int entradas = Integer.parseInt(st.nextToken());
        List<String> palavrasList = new ArrayList<>();
        for (int i = 0; i < entradas; i++) {
            palavrasList.add(br.readLine());
        }

        palavrasList.stream()
                .forEach(p -> {
                    List<String> palavras = Arrays.asList(p.split(" "));
                    System.out.println(
                            palavras.stream()
                                    .sorted(Comparator.comparingInt(String::length)
                                            .reversed()
                                            .thenComparing(String::compareTo))
                                    .collect(Collectors.joining(" ")));
                });
    }
}

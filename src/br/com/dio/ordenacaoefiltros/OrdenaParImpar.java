package br.com.dio.ordenacaoefiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenaParImpar {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numeros = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int entradas = Integer.parseInt(st.nextToken());
        for(int i=0; i<entradas;i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            numeros.add(num);
        }

        List<Integer> pares = numeros.stream().filter(n-> n%2 ==0).sorted().collect(Collectors.toList());
        List<Integer> impares = numeros.stream().filter(n-> n%2 !=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        numeros.clear();
        numeros.addAll(pares);
        numeros.addAll(impares);

        numeros.stream()
                .forEach(System.out::println);
    }

}

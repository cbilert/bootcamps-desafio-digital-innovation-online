package br.com.dio.fundamentoaritimetico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Double> positivos = new ArrayList<>();
        int i=0;
        while(i<6){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num  = Double.parseDouble(st.nextToken());
            if (num >= 0){
                positivos.add(num);
            }
            i++;
        }
//        System.out.println(positivos.stream()
//                .map(Object::toString)
//                .collect( Collectors.joining( "," ) ));
        System.out.println(positivos.stream().count()+" valores positivos");
    }
}
package br.com.dio.ordenacaoefiltros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilaDoBanco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());
        int naoTrocar;

        List<Integer> numeros = new ArrayList<>();
        List<Integer> clientesAtendimento = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            naoTrocar = 0;
            int clientes = Integer.parseInt(br.readLine());
            String sms = br.readLine();

            numeros.addAll(Arrays.stream(sms.split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
            clientesAtendimento.addAll(numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

            for (int j = 0; j < clientes; j++) {
                if(numeros.get(j).compareTo(clientesAtendimento.get(j)) == 0){
                    naoTrocar++;
                }
            }

            System.out.println(naoTrocar);
            numeros.clear();
            clientesAtendimento.clear();
        }
    }
}

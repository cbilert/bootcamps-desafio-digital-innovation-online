package br.com.dio.ordenacaoefiltros;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class UniformesFinalAno {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int linhas = Integer.parseInt(st.nextToken());
        List<Tshirt> camisetas = new ArrayList<>();

        for (int i = 0; i <= linhas; i++) {
            String next = br.readLine();
            if(next.equals("0")) {
                break;
            }
            String[] dados = br.readLine().split(" ");
            Tshirt camiseta = new Tshirt(dados[1],dados[0],next);
            camisetas.add(camiseta);
        }
        Comparator<Tshirt> comparator = Comparator
                .comparing(Tshirt::getColor).reversed()
                .thenComparing(Tshirt::getSize).reversed()
                .thenComparing(Tshirt::getOwner);

        camisetas.stream().sorted(comparator).forEach(System.out::println);
    }

    public static class Tshirt {
        private String owner;
        private String color;
        private String size;

        @Override
        public String toString() {
            return this.getColor() + " " + this.getSize() + " " + this.getOwner();
        }

        public Tshirt(String size, String color, String owner) {
            this.size = size;
            this.color = color;
            this.owner = owner;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }
}
package br.com.dio.ordenacaoefiltros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gincana {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();

        int numAlunos;
        String aluno;
        String valorFicha;
        int valorAtualFicha;
        int indice;
        int indiceEliminado;

        numAlunos = Integer.parseInt(scr.next());

        while (numAlunos > 0) {
            for (int i = 0; i < numAlunos; i++) {
                aluno = scr.next();
                valorFicha = scr.next();
                alunos.add(aluno.trim() + " " + valorFicha.trim());
            }

            indice = 0;
            indiceEliminado = 0;
            valorAtualFicha = Integer.parseInt(alunos.get(indice).split(" ")[1]);

            for (int i = 0; i < numAlunos - 1; i++) {
                if (valorAtualFicha % 2 == 0) {
                    indiceEliminado = (alunos.size() - (valorAtualFicha % alunos.size()) + indice) % alunos.size();
                    valorAtualFicha = Integer.parseInt(alunos.get(indiceEliminado).split(" ")[1]);
                    alunos.remove(indiceEliminado);
                } else if (valorAtualFicha == 0) {
                    indiceEliminado = indice;
                } else if (valorAtualFicha % 2 != 0){
                    indiceEliminado = (valorAtualFicha % alunos.size() + indice) % alunos.size();
                    valorAtualFicha = Integer.parseInt(alunos.get(indiceEliminado).split(" ")[1]);
                    alunos.remove(indiceEliminado);
                }

                    indice = (valorAtualFicha % 2 == 0) ?
                        ((indiceEliminado <= alunos.size() - 1) ?
                                indiceEliminado : 0):
                        ((indiceEliminado == 0) ?
                                (alunos.size() - 1):(indiceEliminado - 1));
            }

            System.out.println("Vencedor(a): " + alunos.get(0).split(" ")[0]);

            alunos.clear();
            numAlunos = Integer.parseInt(scr.next());
        }

        scr.close();
    }
}

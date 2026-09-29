package view;

import java.util.Scanner;

public class Prg06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da turma : ");
        int codigo = sc.nextInt();

        System.out.println("Digite q qtd de alunos masc.");
        int qtdMasculino = sc.nextInt();

        System.out.println("Digite q qtd de alunos fem.");
        int qtdFeminino = sc.nextInt();

        System.out.println("Digite q qtd de alunos aprovados.");
        int qtdAprovados = sc.nextInt();

        int totalAlunosTurma = qtdMasculino + qtdFeminino;
        int totalReprovados = totalAlunosTurma - qtdAprovados;

        double porcentagemMasc = qtdMasculino * 100.0 / totalAlunosTurma;
        double porcentagemFem = qtdFeminino * 100.0 / totalAlunosTurma;
        double porcentagemReprovados = totalReprovados * 100.0 / totalAlunosTurma;

        System.out.println("Codigo da Turma.........: " + codigo);
        System.out.println("Total de Aluno..........: " + totalAlunosTurma);
        System.out.println("Porcentagem Masculino...: " + porcentagemMasc);
        System.out.println("Porcentagem Feminino....: " + porcentagemFem);
        System.out.println("Porcentagem Reprovados..: " + porcentagemReprovados);

    }

}

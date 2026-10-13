package app;

import model.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAluno {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        while(true){
            System.out.println("Digite o Id do aluno ou 0 para finalizar");
            int id = sc.nextInt();

            if(id==0){
                break;
            }
            sc.nextLine();
            System.out.println("Digite o nome ");
            String nome = sc.nextLine();

            double[] notas = new double[3];
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota "+ (i+1)+ " :");
                notas[i] = sc.nextDouble();
            }
            Aluno aluno = new Aluno(id,nome,notas);
            alunos.add(aluno);

        }

        System.out.println("\n================ RESULTADOS  ====================\n");
        for(Aluno aluno : alunos){

            System.out.println("Id .......: "+ aluno.getId());
            System.out.println("Nome.......:" +aluno.getNome());
            System.out.println("--------------------------");


        }






        System.out.println("FIM");
    }


}

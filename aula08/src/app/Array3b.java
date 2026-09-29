package app;
// Define que esta classe pertence ao pacote chamado "app".
// É uma forma de organizar as classes do projeto.

import java.util.Scanner;
// Importa a classe Scanner.
// O Scanner permite receber dados digitados pelo usuário.

public class Array3b {
// Declara a classe chamada Array3.

    public static void main(String[] args) {
        // É o método principal do programa.
        // A execução do Java começa aqui.

        final int TAM = 5;
        // Cria uma constante chamada TAM com valor 5.
        // "final" significa que esse valor não será alterado.
        // Vamos usar TAM para definir o tamanho dos arrays.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner chamado "sc".
        // System.in representa o teclado.
        // Assim, podemos ler o que o usuário digitar.

        String[] nome = new String[TAM];
        // Cria um array de String chamado "nome".
        // Ele terá 5 posições, porque TAM vale 5.
        //
        // As posições são:
        // nome[0]
        // nome[1]
        // nome[2]
        // nome[3]
        // nome[4]

        double[] salario = new double[TAM];
        // Cria um array de double chamado "salario".
        // Também terá 5 posições.
        //
        // salario[0]
        // salario[1]
        // salario[2]
        // salario[3]
        // salario[4]


        for (int i = 0; i < TAM; i++) {
            // Cria um loop que vai repetir 5 vezes.
            //
            // int i = 0 → começa na posição 0.
            // i < TAM → enquanto i for menor que 5.
            // i++ → aumenta i em 1 a cada repetição.
            //
            // Portanto:
            // primeira volta → i = 0
            // segunda volta   → i = 1
            // terceira volta  → i = 2
            // quarta volta    → i = 3
            // quinta volta    → i = 4

            System.out.println("Digite o nome da posição " + (i + 1) + " : ");
            // Mostra uma mensagem para o usuário.
            //
            // Usamos i + 1 porque o usuário normalmente pensa
            // nas posições como 1, 2, 3, 4 e 5.
            //
            // Porém, o array começa em 0.
            //
            // Quando i = 0 → mostra posição 1
            // Quando i = 1 → mostra posição 2
            // etc.

            nome[i] = sc.next();
            // Lê o nome digitado pelo usuário.
            // Guarda esse nome dentro do array "nome".
            //
            // Se i = 0:
            // nome[0] = nome digitado
            //
            // Se i = 1:
            // nome[1] = nome digitado

            System.out.println("Digite o salario da posição " + (i + 1) + " : ");
            // Pede para o usuário digitar o salário.

            salario[i] = sc.nextDouble();
            // Lê o salário digitado.
            // Como o salário é um número decimal, usamos double.
            //
            // O salário é armazenado na mesma posição "i".
            //
            // Exemplo:
            // nome[0] = "Joao"
            // salario[0] = 2500.00

            sc.nextLine();
            // Consome o ENTER que ficou no Scanner depois do nextDouble().
            // Isso ajuda a evitar problemas quando formos ler Strings
            // posteriormente com nextLine().

        }
        // Fim do primeiro for.


        int indiceMaiorSalario = 0;
        // Guarda o índice (posição) onde está o maior salário.
        //
        // Começamos supondo que o maior salário está na posição 0.

        double maiorSalario = 0.0;
        // Guarda o VALOR do maior salário.
        //
        // Inicialmente estamos dizendo:
        // "Por enquanto, o maior salário é 0."


        for (int i = 0; i < TAM; i++) {
            // Percorre novamente todas as posições do array salario.
            //
            // i vai assumir:
            // 0, 1, 2, 3 e 4.

            if (salario[i] > maiorSalario) {
                // Verifica se o salário atual é maior que o maior salário
                // que encontramos até o momento.
                //
                // Exemplo:
                // salario[i] = 3000
                // maiorSalario = 2500
                //
                // 3000 > 2500 → verdadeiro!

                maiorSalario = salario[i];
                // Se encontrou um salário maior,
                // atualiza o valor do maior salário.
                //
                // Exemplo:
                // maiorSalario = 3000;

                indiceMaiorSalario = i;
                // Guarda a posição onde encontramos o maior salário.
                //
                // Se o salário de 3000 estiver na posição 2:
                //
                // indiceMaiorSalario = 2;

            }
            // Fim do if.

        }
        // Fim do segundo for.


        System.out.println("O maior salário é " + salario[indiceMaiorSalario]
                + " Nome " + nome[indiceMaiorSalario]);
        // Mostra o maior salário e o nome da pessoa.
        //
        // Aqui está uma parte MUITO importante.
        //
        // Suponha que:
        //
        // nome[0] = "Joao"
        // salario[0] = 2000
        //
        // nome[1] = "Maria"
        // salario[1] = 5000
        //
        // nome[2] = "Pedro"
        // salario[2] = 3000
        //
        // O maior salário está na posição 1.
        //
        // Então:
        // indiceMaiorSalario = 1
        //
        // salario[1] → 5000
        // nome[1] → Maria
        //
        // Resultado:
        // O maior salário é 5000.0 Nome Maria


        sc.close();
        // Fecha o Scanner.
        // É uma boa prática fechar recursos que não serão mais utilizados.

    }
    // Fim do método main.

}
// Fim da classe Array3.

import jdk.management.resource.ThrottledMeter;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    //Variaveis e objetos estaticos que serão utilizados durante o programa
    static Scanner ler = new Scanner(System.in);
    public static int matriz_real[][] = null;
    public static int matriz_real2[][] = null;
    public static boolean cair_fora = false;
    public static int opcao = 0;

    //funçoes e metodos

    //função que retorna uma matriz criada de forma manual, usuario digite valor de cada posição
    public static int[][] CriaMatrizManualmente(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor para a posição -> linha " + i + " coluna " + j + " :");
                int valor = ler.nextInt();
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    //funcão que retorna uma matriz com o tamanho especificado pelos parametros
    public static int[][] CriaMatriz(int linha, int coluna) {
        int matriz[][] = new int[linha][coluna];
        return matriz;
    }

    //função que retorna uma matriz com valores aleatórios nas posições
    public static int[][] CriaMatrizAleatoria(int[][] matriz, int intervalo) {
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * intervalo);
            }
        }
        return matriz;
    }

    //função que retorna a multiplicação de duas matrizes passadas pelos parametros
    public static int[][] MultiplicacaoMatriz(int matriz[][], int matriz2[][]) {
        int matriz_local[][] = matriz;
        int matriz_local2[][] = matriz2;
        int resultado[][] = new int[matriz_local.length][matriz_local2[0].length];
        for (int i = 0; i < matriz_local.length; i++) {
            for (int j = 0; j < matriz_local2[0].length; j++) {
                int somatoria = 0;
                for (int a = 0; a < matriz_local[0].length; a++) {
                    int x = matriz_local[i][a] * matriz_local2[a][j];
                    somatoria += x;
                }
                resultado[i][j] = somatoria;
            }
        }
        return resultado;
    }

    //método que lê linha por linha da matriz
    public static void LerMatriz(int[][] matriz) {
        System.out.println("Sua matriz");
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d \t", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
    }

    //método que cria as matrizes e define se será construida de forma manual ou aleatória
    public static void ProcedimentoPadrao() {
        int matriz[][] = null;
        int matriz2[][] = null;
        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite a quantidade de colunas da sua %dº matriz:", i + 1);
            int coluna = ler.nextInt();
            System.out.printf("Digite a quantidade de linhas da sua %dº matriz:", i + 1);
            int linha = ler.nextInt();
            if (i == 0) {
                matriz = CriaMatriz(linha, coluna);
            }
            if (i == 1) {
                matriz2 = CriaMatriz(linha, coluna);
            }
        }
        System.out.println("Você gostaria de inserir os dados nas matrizes manualmente ou de forma aleatória?");
        System.out.println("Se manualmente digite 1, se for de forma randomica digite 2: ");
        int in_opcao = ler.nextInt();
        if (in_opcao == 1) {
            matriz_real = CriaMatrizManualmente(matriz);
            LerMatriz(matriz_real);
            matriz_real2 = CriaMatrizManualmente(matriz2);
            LerMatriz(matriz_real2);
        }
        if (in_opcao == 2) {
            System.out.printf("Digite o intervalo de números aleatórios que você deseja 'EXEMPLO: 100 -> NUMEROS DE 0 A 100': ");
            int intervalo = ler.nextInt();
            matriz_real = CriaMatrizAleatoria(matriz, intervalo);
            LerMatriz(matriz_real);
            matriz_real2 = CriaMatrizAleatoria(matriz2, intervalo);
            LerMatriz(matriz_real2);
        }
    }

    //método que após o processamento de alguma operação permite ao usuário escolher se quer fazer outra operação ou sair do programa
    public static void Cair_fora() {
        System.out.println("Deseja realizar outra operação?Se sim digite 1, se não digite 2");
        int opcao_in = ler.nextInt();
        if (opcao_in == 1) {
            System.out.println("Digite a operação que deseja realizar: ");
            opcao = ler.nextInt();
            cair_fora = false;
        } else {
            cair_fora = true;
            opcao = 5;
        }
    }

    //método para sair do bloco de repetição caso o usuário digite uma opção inválida
    public static void Cair_fora2() {
        System.out.println("Você digitou uma opção inválida ou inexistente, comece de novo!\n");
        cair_fora = true;
    }


    public static void main(String[] args) {
        boolean Try = true;
        //While para caso queria sair do bloco Try, condição IF no finally
        while(Try == true){
            try {
                boolean primeira_vez = true;
                while (opcao != 5) {
                    if (primeira_vez != true) {
                        if (opcao != 1 && opcao != 2 && opcao != 4 && opcao != 5) {
                            System.out.printf("Você digitou uma opção inválida");
                            break;
                        }

                    }
                    //caso o usuario digite 5 já sai do programa
                    if (opcao == 5) {
                        break;
                    }

                    //menu do programa
                    System.out.println("Bem vindo!\n");
                    System.out.println("CALCULA MATRIZ X MATRIZ!\n");
                    System.out.println("===========================================");
                    System.out.println("Escolha uma operação utilizando matrizes!");
                    System.out.println("===========================================");
                    System.out.println("Para multiplicar digite 1");
                    System.out.println("Para somar digite 2");
                    //System.out.println("Para dividir digite 3");
                    System.out.println("Para subtrair digite 4");
                    System.out.println("Para sair do programa digite 5");
                    System.out.println("===========================================\n");
                    System.out.printf("");
                    System.out.println("Digite a operação desejada");
                    opcao = ler.nextInt();
                    //bloco de repetição para a escolha da operação
                    //enquanto o cair fora for falso vai continuar dentro do loop de repetição
                    cair_fora = false;
                    while (cair_fora == false) {
                        if (opcao == 1) {
                            ProcedimentoPadrao();
                            //verifica se a matriz1 possui a mesma quantidade de colunas em relaçao as linhas da matriz2
                            if (matriz_real[0].length == matriz_real2.length) {
                                int resultado[][] = MultiplicacaoMatriz(matriz_real, matriz_real2);
                                LerMatriz(resultado);
                                System.out.println("↑ Matriz resultado ↑");
                                Cair_fora();
                            } else {
                                //caso não possua não é possível fazer a multiplicação
                                System.out.println("Não é possíve multiplicar essa matriz");
                                opcao = 0;
                            }
                        }
                        if (opcao == 2) {
                            ProcedimentoPadrao();
                            //verifica se as matrizes possuem as mesmas dimensões
                            if (matriz_real2[0].length == matriz_real[0].length && matriz_real.length == matriz_real2.length) {
                                int resultado[][] = new int[matriz_real.length][matriz_real[0].length];
                                for (int i = 0; i < matriz_real.length; i++) {
                                    for (int j = 0; j < matriz_real2[0].length; j++) {
                                        resultado[i][j] = matriz_real[i][j] + matriz_real2[i][j];//soma das matrizes 1 e 2
                                    }
                                }
                                LerMatriz(resultado);
                                System.out.println("↑ Matriz resultado ↑");
                                Cair_fora();
                            } else {
                                //caso as matrizes não possuem as mesmas dimensões
                                System.out.printf("Não é possível fazer a operação");
                                opcao = 0;
                            }
                        }
                    /*Implementação Futura
                    if (opcao == 3) {
                    }*/
                        if (opcao == 4) {
                            ProcedimentoPadrao();
                            //verifica se as matrizes possuem as mesmas dimensões
                            if (matriz_real2[0].length == matriz_real[0].length && matriz_real.length == matriz_real2.length) {
                                int resultado[][] = new int[matriz_real.length][matriz_real2[0].length];
                                for (int i = 0; i < matriz_real.length; i++) {
                                    for (int j = 0; j < matriz_real2[0].length; j++) {
                                        resultado[i][j] = matriz_real[i][j] - matriz_real2[i][j];//subtração das duas matrizes
                                    }
                                }
                                LerMatriz(resultado);
                                System.out.println("Deseja realizar outra operação?Se sim digite 1, se não digite 2");
                                System.out.println("↑ Matriz resultado ↑");
                                Cair_fora();
                            } else {
                                //caso as matrizes não possuem as mesmas dimensões
                                System.out.printf("Não é possível fazer a operação");
                                opcao = 0;
                            }
                        }
                        //caso passe por todas as opções e o usuario tenha digitado 5
                        if(opcao == 5){
                            break;
                        }
                        //caso passe por todas as opções e o usuário não tenha digitado nenhuma das opçoes
                        Cair_fora2();
                        primeira_vez = false;
                    }
                }
                //System.out.printf("Fim do programa\n");

            //caso o usuário não tenha digitado letra ao inves de numero
            } catch (InputMismatchException erro1) {
                System.err.println("Não é permitido inserir letras, informe apenas números inteiros!Tente novamente!");
                ler.nextLine(); //descarta a entrada errada do usuário
            //ultima ação caso o usuário tenha cometido algum erro de sintaxe
            } finally {
                System.out.printf("Você digitou errado ou deseja sair!Se quiser sair digite 1, se não digite 2: ");
                int decisao = ler.nextInt();
                //Sai do bloco de repetição mais externo
                if(decisao == 1){
                    Try = false;
                }else if(decisao == 2){
                    opcao = 0;
                    Try = true;
                }else{
                    Try = false;
                }
            }
        }
    }
}


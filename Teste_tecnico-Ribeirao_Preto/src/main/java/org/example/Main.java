package org.example;

public class Main {

    private static void Teste_Um(long number) {
        long a = 0, b = 1,i = 0;

        System.out.println("Teste:1)");

        if(number == 0){
            System.out.printf("numero %d Pertence a seguencia",0);
        }else{
            while(i < 9999) {
                long next = a + b;
                if(next == number) {
                    System.out.printf("numero %d Pertence a seguencia",next);
                    break;
                }else if(number < next) {
                    System.out.printf("Numero %d não faz parte da sequencia\n",number);
                    break;
                }
                a = b;
                b = next;
                i++;
            }
        }
        System.out.println("\n");
    }

    private static void Teste_Dois(String parametro) {
        char[] caracters = parametro.toCharArray();
        int contador = 0;

        for (char caracter : caracters) {
            if (caracter == 'a' || caracter == 'A') {
                contador++;
            }
        }
        System.out.println("Teste:2)");
        System.out.printf("Foram encontradas %d letras 'a' na palavra: %s \n\n",contador,parametro);
    }

    private static void Teste_Tres() {
        int indice = 12,soma = 0,k = 1;
        while(k < indice){
            k += 1;
            soma += k;
        }
        System.out.println("Teste:3)");
        System.out.println("O Resultado da soma e: "+soma+"\n");
    }

    private static void Teste_Quatro() {

        System.out.println("Teste:4)");
        System.out.println("A) seguencia de numeros impares:");
        for(int i = 0; i < 10; i++)System.out.print((i%2!=0)?i+" ":"");

        System.out.println("\n\nB) Progressão geométrica:");
        for(int i = 2; i <= 128; i*=2)System.out.print(i+" ");


        System.out.println("\n\nC) Quadrados perfeitos");
        for (int i = 0; i <= 7; i++) {
            System.out.print((i * i) + " ");
        }

        System.out.println("\n\nD) Quadrados perfeitos de números pares");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print((i * i) + " ");
        }

        System.out.println("\n\nE) Fibonacci");
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 7; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        System.out.println("\n\nF) Sequencia de numeros que começão com a Letra D");
        System.out.println("2 10 12 16 17 18 19 200");

    }

    private static void Teste_Cinco() {

        System.out.println("\n\nTeste:5)");
        System.out.println("primeiro lique a primeira lampada e depois de um tempo desligue, ligue a segunda e  olhe as tres lampadas :");
        System.out.println(" A lampada ligada e a segunda  lampada");
        System.out.println(" A desligada que esta  quente e a primeira e a lampada  ");
        System.out.println(" A desligada  e fria e a terceira ");

    }

    public static void main(String[] args) {
        var parametroTesteUm =  0;// Altere variavel para interagir com as entradas
        var parametroTesteDois ="abacate";// Altere variavel para interagir com as entradas

        Teste_Um(parametroTesteUm);
        Teste_Dois(parametroTesteDois);
        Teste_Tres();
        Teste_Quatro();
        Teste_Cinco();
    }
}

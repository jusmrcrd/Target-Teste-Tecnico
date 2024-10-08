package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.TestThreeModel.DesserializadorJson.*;

import java.io.*;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void Teste_Um(){
        int indice = 13,soma = 0,k = 0;
        while(k < indice) soma +=  k +=1;
        System.out.println("Teste:1)");
        System.out.println("O Resultado da soma e: "+soma+"\n");
    }

    public static void Teste_Dois(long number){
        long a = 0, b = 1,i = 0;

        System.out.println("Teste:2)");

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
    public static  void Teste_Tres(){
        System.out.println("Teste:3)");
        try {
            String jsonCaminho = "./src/main/java/org/example/TestThreeModel/data/dados.json";
            ObjectMapper objectMapper = new ObjectMapper();
            List<Faturamento> DadosJson = objectMapper.readValue(new File(jsonCaminho),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Faturamento.class));

            List<Faturamento> faturamentoMensal = DadosJson.stream().filter(filtro -> filtro.getValor() > 0).toList();

            //O minimo valor Faturamento do mes
            Faturamento minFaturamento = faturamentoMensal.stream()
                    .min(Comparator.comparing(Faturamento::getValor)).get();

            //O maior valor faturamento do Mes
            Faturamento maxFaturamento = faturamentoMensal.stream()
                    .max(Comparator.comparing(Faturamento::getValor)).get();

            //Media do faturamento
            Double mediaFaturamento = faturamentoMensal.stream()
                    .mapToDouble(Faturamento::getValor).average().getAsDouble();

            List<Faturamento> mediaSupFaturamento = faturamentoMensal.stream()
                    .filter(filtro -> filtro.getValor() > mediaFaturamento).toList();

            System.out.println("O menor faturamento do mês: "+minFaturamento);
            System.out.println("O maior faturamento do mês: "+maxFaturamento);
            System.out.println("O numero de Dias que o faturamento foi superior a media do mês: "+mediaSupFaturamento.size()+" Dias");
            mediaSupFaturamento.forEach(System.out::println);

            System.out.println("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Teste_Quatro(){
        final double SP = 67836.43;
        final double RJ = 36678.66;
        final double MG = 29229.88;
        final double ES = 27165.48;
        final double Outros = 19849.53;

        final double total = SP+RJ+MG+ES+Outros;

        System.out.println("Teste:4)");
        System.out.printf("Percentual de SP: %.2f%%\n", (SP / total) * 100);
        System.out.printf("Percentual de RJ: %.2f%%\n", (RJ / total) * 100);
        System.out.printf("Percentual de MG: %.2f%%\n", (MG / total) * 100);
        System.out.printf("Percentual de ES: %.2f%%\n", (ES / total) * 100);
        System.out.printf("Percentual de Outros: %.2f%%\n\n", (Outros / total) * 100);
    }

    public static void Teste_Cinco(String entrada){
        char[] caracter = entrada.toCharArray();

        for(int i = 0, l = entrada.length()-1;  i < entrada.length()/2; i++,l--) {
            char temp = caracter[i];
            caracter[i] = caracter[l];
            caracter[l] = temp;
        }
        String inverso = new String(caracter);

        System.out.println("Teste:5)");
        System.out.println("Entrada: "+entrada);
        System.out.println("Invertido: "+inverso);
    }

    public static void main(String[] args) {
        var ParametroTesteDois = 34; // Altere variavel para interagir com as entradas
        var ParametroTesteCinco = "Teste Aqui";//Altere variavel para interagir com as entradas

        Teste_Um();
        Teste_Dois(ParametroTesteDois);
        Teste_Tres();
        Teste_Quatro();
        Teste_Cinco(ParametroTesteCinco);

    }
}
package targetsistemas.sp;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

/**
 * Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
 * faça um programa, na linguagem que desejar, que calcule e retorne:
    • O menor valor de faturamento ocorrido em um dia do mês;
    • O maior valor de faturamento ocorrido em um dia do mês;
    • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 */
public class FaturamentoMensal {
    private static List<Dado> dados;
    private static double menor;
    private static double maior;
    private static int dias;

    public static List<Dado> lerJson(){
        try {
            JsonReader jr = new JsonReader(new FileReader("src/main/java/targetsistemas/sp/utils/dados.json"));
            Type listaDados = new TypeToken<ArrayList<Dado>>(){}.getType();
            List<Dado> datas = new Gson().fromJson(jr, listaDados);
            return datas;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static double menor(List<Dado> dados){
        double menor = dados.get(0).getValor();
        for(Dado dado : dados){
            if(dado.getValor() != 0 && dado.getValor() < menor){
                menor = dado.getValor();
            }
        }
        return menor;
    }

    public static double maior(List<Dado> dados){
        double maior = dados.get(0).getValor();
        for(Dado dado : dados){
            if(dado.getValor() != 0 && dado.getValor() > maior){
                maior = dado.getValor();
            }
        }
        return maior;
    }

    public static double media(List<Dado> dados){
        double soma = 0;
        int dias = 0;
        for(Dado dado : dados){
            if(dado.getValor() != 0){
                soma += dado.getValor();
                dias++;
            }
        }
        return soma/dias;
    }

    public static int dias(List<Dado> dados){
        double media = media(dados);
        int dias = 0;
        for(Dado dado : dados){
            if(dado.getValor() > media){
                dias++;
            }
        }
        return dias;
    }

    public static void main(String[] args) {
        dados = lerJson();
        menor = menor(dados);
        maior = maior(dados);
        dias = dias(dados);

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: "+menor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: "+maior);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "+dias);
    }
    
}
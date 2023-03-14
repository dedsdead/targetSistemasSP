import java.util.HashMap;

public class Percentual {
    public static HashMap<String, Double> faturamento = new HashMap<String, Double>();
    public static double total;

    public static void main(String[] args) {
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        faturamento.forEach((String k, Double v) -> total+=v);
        faturamento.forEach((String k, Double v) -> System.out.format("%s: %.2f%%%n",k, v*100/total));
        

    }
    
}

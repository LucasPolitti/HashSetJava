import java.util.HashSet;

public class HashSetJava{
    public static void main(String[] args) {
     
        HashSet<String> carros = new HashSet<>(); //Particularidade, não adiciona valores repetidos
        
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Ka");
 
        System.out.println(carros.add("Polo")?"Adicionado":"Não adicionado");
        System.out.println(carros.contains("Ka")?"SIM" : "NÃO");


    }
}
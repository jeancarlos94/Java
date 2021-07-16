import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Criação do objeto HashTable
        Hashtable<String, Integer> pessoas = new Hashtable<>();

        //Adicionando elementos ao HashTable
        pessoas.put("João", 66);
        pessoas.put("Jean", 26);
        pessoas.put("Naiara", 25);
        pessoas.put("Miguel", 4);
        pessoas.put("Maria", 50);

        //Iterando sobre o HashTable
        for (Map.Entry<String, Integer> obj : pessoas.entrySet()){
            System.out.println(obj.getKey() + " -> " + obj.getValue());
        }

        //Adicionando elemento ao HashTable
        pessoas.put("Hakan", 19);

        //Removendo o elemento Miguel do HashTable
        pessoas.remove("Miguel");

        //Retornará a idade do objeto referente a Naiara no HashTable
        int idadeAux = pessoas.get("Naiara");

        //Retorna o tamanho atual do HashTable
        System.out.println(pessoas.size());
    }
}

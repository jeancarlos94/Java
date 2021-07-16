import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //Criação do objeto TreeMap que recebrá chave e valor do tipo String
        TreeMap<String, String> treeCaptais = new TreeMap<>();

        //Inserção de valores na TreeMap
        treeCaptais.put("RS", "Porto Alegre");
        treeCaptais.put("MG", "Belo Horizonte");
        treeCaptais.put("SC", "Florianópolis");
        treeCaptais.put("PR", "Curitiba");
        treeCaptais.put("SP", "São Paulo");
        treeCaptais.put("RJ", "Rio de Janeiro");

        System.out.println(treeCaptais);

        //Retorna o primeiro elemento no topo da árvore
        System.out.println("Primeiro elemento da Tree: " + treeCaptais.firstKey());

        //Retorna o ultimo elemento da árvore
        System.out.println("Último elemento da Tree: " + treeCaptais.lastKey());

        //Retorna o elemento abaixo do elemento passado no parâmetro
        System.out.println(treeCaptais.lowerKey("SC"));

        //Retorna o elemento acima do elemento passado no parâmetro
        System.out.println(treeCaptais.higherKey("PR"));

        //Retorna o primeiro elemento do topo da árvore
        System.out.println(treeCaptais.firstEntry().getKey() + " | " + treeCaptais.firstEntry().getValue());

        //Retorna o último elemento da árvore
        System.out.println(treeCaptais.lastEntry().getKey() + " | " + treeCaptais.lastEntry().getValue());

        ////Retorna o elemento acima do elemento passado no parâmetro
        System.out.println(treeCaptais.higherEntry("RS").getKey() + " / " + treeCaptais.higherEntry("RS").getValue());

        //Retorna o elemento abaixo do elemento passado no parâmetro
        System.out.println(treeCaptais.lowerEntry("RS").getKey() + " / " + treeCaptais.lowerEntry("RS").getValue());

        Iterator<String> iterator = treeCaptais.keySet().iterator();
        String key; //Irá armazenar a key do elemento

        //Forma não elegante de se fazer iteração sobre a TreeSet
        while (iterator.hasNext()){
            key = iterator.next();
            System.out.println(key + "-" + treeCaptais.get(key));
        }

        //Forma elegante, utilizando Entry que já traz tanto key quanto value consigo.
        for (Map.Entry<String, String> obj : treeCaptais.entrySet()){
            System.out.println(obj.getKey() + "--" + obj.getValue());
        }

        for (String capital : treeCaptais.keySet()){
            System.out.println(capital + "---" + treeCaptais.get(capital));
        }
    }
}

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
      
        //Desvantagem: Sempre que um objeto da árvore é modificado, uma re-ordenação acontece.
      
        TreeSet<String> lugares = new TreeSet<>();
        lugares.add("Belo Horizonte");
        lugares.add("São Paulo");
        lugares.add("Florianópolis");
        lugares.add("Oliveira");
        lugares.add("Pernambuco");
        lugares.add("Santa Catarina");

        System.out.printf("Arvore --> %1$s\n", lugares);
        System.out.printf("Topo de árvore --> %1$s\n", lugares.first());
        System.out.printf("Fim da árvore --> %1$s\n", lugares.last());
        System.out.printf("Primeiro nó abaixo do parâmetro da chamada --> %1$s\n", lugares.lower("Oliveira"));
        System.out.printf("Primeiro nó acima do parâmetro da chamada --> %1$s\n", lugares.higher("Oliveira"));
        System.out.printf("Primeiro nó removendo-o após a chamada --> %1$s\n", lugares.pollFirst());
        System.out.printf("Último nó removendo-o após a chamada --> %1$s\n", lugares.pollLast());

        System.out.println("\nExecutando o iterator ...\n");
        Iterator iterator = lugares.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

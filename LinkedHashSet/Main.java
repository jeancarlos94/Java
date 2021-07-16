import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        //A principal diferença para o HashSet é que o LinkedHashSet mantém a ordem de inserção.

        //Criação do objeto LinkedHashSet do tipo Integer
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adição de elementos no LinkedHashSet
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //Removendo o item 8 do LinkedHashSet
        sequenciaNumerica.remove(8);

        //Iteração sobre o LinkedHashSet utilizando iterator
        Iterator iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Retorna se o LinkedHashSet possui o valor 16 armazenado em alguma das posições
        System.out.println(sequenciaNumerica.contains(16));

        //Retorna o tamanho atual do LinkedHashSet
        System.out.println(sequenciaNumerica.size());

        //Limpa completamente o LinkedHashSet
        sequenciaNumerica.clear();

        //Retorna se o LinkedHashSet está vazio
        System.out.println(sequenciaNumerica.isEmpty());
    }
}

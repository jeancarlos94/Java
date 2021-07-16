import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
      
        //Criação do objeto Hash
        HashSet<Double> notas = new HashSet<>();

        //Inserção de valores no Hash
        notas.add(9.8);
        notas.add(3.0);
        notas.add(5.7);
        notas.add(1.4);
        notas.add(7.5);
        notas.add(3.3);
        notas.add(8.0);
        notas.add(3.4);
        notas.add(4.2);
        notas.add(7.7);

        System.out.println(notas);

        //Remover o elemento 3.4 do Hash
        notas.remove(3.4);

        System.out.println(notas);

        System.out.printf("HashSet está vazio ? --> %1$s\n",notas.isEmpty());

        System.out.printf("Tamanho do HashSet --> %1$d\n", notas.size());

        //Iteração com Iterator sobre o Hash
        Iterator iterator = notas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Retorna se existe o valor 8.0 no Hash
        System.out.printf("Existe o item 8.0 no HashSet ? --> %1$s\n", notas.contains(8.0));

        //Limpa o Hash
        notas.clear();

        System.out.printf("HashSet está vazio ? --> %1$s\n",notas.isEmpty());
    }
}

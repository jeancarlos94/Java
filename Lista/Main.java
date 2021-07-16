import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        /*
            Crie uma lista que execute as seguintes operações:
                - Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa, João.
                - Navegue na lista exibindo cada nome no console.
                - Substitua o nome Carlos por Roberto.
                - Retorne o nome da posição 1.
                - Remova o nome da posição 4.
                - Remova o nome João.
                - Retorne a quantidade de itens na lista.
                - Verifique se o nome Juliano existe na lista.
                - Crie uma nova lista com os nomes: Ismael, Rodrigo.
                - Adicione todos os itens da nova lista na primeira lista criada.
                - Ordene os itens da lista por ordem alfabética.
                - Verifique se a lista está vazia.
         */
        
        //Criação do objeto listaNomes
        List<String> listaNomes = new ArrayList<>();
      
        //Adição de valores na lista
        listaNomes.add("Juliana");
        listaNomes.add("Pedro");
        listaNomes.add("Carlos");
        listaNomes.add("Larissa");
        listaNomes.add("João");
        
        //Criação do objeto iterator para lista
        ListIterator<String> iterator = listaNomes.listIterator();
        
      //Iteração com o iterator sobre a lista
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = listaNomes.listIterator(); //Reiniciando o iterator
        
        //Localizar a posição de Carlos na lista
        int posicaoCarlos = listaNomes.indexOf("Carlos");
        //Alterar a posição que Carlos ocupava na lista para Roberto
        listaNomes.set(posicaoCarlos, "Roberto");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Obter a posição 1 da lista
        System.out.println(listaNomes.get(1));
        
        //Remover a posição 4 da lista
        listaNomes.remove(4);
        
        //Remover o elemento João da lista
        listaNomes.remove("João");
        
        //Retorna o tamanho da lista
        System.out.println(listaNomes.size());
        
        //Retorna se a lista possui Juliano em alguma das posições da lista
        System.out.println(listaNomes.contains("Juliano"));
        
        //Criando uma lista auxiliar e adicionando dois elementos á ela
        List<String> listaAux = new ArrayList<>();
        listaAux.add("Ismael");
        listaAux.add("Rodrigo");
        
        //Adicionando todos os elementos da lista auxiliar á lista principal
        listaNomes.addAll(listaAux);

        System.out.println(listaNomes);
        
        //Aplicando a ordenação alfabética á lista
        Collections.sort(listaNomes);

        System.out.println(listaNomes);
        
        //Retorna se a lista está vazia
        System.out.println(listaNomes.isEmpty());
    }
}

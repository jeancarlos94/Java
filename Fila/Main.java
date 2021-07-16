import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
         /*
            Crie uma fila que execute as seguintes operações:
                - Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa, João.
                - Navegue na fila exibindo cada nome no console.
                - Retorne o primeiro nome da fila, sem remove-lo.
                - Retorne o primeiro nome da fila removendo-o.
                - Adicione um novo nome Daniel e verifique a posição que ele ocupou na fila.
                - Retorne o tamanho da fila.
                - Verifique se a fila está vazia.
                - Verifique se o nome Carlos está na fila.
         */
        
        //Criação do objeto filaPessoas
        Queue<String> filaPessoas = new LinkedList<>();
      
        //Adição de valores na fila
        filaPessoas.add("Juliana");
        filaPessoas.add("Pedro");
        filaPessoas.add("Carlos");
        filaPessoas.add("Larissa");
        filaPessoas.add("João");
        
        //Iteração simples para exibir a fila. Lembre-se do padrão FIFO -> First In First Out ( Primeiro que entra é o primeiro que sairá )
        for (String nome : filaPessoas) {
            System.out.println(nome);
        }
        
        //Utilizando o peek obtemos a "cabeça" da fila mas não alteramos essa fila
        System.out.printf("Primeiro da fila (Sem remove-lo) --> %1$s\n",filaPessoas.peek());
      
        //Utilizando o poll também obtemos a "cabeça" da fila e removemos esta da fila.
        System.out.printf("Primeiro da fila (Removendo-o) --> %1$s\n", filaPessoas.poll());
      
        System.out.println(filaPessoas);
        
        //Adicionando Daniel a fila
        filaPessoas.add("Daniel");
        
        //Criação do objeto iterator para fila
        Iterator iterator = filaPessoas.iterator();
      
        //Variável que irá servir como apontador da posição que Daniel está ocupando no momento na fila.
        int posicao = 0;
      
        //Iteração com o iterator sobre a fila
        for (String pessoa : filaPessoas) {
            if (pessoa == "Daniel"){
                System.out.printf("Posição da pessoa Daniel na fila é --> %1$d\n", posicao);
                break; //Importante o break, pois no momento em que encontrar Daniel não precisamos continuar percorrendo a fila.
            }
            posicao++; //Incremento da posição caso não encontre Daniel.
        }
      
        //Retorna o tamanho atual da fila
        System.out.printf("Tamanho da fila --> %1$d\n", filaPessoas.size());
        
        //Retorna se a fila está vazia
        System.out.printf("Fila vazia ? %1$s\n", filaPessoas.isEmpty());

        //Retorna se o nome Carlos está na fila
        System.out.printf("Nome Carlos existe na lista ? %1$s\n", filaPessoas.contains("Carlos"));
    }
}

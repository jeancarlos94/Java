import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        
        //Retorna o total de elementos no stream
        System.out.println("Total de elementos no stream: " + estudantes.stream().count());

        //Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Elementos que possuem a letra r
        System.out.println("Elementos que possuem a letra r: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados a quantidade de letras de cada nome
        System.out.println(estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retornar somente os 3 primeiros elementos da coleção
        System.out.println("3 primeiros elementos da coleção : " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento da coleção no console e depois retorna a mesma coleção
        System.out.println("\nPEEK:");
        System.out.println(estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar uma coleção
        System.out.println("\n\nFOREACH:");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos da coleção possuem a letra W
        System.out.println("\nTODOS elementos possuem W no nome ? "+estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        //Retorna true se ALGUM dos elementos possuem a letra a minúscula no nome
        System.out.println("\nALGUM elemento possui a letra (a) no nome ? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        //Retorna true se NENHUM dos elementos possuem a letra a minúscula no nome
        System.out.println("\nNENHUM elemento possui a letra (a) no nome ? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir exibe no console
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada ( ATENÇÃO AO CONCEITO DE CONCORÊNCIA ENTRE AS THREADS - EXECUÇÃO PARALELA )
        System.out.println("\n\nOperação encadeada: ");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
            .map(estudante -> estudante.concat(" - " ).concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                        .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList())
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
        );
    }
}

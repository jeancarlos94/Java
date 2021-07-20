import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
            Crie um optional de um determinado tipo de dado
                - Crie com o estado vazio, presente e null
                - Se presente exiba valor no console
                - Se vazio lance uma excessão IlegalStateException
                - Se vazio, exiba "Optional vazio" no console
                - Se presente, transforme o valor e exiba no console
                - Se presente, pegue o valor do Optional e atribua em uma variável
         */

        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalPresent = Optional.of("abcdefghijklmno");
        Optional<String> optionalNull = Optional.ofNullable(null);

        optionalPresent.ifPresentOrElse(System.out::println, () -> System.out.println("Não presente"));

        //Lançar a exceção
        //optionalEmpty.orElseThrow(IllegalStateException::new);

        System.out.println(optionalEmpty.isEmpty() ? "Optional vazio" : "Optional não vazio");

        optionalPresent.ifPresent(s -> System.out.println(s.toUpperCase()));

        String temp = optionalPresent.isPresent() ? optionalPresent.get() : null;
        System.out.println(temp);
    }
}

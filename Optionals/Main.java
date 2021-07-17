import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Possui 2 estados : Presente ou Vazio
        //Permite que se execute operações em valores que podem ser nulos, sem preocupação com NullPointerExceptions

        //Utilizar o .of quando tivermos certeza de que a variável tem algum valor
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.print("Valor ->  ");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não presente"));

        //Se a variável PUDER ser nula, utilize .ofNullable
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.print("Valor ->  ");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        //Caso queira construir do zero utilize o .empty
        Optional<String> emptyOpcional = Optional.empty();
        System.out.print("Valor ->  ");
        emptyOpcional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullError = Optional.of(null);
        System.out.print("Valor ->  ");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}

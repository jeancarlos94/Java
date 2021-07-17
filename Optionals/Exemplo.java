import java.util.Optional;

public class Exemplo {
    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("Valor opcional");

        //Lambda -> Se o valor estiver presente será imprimido. Poderia utilizar o cod. da linha 13. Mas como utilizamos o .of é pq temos certeza que a variável possui valor
        stringOptional.ifPresent(System.out::println);
        //System.out.println(stringOptional.isPresent()); //Mesmo efeito da expressão acima
        //stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Não presente"));

        //Importante a verificação para evitar erros com o .get
        if (stringOptional.isPresent()){
            //Copiar o valor da optional para uma primitiva. ( -- só para exemplificar )
            String valor = stringOptional.get() + " -- ";
            System.out.println(valor);
        }

        //Irá concatenar *** caso a optional esteja presente e imprimi-la no console. (Lambda) Faz a mesma coisa do bloco da linha 16
        stringOptional.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

        //Se o optional não estiver presente irá ser lançada uma nova exceção
        stringOptional.orElseThrow(IllegalStateException::new);

    }
}

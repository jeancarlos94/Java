import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalsPrimitivos {
    public static void main(String[] args) {
        System.out.print("Valor inteiro opcional -> ");
        OptionalInt.of(25).ifPresent(System.out::println);

        System.out.print("Valor decimal opcional -> ");
        OptionalDouble.of(26.4).ifPresent(System.out::println);

        System.out.print("Valor longo opcional -> ");
        OptionalLong.of(245L).ifPresent(System.out::println);
    }
}

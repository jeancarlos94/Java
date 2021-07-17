import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Zé", 51));
        estudantes.add(new Estudante("João", 66));
        estudantes.add(new Estudante("Naiara", 25));
        estudantes.add(new Estudante("Jean", 26));
        estudantes.add(new Estudante("Maria", 70));
        estudantes.add(new Estudante("Caroline", 30));

        System.out.printf("Ordem de inserção natural ==> %1$s\n\n", estudantes);

        //Expressão lambda - Ordem natural ( Idade )
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.printf("LAMBDA - Ordem natural dos números ( idade ) ==> %1$s\n\n", estudantes);

        //Expressão lambda - Ordem reversa ( Idade )
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.printf("LAMBDA - Ordem reversa dos números ( idade ) ==> %1$s\n\n", estudantes);

        //Method reference - Mesmo processo de ordem natural ( Idade )
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.printf("METHOD REF - Ordem natural dos números ( idade ) ==> %1$s\n\n", estudantes);

        //Method reference - Mesmo processo de ordem reversa ( Idade )
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.printf("METHOD REF - Ordem reversa dos números ( idade ) ==> %1$s\n\n", estudantes);

        //Só aceita o parâmetro caso este implemente a classe comparable
        Collections.sort(estudantes);
        System.out.printf("COMPARABLE - Ordem natural dos números ( idade ) ==> %1$s\n\n", estudantes);

        //Caso a classe não implemente o comparable, podemos sobrecarregar o método e passar um comparator
        Collections.sort(estudantes, new EstudanteComparator());
        System.out.printf("COMPARATOR - Ordem reversa dos números ( idade ) ==> %1$s\n\n", estudantes);
    }
}

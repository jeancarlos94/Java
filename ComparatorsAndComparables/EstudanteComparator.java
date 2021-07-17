import java.util.Comparator;

public class EstudanteComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        
        //Ordem crescente ( natural )
        //return o1.getIdade() - o2.getIdade();

        //Ordem decrescente ( reversa )
        return o2.getIdade() - o1.getIdade();
    }
}

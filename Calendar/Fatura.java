import java.util.Calendar;

public class Fatura {
    private Calendar dataVencimento;
    private double valor;

    public Fatura(Calendar dataVencimento){
        this.dataVencimento = dataVencimento;
        //Valor fixado em 1000.0 mas poderia ser recebido como parâmetro do construtor
        this.valor = 1000.0;
    }

    public Calendar VerificarVencimento(Calendar dtVenc){
        
      //Adicionar 10 dias a data de vencimento
        dtVenc.add(Calendar.DATE, 10);
        
      //Verificação de qual dia da semana corresponde a data já acrescida em 10 dias
        if(dtVenc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            //Sábado
            dtVenc.add(Calendar.DATE, 2); //Adicionar 2 dias ao vencimento
        }else if(dtVenc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            //Domingo
            dtVenc.add(Calendar.DATE, 1); //Adicionar 1 dia ao vencimento
        }
        return dtVenc;
    }
}

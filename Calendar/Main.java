import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
  
    /*
        Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que juros sejam cobrados
        Caso essa data caia em um sábado ou domingo, o cliente poderá pagar na segunda feira seguinte.
        Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar
     */

    public static void main(String[] args) {
      
        //Criando uma data fitícia de 14/06/2021 e armazenando no objeto dtVencimentoFatura
        Calendar dtVencimentoFatura = new GregorianCalendar(2021,6,14);
        
        //Criação do objeto do tipo fatura, passando a data criada acima como parâmetro
        Fatura fatura = new Fatura(dtVencimentoFatura);
        
        //Chamada da função que retorna a data limite para pagamento da fatura
        dtVencimentoFatura = fatura.VerificarVencimento(dtVencimentoFatura);
        
        //Impressão da data limite no console com formatação para yyyy/MM/dd
        System.out.printf("Data do vencimento limite será: %tF",dtVencimentoFatura);
    }
}

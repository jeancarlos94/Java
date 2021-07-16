import java.util.HashMap;
import java.util.Map;

public class ExercicioFinal {
    public static void main(String[] args) {

        /*
            Crie um Map e execute as seguintes operações:
                - Adicione os 26 estados Brasileiros no map, onde a sigla será  a chave e o nome do estado o valor
                - Remova o estados de Minas Gerais
                - Adicione o Distrito Federal
                - Verifique o tamanho do map
                - Remova o estado do Mato Grosso do Sul usando o seu nome como parâmetro
                - Navegue em todos os registros do map, mostrando os dados no console c/ o formato NOME (SIGLA)
                - Verifique se o estado se Santa Caratina existe no map buscando por sua sigla (SC)
                - Verifique se o estado do Maranhão existe no map usando o seu nome como parâmetro
         */

        HashMap<String, String> hashEstados = new HashMap<>();

        //Adicionando dados ao HashMap
        hashEstados.put("AC","Acre");
        hashEstados.put("AL","Alagoas");
        hashEstados.put("AP","Amapá");
        hashEstados.put("AM","Amazonas");
        hashEstados.put("BA","Bahia");
        hashEstados.put("CE","Ceará");
        hashEstados.put("ES","Espírito Santo");
        hashEstados.put("GO","Goiás");
        hashEstados.put("MA","Maranhão");
        hashEstados.put("MT","Mato Grosso");
        hashEstados.put("MS","Mato Grosso do Sul");
        hashEstados.put("MG","Minas Gerais");
        hashEstados.put("PA","Pará");
        hashEstados.put("PB","Paraíba");
        hashEstados.put("PR","Paraná");
        hashEstados.put("PE","Pernambuco");
        hashEstados.put("PI","Piauí");
        hashEstados.put("RJ","Rio de Janeiro");
        hashEstados.put("RN","Rio Grande do Norte");
        hashEstados.put("RS","Rio Grande do Sul");
        hashEstados.put("RO","Rondônia");
        hashEstados.put("RR","Roraima");
        hashEstados.put("SC","Santa Catarina");
        hashEstados.put("SP","São Paulo");
        hashEstados.put("SE","Sergipe");
        hashEstados.put("TO","Tocantins");

        System.out.println(hashEstados);

        //Removendo o estado de MG do HashTable
        hashEstados.remove("MG");

        //Adicionando o DF ao HashTable
        hashEstados.put("DF","Distrito Federal");

        //Retornando o tamanho do HashTable
        System.out.println(hashEstados.size());

        //Removendo o estado de MS utilizando o nome como parâmetro
        hashEstados.values().remove("Mato Grosso do Sul");

        //Iterando sobre o HashTable imprimindo no formato NOME (SIGLA)
        for (Map.Entry<String, String> entry : hashEstados.entrySet()){
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");
        }

        //Retorna se a sigla SC existe no HashTable
        System.out.println(hashEstados.containsKey("SC"));

        //Retorna se no HashTable existe o valor Maranhão
        System.out.println(hashEstados.containsValue("Maranhão"));
    }
}

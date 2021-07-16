import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        //Criação do objeto HashMap. Chave é uma String e os valores serão Integer
        HashMap<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        //Inserção de valores no Map
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //Retorna o value de Argentina ou null se não exisitr no Map
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //Retorna se existe ou não a key França no Map
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Retorna se existe algum value 6 no Map
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        //Retorna o tamanho do Map
        System.out.println(campeoesMundiaisFifa.size());

        //Navegar nos registros do Map (Map.Entry armazena tanto a chave quanto o valor para cada iteração)
        System.out.println("\nIteração utilizando o Map.Entry");
        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //Navegar nos registros do Map (Um pouco menos performática que a função com o Map.Entry)
        System.out.println("\nIteração utilizando o KeySet");
        for (String key : campeoesMundiaisFifa.keySet()){
            System.out.println(key + " -- " + campeoesMundiaisFifa.get(key));
        }

        //Remover um elemento através da key do Map.
        campeoesMundiaisFifa.remove("Argentina");

        System.out.println(campeoesMundiaisFifa);

        //Limpar o Map
        campeoesMundiaisFifa.clear();

        //Verificar se o Map está vazio
        System.out.println(campeoesMundiaisFifa.isEmpty());
    }
}

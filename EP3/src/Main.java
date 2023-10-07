import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

   /*     //JAVA 4
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //JAVA 4
        for(Iterator iterator = lista.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        //JAVA 5 (for each)
        for (Integer i : lista) {
            System.out.println(i);
        }*/

        //JAVA 8 (lambda)
        //lista.stream().forEach(i -> System.out.println(i));
        //lista.stream().forEach(System.out::println); //Method Reference
        //o stream é uma sequencia de dados, que pode ser iterada apenas uma vez (lazy evaluation)
        //lista.stream().filter(i -> i % 2 == 0).forEach(System.out::println); //imprime apenas os pares
        lista.forEach(i -> System.out.println(i)); //imprime todos os números da lista



    }
}
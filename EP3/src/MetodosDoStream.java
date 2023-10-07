/**
 * EP3 - Métodos do Stream
 *
 * @author: Rodrigo Soares Sampaio
 * <p>
 * Exemplo de uso de alguns métodos do Stream
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MetodosDoStream {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        lista.stream() //cria um stream
                .skip(2) //pula os dois primeiros elementos (operação intermediária)
                .limit(8) //limita a quantidade de elementos a serem processados (operação intermediária)
                .sorted() //ordena os elementos (operação intermediária)
                .sorted((a, b) -> b - a) //ordena os elementos de forma decrescente (operação intermediária)
                .distinct() //remove os elementos duplicados (operação intermediária)
                .filter(i -> i % 2 == 0) //filtra os elementos, se o mod por 2 for igual a 0 (operação intermediária)
                .forEach(i -> System.out.println(i)); //imprime todos os números da lista

        //dps do .forEach a lista não é alterada, como podemos ver abaixo:
        System.out.println(lista);
        System.out.println(lista.stream().count());
        System.out.println(lista.stream().max((a, b) -> a - b));
        System.out.println(lista.stream().min((a, b) -> a - b));
        System.out.println(lista);


    }
}



/**
 * EP3 - Métodos do Stream
 *
 * @author: Rodrigo Soares Sampaio
 * <p>
 * Exemplo de uso de alguns métodos do Stream
 * <p>
 *     dropWhile
 *     map
 *     distinct
 *     limit
 *     forEach
 *     filter
 *     count
 *     max
 *     min
 *     sorted
 *     skip
 *     findFirst
 *     findAny
 *     allMatch
 *     anyMatch
 *     noneMatch
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MaisMetodosDoStream {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        lista.stream() //cria um stream
                .dropWhile(i -> i < 7) //pula os elementos enquanto a condição for verdadeira (operação intermediária)
                .map(i -> i*i) //aplica uma função (multiplica por dois) em cada elemento (operação intermediária)
                .distinct() //remove os elementos duplicados (operação intermediária)
                .limit(3) //limita a quantidade de elementos a serem processados (operação intermediária)
                .forEach(System.out::println); //imprime todos os números da lista

    }
}



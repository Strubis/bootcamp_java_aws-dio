package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
 *      Utilizando a Stream API, verifique se a lista contém pelo menos um
 *      número negativo e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean existNegativeNumber = numeros.stream().anyMatch(n -> n < 0);
        System.out.println( "Is there a negative number? " + existNegativeNumber );
    }
}

package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Descricao:
 *  Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
 *         Com a Stream API, verifique se todos os números da lista são distintos
 *         (não se repetem) e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean distinct =
                numeros.stream()
                        .filter(n -> Collections.frequency(numeros, n) > 1)
                        .findFirst()
                        .isEmpty();
        System.out.println( "Are the numbers distinct? " + distinct );
    }
}

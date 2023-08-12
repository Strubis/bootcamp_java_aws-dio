package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 20 - Encontre a soma dos números divisíveis por 3 e 5:
 *      Com a Stream API, encontre a soma dos números da lista que são
 *      divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio20 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long sum = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0).mapToLong(n -> n).sum();
        System.out.println("Sum: " + sum);
    }
}

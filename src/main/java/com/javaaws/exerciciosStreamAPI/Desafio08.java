package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 8 - Somar os dígitos de todos os números da lista:
 *      Utilizando a Stream API, realize a soma dos dígitos de todos
 *      os números da lista e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long accumulator = numeros.stream().reduce(0, Integer::sum);
        System.out.println( "Accumulator: " + accumulator );
    }
}

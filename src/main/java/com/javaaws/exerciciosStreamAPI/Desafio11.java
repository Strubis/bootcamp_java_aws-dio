package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
 *      Utilizando a Stream API, encontre a soma dos quadrados de todos os
 *      números da lista e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double sum = numeros.stream().mapToDouble(n -> Math.pow(n, 2)).sum();
        System.out.println("Sum: " + sum);
    }
}
package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Descricao:
 *  Desafio 5 - Calcule a média dos números maiores que 5:
 *      Com a Stream API, calcule a média dos números maiores
 *      que 5 e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> greaterThanFive = n -> n > 5;

        long average = numeros.stream().filter(greaterThanFive).reduce(0, Integer::sum);
        long qtdNum = numeros.stream().filter(greaterThanFive).count();

        System.out.println("Average> " + average / qtdNum);
    }
}

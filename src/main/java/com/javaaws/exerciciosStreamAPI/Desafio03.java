package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 3 - Verifique se todos os números da lista são positivos:
 *      Com a ajuda da Stream API, verifique se todos os números da
 *      lista são positivos e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean positiveAll = numeros.stream().allMatch(n -> n >= 0);
        System.out.println("All Numbers are positive? " + positiveAll);
    }
}

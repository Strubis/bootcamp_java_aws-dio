package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Descricao:
 *  Desafio 7 - Encontrar o segundo número maior da lista:
 *      Com a ajuda da Stream API, encontre o segundo número maior
 *      da lista e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long secondMaxNumber = numeros.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Max Number: " + secondMaxNumber);
    }
}

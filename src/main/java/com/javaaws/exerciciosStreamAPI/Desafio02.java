package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 2 - Imprima a soma dos números pares da lista:
 *      Utilizando a Stream API, realize a soma dos números pares da
 *      lista e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int sum = numeros.stream().filter(n -> n % 2 == 0).mapToInt(value -> value).sum();
        System.out.println("Sum: " + sum);
    }
}

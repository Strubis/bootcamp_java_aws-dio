package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Descricao:
 *  Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
 *      Utilize a Stream API para agrupar os valores ímpares múltiplos
 *      de 3 ou de 5 e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .collect(Collectors.groupingBy(n -> n % 3 == 0 || n % 5 == 0 ))
                .get(true)
                .forEach(System.out::println);
    }
}

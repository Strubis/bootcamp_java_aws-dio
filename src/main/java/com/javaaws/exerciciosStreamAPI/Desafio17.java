package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Descricao:
 *  Desafio 17 - Agrupe os números em pares e ímpares:
 *      Utilize a Stream API para agrupar os números em duas listas
 *      separadas, uma contendo os números pares e outra contendo os
 *      números ímpares da lista original, e exiba os resultados no
 *      console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().collect(Collectors.groupingBy(n -> n % 2 == 0)).get(true));
        System.out.println(numeros.stream().collect(Collectors.groupingBy(n -> n % 2 == 0)).get(false));
    }
}

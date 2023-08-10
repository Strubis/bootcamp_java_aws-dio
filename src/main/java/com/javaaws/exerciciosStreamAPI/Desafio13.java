package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 13 - Filtrar os números que estão dentro de um intervalo:
 *      Utilize a Stream API para filtrar os números que estão dentro de um
 *      intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado
 *      no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().skip(2).limit(5).forEach(System.out::println);
    }
}

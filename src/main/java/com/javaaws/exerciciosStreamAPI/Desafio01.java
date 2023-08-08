package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 1 - Mostre a lista na ordem numérica:
 *      Crie um programa que utilize a Stream API para ordenar a lista de
 *      números em ordem crescente e a exiba no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().sorted().forEach(System.out::println);
    }
}

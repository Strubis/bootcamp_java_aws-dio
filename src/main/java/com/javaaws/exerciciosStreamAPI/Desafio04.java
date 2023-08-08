package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 4 - Remova todos os valores ímpares:
 *      Utilize a Stream API para remover os valores ímpares
 *      da lista e imprima a lista resultante no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }
}

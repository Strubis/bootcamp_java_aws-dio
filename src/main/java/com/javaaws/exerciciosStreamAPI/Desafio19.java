package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Descricao:
 *  Desafio 19 - Verifique se todos os números da lista são iguais:
 *      Utilizando a Stream API, verifique se todos os números da lista
 *      são iguais e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros2 = Arrays.asList(1, 1, 1);
        Integer firstElement = numeros.get(0);

        System.out.println(
                "Equals? " + numeros.stream().allMatch(n -> n.equals(firstElement))
        );
        System.out.println(
                "Equals? " + numeros2.stream().allMatch(n -> n.equals(firstElement))
        );
    }
}

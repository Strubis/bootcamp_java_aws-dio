package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 6 - Verificar se a lista contém algum número maior que 10:
 *      Utilize a Stream API para verificar se a lista contém algum número
 *      maior que 10 e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean greaterThanTen = numeros.stream().anyMatch(n -> n > 10);
        System.out.println( "Any number greater than 10? " + greaterThanTen );
    }
}

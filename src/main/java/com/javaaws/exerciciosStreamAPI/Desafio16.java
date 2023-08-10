package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Descricao:
 *  Desafio 16 - Calcule o fatorial de um número:
 *      Crie um programa que receba um número inteiro como entrada e,
 *      utilizando a Stream API, calcule o fatorial desse número e
 *      exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long fat = ((Integer) numeros.stream().
                skip(4).
                findFirst().
                stream().mapToInt(n ->
                {
                if(n == 0 || n == 1){
                    return 1;
                }

                for (int i = n - 1; i > 1; i--) {
                    n *= i;
                }

                return n;
                }
        ).sum()).longValue();
        System.out.println( "Fat: " + fat );
    }
}

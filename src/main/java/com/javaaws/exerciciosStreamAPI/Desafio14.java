package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 14 - Encontre o maior número primo da lista:
 *      Com a Stream API, encontre o maior número primo
 *      da lista e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        final int[] maxN = {0};
        numeros.stream().forEach(n -> {
            boolean check = false;
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    check = true;
                    break;
                }
            }

            if( !check && n > maxN[0]){
                maxN[0] = n;
            }
        });

        System.out.println("The max number: " + maxN[0]);
    }
}

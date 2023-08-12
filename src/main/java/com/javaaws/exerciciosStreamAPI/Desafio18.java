package com.javaaws.exerciciosStreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Descricao:
 *  Desafio 18 - Filtrar os números primos da lista:
 *      Com a ajuda da Stream API, filtre os números primos
 *      da lista e exiba o resultado no console.
 *
 * @author Emerson Melo
 * @since 2023
 * @see <a href="https://github.com/Strubis/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md">...</a>
 * */
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 5, 4, 3, 16);

        numeros.stream().toList().stream().filter(n -> {
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }

            return true;
        }).forEach(System.out::println);
    }
}

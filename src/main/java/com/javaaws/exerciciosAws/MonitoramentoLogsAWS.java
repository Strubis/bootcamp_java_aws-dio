package com.javaaws.exerciciosAws;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Desafio:
 *  Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na
 *  infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços
 *  da AWS e realizará uma análise simples desses logs.
 *
 * @author Emerson Melo adaptado de DIO - Java com AWS
 * @since 2023
 * */
public class MonitoramentoLogsAWS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        String servico = null;
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            servico = parts[1];
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
            AtomicLong qtd = new AtomicLong(0);
            if (eventosPorServico.containsKey(servico)) {
                qtd = new AtomicLong(eventosPorServico.get(servico));
            }
            eventosPorServico.put(servico, qtd.addAndGet(1));
        }

        //TODO: Identifique no mapa os serviços com maior e menor quantidade de logs.
        //      Dica: Utilize Java Streams para tornar essa tarefa mais simples.
        String max = eventosPorServico.keySet().stream().max(Comparator.comparing(eventosPorServico::get)).get();
        String min = eventosPorServico.keySet().stream().min(Comparator.comparing(eventosPorServico::get)).get();

        //TODO: Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((srv, qtd) -> {
            System.out.println(srv + ":" + qtd);
        });
        System.out.println("Maior:" + max);
        System.out.println("Menor:" + min);
    }
}

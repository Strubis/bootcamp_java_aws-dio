package com.javaaws.exerciciosAws;

import java.util.Scanner;

/**
 * Desafio:
 *  Você foi contratado como desenvolvedor pela "DIOCloudTech Solutions", que é especializada em serviços em nuvem
 *  baseados na AWS. E sua tarefa será criar uma calculadora de velocidade de download que leve em consideração a
 *  localização geográfica do servidor de origem e do dispositivo do usuário. Quanto mais próximo o servidor, menor
 *  será a latência e, portanto, a velocidade de download será melhor. Isso permitirá que os usuários estimem a
 *  velocidade de download para diferentes locais e servidores AWS em todo mundo.
 *
 *  Fórmula para Cálculo da Velocidade de Download (em Mbps):
 *  A velocidade de download estimada (VD) será dada pela fórmula:
 *      VD = VelocidadePlano / (1 + (DistanciaServidores / 100))
 *
 * Observação: A velocidade de download estimada não pode exceder a velocidade do plano de internet contratado.
 *
 * @author Emerson Melo adaptado de DIO - Java com AWS
 * @since 2023
 * */
public class CalculadoraVelocidadeDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
        double distanciaServidores = scanner.nextDouble();
        double velocidadePlano = scanner.nextDouble();

        //TODO: Calcule a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Apresentar o resultado
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        scanner.close();
    }
    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        // TODO: Crie a fórmula de cálculo para a velocidade de download estimada
        // Formula -> VD = VelocidadePlano / (1 + (DistanciaServidores / 100))
        double vd = velocidadePlano / (1 + (distanciaServidores / 100));
        return Math.min(vd, velocidadePlano);
    }
}

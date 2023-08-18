import java.util.Scanner;

/**
 * Desafio:
 *  Você é um engenheiro responsável por ajudar as equipes de desenvolvimento a calcular o número mínimo de nodes e servidores 
 *  necessários para suportar seus aplicativos no cluster do EKS..
 *  Regras Básicas:
 *    Cada node pode suportar até 10 pods.
 *    Cada servidor (EC2) pode suportar até 4 pods.
 *    Seu objetivo é desenvolver um programa em Java que permita ao usuário fazer uma consulta de dimensionamento. O programa 
 *    deve receber o número total de pods do aplicativo e calcular o número mínimo de nodes e servidores necessários com base 
 *    nas regras de dimensionamento.
 *
 * @author Emerson Melo adaptado de DIO - Java com AWS
 * @since 2023
 * */
public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        if(numeroTotalPods < 1){
          System.out.println("Pods invalidos!");
          return;
        }
        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.ceil( (double) numeroTotalPods / podsPorNode);

        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) Math.ceil( (double) numeroTotalPods / podsPorServidor);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        System.out.println( numeroMinimoNodes <= 1 ? "1.Recomendamos usar um unico node" : "1.Numero minimo de nodes:" + numeroMinimoNodes);
        
        System.out.println( numeroMinimoServidores <= 1 ? "2.Recomendamos usar um unico servidor" : "2.Numero minimo de servidores:" + numeroMinimoServidores);

        // Fechando o Scanner
        scanner.close();
    }
}

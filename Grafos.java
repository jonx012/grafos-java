package grafos;

import java.util.Scanner;

public class Grafos {
    public static void main(String[] args) {
        int[][] matrizDeAdjacencias = new int[7][7];
        Scanner input = new Scanner(System.in);
        
        for(int linha = 0; linha < 7; linha++){
            int linhaAtual = linha + 1;
            for(int coluna = 0; coluna < 7; coluna++){
                int colunaAtual = coluna + 1;
                System.out.println("Insira 0/1 para linha: " + linhaAtual + " e coluna: " + colunaAtual);
                matrizDeAdjacencias[linha][coluna] = input.nextInt();
                System.out.println("--------------------------------------------------------------");
                colunaAtual = 0;
            } 
        }
        
        System.out.println("Matriz está completa!!");
        
        /*
        for(int linha = 0; linha < 7; linha++){
            System.out.println("");
            for(int coluna = 0; coluna < 7; coluna++){
                System.out.print(matrizDeAdjacencias[linha][coluna]);
            } 
        }*/
        
        System.out.println("Digite o vertice 1:");
        int vertice1 = input.nextInt();
        
        System.out.println("Digite o vertice 2:");
        int vertice2 = input.nextInt();
        
        boolean analiseDeVertices = false;
        
        if(vertice1 < 7 & vertice1 >= 0){
            if(vertice2 < 7 & vertice2 >= 0){
                if(matrizDeAdjacencias[vertice1][vertice2] == 1){
                    analiseDeVertices = true;
                }
            }
        }
        
        System.out.println("Se existe aresta = true / Se não existe aresta = false");
        System.out.println(analiseDeVertices);
        
        System.out.println("");
    }
    
}

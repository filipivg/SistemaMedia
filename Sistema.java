/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema;

/**
 *
 * @author Filipi
 */
public class Sistema {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        double media = calcularMedia(nota1, nota2);
        String situacaoAluno = verificarSituacao(media);
    }
        private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
        }
        
        private static String verificarSituacao(double media){
            if (media >= 6) {
                return "Aprovado";
            } else{
                return "Reprovado";
            }
        }
        
        private static void exibirResultado(String nomeAluno, double media, String situacaoAluno){
            System.out.println("Aluno: " + nomeAluno);
            System.out.println("Media: " + media);
            System.out.println(situacaoAluno);
        }
}



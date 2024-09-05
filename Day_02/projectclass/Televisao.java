/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectclass;

/**
 *
 * @author CAMARGO
 */
public class Televisao {
    String polegadas;
    int quantidadeDePortas; // Isso parece ser um erro, TVs normalmente não têm portas.
    String resolucao;
    String modelo;
    int valor;
    String tiposDeEntrada;
    String hz;

            public String ligarDesligar() {
             return "A televisão está ligada ou desligada.";
         }

         public String passarCanal() {
             return "O canal foi alterado.";
         }

         public String alterarVolume() {
             return "O volume foi alterado.";
         }

         public String reconhecimentoDeVoz() {
             return "Reconhecimento de voz ativado.";
         }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectclass;

/**
 *
 * @author CAMARGO
 */
public class ProjectClass {

    public static void main(String[] args) {
        // Instanciando a nova versão da classe Geladeira
        Geladeira geladeira = new Geladeira();
       System.out.println(geladeira.armazenar());
       System.out.println(geladeira.congelar());
       
        // Instanciando a classe Televisao
        Televisao tv = new Televisao();
 
        // Instanciando a classe Celular
        Celular celular = new Celular();
        
        // Instanciando a classe Automovel
        Automovel automovel = new Automovel();
       System.out.println(automovel.viagem());
        System.out.println(automovel.cotidiano());
        System.out.println(automovel.esportivo());
        System.out.println(automovel.locomover());

        // Instanciando a classe Aluno
        Alunos aluno = new Alunos();

        // Mensagem final
        System.out.println("Execução completa.");
    }
}

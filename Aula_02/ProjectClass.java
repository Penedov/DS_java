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
        System.out.println(geladeira.refrigerar());

        // Instanciando a classe Televisao
        Televisao tv = new Televisao();
        System.out.println(tv.alterarVolume());
        System.out.println(tv.ligarDesligar());
        System.out.println(tv.passarCanal());
        System.out.println(tv.reconhecimentoDeVoz());

        // Instanciando a classe Celular
        Celular celular = new Celular();
        System.out.println(celular.acessarInformacoes());
        System.out.println(celular.gravar());
        System.out.println(celular.jogar());
        System.out.println(celular.ligaDesliga());

        // Instanciando a classe Automovel
        Automovel automovel = new Automovel();
        System.out.println(automovel.viagem());
        System.out.println(automovel.cotidiano());
        System.out.println(automovel.esportivo());
        System.out.println(automovel.locomover());

        // Instanciando a classe Aluno
        Alunos aluno = new Alunos();
        System.out.println(aluno.atualizar());
        System.out.println(aluno.cadastrar());
        System.out.println(aluno.filtragem());
        
        // Mensagem final
        System.out.println("Execução completa.");
    }
}

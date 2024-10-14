/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectclass;

/**
 *
 * @author CAMARGO
 */
public class Alunos {
    String curso;
    String turma;
    String periodo;
    String nome;
    int idade;
    int cpf;
    int rg;
    String tipoGraduacao;
    int ra;

            public String cadastrar() {
            return "Aluno cadastrado com sucesso.";
        }

        public String filtragem() {
            return "Filtrando alunos.";
        }

        public String atualizar() {
            return "Atualizando dados do aluno.";
        }
}

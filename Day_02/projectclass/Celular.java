/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectclass;

/**
 *
 * @author CAMARGO
 */
public class Celular {
    String marca;
    String modelo;
    String cor;
    int valor;
    int memoriaRam;
    int armazenamento;
    String anoFabricacao;
    String processador;
    boolean comNfc;
    boolean com5g;

        public String ligaDesliga() {
          return "O celular está ligado ou desligado.";
      }

      public String jogar() {
          return "Jogando no celular.";
      }

      public String gravar() {
          return "Gravando com o celular.";
      }

      public String acessarInformacoes() {
          return "Acessando informações no celular.";
      }
}


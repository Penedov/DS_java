/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectclass;

/**
 *
 * @author CAMARGO
 */
public class Automovel {
    String marca;
    String modelo;
    String cor;
    int valor;
    int cavalos;
    int autonomia;
    String anoFabricacao;
    String motor;

        public String viagem() {
          return "O automóvel está em modo viagem.";
      }

      public String cotidiano() {
          return "O automóvel está em modo cotidiano.";
      }

      public String esportivo() {
          return "O automóvel está em modo esportivo.";
      }

      public String locomover() {
          return "O automóvel está se locomovendo.";
      }
}

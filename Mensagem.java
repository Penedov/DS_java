package com.mycompany;

/*Criando a classe*/
public class Mensagem {
    /*Declarando uma variavel para a classe*/
    public String msg = "I am learning Java";
    
    /*Criando uma função que é igual a um metodo */
    public String lernome(){
        String nomeEmMaisculas =
                msg.toUpperCase(); /*comando incorporado no Java que faz a e String retornar em maiuscula.*/
        return nomeEmMaisculas;
    }
}

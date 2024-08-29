
package com.mycompany.modeloclasse;
/*Importando mingha Classe*/
import com.mycompany.Mensagem;

public class ModeloClasse {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        /*Estanciando a classe mensagem e incorporando uma variavel 
        para executar a função "Lernome"*/
        Mensagem M = new Mensagem();
        System.out.println(M.lernome());
    }
}

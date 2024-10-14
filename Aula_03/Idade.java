/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade;

import java.util.Scanner;


public class Idade {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    try (Scanner scanner = new 
    Scanner(System.in)) {
        
        System.out.println("Escreva sua idade : ");
        
       int idade = scanner.nextInt();
        
            if ( idade >= 18){
                
                System.out.println("Permitido");
                
            }
            else{
                
                System.out.println("Negado");
                
            }
     
        }
    
        System.exit(0);
    }
    
}

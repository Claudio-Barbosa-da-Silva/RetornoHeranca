/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author telecentro
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ProcessarRetorno processar = new LeituraRetornoBancoBrasil();
        
        processar.processar("banco-brasil.txt");
               
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class BinaryTree {

    int valor; 

    BinaryTree left; 

    BinaryTree right;
    
   public int calculaValor(BinaryTree no){       
       return valor + no.valor;
   }
}



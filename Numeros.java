/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo Cesar
 */
public class Numeros {
    
    private int a;
    private int b;
    private int c;
    
    public Numeros(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getC(){
        
        String sa , sb, sc = "";

        char [] ca = String.valueOf(a).toCharArray();
        char [] cb = String.valueOf(b).toCharArray();
        
        for (int i = 0; i < ca.length; i++){
            sc += String.valueOf(ca[i]);
            if (i < cb.length)
                sc += String.valueOf(cb[i]);
        }
        
        if (cb.length > ca.length ){
            for (int j = ca.length; j < cb.length; j++){
                sc += String.valueOf(cb[j]);
            }
        }
 
        c = Integer.parseInt(sc);
        
        if (c > 1000000)
            c = -1;
        
        return c;
    }    
    
    public static void main(String [] args){
        
        Numeros n = new Numeros(10256,512);
        System.out.println(n.getC());
    }
}

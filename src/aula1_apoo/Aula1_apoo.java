/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1_apoo;

/**
 *
 * @author thais
 */
public class Aula1_apoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Relogio r = new Relogio();
        r.setHora(22);
        r.imprime();
        //System.out.println(r);//Numero de identificacao
        
        /*
        for (int i = 0; i < 7500; i++) {
            r.incrementaSegundo();
            r.imprime();
        }
        */
        
        Relogio12 r12= new Relogio12();
        r12.imprime();
        
        //Polimorfismo
        Relogio reg = new Relogio12();
        reg.imprime();
        
    }
    
}

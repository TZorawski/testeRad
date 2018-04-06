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
public class Relogio12 extends Relogio {
    //Heranca
    
    private int status;
    
    //Sobreescrevendo o metodo pai
    public void setHora (int hora) {
        if (hora>=0 && hora<=11) {
            //super.hora= 8;
        }
    }
    
    //Sobreescrevendo o metodo pai
    public void imprime () {
        System.out.println("Imprime");
    }
}

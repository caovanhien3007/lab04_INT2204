/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author user56
 */
public class Numeral extends Expression {
 
    int value;

    public Numeral(int value ) {
        this.value = value;
        
    }

    public Numeral() {
    }

    

    @Override
    public int evaluate() {
    return value;    
    }

    @Override
    public String toString() {
     return "Numeral  " +value ;  
    }

}

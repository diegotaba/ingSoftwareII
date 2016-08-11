/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author Alejandro
 */
public class Tablero {

    private int x;
    private int y;

    public Tablero(){
        
    }
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x) {
        this.x = x;

    }

    void setY(int y) {
        this.y = y;

    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof Tablero))
            return false;
        Tablero t=(Tablero)obj;
        if(this.x==t.x && this.y==t.y)
            return true;
        return false;
    }
    
    

}

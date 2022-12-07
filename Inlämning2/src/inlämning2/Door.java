/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inlämning2;

/**
 *
 * @author ÄGARE
 */
public class Door {
        private char position;
    private boolean locked;


    
    public Door(char position, boolean locked) {
        this.position = position;
        this.locked = locked;
     
      
        
    }
    
    public void getPosition () {
        System.out.print(position );
        if (locked){
        System.out.println("   (this door is locked, you need a key)");
    }
        else {
            System.out.println("   (this door is open)");
        }
    }
    
    
    public char getPositionString (){
        return position;
    }
}

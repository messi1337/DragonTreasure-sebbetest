/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inlämning2;

/**
 *
 * @author ÄGARE
 */
public class Room {
        private String roomDesc;
    private Door[] doors = new Door [3];
    private int doorCount = 0;

   
    
    public Room(String roomDesc, String doors) {
        this.roomDesc = roomDesc;
        for (int i=0; doors.length() > i; i++){
            doorCount++;
            this.doors[i] = new Door (doors.charAt(i), false);
        }
    }
    
    public void doNarrative() {
        System.out.printf("%n%s %nYou can go in the following directions: %n", roomDesc);
        for (int y = 0; y < doorCount; y++) {
            doors[y].getPosition();
        }
        System.out.println("Type in the direction you want to go in and press enter.");
                
    }
    
    public boolean hasDoor (String input){
        boolean temp = false;
        for (int y = 0; y < doorCount; y++) {
            String position = Character.toString(doors[y].getPositionString());
            if (input.equals(position)){
                temp = true;}
                }
        return temp;
    }
}

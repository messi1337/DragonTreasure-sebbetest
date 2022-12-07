/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inlämning2;

import java.util.Scanner;

/**
 *
 * @author ÄGARE
 */
public class DungeonTreasure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setupGame();
        
    }
    public static void setupGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dragon Treasure, enter your username and press enter to start a new game");
        Player playerName = new Player(input.nextLine());
        
        
        Dungeon dungeon = new Dungeon ("You are standing outside a cave. Do you want to enter the cave? Type in 'y' for yes and press enter.", playerName);
 
        dungeon.playGame();      
    }
    
}

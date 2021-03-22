/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import information.Cards;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class CardsMethods {
    public static ArrayList<Cards> initCards(){
        ArrayList<Cards> deck = new ArrayList<>();
        //
        for(int i = 0; i<62; i++ ){
            if(i <= 16){
                Cards card = new Cards("Chance", 8, 23, 37, "", i); //starting position from 1
                deck.add(i, card);
                switch(i){
                    case 0:
                        deck.get(i).setDescription("Advance to Go. (Collect $200)");
                        break;
                    case 1:
                        deck.get(i).setDescription("Advance to Illinois Avenue. If you pass Go, collect $200.");
                        break;
                    case 2:
                        deck.get(i).setDescription("Advance to St. Charles Place. If you pass Go, collect $200.");
                        break;
                    case 3: 
                        deck.get(i).setDescription("Advance token to the nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total 10 (ten) times the amount thrown.");
                        break;
                    case 4:
                        deck.get(i).setDescription("Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay owner twice the re tal to which they are otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
                        break;
                    case 5:
                        deck.get(i).setDescription("Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay owner twice the re tal to which they are otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
                        break;
                    case 6:
                        deck.get(i).setDescription("Bank pays you dividend of $50.");
                        break;
                    case 7:
                        deck.get(i).setDescription("Get out of Jail Free. This card may be kept until needed, or traded/sold.");
                        break;
                    case 8:
                        deck.get(i).setDescription("Go Back Three 3 Spaces.");
                        break;
                    case 9:
                        deck.get(i).setDescription("Go to Jail. Go directly to Jail. Do not pass GO, do not collect $200.");
                        break;
                    case 10:
                        deck.get(i).setDescription("Make general repairs on all your property: For each house pay $25, For each hotel pay $100.");
                        break;
                    case 11:
                        deck.get(i).setDescription("Pay poor tax of $15.");
                        break;
                    case 12:
                        deck.get(i).setDescription("Take a trip to Reading Railroad. If you pass Go, collect $200.");
                        break;
                    case 13:
                        deck.get(i).setDescription("Take a walk on the Boardwalk. Advance token to Boardwalk.");
                        break;
                    case 14:
                        deck.get(i).setDescription("You have been elected Chairman of the Board. Pay each player $50.");
                        break;
                    case 15:
                        deck.get(i).setDescription("Your building and loan matures. Receive $150.");
                        break;                      
                    case 16:
                        deck.get(i).setDescription("You have won a crossword competition. Collect $100.");
                        break; 
                }
            }else if(i <= 33){
                Cards card = new Cards("Community", 3, 18, 34, "", i); //starting position from 1
                deck.add(i, card);
                switch(i){
                    case 17:
                        deck.get(i).setDescription("Advance to Go. (Collect $200)");
                        break;
                    case 18:
                        deck.get(i).setDescription("Bank error in your favor. Collect $200.");
                        break;
                    case 19:
                        deck.get(i).setDescription("Doctor's fees. Pay $50.");
                        break;
                    case 20: 
                        deck.get(i).setDescription("From sale of stock you get $50.");
                        break;
                    case 21:
                        deck.get(i).setDescription("Get Out of Jail Free. This card may be kept until needed or sold/traded.");
                        break;
                    case 22:
                        deck.get(i).setDescription("Go to Jail. Go directly to jail. Do not pass Go, Do not collect $200.");
                        break;
                    case 23:
                        deck.get(i).setDescription("Grand Opera Night. Collect $50 from every player for opening night seats.");
                        break;
                    case 24:
                        deck.get(i).setDescription("Holiday Fund matures. Receive $100.");
                        break;
                    case 25:
                        deck.get(i).setDescription("Income tax refund. Collect $20.");
                        break;
                    case 26:
                        deck.get(i).setDescription("It's your birthday. Collect $10 from every player.");
                        break;
                    case 27:
                        deck.get(i).setDescription("Life insurance matures. Collect $100");
                        break;
                    case 28:
                        deck.get(i).setDescription("Hospital Fees. Pay $50.");
                        break;
                    case 29:
                        deck.get(i).setDescription("School fees. Pay $50.");
                        break;
                    case 30:
                        deck.get(i).setDescription("Receive $25 consultancy fee.");
                        break;
                    case 31:
                        deck.get(i).setDescription("You are assessed for street repairs: Pay $40 per house and $115 per hotel you own.");
                        break;
                    case 32:
                        deck.get(i).setDescription("You have won second prize in a beauty contest. Collect $10.");
                        break;                      
                    case 33:
                        deck.get(i).setDescription("You inherit $100.");
                        break;                    
                }
            }else{
                //starting board position from 1
                switch(i){
                    case 34:
                        Cards card34 = new Cards("Property", "Mediterranean Avenue", 60, 2, "None", 0, "Brown", 30, 50, 2, i);
                        deck.add(i, card34);
                        break;
                    case 35:    
                        Cards card35 = new Cards("Property", "Baltic Avenue", 60, 4, "None", 0, "Brown", 30, 50, 4, i);
                        deck.add(i, card35);
                        break;
                    case 36:
                        Cards card36 = new Cards("Property", "Reading Railroad", 200, 25, "None", 0, "Stations", 100, 0, 6, i);
                        deck.add(i, card36);
                        break;
                    case 37:
                        Cards card37 = new Cards("Property", "Oriental Avenue", 100, 6, "None", 0, "Light Blue", 50, 50, 7, i);
                        deck.add(i, card37);
                        break;
                    case 38:
                        Cards card38 = new Cards("Property", "Vermont Avenue", 100, 6, "None", 0, "Light Blue", 50, 50, 9, i);
                        deck.add(i, card38);
                        break;
                    case 39:
                        Cards card39 = new Cards("Property", "Connecticut Avenue", 120, 8, "None", 0, "Light Blue", 60, 50, 10, i);
                        deck.add(i, card39);
                        break;
                    case 40:
                        Cards card40 = new Cards("Property", "St. Charles Place", 140, 10, "None", 0, "Pink", 70, 100, 12, i);
                        deck.add(i, card40);
                        break;
                    case 41:
                        Cards card41 = new Cards("Property", "Electric Company", 150, 0, "None", 0, "Utilities", 75, 0, 13, i);
                        deck.add(i, card41);
                        break;
                    case 42:
                        Cards card42 = new Cards("Property", "States Avenue", 140, 10, "None", 0, "Pink", 70, 100, 14, i);
                        deck.add(i, card42);
                        break;
                    case 43:
                        Cards card43 = new Cards("Property", "Virginia Avenue", 160, 12, "None", 0, "Pink", 80, 100, 15, i);
                        deck.add(i, card43);
                        break;
                    case 44:
                        Cards card44 = new Cards("Property", "Pennsylvania Railroad", 200, 25, "None", 0, "Stations", 100, 0, 16, i);
                        deck.add(i, card44);
                        break;
                    case 45:
                        Cards card45 = new Cards("Property", "St. James Place", 180, 14, "None", 0, "Orange", 90, 100, 17, i);
                        deck.add(i, card45);
                        break;
                    case 46:
                        Cards card46 = new Cards("Property", "Tennessee Avenue", 180, 14, "None", 0, "Orange", 90, 100, 19, i);
                        deck.add(i, card46);
                        break;
                    case 47:
                        Cards card47 = new Cards("Property", "New York Avenue", 200, 16, "None", 0, "Orange", 100, 100, 20, i);
                        deck.add(i, card47);
                        break;
                    case 48:
                        Cards card48 = new Cards("Property", "Kentucky Avenue", 220, 18, "None", 0, "Red", 110, 150, 22, i);
                        deck.add(i, card48);
                        break;
                    case 49:
                        Cards card49 = new Cards("Property", "Indiana Avenue", 220, 18, "None", 0, "Red", 110, 150, 24, i);
                        deck.add(i, card49);
                        break;
                    case 50:
                        Cards card50 = new Cards("Property", "Illinois Avenue", 240, 20, "None", 0, "Red", 120, 150, 25, i);
                        deck.add(i, card50);
                        break;
                    case 51:
                        Cards card51 = new Cards("Property", "B. & O. Railroad", 200, 25, "None", 0, "Stations", 100, 0, 26, i);
                        deck.add(i, card51);
                        break;
                    case 52:
                        Cards card52 = new Cards("Property", "Atlantic Avenue", 260, 22, "None", 0, "Yellow", 130, 150, 27, i);
                        deck.add(i, card52);
                        break;
                    case 53:
                        Cards card53 = new Cards("Property", "Ventnor Avenue", 260, 22, "None", 0, "Yellow", 130, 150, 28, i);
                        deck.add(i, card53);
                        break;
                    case 54:
                        Cards card54 = new Cards("Property", "Water Works", 150, 0, "None", 0, "Utilities", 75, 0, 29, i);
                        deck.add(i, card54);
                        break;
                    case 55:
                        Cards card55 = new Cards("Property", "Marvin Gardens", 280, 24, "None", 0, "Yellow", 140, 150, 30, i);
                        deck.add(i, card55);
                        break;
                    case 56:
                        Cards card56 = new Cards("Property", "Pacific Avenue", 300, 26, "None", 0, "Green", 150, 200, 32, i);
                        deck.add(i, card56);
                        break;
                    case 57:
                        Cards card57 = new Cards("Property", "North Carolina Avenue", 300, 26, "None", 0, "Green", 150, 200, 33, i);
                        deck.add(i, card57);
                        break;
                    case 58:
                        Cards card58 = new Cards("Property", "Pennsylvania Avenue", 320, 28, "None", 0, "Green", 160, 200, 35, i);
                        deck.add(i, card58);
                        break;
                    case 59:
                        Cards card59 = new Cards("Property", "Short Line", 200, 25, "None", 0, "Stations", 100, 0, 36, i);
                        deck.add(i, card59);
                        break;
                    case 60:
                        Cards card60 = new Cards("Property", "Park Place", 350, 35, "None", 0, "Dark Blue", 175, 200, 38, i);
                        deck.add(i, card60);
                        break;
                    case 61:
                        Cards card61 = new Cards("Property", "Boardwalk", 400, 50, "None", 0, "Dark Blue", 200, 200, 40, i);
                        deck.add(i, card61);
                        break;    
                }
            }
        }
        return deck;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

import java.util.Hashtable;

/**
 *
 * @author anna
 */
public class Cards {
    private String type;
    private String name;
    private int price;
    private int rent;
    private String owner;
    private int houses;
    private String colour;
    private int position; //same as id of special cards
    private String description;
    
    //constructor for properties
    public Cards(String type, String name, int price, int rent, String owner, int houses, String colour, int position) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.rent = rent;
        this.owner = owner;
        this.houses = houses;
        this.colour = colour;
        this.position = position;
    }
    
    //constructor for special cards (decision, order)
    public Cards(String type, int position, String description) {
        this.type = type;
        this.position = position;
        this.description = description;
    }

    //getters and setters for attributes
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getHouses() {
        return houses;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
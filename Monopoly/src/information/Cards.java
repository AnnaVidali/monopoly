/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

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
    private int mortgage;
    private int houseCost;
    private int id; 
    private String description;
    private int position; //board position
    private int position2; //board position for special cards
    private int position3; //board position for special cards
    
    //constructor for properties
    public Cards(String type, String name, int price, int rent, String owner, int houses, String colour, int mortgage, int houseCost, int position, int id) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.rent = rent;
        this.owner = owner;
        this.houses = houses;
        this.colour = colour;
        this.mortgage = mortgage;
        this.houseCost = houseCost;
        this.position = position;
        this.id = id;
    }
    
    //constructor for special cards (decision, order)
    public Cards(String type, int position, int position2, int position3, String description, int id) {
        this.type = type;
        this.position = position;
        this.position2 = position2;
        this.position3 = position3;
        this.description = description;
        this.id = id;
    }

    //empty constructor
    public Cards() {
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

    public int getMortgage() {
        return mortgage;
    }

    public void setMortgage(int mortgage) {
        this.mortgage = mortgage;
    }

    public int getHouseCost() {
        return houseCost;
    }

    public void setHouseCost(int houseCost) {
        this.houseCost = houseCost;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition2() {
        return position2;
    }

    public void setPosition2(int position2) {
        this.position2 = position2;
    }

    public int getPosition3() {
        return position3;
    }

    public void setPosition3(int position3) {
        this.position3 = position3;
    }
}
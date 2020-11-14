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
public class Properties {
    private String name;
    private int price;
    private int pay;
    private String owner;
    private int houses;
    private String colour;
    private int spot;
    
    public Properties(String name, int price, int pay, String owner, int houses, String colour, int spot) {
        this.name = name;
        this.price = price;
        this.pay = pay;
        this.owner = owner;
        this.houses = houses;
        this.colour = colour;
        this.spot = spot;
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

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
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

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }
    
}

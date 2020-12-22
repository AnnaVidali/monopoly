package information;


public class Player {
    public String name;
    public int money;
    private boolean round;
    private String property;
    private boolean construct;
    private int position;
    
    //constructor for player
    public Player(String name, int money, boolean round, String property, boolean construct, int potision) {
	this.name = name;
	this.money = money;
	this.round = round;
	this.property = property;
	this.construct = construct;
	this.position = position;
    }
	public Player(){
            
        }
    //getters and setters
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getMoney() {
	return money;
    }
    
    public void setMoney(int money) {
    	this.money = money;
    }
    
    public boolean isRound() {
    	return round;
    }
    
    public void setRound(boolean round) {
    	this.round = round;
    }
    
    public String getProperty() {
    	return property;
    }
    
    public void setProperty(String property) {
    	this.property = property;
    }
    
    public boolean isConstruct() {
    	return construct;
    }
    
    public void setConstruct(boolean construct) {
    	this.construct = construct;
    }
    
    public int getPosition() {
    	return position;
    }
    
    public void setPosition(int potision) {
    	this.position = position;
    }
}

package information;



public class Player {
    private String name;
    private int money;
    private boolean round;
    private String property;
    private boolean construct;
    private int potision;
    
    public Player(String name, int money, boolean round, String property, boolean construct, int potision) {
	//super();
	this.name = name;
	this.money = money;
	this.round = round;
	this.property = property;
	this.construct = construct;
	this.potision = potision;
    }
	
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
    
    public int getPotision() {
    	return potision;
    }
    
    public void setPotision(int potision) {
    	this.potision = potision;
    }
}

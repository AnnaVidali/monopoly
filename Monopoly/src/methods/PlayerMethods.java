/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methods;
import information.*;
import java.util.Random;

/**
 *
 * @author anna
 */
public class PlayerMethods {
    
    
  public int  throwDice() {
      int numSides=6;
       Random  r = new Random();
      int number = r.nextInt(numSides)+1;
     return number;
}  
    
    
   public static void buyProperty(Player player, Cards card){
       int price = card.getPrice();
       player.money=player.money - price;
       card.setOwner(player.getName());
       
       
   }
    
    public static void initPlayer(String name){
        Player p= new Player();
        p.setName(name);
        p.setMoney(10000);
    }
    
    public static void giveMoney(Player player, int money){
        player.setMoney(player.getMoney()+ money);
    }
    
    public static void takeMoney(Player player, int money){
         if (money<=player.getMoney()){
        player.setMoney(player.getMoney()- money);
         }
    }
    
    public static void givePlayer1MoneyFromPlayer2(Player player1, Player player2, int money){
        if (money<=player2.getMoney()){
        giveMoney(player1, money);
        takeMoney(player2, money);
        }
    }
    
    public static void giveMoneyForStartRound (Player player, int dices){
        int position = player.getPosition();
        int newposition = position + dices;
        if (newposition>39){
            player.setMoney(player.getMoney() + 2000);
        }
        
    }
    
    boolean checkNewRoundPosition(Player player, int dices){
        boolean flag=false;
        int position = player.getPosition();
        int newposition = position + dices;
        if (newposition>39){
        flag=true;
        }
        return flag;
    }
    
        int makeMovePlayer(Player player, int dices){
        giveMoneyForStartRound(player, dices);
        boolean flag= checkNewRoundPosition(player, dices);
        int finalposition=0;
        if (flag==true){
          // int finalposition=0;
            player.setPosition(dices);
            int position = player.getPosition();
            int newposition = position + dices;
            finalposition=newposition-39;
        }else{
             int position = player.getPosition();
        int newposition = position + dices;
            finalposition=newposition;
        }
        player.setPosition(finalposition);
      return 1;
        //change
    }
    
    
    
    
    
}

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
    
    
  int ThrowDice() {
      int numSides=6;
       Random  r = new Random();
      int number = r.nextInt(numSides)+1;
     return number;
}  
    
    
    
    
    
    
}

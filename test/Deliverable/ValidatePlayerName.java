package Deliverable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabri
 */
public class ValidatePlayerName {
    
    public ValidatePlayerName() {
    }

    @Test
    public void testPlayerNameGood(){
        System.out.println("checkPlayerNameGood");
        String user = "BobbyLee";
        boolean expResult = true;
        boolean result = MainGame.checkName(user);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerNameBad(){
        System.out.println("checkPlayerNameBad");
        String user = "Bobb";
        boolean expResult = false;
        boolean result = MainGame.checkName(user);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerNameBoundary(){
        System.out.println("checkPlayerNameBoundary");
        String user = "Bobby";
        boolean expResult = true;
        boolean result = MainGame.checkName(user);
        assertEquals(expResult, result);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author gabri
 */
public enum FaceOfCardEnum {
    ACE("ACE", 14),
    KING("KING", 13),
    QUEEN("QUEEN", 12),
    JACK("JACK", 11),
    TEN("TEN", 10),
    NINE("NINE", 9),
    EIGHT("EIGHT", 8),
    SEVEN("SEVEN", 7),
    SIX("SIX", 6),
    FIVE("FIVE", 5),
    FOUR("FOUR", 4),
    THREE("THREE", 3),
    TWO("TWO", 2);
    
    private final String face;
    private final int value;
    

    private FaceOfCardEnum(String face, int value) {
        this.face = face;
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public String getFace(){
        return face;
    }
    
}

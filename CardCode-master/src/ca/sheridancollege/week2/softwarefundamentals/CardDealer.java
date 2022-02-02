/*
 * Name = Manvir Singh Rattan
 * Student id= 991658419
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author Manvir Singh Rattan , 2022
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card ace = new Card("ace", 6);
        ace.setSuit("diamonds");
        System.out.println("ace suit"+ace.getSuit());
        System.out.println("ace suit"+ace.getValue());
        
        
        Card ninehearts = new Card ("ace", 6);
        ace.setSuit("diamonds");
        System.out.println("ninehearts suit"+ninehearts.getSuit());
        System.out.println("nineheart suit"+ninehearts.getValue());
        
        
    }
}

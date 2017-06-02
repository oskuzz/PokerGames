/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author s1601396
 */
public class CardTest {

    static int Num1, luku1;
    static int Num2, luku2;
    static int Num3, luku3;
    static int Num4, luku4;

    public static int Test(int Card, int Num, int Gender) {
        if (Card == 1) {
            Num1 = Num;
            luku1 = Gender;
        } else if (Card == 2) {
            if (Num1 == Num && luku1 == Gender) {
                return 0;
            } else {
                Num2 = Num;
                luku2 = Gender;
                return 1;
            }
        } else if (Card == 3) {
            if (Num1 == Num && luku1 == Gender) {
                return 0;
            } else if (Num2 == Num && luku2 == Gender) {
                return 0;
            } else {
                Num3 = Num;
                luku3 = Gender;
                return 1;
            }
        } else if (Card == 4) {
            if (Num1 == Num && luku1 == Gender) {
                return 0;
            } else if (Num2 == Num && luku2 == Gender) {
                return 0;
            } else if (Num3 == Num && luku3 == Gender) {
                return 0;
            } else {
                Num4 = Num;
                luku4 = Gender;
                return 1;
            }

        } else if (Card == 5) {
           if (Num1 == Num && luku1 == Gender) {
                return 0;
            } else if (Num2 == Num && luku2 == Gender) {
                return 0;
            } else if (Num3 == Num && luku3 == Gender) {
                return 0;
            } else if(Num4 == Num && luku4 == Gender){
                
            }else{
                return 1;
            }
        }
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.*;

/**
 *
 * @author s1601396
 */
public class Cards {

    static int Bet = 0;
    static int Bank = 0;

    public static String Cards() {
        int Card1 = 0;
        int Card2 = 0;
        int Card3 = 0;
        int Card4 = 0;
        int Card5 = 0;
        int luku;

        for (int j = 1; j <= 5; j++) {
            if (j == 1) {
                Card1 = Shuffle();
                luku = Shuffle2();
                CardTest.Test(1, Card1, luku);
                if (luku == 1) {
                    if (Card1 == 1) {
                        System.out.print("Hertta " + "A" + ", ");
                    } else if (Card1 == 11) {
                        System.out.print("Hertta " + "J" + ", ");
                    } else if (Card1 == 12) {
                        System.out.print("Hertta " + "Q" + ", ");
                    } else if (Card1 == 13) {
                        System.out.print("Hertta " + "K" + ", ");
                    } else {
                        System.out.print("Hertta " + Card1 + ", ");
                    }
                } else if (luku == 2) {
                    if (Card1 == 1) {
                        System.out.print("Ruutu " + "A" + ", ");
                    } else if (Card1 == 11) {
                        System.out.print("Ruutu " + "J" + ", ");
                    } else if (Card1 == 12) {
                        System.out.print("Ruutu " + "Q" + ", ");
                    } else if (Card1 == 13) {
                        System.out.print("Ruutu " + "K" + ", ");
                    } else {
                        System.out.print("Ruutu " + Card1 + ", ");
                    }
                } else if (luku == 3) {
                    if (Card1 == 1) {
                        System.out.print("Risti " + "A" + ", ");
                    } else if (Card1 == 11) {
                        System.out.print("Risti " + "J" + ", ");
                    } else if (Card1 == 12) {
                        System.out.print("Risti " + "Q" + ", ");
                    } else if (Card1 == 13) {
                        System.out.print("Risti " + "K" + ", ");
                    } else {
                        System.out.print("Risti " + Card1 + ", ");
                    }
                } else if (luku == 4) {
                    if (Card1 == 1) {
                        System.out.print("Pata " + "A" + ", ");
                    } else if (Card1 == 11) {
                        System.out.print("Pata " + "J" + ", ");
                    } else if (Card1 == 12) {
                        System.out.print("Pata " + "Q" + ", ");
                    } else if (Card1 == 13) {
                        System.out.print("Pata " + "K" + ", ");
                    } else {
                        System.out.print("Pata " + Card1 + ", ");
                    }
                }
            } else if (j == 2) {
                Card2 = Shuffle();
                luku = Shuffle2();
                int test = CardTest.Test(2, Card2, luku);
                if (test == 0) {
                    while (true) {
                        Card2 = Shuffle();
                        luku = Shuffle2();
                        test = CardTest.Test(2, Card2, luku);
                        if (test == 1) {
                            break;
                        }
                    }
                }
                if (luku == 1) {
                    if (Card2 == 1) {
                        System.out.print("Hertta " + "A" + ", ");
                    } else if (Card2 == 11) {
                        System.out.print("Hertta " + "J" + ", ");
                    } else if (Card2 == 12) {
                        System.out.print("Hertta " + "Q" + ", ");
                    } else if (Card2 == 13) {
                        System.out.print("Hertta " + "K" + ", ");
                    } else {
                        System.out.print("Hertta " + Card2 + ", ");
                    }
                } else if (luku == 2) {
                    if (Card2 == 1) {
                        System.out.print("Ruutu " + "A" + ", ");
                    } else if (Card2 == 11) {
                        System.out.print("Ruutu " + "J" + ", ");
                    } else if (Card2 == 12) {
                        System.out.print("Ruutu " + "Q" + ", ");
                    } else if (Card2 == 13) {
                        System.out.print("Ruutu " + "K" + ", ");
                    } else {
                        System.out.print("Ruutu " + Card2 + ", ");
                    }
                } else if (luku == 3) {
                    if (Card2 == 1) {
                        System.out.print("Risti " + "A" + ", ");
                    } else if (Card2 == 11) {
                        System.out.print("Risti " + "J" + ", ");
                    } else if (Card2 == 12) {
                        System.out.print("Risti " + "Q" + ", ");
                    } else if (Card2 == 13) {
                        System.out.print("Risti " + "K" + ", ");
                    } else {
                        System.out.print("Risti " + Card2 + ", ");
                    }
                } else if (luku == 4) {
                    if (Card2 == 1) {
                        System.out.print("Pata " + "A" + ", ");
                    } else if (Card2 == 11) {
                        System.out.print("Pata " + "J" + ", ");
                    } else if (Card2 == 12) {
                        System.out.print("Pata " + "Q" + ", ");
                    } else if (Card2 == 13) {
                        System.out.print("Pata " + "K" + ", ");
                    } else {
                        System.out.print("Pata " + Card2 + ", ");
                    }
                }
            } else if (j == 3) {
                Card3 = Shuffle();
                luku = Shuffle2();
                int test = CardTest.Test(3, Card3, luku);
                if (test == 0) {
                    while (true) {
                        Card3 = Shuffle();
                        luku = Shuffle2();
                        test = CardTest.Test(2, Card3, luku);
                        if (test == 1) {
                            break;
                        }
                    }
                }
                if (luku == 1) {
                    if (Card3 == 1) {
                        System.out.print("Hertta " + "A" + ", ");
                    } else if (Card3 == 11) {
                        System.out.print("Hertta " + "J" + ", ");
                    } else if (Card3 == 12) {
                        System.out.print("Hertta " + "Q" + ", ");
                    } else if (Card3 == 13) {
                        System.out.print("Hertta " + "K" + ", ");
                    } else {
                        System.out.print("Hertta " + Card3 + ", ");
                    }
                } else if (luku == 2) {
                    if (Card3 == 1) {
                        System.out.print("Ruutu " + "A" + ", ");
                    } else if (Card3 == 11) {
                        System.out.print("Ruutu " + "J" + ", ");
                    } else if (Card3 == 12) {
                        System.out.print("Ruutu " + "Q" + ", ");
                    } else if (Card3 == 13) {
                        System.out.print("Ruutu " + "K" + ", ");
                    } else {
                        System.out.print("Ruutu " + Card3 + ", ");
                    }
                } else if (luku == 3) {
                    if (Card3 == 1) {
                        System.out.print("Risti " + "A" + ", ");
                    } else if (Card3 == 11) {
                        System.out.print("Risti " + "J" + ", ");
                    } else if (Card3 == 12) {
                        System.out.print("Risti " + "Q" + ", ");
                    } else if (Card3 == 13) {
                        System.out.print("Risti " + "K" + ", ");
                    } else {
                        System.out.print("Risti " + Card3 + ", ");
                    }
                } else if (luku == 4) {
                    if (Card3 == 1) {
                        System.out.print("Pata " + "A" + ", ");
                    } else if (Card3 == 11) {
                        System.out.print("Pata " + "J" + ", ");
                    } else if (Card3 == 12) {
                        System.out.print("Pata " + "Q" + ", ");
                    } else if (Card3 == 13) {
                        System.out.print("Pata " + "K" + ", ");
                    } else {
                        System.out.print("Pata " + Card3 + ", ");
                    }
                }
            } else if (j == 4) {
                Card4 = Shuffle();
                luku = Shuffle2();
                int test = CardTest.Test(4, Card4, luku);
                if (test == 0) {
                    while (true) {
                        Card4 = Shuffle();
                        luku = Shuffle2();
                        test = CardTest.Test(4, Card4, luku);
                        if (test == 1) {
                            break;
                        }
                    }
                }
                if (luku == 1) {
                    if (Card4 == 1) {
                        System.out.print("Hertta " + "A" + ", ");
                    } else if (Card4 == 11) {
                        System.out.print("Hertta " + "J" + ", ");
                    } else if (Card4 == 12) {
                        System.out.print("Hertta " + "Q" + ", ");
                    } else if (Card4 == 13) {
                        System.out.print("Hertta " + "K" + ", ");
                    } else {
                        System.out.print("Hertta " + Card4 + ", ");
                    }
                } else if (luku == 2) {
                    if (Card4 == 1) {
                        System.out.print("Ruutu " + "A" + ", ");
                    } else if (Card4 == 11) {
                        System.out.print("Ruutu " + "J" + ", ");
                    } else if (Card4 == 12) {
                        System.out.print("Ruutu " + "Q" + ", ");
                    } else if (Card4 == 13) {
                        System.out.print("Ruutu " + "K" + ", ");
                    } else {
                        System.out.print("Ruutu " + Card4 + ", ");
                    }
                } else if (luku == 3) {
                    if (Card4 == 1) {
                        System.out.print("Risti " + "A" + ", ");
                    } else if (Card4 == 11) {
                        System.out.print("Risti " + "J" + ", ");
                    } else if (Card4 == 12) {
                        System.out.print("Risti " + "Q" + ", ");
                    } else if (Card4 == 13) {
                        System.out.print("Risti " + "K" + ", ");
                    } else {
                        System.out.print("Risti " + Card4 + ", ");
                    }
                } else if (luku == 4) {
                    if (Card4 == 1) {
                        System.out.print("Pata " + "A" + ", ");
                    } else if (Card4 == 11) {
                        System.out.print("Pata " + "J" + ", ");
                    } else if (Card4 == 12) {
                        System.out.print("Pata " + "Q" + ", ");
                    } else if (Card4 == 13) {
                        System.out.print("Pata " + "K" + ", ");
                    } else {
                        System.out.print("Pata " + Card4 + ", ");
                    }
                }
            } else if (j == 5) {
                Card5 = Shuffle();
                luku = Shuffle2();
                int test = CardTest.Test(5, Card5, luku);
                if (test == 0) {
                    while (true) {
                        Card5 = Shuffle();
                        luku = Shuffle2();
                        test = CardTest.Test(5, Card5, luku);
                        if (test == 1) {
                            break;
                        }
                    }
                }
                if (luku == 1) {
                    if (Card5 == 1) {
                        System.out.print("Hertta " + "A" + ", ");
                    } else if (Card5 == 11) {
                        System.out.print("Hertta " + "J" + ", ");
                    } else if (Card5 == 12) {
                        System.out.print("Hertta " + "Q" + ", ");
                    } else if (Card5 == 13) {
                        System.out.print("Hertta " + "K" + ", ");
                    } else {
                        System.out.print("Hertta " + Card5 + ", ");
                    }
                } else if (luku == 2) {
                    if (Card5 == 1) {
                        System.out.print("Ruutu " + "A" + ", ");
                    } else if (Card5 == 11) {
                        System.out.print("Ruutu " + "J" + ", ");
                    } else if (Card5 == 12) {
                        System.out.print("Ruutu " + "Q" + ", ");
                    } else if (Card5 == 13) {
                        System.out.print("Ruutu " + "K" + ", ");
                    } else {
                        System.out.print("Ruutu " + Card5 + ", ");
                    }
                } else if (luku == 3) {
                    if (Card5 == 1) {
                        System.out.print("Risti " + "A" + ", ");
                    } else if (Card5 == 11) {
                        System.out.print("Risti " + "J" + ", ");
                    } else if (Card5 == 12) {
                        System.out.print("Risti " + "Q" + ", ");
                    } else if (Card5 == 13) {
                        System.out.print("Risti " + "K" + ", ");
                    } else {
                        System.out.print("Risti " + Card5 + ", ");
                    }
                } else if (luku == 4) {
                    if (Card5 == 1) {
                        System.out.print("Pata " + "A" + ", ");
                    } else if (Card5 == 11) {
                        System.out.print("Pata " + "J" + ", ");
                    } else if (Card5 == 12) {
                        System.out.print("Pata " + "Q" + ", ");
                    } else if (Card5 == 13) {
                        System.out.print("Pata " + "K" + ", ");
                    } else {
                        System.out.print("Pata " + Card5 + ", ");
                    }
                }
            }

        }
        return "";
    }

    public static int Shuffle() {
        int START = 1;
        int END = 14;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int Shuffle2() {
        int START = 1;
        int END = 4;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    private static int showRandomInteger(int aStart, int aEnd, Random aRandom) {
        long range = (long) aEnd - (long) aStart + 1;
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        return (randomNumber);
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Bank?");
        Bank = Integer.parseInt(lukija.nextLine());
        System.out.println("Bet");
        Bet = Integer.parseInt(lukija.nextLine());

        if (Bank >= Bet) {
            Bank = Bank - Bet;
        }
        while (true) {
            Cards();
            System.out.println("");
            System.out.println("Continue?");
            String answear = lukija.nextLine();
            if (answear.equals("No") || answear.equals("no")) {
                break;
            } else {
                System.out.println("Bank: "+Bank);
            }

            System.out.println("Bet");
            Bet = Integer.parseInt(lukija.nextLine());
            if (Bank >= Bet) {
                Bank = Bank - Bet;
            }
        }
        System.out.println("Thanks for playing");

    }
}

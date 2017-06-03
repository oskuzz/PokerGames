package GUI;

public class TexasHoldem extends javax.swing.JFrame {

    int Cards = 0;
    int Card = 1;
    int Gender = 1;
    static int Bots = 1;
    static int Bot = 1;
    String card1 = "0";
    String card2 = "0";
    String card3 = "0";
    String card4 = "0";
    String card5 = "0";
    String Hcard1 = "0";
    String Hcard2 = "0";
    String Hcard3 = "0";
    String Hcard4 = "0";
    String Hcard5 = "0";
    String Hcard6 = "0";
    String Hcard7 = "0";
    String Hcard8 = "0";
    String Hcard9 = "0";
    String Hcard10 = "0";
    int Fold = 0;
    int Fold1 = 0;
    int Fold2 = 0;
    int Fold3 = 0;
    int Fold4 = 0;
    int Pot = 0;
    int Bank = 0;
    int Bet = 0;
    int SmallBlind = 2;
    int BigBlind = 4;
    int Dealer = 0;

    public TexasHoldem() {
        initComponents();
        jButton2.setVisible(false);
        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P3B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P3B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P4B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P4B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P5B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        P5B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        CardStack = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        P5B2 = new javax.swing.JLabel();
        P5B1 = new javax.swing.JLabel();
        P5C2 = new javax.swing.JLabel();
        P5C1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        P4B2 = new javax.swing.JLabel();
        P4B1 = new javax.swing.JLabel();
        P4C2 = new javax.swing.JLabel();
        P4C1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        P2B2 = new javax.swing.JLabel();
        P2B1 = new javax.swing.JLabel();
        P2C2 = new javax.swing.JLabel();
        P2C1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        P1C2 = new javax.swing.JLabel();
        P1C1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        P3B2 = new javax.swing.JLabel();
        P3B1 = new javax.swing.JLabel();
        P3C2 = new javax.swing.JLabel();
        P3C1 = new javax.swing.JLabel();
        Card5 = new javax.swing.JLabel();
        Card4 = new javax.swing.JLabel();
        Card3 = new javax.swing.JLabel();
        Card2 = new javax.swing.JLabel();
        Card1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Texas Holdem");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));

        jToggleButton1.setText("Ready");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        jTextField1.setText("1000");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cash:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bet:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField2.setText("10");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 90, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pot:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("0");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 50, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jButton3.setText("Fold");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 110));

        CardStack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardStack.png"))); // NOI18N
        getContentPane().add(CardStack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 206, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 185, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 185, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P5B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel6.add(P5B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 1, -1, -1));

        P5B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel6.add(P5B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 1, -1, -1));

        P5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_2.png"))); // NOI18N
        jPanel6.add(P5C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 1, -1, -1));

        P5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_1.png"))); // NOI18N
        jPanel6.add(P5C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 1, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 80));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P4B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel5.add(P4B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 1, -1, -1));

        P4B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel5.add(P4B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 1, -1, -1));

        P4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_2.png"))); // NOI18N
        jPanel5.add(P4C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 1, -1, -1));

        P4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_1.png"))); // NOI18N
        jPanel5.add(P4C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 1, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 90, 80));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel2.add(P2B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 10, -1, -1));

        P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel2.add(P2B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_2.png"))); // NOI18N
        jPanel2.add(P2C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 10, -1, -1));

        P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_1.png"))); // NOI18N
        jPanel2.add(P2C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 90, 80));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_2.png"))); // NOI18N
        jPanel3.add(P1C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 10, -1, -1));

        P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_1.png"))); // NOI18N
        jPanel3.add(P1C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 90, 80));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P3B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel4.add(P3B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 10, -1, -1));

        P3B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png"))); // NOI18N
        jPanel4.add(P3B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        P3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_2.png"))); // NOI18N
        jPanel4.add(P3C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 10, -1, -1));

        P3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/1_1.png"))); // NOI18N
        jPanel4.add(P3C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, 80));
        getContentPane().add(Card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 206, -1, 70));
        getContentPane().add(Card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 206, -1, 70));
        getContentPane().add(Card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 206, -1, 70));
        getContentPane().add(Card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 206, -1, 70));
        getContentPane().add(Card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 206, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/CardTable.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/Background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        setSize(new java.awt.Dimension(811, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Cards++;

        if (Bots == 1) {
            Bots1();
            Bots = 0;
        }
        if (Cards == 2) {
            System.out.println("Hi");
            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.Test(1, Card, Gender);
                if (luku == 0) {
                    card1 = Card + "." + Gender;
                    Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.Test(2, Card, Gender);
                if (luku == 0) {
                    card2 = Card + "." + Gender;
                    Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.Test(3, Card, Gender);
                if (luku == 0) {
                    card3 = Card + "." + Gender;
                    Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

        } else if (Cards == 3) {
            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.Test(4, Card, Gender);
                if (luku == 0) {
                    card4 = Card + "." + Gender;
                    Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }
        } else if (Cards == 4) {
            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.Test(5, Card, Gender);
                if (luku == 0) {
                    card5 = Card + "." + Gender;
                    Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }
            CardWinTest.TableCards3(Double.parseDouble(card1), Double.parseDouble(card2), Double.parseDouble(card3), Double.parseDouble(card4), Double.parseDouble(card5), Pot);
            jToggleButton1.setVisible(true);
            jButton2.setVisible(false);
            Cards = 0;
            rBot();
            Fold1 = 0;

            P3B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P3B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P4B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P4B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P5B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P5B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    public static void Bot(int val) {
        Bots = val;
        Bot = val;
    }
    
    public void rBot(){
        Bots = Bot;
    }

    public void Bots1() {
        for (int i = 1; i <= 2; i++) {

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 1, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard1 = Card + "." + Gender;
                    P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard3 = Card + "." + Gender;
                    P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }
            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 2, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard2 = Card + "." + Gender;
                    P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard4 = Card + "." + Gender;
                    P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

        }
        CardWinTest.HandCards1(Double.parseDouble(Hcard1), Double.parseDouble(Hcard2), Double.parseDouble(Hcard3), Double.parseDouble(Hcard4));
        if(Cards == 1){
        Fold1 = PlayerTurn.Bot1("0", "0", "0", "0", "0", Hcard3, Hcard4);
        }

            if (Fold1 == 1) {
                jLabel10.setText("Fold");
                Fold(1);
            } else {
                P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
                P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
            }
        
    }

    public void Fold(int fold) {
        if (fold == 1) {
            jToggleButton1.setVisible(true);
            jButton2.setVisible(false);
            Fold1 = 0;
            Cards = 5;
            P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            
        }
    }

    public void Bots2() {
        for (int i = 1; i <= 3; i++) {

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 1, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard1 = Card + "." + Gender;
                    P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard3 = Card + "." + Gender;
                    P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 3 && luku == 0) {
                    Hcard5 = Card + "." + Gender;
                    P3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }
            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 2, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard2 = Card + "." + Gender;
                    P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard4 = Card + "." + Gender;
                    P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 3 && luku == 0) {
                    Hcard6 = Card + "." + Gender;
                    P3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

        }
        CardWinTest.HandCards2(Double.parseDouble(Hcard1), Double.parseDouble(Hcard2), Double.parseDouble(Hcard3), Double.parseDouble(Hcard4), Double.parseDouble(Hcard5), Double.parseDouble(Hcard6));
        int joku = PlayerTurn.Bot1("0", "0", "0", "0", "0", Hcard3, Hcard4);
        int joku2 = PlayerTurn.Bot2("0", "0", "0", "0", "0", Hcard5, Hcard6);
        System.out.println("Bot1: " + joku);
        System.out.println("Bot2: " + joku2);
        P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P3B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P3B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
    }

    public void Bots3() {
        for (int i = 1; i <= 4; i++) {

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 1, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard1 = Card + "." + Gender;
                    P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard3 = Card + "." + Gender;
                    P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 3 && luku == 0) {
                    Hcard5 = Card + "." + Gender;
                    P3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 4 && luku == 0) {
                    Hcard7 = Card + "." + Gender;
                    P4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }
            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 2, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard2 = Card + "." + Gender;
                    P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard4 = Card + "." + Gender;
                    P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 3 && luku == 0) {
                    Hcard6 = Card + "." + Gender;
                    P3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 4 && luku == 0) {
                    Hcard8 = Card + "." + Gender;
                    P4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

        }
        CardWinTest.HandCards3(Double.parseDouble(Hcard1), Double.parseDouble(Hcard2), Double.parseDouble(Hcard3), Double.parseDouble(Hcard4), Double.parseDouble(Hcard5), Double.parseDouble(Hcard6), Double.parseDouble(Hcard7), Double.parseDouble(Hcard8));
        int joku = PlayerTurn.Bot1("0", "0", "0", "0", "0", Hcard3, Hcard4);
        int joku2 = PlayerTurn.Bot2("0", "0", "0", "0", "0", Hcard5, Hcard6);
        int joku3 = PlayerTurn.Bot3("0", "0", "0", "0", "0", Hcard7, Hcard8);
        System.out.println("Bot1: " + joku);
        System.out.println("Bot2: " + joku2);
        System.out.println("Bot3: " + joku3);
        P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P3B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P3B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P4B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P4B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
    }

    public void Bots4() {
        for (int i = 1; i <= 5; i++) {

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 1, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard1 = Card + "." + Gender;
                    P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard3 = Card + "." + Gender;
                    P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 3 && luku == 0) {
                    Hcard5 = Card + "." + Gender;
                    P3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 4 && luku == 0) {
                    Hcard7 = Card + "." + Gender;
                    P4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 5 && luku == 0) {
                    Hcard9 = Card + "." + Gender;
                    P5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

            while (true) {
                Gender = CardShuffle.ShuffleGender();
                Card = CardShuffle.ShuffleNum();
                double luku = CardTest.PlayerCards(i, 2, Card, Gender);
                if (i == 1 && luku == 0) {
                    Hcard2 = Card + "." + Gender;
                    P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 2 && luku == 0) {
                    Hcard4 = Card + "." + Gender;
                    P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 3 && luku == 0) {
                    Hcard6 = Card + "." + Gender;
                    P3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 4 && luku == 0) {
                    Hcard8 = Card + "." + Gender;
                    P4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                } else if (i == 5 && luku == 0) {
                    Hcard10 = Card + "." + Gender;
                    P5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/" + Card + "_" + Gender + ".png")));
                    break;
                }
            }

        }
        CardWinTest.HandCards4(Double.parseDouble(Hcard1), Double.parseDouble(Hcard2), Double.parseDouble(Hcard3), Double.parseDouble(Hcard4), Double.parseDouble(Hcard5), Double.parseDouble(Hcard6), Double.parseDouble(Hcard7), Double.parseDouble(Hcard8), Double.parseDouble(Hcard9), Double.parseDouble(Hcard10));
        int joku = PlayerTurn.Bot1("0", "0", "0", "0", "0", Hcard3, Hcard4);
        int joku2 = PlayerTurn.Bot2("0", "0", "0", "0", "0", Hcard5, Hcard6);
        int joku3 = PlayerTurn.Bot3("0", "0", "0", "0", "0", Hcard7, Hcard8);
        int joku4 = PlayerTurn.Bot4("0", "0", "0", "0", "0", Hcard9, Hcard10);
        System.out.println("Bot1: " + joku);
        System.out.println("Bot2: " + joku2);
        System.out.println("Bot3: " + joku3);
        System.out.println("Bot4: " + joku4);
        P2B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P2B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P3B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P3B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P4B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P4B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P5B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
        P5B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PlayCards/PlayCardBack.png")));
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            if (jTextField1.getText().equals("")) {
                jLabel7.setText("Cash is empty!");
                jToggleButton1.doClick();
            } else if (jTextField2.getText().equals("")) {
                jLabel7.setText("Bet is empty!");
                jToggleButton1.doClick();
            } else {
                jTextField1.setEditable(false);
                jLabel7.setText("");
                jToggleButton1.setText("Clear");
                jToggleButton1.setVisible(false);
                jButton2.setVisible(true);

                Bank = Integer.parseInt(jTextField1.getText()) - (Bet = Integer.parseInt(jTextField2.getText()));
                jTextField1.setText(Integer.toString(Bank));
                jLabel6.setText(Integer.toString(Bet * Bots + Bet));
                jLabel9.setText(Integer.toString(Bet) + " €");
                jLabel10.setText("10 €");
                jLabel8.setText("10 €");
                jLabel11.setText("10 €");
                jLabel12.setText("10 €");
                jButton2.doClick();
            }
        } else {
            jToggleButton1.setText("Ready");
            Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            Card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P3C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P3C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P4C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P4C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P5C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            P5C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TexasHoldemSetup().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TexasHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TexasHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TexasHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TexasHoldem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TexasHoldem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Card1;
    private javax.swing.JLabel Card2;
    private javax.swing.JLabel Card3;
    private javax.swing.JLabel Card4;
    private javax.swing.JLabel Card5;
    private javax.swing.JLabel CardStack;
    private javax.swing.JLabel P1C1;
    private javax.swing.JLabel P1C2;
    private javax.swing.JLabel P2B1;
    private javax.swing.JLabel P2B2;
    private javax.swing.JLabel P2C1;
    private javax.swing.JLabel P2C2;
    private javax.swing.JLabel P3B1;
    private javax.swing.JLabel P3B2;
    private javax.swing.JLabel P3C1;
    private javax.swing.JLabel P3C2;
    private javax.swing.JLabel P4B1;
    private javax.swing.JLabel P4B2;
    private javax.swing.JLabel P4C1;
    private javax.swing.JLabel P4C2;
    private javax.swing.JLabel P5B1;
    private javax.swing.JLabel P5B2;
    private javax.swing.JLabel P5C1;
    private javax.swing.JLabel P5C2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

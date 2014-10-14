{"changed":true,"filter":false,"title":"RandomGames.java","tooltip":"/lab05/RandomGames.java","value":"//William Schwarz\n//\n//lab05\n//random game generator\n\n//import scanner\nimport java.util.Scanner;\n\n    //assign class\n    public class RandomGames {\n        \n        //main method\n        public static void main(String [] args) {\n    \n      \n            //set up scanner to accept input\n            Scanner myScanner = new Scanner( System.in );\n                \n                //prompt the user for their game of choice\n                System.out.print(\"Enter R or r for Roulette, C or c for craps, P or p for pick a card- \");\n                \n                //accept user input\n                    char game = myScanner.next().charAt(0);\n                    \n                        //set up the switch function\n                        \n                        switch( game ){\n                            \n                            case 'r':\n                                int roulette=(int)(Math.random()*37)+1;//generate random number \n                                \n                                System.out.println(\"Roulette : \"+roulette);\n                                \n                               break; \n                            case 'R':\n                                int roulette2=(int)(Math.random()*37)+1;\n                                System.out.println(\"Roulette : \"+roulette2);\n                                \n                                break;\n                            case 'p':\n                                int suit=(int)(Math.random()*4)+1;//generate number representative of suit\n                                int card=(int)(Math.random()*13)+1;//generate card number\n                                    String cardType= \"\";\n                                    String suitType= \"\";\n                                    switch( card ){\n                                        \n                                        case 1:\n                                            cardType= \"Ace\";\n                                            break;\n                                        case 11:\n                                            cardType= \"Jack\";\n                                            break;\n                                        case 12:\n                                            cardType= \"Queen\";\n                                            break;\n                                        case 13:\n                                            cardType= \"King\";\n                                            break;\n                                        \n                                    }\n                                    switch (suit){\n                                        \n                                        case 1:\n                                            suitType= \"diamonds\";\n                                            break;\n                                        case 2:\n                                            suitType= \"clubs\";\n                                            break;\n                                        case 3:\n                                            suitType= \"spades\";\n                                            break;\n                                        case 4:\n                                            suitType= \"hearts\";\n                                            break;\n                                    }\n                                        //print the result\n                                        System.out.println(cardType+\" of \"+suitType);\n                                \n                                break;\n                            case 'P':\n                                int suit2=(int)(Math.random()*4)+1;//generate number representative of suit\n                                int card2=(int)(Math.random()*13)+1;//generate card number\n                                    String cardType2= \"\";\n                                    String suitType2= \"\";\n                                    switch( card2 ){\n                                        \n                                        case 1:\n                                            cardType2= \"Ace\";\n                                            break;\n                                        case 11:\n                                            cardType2= \"Jack\";\n                                            break;\n                                        case 12:\n                                            cardType2= \"Queen\";\n                                            break;\n                                        case 13:\n                                            cardType2= \"King\";\n                                            break;\n                                        \n                                    }\n                                    switch (suit2){\n                                        \n                                        case 1:\n                                            suitType2= \"diamonds\";\n                                            break;\n                                        case 2:\n                                            suitType2= \"clubs\";\n                                            break;\n                                        case 3:\n                                            suitType2= \"spades\";\n                                            break;\n                                        case 4:\n                                            suitType2= \"hearts\";\n                                            break;\n                                    }\n                                        //print the result\n                                        System.out.println(cardType2+\" of \"+suitType2);\n                                \n                                break;\n                            case 'c':\n                                int dice1=(int)(Math.random()*6)+1;\n                                int dice2=(int)(Math.random()*6)+1;\n                                int myVal= dice1+dice2;\n                                \n                                System.out.println(\"Craps : \"+dice1+\" + \"+dice2+\" = \"+myVal);\n                                \n                                break;\n                            case 'C':\n                                int dice3=(int)(Math.random()*6)+1;\n                                int dice4=(int)(Math.random()*6)+1;\n                                int myVal2= dice3+dice4;\n                                \n                                System.out.println(\"Craps : \"+dice3+\" + \"+dice4+\" = \"+myVal2);\n                                \n                                break;\n                                \n                            default:\n                                \n                                System.out.println(\"character entered is not as expected\");\n                                break;\n                                \n                            \n                                \n                        }\n                        \n                        \n        }\n    }","undoManager":{"mark":-1,"position":1,"stack":[[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":43,"column":56},"end":{"row":43,"column":57}},"text":"\\"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":43,"column":56},"end":{"row":43,"column":57}},"text":"\\"}]}]]},"ace":{"folds":[],"scrolltop":120,"scrollleft":0,"selection":{"start":{"row":43,"column":56},"end":{"row":43,"column":56},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":137,"state":"start","mode":"ace/mode/java"}},"timestamp":1411744966974}
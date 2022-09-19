package Assignment;
import java.util.Scanner;
public class Nokia3010Test{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Nokia3010 nokia = new Nokia3010();

        while(true){
            System.out.println(nokia.mainMenu());
            int mainMenu = input.nextInt();
            if(mainMenu == 99){
                break;
            }
            switch(mainMenu){
                case 1:
                    while(true){
                        System.out.println(nokia.phoneBook());
                        int phoneBook = input.nextInt();
                        if(phoneBook == 99){
                            break;
                            }
                        switch(phoneBook){
                            case 8:
                                while(true){
                                    System.out.println(nokia.options());
                                    int options = input.nextInt();
                                    if(options == 99){
                                        break;

                                    }
                                }
                              break;
                            default:
                                break;
                        }
                    }
                    break;

                case 2:
                    while(true){
                        System.out.println(nokia.messages());
                        int messages = input.nextInt();
                        if(messages == 99){
                            break;
                        }
                        switch (messages){
                            case 7:
                            while(true){
                                System.out.println(nokia.messageSettings());
                                int messageSettings = input.nextInt();
                                if(messageSettings == 99){
                                    break;
                                }
                                switch (messageSettings){
                                    case  1:
                                        while(true){
                                            System.out.println(nokia.set1());
                                            int set1 = input.nextInt();
                                            if(set1 == 99){
                                                break;

                                            }
                                        }
                                        break;
                                    case 2:
                                        while(true){
                                            System.out.println(nokia.common());
                                            int common = input.nextInt();
                                            if(common == 99){
                                                break;
                                            }
                                        }
                                    default:
                                        break;
                                }

                            }
                            break;
                            default:
                                break;
                        }
                    }
                    break;
                case 4:
                    while(true){
                        System.out.println(nokia.callRegister());
                        int callRegister = input.nextInt();
                        if(callRegister == 99){
                            break;
                        }
                        switch (callRegister){
                            case 5: while(true){
                                System.out.println(nokia.showCallDuration());
                                int showCallDuration = input.nextInt();
                                if(showCallDuration == 99){
                                    break;
                                }
                            }
                            break;
                            case 6:
                                while(true){
                                    System.out.println(nokia.showCallCosts());
                                    int showCallCosts = input.nextInt();
                                    if(showCallCosts == 99){
                                        break;
                                    }
                                }
                                break;
                            case 7:
                                while(true){
                                    System.out.println(nokia.callCostSettings());
                                    int callCostSettings = input.nextInt();
                                    if(callCostSettings == 99){
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }

                    }
                    break;
                case 5:
                    while(true){
                        System.out.println(nokia.tones());
                        int tones = input.nextInt();
                        if(tones == 99){
                            break;
                        }
                    }
                case 6:
                    while(true){
                        System.out.println(nokia.settings());
                        int settings = input.nextInt();
                        if(settings == 99){
                            break;
                        }
                        switch (settings){
                            case 1:
                                while(true){
                                    System.out.println(nokia.callSettings());
                                    int callSettings = input.nextInt();
                                    if(callSettings == 99){
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                while(true){
                                    System.out.println(nokia.phoneSettings());
                                    int phoneSettings = input.nextInt();
                                    if(phoneSettings == 99){
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                while(true){
                                    System.out.println(nokia.securitySettings());
                                    int securitySettings = input.nextInt();
                                    if(securitySettings == 99){
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }

                    }
                    break;
                case 11:
                    while(true){
                        System.out.println(nokia.clock());
                        int clock = input.nextInt();
                        if(clock == 99){
                            break;
                        }
                    }
                    break;
            }
        }
    }
}
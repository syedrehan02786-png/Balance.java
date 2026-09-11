import java.util.Scanner;
public class Balance {
    public static void main(String[] args) {
        double balance = 100000;
         Scanner sc = new Scanner(System.in);
         System.out.println("1.checkout balance");
         System.out.println("2.credited balance");
         System.out.println("3.debited balance");
         System.out.println("4.exit");
         System.out.println("enter ur choice");
         int choice = sc.nextInt();
         switch(choice){
                case 1:
                    System.out.println("ur balance is: " + balance);
                    break;
                    case 2:
                        System.out.println("enter the amount to be credited");
                        double credit = sc.nextDouble();
                        balance = balance + credit;
                        System.out.println("ur balance is: " + balance);
                        break;
                        case 3:
                            System.out.println("enter the amount to be debited");
                            double debit = sc.nextDouble();
                            if(debit > balance){
                               System.out.println("insuffient balance");

                            }
                            else{
                                balance = balance - debit;
                                System.out.println("ur balance is : " + balance);

                            }
                            case 4:
                                System.out.println("exit");
                                break;
                                default:
                                    System.out.println("invalid choice");


                    
         }
         sc.close();
    }
    
}

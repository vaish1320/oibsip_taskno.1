    import java.util.*;
    import java.util.Scanner;
    
    import static java.awt.event.MouseEvent.BUTTON1;
    
    public class reservation {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // write your code here
            
            System.out.println("  WELCOME TO ONLINE RESERVATION SYSTEM ");
           
            System.out.println("       \tPRESS BUTTON\t      ");
            
            System.out.println("  1. SIGN UP           2. LOGIN");
            int BUTTON;
    
            
            BUTTON = sc.nextInt();
            
            switch (BUTTON) {
                case 1 -> SIGNIN();
                case 2 -> {
                    System.out.println("First you Create Account    ");
                    
                    SIGNIN();
                }
                default -> {
                    System.out.println("INCORRECT INPUT");
                    
    
                }
            }
        }
    
        public static void SIGNIN() {
            Scanner sc = new Scanner(System.in);
            String id = "";
            String pw = "";
            System.out.print("Enter User ID : ");
            try {
    
                id = sc.next();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.print("Enter password : ");
            try {
                pw = sc.next();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.println("SIGN IN SUCCESSFULLY");
            
            LOGININ(id, pw);
        }
    
        public static void LOGININ(String id, String pw) {
            String L_id;
            String L_pw;
            int BUTTON1 = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter User L_ID : ");
            L_id = sc.next();
            System.out.print("Enter L_password : ");
            L_pw = sc.next();
            if (id.equals(L_id)) {
                if (pw.equals(L_pw)) {
                    System.out.println("LOGIN IN SUCCESSFULLY");
                    System.out.println("PRESS BUTTON ");
                    System.out.println("1 RESERVATION SYSTEM");
                    try {
                        BUTTON1 = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    if (BUTTON1 == 1) {
                        reservationSystem();
                    } else {
                        System.out.println("INCORRECT INPUT");
                        
                    }
                } else {
                    
                    System.out.println("404");
                    System.out.println("INCORRECT ID & PASSWORD");
                    
                    LOGININ(id, pw);
                    System.exit(0);
                }
            } else {
                
                System.out.println(" 404 ");
                System.out.println("INCORRECT ID & PASSWORD");
                
                LOGININ(id, pw);
                System.exit(0);
            }
        }
    
        public static void CancellationSystem(String name, int age, String start, String end, int PNR, int Class_Type, String date, String train_name, int Train_Number) {
            Scanner C = new Scanner(System.in);
            System.out.print("Enter PNR : ");
            int PNR_No = 0;
            try {
                PNR_No = C.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            if (PNR == PNR_No) {
                ticket(name, age, start, end, PNR, Class_Type, date, train_name, Train_Number);
                System.out.println("CANCELLATION SUCCESSFULLY");
           
            } else {
                System.out.println("PNR NOT FOUND");
                CancellationSystem(name, age, start, end, PNR, Class_Type, date, train_name, Train_Number);
             
            }
        }
    
        public static void reservationSystem() {
            String name = "";
            int age = 0;
            String start = "";
            String end = "";
            int Class_Type = 0;
            String date = "";
            String train_name = "";
            Scanner R = new Scanner(System.in);
            
            System.out.print("Enter Name of Passenger : ");
            try {
                name = R.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.print("Enter age : ");
            try {
    
                age = R.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }
            R.nextLine();
            System.out.print("Enter Train Name : ");
            try {
                train_name = R.nextLine();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.print("Enter Destination Date : ");
            try {
                date = R.next();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.print("Enter Class Type : ");
            try {
                Class_Type = R.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.print("Enter Destination : ");
            try {
                start = R.next();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            System.out.print("To ");
            try {
                end = R.next();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            
            int Train_Number = (int) (Math.random() * 1000000);
            int PNR = (int) (Math.random() * 10000);
            System.out.print("Press 1 To Generate Ticket : ");
            try {
                int BUTTON1 = R.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            if (BUTTON1 == 1) {
                ticket(name, age, start, end, PNR, Class_Type, date, train_name, Train_Number);
            } else {
                System.out.println("INCORRECT INPUT");
            
            }
            System.out.println("           PRESS BUTTON            ");
         
            System.out.println("1.Ticket Conform\t\t\t2.Cancel Tickets");
         
            int button3 = R.nextInt();
            switch (button3) {
                case 1 -> {
                    ticket(name, age, start, end, PNR, Class_Type, date, train_name, Train_Number);
                    System.out.println("YOUR TICKET IS CONFORM SUCCESSFULLY");
                   
                }
                case 2 -> {
                    CancellationSystem(name, age, start, end, PNR, Class_Type, date, train_name, Train_Number);
                }
                default -> {
                    System.out.println("\t\t\tINCORRECT INPUT\t\t\t\t");
                           }
            }
    
        }
    
    
        public static void ticket(String name, int age, String start, String end, int PNR, int Class_Type, String date, String train_name, int Train_Number) {
            Scanner T = new Scanner(System.in);
           
            System.out.println("\t\t\t\tTICKET\t\t\t\t");
            
            System.out.println("\t\t\t\t\t\t\t\t" + new Date());
            
            System.out.println("|Train Name|\t\t\t|Train Number|\t\t\t|PNR|\t\t\t|Class_Type|");
            System.out.println(train_name + "\t\t\t\t\t" + Train_Number + "\t\t\t\t" + PNR + "\t\t\t\t" + Class_Type);
            System.out.println("\nDestination - " + start + "\t\tTo\t\t" + end);
            System.out.println("\n|Passenger Name|\t\t\t|Age|\t\t\t|Date|");
            System.out.println(name + "\t\t\t\t\t" + age + "\t\t\t\t" + date);
            
        }
    
        public void Cancelticket(String name, int age, String start, String end, int PNR, int Class_Type, String date, String train_name, int Train_Number) {
            Scanner CT = new Scanner(System.in);
            System.out.println("IF YOU CANCEL TICKET");
      
            System.out.print("PRESS BUTTON 1 : ");
            int BUTTON2 = CT.nextInt();
            if (BUTTON2 == 1) {
                CancellationSystem(name, age, start, end, PNR, Class_Type, date, train_name, Train_Number);
            } else {
                System.out.println("\t\t\tINCORRECT INPUT\t\t\t\t");
                
            }
        }
    }

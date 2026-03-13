import java.util.*;
class Bank{// this is the class bank which is blue print //
    //! ths bank class holds does and has part //

    //? in [has] part we have fields amount , accountHolderName , accountNumber , balance //
        float amount;
      String accountHolderName;
     long accountNumber;
    float balance = 20000;

   //? this is the [does] part it has 3 methods //

      void deposit() { //in this 1st method deposit help to store the value in and give the new balance//
          System.out.print("-----------------------------------------------------------------------------------------------\n");
         System.out.printf("the name of the account is %s\n",accountHolderName);
         System.out.printf("the account number is %d\n",accountNumber);
      System.out.printf("the amount is successfully deposit %f\n new balance is %f", amount,balance+amount);
       
      }
    void withdrawl() {//in this 2nd method withdrawl help to deduct the value and give the new balance//
        System.out.print("-----------------------------------------------------------------------------------------------\n");
         System.out.printf("the name of the account is %s\n",accountHolderName);
         System.out.printf("the account number is %d\n",accountNumber);
         System.out.printf("the amount is successfully withdrawl %f\n new balance is %f",amount,balance-amount);
    }
    void checkbalance() {// in this 3rt method  help to show the value and give the balance //
        System.out.print("-----------------------------------------------------------------------------------------------\n");
         System.out.printf("the name of the account is %s\n",accountHolderName);
         System.out.printf("the account number is %d\n",accountNumber);
           System.out.printf("balance is %f",balance);
    }
}





public class BankAccount { //* its main class //
    public static void main(String[] args) {  //* its main class method//
      int option;
          Bank b1 = new Bank();//! in this we are creating the object from the class bank and giving it the refernce as b1/ 
      
    //? the first inter face in which it asks for the user what is the main purpose of this code as ui//

       System.out.printf("hello welcome to the swish-BANK \n");
       System.out.printf("Select one option fromt these\n ");
       System.out.println(" 1> DEPOSIT\n 2> WITHDRAWL\n 3>CHECK_BALANCE\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("select one value from 1,2,3");
           option = scan.nextInt(); // option is used to scan any one value by which we can give user the output he want//


   //? in this we can store value in option then compare it with the respective value //

           if(option==1){ //! this will used to do deposit method
            scan.nextLine();
             System.out.printf("enter user name :");
             b1.accountHolderName = scan.nextLine();
                  System.out.printf("enter user account-number- ");
             b1.accountNumber = scan.nextLong();
                  System.out.printf("enter amount to deposit : ");
                 b1.amount = scan.nextFloat();
                 b1.deposit();

         
           }
           else if(option==2){//! this will used to do withdrawl method
            scan.nextLine();
       System.out.printf("enter user name :");
             b1.accountHolderName = scan.nextLine();
                  System.out.printf("enter user account-number- ");
             b1.accountNumber = scan.nextLong();
                  System.out.printf("enter amount to withdrawl :");
                 b1.amount = scan.nextFloat();
              b1.withdrawl();
           }
                  else if(option==3){//! this will used to do checkbalance method
                    scan.nextLine();
                         System.out.printf("enter user name :");
             b1.accountHolderName = scan.nextLine();
                  System.out.printf("enter user account-number- ");
             b1.accountNumber = scan.nextLong();

             b1.checkbalance();
                  }
                         else{
                            System.out.printf("invalid command");
                         }
    }
}

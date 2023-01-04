package onlineExamSystem;

import java.util.*;
class onlineExamSystem
{
    Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> data = new HashMap<String,Integer>();

    onlineExamSystem(){
        data.put("Ritesh",9926652);
        data.put("Shubham",9826245);
        data.put("Shreya",9965524);
        data.put("Aman",8408512);
        data.put("Chirag",8959525);
    }
    public void signUp(){

        String username ;
        int pwd ;
        System.out.println("Enter UserName ");
        username = sc.next();
        if(data.containsKey(username))
        {
            System.out.println("\nUser Already Registered!");
            return;
        }
        System.out.println("Enter Password ");
        pwd = sc.nextInt();
        data.put(username,pwd);
        System.out.println();
        System.out.println("User Registered Successfully! ");
        System.out.println();
    }
    public void SignIn()
    {
        String username;
        int pwd;
        System.out.println("LOGIN");
        System.out.println("Enter Username:");
        username = sc.next();
        System.out.println("Enter Passoword:");
        pwd = sc.nextInt();
        if(data.containsKey(username) && data.get(username).equals(pwd))
        {
            System.out.println("\nLogin successful!");
            menu();
        }
        else
        {
            System.out.println("\nInvalid Username or Password.\nTry again!!!\n");
            SignIn();
        }
    }
    public void menu()
    {
        int ch;
        System.out.println("\nEnter your Choice:");
        System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                data = update();
                menu();
                break;
            case 2:
                startExam();
                menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice!!! Choose correct choice");
        }
    }
    public HashMap<String,Integer> update()
    {
        String update_id;
        int update_pwd;
        System.out.println("Enter Username:");
        update_id = sc.next();
        System.out.println("Enter Old Password:");
        update_pwd = sc.nextInt();
        if(data.containsKey(update_id) && data.get(update_id)==update_pwd)
        {
            System.out.println("Enter New Password:");
            update_pwd = sc.nextInt();
            data.replace(update_id,update_pwd);
            System.out.println("Password Changed Successfully!!!");
        }
        else
        {
            System.out.println("User not found.\n");
        }
        return data;
    }
    public void startExam()
    {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 30;
        int result = 0,ans;

        while(System.currentTimeMillis()<endTime)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Q1.Which Operation is used to enter values in Stack?");
            System.out.println("1.Push \t2.Pop \t3.Peek \t4.None");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 1)
                result+=5;
            else
                result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q2.Which Operation is used to read values in Stack?");
            System.out.println("1.Push \t2.Pop \t3.Peek \t4.None");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 3)
                result+=5;
            else
                result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q3.How many types of Inheritance are there in OOPs?");
            System.out.println("1.One\t2.Two\t3.Five\t4.Four");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 3) result+=5;
            else result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q4.What Operation is used to insert values in Queue?");
            System.out.println("1.enqueue\t2.Push\t3.Insert\t4.dequeue");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 1) result+=5;
            else result--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q5.Number of Basic Pillars of OOPs?");
            System.out.println("1.One\t2.Two\t3.Three\t4.Four");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if(ans == 4)
                result+=5;
            else
                result--;
            System.out.println("-------------------------------------------------------------");
            break;
        }
        System.out.println("Exam Finished!!!");
        System.out.println();
        System.out.println("Your Score is "+result);
        if(result>10)
            System.out.println("Congratulations you passed!!!");
        else
            System.out.println("Better Luck Next Time!!!");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        onlineExamSystem oes  = new onlineExamSystem();
        int choice = 0;
        do{
            System.out.println("Enter Your Choice: ");
            System.out.println("1.SignUp\t2.SignIn");
            choice = sc.nextInt();
            if(choice == 1) oes.signUp();
            else if(choice == 2) oes.SignIn();
            else System.out.println("Wrong Choice!");
        }while(choice != 2);

    }
}
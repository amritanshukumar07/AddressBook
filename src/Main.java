import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddressBook<Contact> a1 =new AddressBook<>();
        System.out.println("Welcome to Addressbook");
        Scanner sc= new Scanner(System.in);
        int input =0;
        do{
            System.out.println("Enter 1-> Add contact\nEnter 2 -> Display all contacts");
            int userInput= sc.nextInt();
            switch(userInput){
                case 1-> a1.addToAdBook(Contact.createContact());
                case 2-> a1.display();
                default -> System.out.println("Wrong Input");
            }
            System.out.println("Press 0 to exit");
            input = sc.nextInt();
        }
        while(input !=0);
        Contact c1 = Contact.createContact();
    }
}
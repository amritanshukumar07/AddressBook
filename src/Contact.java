import java.util.Scanner;

public class Contact {
    private String name;
    private String email;
    private String state;
    private Integer phoneNumber;


    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact(String name, String email, String state, Integer phoneNumber) {
        this.name = name;
        this.email = email;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter name");
        String name= sc.next();
        System.out.println("Email");
        String email = sc.next();
        System.out.println("State");
        String state= sc.next();
        System.out.println("PhoneNumber");
        int phone = sc.nextInt();

        return new Contact(name,email,state,phone);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

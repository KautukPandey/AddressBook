import java.util.Scanner;

class Contact{
String firstName;
String lastName;
String address;
String city;
String state;
String zip;
String phone;
String email;
}

public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Contact c=new Contact();

System.out.print("First Name: ");
c.firstName=sc.nextLine();

System.out.print("Last Name: ");
c.lastName=sc.nextLine();

System.out.print("Address: ");
c.address=sc.nextLine();

System.out.print("City: ");
c.city=sc.nextLine();

System.out.print("State: ");
c.state=sc.nextLine();

System.out.print("Zip: ");
c.zip=sc.nextLine();

System.out.print("Phone: ");
c.phone=sc.nextLine();

System.out.print("Email: ");
c.email=sc.nextLine();

System.out.println("\nContact Details");
System.out.println("First Name : "+c.firstName);
System.out.println("Last Name  : "+c.lastName);
System.out.println("Address    : "+c.address);
System.out.println("City       : "+c.city);
System.out.println("State      : "+c.state);
System.out.println("Zip        : "+c.zip);
System.out.println("Phone      : "+c.phone);
System.out.println("Email      : "+c.email);
}
}
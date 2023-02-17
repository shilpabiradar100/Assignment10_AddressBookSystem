package Assignment10;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address book program");
        System.out.println("How many contacts do you want to add : ");
        Scanner scanner = new Scanner(System.in);
        int numOfContacts = scanner.nextInt();
        Contacts contact [] = new Contacts[numOfContacts];


        while(true)
        {
            System.out.println("Chooose a option : 1) Add contacts 2) Edit contact 3)Delete a contact 4) exit ");
            int number = scanner.nextInt();
            switch(number)
            {
                case 1:
                    System.out.println("Add contacts: ");
                    addContacts(scanner, numOfContacts,contact);
                    break;
                case 2:
                    System.out.println("Enter person phonenumber to edit the contact: ");
                    String phoneNumber = scanner.next();
                    editContact(scanner, contact, phoneNumber);
                    break;
                case 3:
                    System.out.println("Enter person email to delete the contact : ");
                    String email =scanner.next();
                    deleteContact(contact, email);
                    break;
                case 4:
                    System.out.println("exit");
                    System.exit(0);
                default:
                    System.out.println("Choose correct option");
            }

        }
    }

    private static void displayContacts(Contacts[] contact) {
        for(int index=0;index<contact.length;index++)
        {
            System.out.println(contact[index]);
        }
    }

    private static void deleteContact(Contacts[] contact, String email) {
        for(int index=0;index<contact.length;index++)
        {
            if(contact[index].getEmail().equalsIgnoreCase(email))
            {
                //reduce size of array and move all elements on space ahead to remove
                int n = contact.length -1;
                for(int i=index;i<n;i++)
                {
                    contact[i] = contact[i+1];
                }

            }
        }
        displayContacts(contact);
    }

    private static void editContact(Scanner scanner, Contacts[] contact, String phoneNumber) {
        String firstName;
        String lastName;
        String address;
        String city;
        String email;
        int zip;
        for (int index=0;index<contact.length;index++)
        {
            if(contact[index].getPhoneNumber().equalsIgnoreCase(phoneNumber))
            {
                System.out.println("Enter First name: ");
                firstName = scanner.next();
                contact[index].setFirstName(firstName);
                System.out.println("Enter last name: ");
                lastName = scanner.next();
                contact[index].setLastName(lastName);
                System.out.println("Enter address : ");
                address = scanner.next();
                contact[index].setAddress(address);
                System.out.println("Enter city name: ");
                city = scanner.next();
                contact[index].setCity(city);
                System.out.println("Enter email: ");
                email = scanner.next();
                contact[index].setEmail(email);
                System.out.println("Enter zip : ");
                zip = scanner.nextInt();
                contact[index].setZip(zip);
                System.out.println("Enter phone number: ");
                phoneNumber = scanner.next();
                contact[index].setPhoneNumber(phoneNumber);
            }
        }
        displayContacts(contact);
    }

    private static void addContacts(Scanner scanner, int numOfContacts, Contacts contact[]) {
        String firstName,lastName,address,city,email,phoneNumber;
        int zip;
        for(int index=0;index<contact.length;index++)
        {

            System.out.println("Enter First name: ");
            firstName = scanner.next();
            System.out.println("Enter last name: ");
            lastName = scanner.next();
            System.out.println("Enter address : ");
            address = scanner.next();
            System.out.println("Enter city name: ");
            city = scanner.next();
            System.out.println("Enter email: ");
            email = scanner.next();
            System.out.println("Enter zip : ");
            zip = scanner.nextInt();
            System.out.println("Enter phone number: ");
            phoneNumber = scanner.next();
            contact[index] = new Contacts(firstName,lastName,address,city,zip,phoneNumber,email);
        }
        displayContacts(contact);
    }
}

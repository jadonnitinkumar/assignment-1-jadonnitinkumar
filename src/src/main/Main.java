package main;

import defination.SinglyLinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        SinglyLinkedList<Person> list = new SinglyLinkedList<>();
        boolean flag = true;
        do {
            System.out.println("Nitin Kumar's Contact List app\n" +
                    "Press 1 to add new contacts\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit programm");
            int choice = scanner.nextInt();
            /*scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact(list, list1, list2);
                    break;
                case 2:
                    list.sort();
                    list.print();
                    break;
                case 3:
                    searchContact(list, list2);
                    break;
                case 4:
                    removeContact(list, list1, list2);
                    break;
                case 5:
                    flag = false;
                    break;
            }*/
        } while (flag);
    }
    public static SinglyLinkedList addContact(SinglyLinkedList list,ArrayList list1, ArrayList list2) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        String s;
        System.out.println("You have chosen to add a new contact: \n +" +
                "Please enter the name of the person\n" +
                "first Name:");
        String fName = scanner.nextLine();
        person.setfName(fName);
        list2.add(fName);
        System.out.println("Last Name:");
        String lName = scanner.nextLine();
        person.setlName(lName);
        list1.add(fName + " " + lName);
        System.out.println("Contact Number: ");
        long phoneNumber = scanner.nextLong();
        person.setPhoneNumber(phoneNumber);
        scanner.nextLine();
        do {
            System.out.print("Would you like to add another contact number? (y/n):");
            s = scanner.next();
            if (s.equalsIgnoreCase("y")) {
                System.out.print("Contact Number: ");
                long phoneNumber1 = scanner.nextLong();
                person.setPhoneNumber(phoneNumber1);
            }
        } while (s.equalsIgnoreCase("y"));
        scanner.nextLine();
        System.out.println("Would you like to add email address ? (y/n):");
        s = scanner.next();
        scanner.nextLine();
        if (s.equalsIgnoreCase("y")) {
            System.out.print("Email Address: ");
            String email = scanner.nextLine();
            person.setEmail(email);
        }
        list.add(person);
        Collections.sort(list1);
        Collections.sort(list2);
        return list;
    }
}

package main;

import defination.SinglyLinkedList;
import person.Person;

import java.util.ArrayList;
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
}

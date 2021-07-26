package Homework4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phoneForLastName.add(phoneNumber);
        phoneBook.put(lastName, phoneForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "8988097566");
        phoneBook.add("Petrov1", "898809");
        phoneBook.add("Petrov2", "89880975");
        phoneBook.add("Petrov", "899999999999769");

        System.out.println(phoneBook.get("Petrov"));

    }
}

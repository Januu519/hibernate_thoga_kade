package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("C001", "Janu", "Panadura", "074 1239945");
        Customer customer2 = new Customer("C002", "Thenu", "colombo", "075 2746328");
        Customer customer3 = new Customer("C003", "Sanju", " kaluthara", "072 6587463");

        Item item1 = new Item("I001", "ice cream", 160, 500);
        Item item2 = new Item("I002", "coca-cola", 195, 250);
        Item item3 = new Item("I003", "soda", 180, 600);

        Orders order1 = new Orders("OR-001",customer1);
        Orders order2 = new Orders("OR-002",customer1);
        Orders order3 = new Orders("OR-003",customer2);
        Orders order4 = new Orders("OR-004",customer2);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();




        transaction.commit();

        session.close();

    }
}

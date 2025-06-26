package org.cinema;

import org.cinema.model.Family;
import org.cinema.model.HalfPrice;
import org.cinema.model.Ticket;

public class Main {
    public static void main(String[] args) {

        Ticket ticketHalfPrice =  new HalfPrice(20, "Harry Potter", true);
        Ticket ticketFamily1 = new Family(20, "Harry Potter", false, 5);
        Ticket ticketFamily2 = new Family(20, "Harry Potter", false, 2);

        System.out.println(ticketHalfPrice.toString() + " price: " + ticketHalfPrice.getRealPrice());
        System.out.println(ticketFamily1.toString() + " price: " + ticketFamily1.getRealPrice());
        System.out.println(ticketFamily2.toString() + " price: " + ticketFamily2.getRealPrice());

    }
}
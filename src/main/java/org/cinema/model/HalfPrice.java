package org.cinema.model;

/**
 * Represents a half-price ticket.
 * The final value is half the original price.
 */
public non-sealed class HalfPrice extends Ticket {

    /**
     * Constructs a HalfPrice ticket.
     *
     * @param price Original price of the ticket
     * @param movieName Name of the movie
     * @param isSubtitled True if the movie is subtitled
     */
    public HalfPrice(double price, String movieName, boolean isSubtitled) {
        super(price, movieName, isSubtitled);
    }

    /**
     * Returns half of the original price as the real ticket price.
     *
     * @return 50% of the base price
     */
    @Override
    public double getRealPrice(){
        return price/2;
    }

}

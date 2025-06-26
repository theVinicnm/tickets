package org.cinema.model;

/**
 * Abstract class that represents a movie ticket.
 * Contains information such as base price, movie name, and whether it is subtitled.
 */
public sealed abstract class Ticket permits HalfPrice, Family {
    /**
     * Base ticket price.
     */
    protected final double price;

    /**
     * Movie name.
     */
    protected final String movieName;

    /**
     * Indicates whether the movie is subtitled.
     */
    protected final boolean isSubtitled;

    /**
     * Constructs a new Ticket.
     *
     * @param price Base price of the ticket
     * @param movieName Name of the movie
     * @param isSubtitled True if the movie is subtitled, false otherwise
     */
    public Ticket(double price, String movieName, boolean isSubtitled) {
        this.price = price;
        this.movieName = movieName;
        this.isSubtitled = isSubtitled;
    }
    /**
     * Returns the real ticket price based on its type (e.g., half-price, family).
     *
     * @return Final price of the ticket
     */
    public abstract double getRealPrice();

    public String getMovieName() {
        return movieName;
    }

    public boolean isSubtitled() {
        return isSubtitled;
    }

    public String toString() {
        return "Price: " + price + ", name: " + movieName + ", isSubtitled: " + isSubtitled;
    }
}

package org.cinema.model;
/**
 * Represents a family ticket.
 * The total value is the base price multiplied by the number of people.
 * A 5% discount is applied if there are more than 3 people.
 */
public non-sealed class Family extends Ticket {
    /**
     * Number of people using the ticket.
     */
    private final int numberPeople;

    /**
     * Constructs a Family ticket.
     *
     * @param price Price per person
     * @param movieName Name of the movie
     * @param isSubtitled True if the movie is subtitled
     * @param numberPeople Number of people included in the ticket
     */
    public Family(double price, String movieName, boolean isSubtitled, int numberPeople) {
        super(price, movieName, isSubtitled);
        this.numberPeople = numberPeople;
    }
    /**
     * Returns the total price based on the number of people.
     * Applies a 5% discount if more than 3 people are included.
     *
     * @return Total ticket price with or without discount
     */
    private double applyDiscountIfNeeded(double value) {
        return numberPeople > 3 ? value * 0.95 : value;
    }

    /**
     * Returns the total price based on the number of people.
     *
     * @return Total ticket price with or without discount
     */
    @Override
    public double getRealPrice(){
        return applyDiscountIfNeeded(price * numberPeople);
    }

    public String toString() {
        return super.toString() + " numberPeople: " + numberPeople;
    };
}

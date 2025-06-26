import org.cinema.model.Family;
import org.cinema.model.HalfPrice;
import org.cinema.model.Ticket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    void testHalfPrice() {
        Ticket ticket = new HalfPrice(20.0, "Interstellar", false);
        assertEquals(10.0, ticket.getRealPrice(), 0.0001);
        assertEquals("Interstellar", ticket.getMovieName());
        assertFalse(ticket.isSubtitled());
    }

    @Test
    void testFamilyWithThreePeople() {
        Ticket ticket = new Family(25.0, "Oppenheimer", true, 3);
        assertEquals(75.0, ticket.getRealPrice(), 0.0001);
    }

    @Test
    void testFamilyWithFourPeopleGetsDiscount() {
        Ticket ticket = new Family(25.0, "Duna 2", false, 4);
        double expected = 25.0 * 4 * 0.95;
        assertEquals(expected, ticket.getRealPrice(), 0.0001);
    }

    @Test
    void testToStringIncludesMovieName() {
        Ticket ticket = new HalfPrice(30.0, "Matrix", true);
        String str = ticket.toString();
        assertTrue(str.contains("Matrix"));
        assertTrue(str.contains("Price:"));
    }

    @Test
    void testFamilyToStringIncludesPeopleCount() {
        Ticket ticket = new Family(30.0, "Matrix", true, 5);
        String str = ticket.toString();
        assertTrue(str.contains("numberPeople: 5"));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GuestTest {

    Guest guest;

    @BeforeEach
    public void setUp() {
        guest = new Guest("Radhika", 24,500, '£', 50, false);
    }

    @Test
    public void guestHasName() {
        assertThat(guest.getName()).isEqualTo("Radhika");
    }

    @Test
    public void hasAge() {
        assertThat(guest.getAge()).isEqualTo(24);
    }

    @Test
    public void hasWallet() {
        assertThat(guest.getWallet()).isEqualTo(500);
    }
}

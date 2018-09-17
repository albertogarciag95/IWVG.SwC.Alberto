package es.upm.miw.iwvg.junit;

import es.upm.miw.iwvg.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
         this.user = new User(123,"Tommy", "Shelby");
    }

    @Test
    void testFullName() {
        assertEquals("Tommy Shelby", this.user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("T.", this.user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(123, this.user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Tommy", this.user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Shelby", this.user.getFamilyName());
    }
}

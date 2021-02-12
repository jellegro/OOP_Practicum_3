package opdracht.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    void naam(){
        Voetbalclub club = new Voetbalclub("");
        assertEquals("FC", club.getNaam());
    }
    @Test
    void testnaam(){
        Voetbalclub club = new Voetbalclub("PEC");
        assertEquals("PEC", club.getNaam());
    }
    @Test
    void punten(){
        Voetbalclub punt = new Voetbalclub("");
        punt.verwerkResultaat('w');
        punt.verwerkResultaat('i');
        assertEquals(3, punt.aantalPunten());
    }
    @Test
    void herhaal(){
        Voetbalclub opnieuw = new Voetbalclub("");
        opnieuw.verwerkResultaat('w');
        opnieuw.verwerkResultaat('g');
        opnieuw.verwerkResultaat('w');
        opnieuw.verwerkResultaat('v');
        opnieuw.verwerkResultaat('g');
        opnieuw.verwerkResultaat('v');
        opnieuw.verwerkResultaat('w');
        opnieuw.verwerkResultaat('w');
        opnieuw.verwerkResultaat('t');
        assertEquals(14, opnieuw.aantalPunten());
    }
}
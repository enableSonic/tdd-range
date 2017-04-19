import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloworldTest {

    Hello hello = new Hello();

    @Test
    public void shouldShowHelloSomkiatWhenNameIsSomkiat() {
        assertEquals("Hello Somkiat", hello.say("Somkiat"));
    }

    @Test
    public void shouldShowHelloPuiWhenNameIsPui() {
        assertEquals("Hello Pui", hello.say("Pui"));
    }

    @Test(expected = InputInvalidException.class)
    public void shouldThrowInputInvalidExceptionWithEmptyString() {
        hello.say("");
    }

}

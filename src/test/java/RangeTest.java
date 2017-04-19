import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    Range range = new Range();

    @Test
    public void เริ่มต้นด้วยก้ามปูและ1() {
        int result = range.หาค่าเริ่มต้น("[1,5]");
        assertEquals(1, result);
    }

    @Test
    public void ไม่เริ่มต้นด้วยก้ามปูและ1() {
        int result = range.หาค่าเริ่มต้น("(1,5]");
        assertEquals(2, result);
    }

    @Test
    public void เริ่มต้นด้วยก้ามปู() {
        boolean result = range.เริ่มต้นด้วยก้ามปูนะ("[1,5]");
        assertTrue("ต้องเริ่มต้นด้วยก้ามปูนะ", result);
    }

    @Test
    public void ไม่เริ่มต้นด้วยก้ามปู() {
        boolean result = range.เริ่มต้นด้วยก้ามปูนะ("(1,5]");
        assertFalse("ต้องไม่เริ่มต้นด้วยก้ามปูนะ", result);
    }

}

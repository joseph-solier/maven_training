import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @org.junit.jupiter.api.Test
    void op() {
        Sample sample = new Sample();
        assertEquals(5, sample.op(Sample.Operation.ADD, 2, 3));
        assertEquals(6, sample.op(Sample.Operation.MULT, 2, 3));
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Sample sample = new Sample();
        assertEquals(24, sample.fact(4));
        assertEquals(1, sample.fact(0));
        assertThrows(IllegalArgumentException.class, () -> sample.fact(-1));
    }
}

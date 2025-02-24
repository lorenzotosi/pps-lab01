package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    @Test
    public void todo() {
        assertTrue(true);
    }

    private SmartDoorLock smartDoorLock;

    @BeforeEach
    public void setUp() {
        this.smartDoorLock = new SmartDoorLockImplementation();
    }

    @Test
    void testSmartDoorStartsLocked() {
        assertTrue(smartDoorLock.isLocked());
    }



}

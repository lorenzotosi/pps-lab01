package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    @Test
    public void todo() {
        assertTrue(true);
    }

    public final static int PIN = 1234;
    public final static int WRONG_PIN = 1;
    private SmartDoorLock smartDoorLock;


    @BeforeEach
    public void setUp() {
        this.smartDoorLock = new SmartDoorLockImplementation();
        this.smartDoorLock.setPin(PIN);
    }

    @Test
    void testSmartDoorStartsOpen() {
        assertFalse(smartDoorLock.isLocked());
    }

    @Test
    void testLockSmartDoor(){
        this.smartDoorLock.lock();
        assertTrue(smartDoorLock.isLocked());
    }

    @Test
    void testUnlockSmartDoor() {
        this.smartDoorLock.lock();
        this.smartDoorLock.unlock(PIN);
        assertFalse(smartDoorLock.isLocked());
    }

    @Test
    void testFailUnlockSmartDoor() {
        this.smartDoorLock.lock();
        this.smartDoorLock.unlock(WRONG_PIN);
        assertTrue(smartDoorLock.isLocked());
    }

    @Test
    void testBlockSmartDoor() {

    }
}

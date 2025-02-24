package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    @Test
    public void todo() {
        assertTrue(true);
    }

    public final static int PIN = 0;
    private SmartDoorLock smartDoorLock;


    @BeforeEach
    public void setUp() {
        this.smartDoorLock = new SmartDoorLockImplementation();
        this.smartDoorLock.setPin(PIN);
    }

    @Test
    void testSmartDoorStartsOpen() {
        assertTrue(smartDoorLock.isLocked());
    }

    @Test
    void testLockSmartDoor(){
        this.smartDoorLock.lock();
        assertTrue(smartDoorLock.isLocked());
    }

}

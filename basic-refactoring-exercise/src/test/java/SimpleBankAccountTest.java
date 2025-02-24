import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest {

    public static final int DEFAULT_DEPOSIT_AMOUNT = 100;
    public static final int DEFAULT_WITHDRAW_AMOUNT = 70;
    public static final int EMPTY_BANK_ACCOUNT = 0;
    public static final int USER_ONE = 1;
    public static final int USER_TWO = 2;
    public static final int WITHDRAW_FEE = SimpleBankAccount.WITHDRAW_FEE;
    private AccountHolder accountHolder;
    private BankAccount bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", USER_ONE);
        bankAccount = new SimpleBankAccount(accountHolder, EMPTY_BANK_ACCOUNT);
    }

    @Test
    void testInitialBalance() {
        assertEquals(EMPTY_BANK_ACCOUNT, bankAccount.getBalance());
    }

    private void depositDefaultAmount() {
        bankAccount.deposit(accountHolder.getId(), DEFAULT_DEPOSIT_AMOUNT);
    }

    @Test
    void testDeposit() {
        depositDefaultAmount();
        assertEquals(DEFAULT_DEPOSIT_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        depositDefaultAmount();
        bankAccount.deposit(USER_TWO, 50);
        assertEquals(DEFAULT_DEPOSIT_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        depositDefaultAmount();
        bankAccount.withdraw(accountHolder.getId(), DEFAULT_WITHDRAW_AMOUNT);
        assertEquals(30-WITHDRAW_FEE, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        depositDefaultAmount();
        bankAccount.withdraw(USER_TWO, DEFAULT_WITHDRAW_AMOUNT);
        assertEquals(DEFAULT_DEPOSIT_AMOUNT, bankAccount.getBalance());
    }
}

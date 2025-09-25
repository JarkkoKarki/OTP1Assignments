package WK3.HomeAssignmentWK3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {
    Account account = new Account();
    @Test
    public void deposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);

        account.deposit(-100.0);
        assertEquals(150, account.getBalance(), 0.01);
    }

    @Test
    public void withdraw() {
        account.deposit(200.0);
        double withdrawn = account.withdraw(50.0);
        assertEquals(50.0, withdrawn, 0.01);
        assertEquals(150.0, account.getBalance(), 0.01);

        withdrawn = account.withdraw(200.0);
        assertEquals(0.0, withdrawn, 0.01);
        assertEquals(150.0, account.getBalance(), 0.01);

        withdrawn = account.withdraw(-200.0);
        assertEquals(0.0, withdrawn, 0.01);
        assertEquals(150.0, account.getBalance(), 0.01);

    }

    @Test
    public void getBalance() {
        account.deposit(300.0);
        assertEquals(300.0, account.getBalance(), 0.01);
    }
}
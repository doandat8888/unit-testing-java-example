import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTest {
    //Some methods of assert
    //1. assertEquals(): When we want to compare 2 values is equal or not
    //2. assertNotEquals(): When we dont want the actual value equal to a specific value
    //3. assertArrayEquals(): When we want to verify a value of an array, we have to use the assertArrayEquals() method. This method consider 2 arrays is equal when they length are the same, and every element in both arrays is the same
    //4. assertNull() and assertNotNull(): check for null and not-null value
    //5. assertSame() and assertNotSame(): we use this when we want to check whether two instances are the exact same instance
    //6. assertThat(): compare the actual value against the matcher

    private BankAccount bankAccountTest;
    public static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }
    @org.junit.Before
    public void setUp() {
        bankAccountTest = new BankAccount("Tim", "Shedan", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test....");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double deposit = bankAccountTest.deposit(200, true);
        assertEquals(1200.0, deposit, 0); 
        // 3th parameter(delta): The maximum allowed difference between the expected and actual values.
    }
    @org.junit.Test
    public void withdraw() throws Exception {
        double deposit = bankAccountTest.withDraw(600.00, true);
        assertEquals(400.00, deposit, 0);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        double deposit = bankAccountTest.withDraw(600.00, false);
        assertEquals(400.00, deposit, 0);
    }
    @org.junit.Test
    public void getBalance() throws Exception {
        double balance = bankAccountTest.getBalance();
        assertEquals(1000.00, balance, 0);
    }
    @org.junit.Test
    public void isChecking() throws Exception {
        assertEquals(true, bankAccountTest.isChecking());
    }
    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases");
    }
    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }
}

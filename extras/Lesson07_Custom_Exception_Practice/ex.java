package Lesson07_Custom_Exception_Practice;

// ============================================================
// Custom Exception Practice — Bank Withdrawal Validation
// ============================================================
// Demonstrates:
//   - Throwing IllegalArgumentException for business rule violations
//   - Validating balance before allowing withdrawal
//   - Companion custom exception class (InsufficientFundsException)
// ============================================================

public class ex {
    public static void main(String[] args) {

        // Attempt to withdraw more than the balance
        withdrawal(300, 200);

    }

    // Withdrawal method — throws exception if funds are insufficient
    public static void withdrawal(int amount, int balance) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

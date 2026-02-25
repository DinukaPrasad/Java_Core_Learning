package Lesson06_Custom_Exceptions;

// ============================================================
// Custom Exception — InvalidEmailException
// ============================================================
// Extends RuntimeException (unchecked exception).
// Thrown when an email fails validation rules.
// ============================================================

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }

}
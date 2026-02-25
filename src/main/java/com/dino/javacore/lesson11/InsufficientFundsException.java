package com.dino.javacore.lesson11;

// ============================================================
// Custom Exception — InsufficientFundsException
// ============================================================
// Extends RuntimeException (unchecked).
// Designed for banking/financial withdrawal scenarios.
// ============================================================

public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

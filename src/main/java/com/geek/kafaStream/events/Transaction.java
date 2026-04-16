package com.geek.kafaStream.events;

public record Transaction(
        String transactionId,
        String userId,
        double amount,
        String timestamp
) {
}


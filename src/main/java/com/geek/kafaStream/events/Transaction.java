package com.geek.kafaStream.events;

import com.geek.kafaStream.events.Item;

import java.util.List;

public record Transaction(
        String transactionId,
        String userId,
        double amount,
        String location,
        String type,
        List<Item> items
) {
}

//serializer //Deserializer
//serdes
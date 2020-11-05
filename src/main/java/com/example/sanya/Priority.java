package com.example.sanya;

import java.util.Arrays;

public enum Priority {

    LOW("low"),
    MEDIUM_LOW("medium low"),
    MEDIUM("medium");

    public final String value;

    Priority(String value) {
        this.value = value;
    }

    public static Priority getPriority(String pValue) {
        return Arrays.stream(values())
                     .filter(categoryType -> categoryType.toString().equalsIgnoreCase(pValue.trim()) ||
                                             categoryType.value.equalsIgnoreCase(pValue.trim()))
                     .findFirst()
                     .orElse(LOW);
    }
}

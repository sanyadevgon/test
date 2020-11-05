package com.example.sanya;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
class PriorityJpaConverter implements AttributeConverter<Priority, String> {

    @Override
    public String convertToDatabaseColumn(Priority priority) {
        if (priority == null) {
            return Priority.LOW.name();
        }
        return priority.value;
    }

    @Override
    public Priority convertToEntityAttribute(String string) {
        if (string == null) {
            return null;
        }
        try {
            return Priority.getPriority(string);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
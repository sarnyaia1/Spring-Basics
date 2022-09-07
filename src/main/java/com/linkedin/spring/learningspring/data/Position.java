package com.linkedin.spring.learningspring.data;

public enum Position {

    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString(){
        return switch (this) {
            case CONCIERGE -> "Concierge";
            case HOUSEKEEPING -> "Housekeeping";
            case FRONT_DESK -> "Front Desk";
            case SECURITY -> "Security";
        };
    }
}

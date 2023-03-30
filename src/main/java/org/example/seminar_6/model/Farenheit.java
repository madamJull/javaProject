package org.example.seminar_6.model;

public class Farenheit implements Converter {
    @Override
    public Double convert(Double inputValue) {
        return inputValue * 9 / 5 + 32;
    }
}

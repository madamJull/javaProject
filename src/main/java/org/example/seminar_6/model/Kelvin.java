package org.example.seminar_6.model;

public class Kelvin implements Converter {
    @Override
    public Double convert(Double inputValue) {
        return inputValue + 273.15;
    }
}

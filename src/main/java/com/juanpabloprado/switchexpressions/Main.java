package com.juanpabloprado.switchexpressions;



public class Main {
    enum Season {
        Spring, Summer, Fall, Winter, Invalid
    }

    public static void main(String[] args) {
        Season season = Season.Spring;

        String weather = getWeather(season);
        System.out.println(weather);

        String weather2 = getWeather(Season.Invalid);
        System.out.println(weather2);
    }

    private static String getWeather(Season season) {
        return switch (season) {
            case Spring, Summer -> "Sunny";
            case Fall -> "Rainy";
            case Winter -> "Snowy";
            default -> {
                System.out.println("Invalid season");
                yield "Invalid weather";
            }
        };
    }
}

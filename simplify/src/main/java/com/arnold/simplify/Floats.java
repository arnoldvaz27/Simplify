package com.arnold.simplify;

public class Floats {
    public static float FahrenheitToCentigrade(float value) {
        float ceh;
        ceh = (value - 32) / 1.8f;
        return ceh;
    }

    public static float CentigradeToFahrenheit(float value) {
        float fah;
        fah = (1.8f * value) + 32;
        return fah;
    }
}

package com.arnoldvaz27.simplify;

public class Floats {
    public static float fahrenheitToCentigrade(float value) {
        float ceh;
        ceh = (value - 32) / 1.8f;
        return ceh;
    }

    public static float centigradeToFahrenheit(float value) {
        float fah;
        fah = (1.8f * value) + 32;
        return fah;
    }
}

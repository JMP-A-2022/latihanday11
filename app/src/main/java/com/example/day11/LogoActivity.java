package com.example.day11;

public class LogoActivity {
    private final String outlet;
    private final int logo;

    public LogoActivity(int logo, String outlet) {
        this.logo = logo;
        this.outlet = outlet;
    }

    public int getLogo() {
        return logo;
    }

    public String getOutlet() {
        return outlet;
    }
}
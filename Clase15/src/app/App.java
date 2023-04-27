package app;

import app.figures.Pentagon;

public class App {
    public static void main(String[] args) {
        Pentagon figure = new Pentagon(10d);
        System.out.println(figure.getArea());
        System.out.println(0.1d + 0.2d == 0.3d);
    }
}
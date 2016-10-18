package ua.edu.nuos.webspring.model;

import org.springframework.stereotype.Component;

/**
 * Created by Eugeny on 18.10.2016.
 */
@Component
public class Zadacha {
    private double start;
    private double finish;
    private double step;

    public Zadacha(double start, double finish, double step) {
        this.start = start;
        this.finish = finish;
        this.step = step;
    }

    public Zadacha() {
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getFinish() {
        return finish;
    }

    public void setFinish(double finish) {
        this.finish = finish;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public int getN() {
        return (int)((finish-start)/step+1);
    }

    public double[] getX() {
        int n = getN();
        double[] x = new double[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = start + i*step;
        }
        return x;
    }

    public double[] getY(double[] x) {
        double[] y = new double[x.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = f(x[i]);
        }
        return y;
    }

    private double f(double x) {
        return Math.sin(x); // TODO функция из своего варианта
    }
}

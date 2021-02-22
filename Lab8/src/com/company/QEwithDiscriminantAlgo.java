package com.company;

public class QEwithDiscriminantAlgo extends QuadraticEquation{
    private double discriminant;

    public QEwithDiscriminantAlgo(double a, double b, double c) {
        super(a, b, c);
        discriminant = Math.pow(b, 2) - 4*a*c;

    }

    public double getDiscriminant() {
        return discriminant;
    }

    public String solveEquation() {

        if (discriminant < 0) {
            return "There's no real solution";
        } else if (discriminant == 0) {
            double x = (-this.getB()/(2*this.getA()));
            return ""+x;
        } else {
            double x1 = ((-this.getB()-Math.sqrt(discriminant))/2*this.getA());
            double x2 = ((-this.getB()+Math.sqrt(discriminant))/2*this.getA());
            return ""+x1+" "+x2;
        }
    }

    @Override
    public String toString() {
        return "a="+this.getA()+" b="+this.getB()+" c="+this.getC()+"\n"+"Solution: "+this.solveEquation();
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        this.discriminant = Math.pow(this.getB(), 2) - 4*a*this.getC();
    }

    @Override
    public void setB(double b) {
        super.setB(b);
        this.discriminant = Math.pow(b, 2) - 4*this.getA()*this.getC();
    }

    @Override
    public void setC(double c) {
        super.setC(c);
        this.discriminant = Math.pow(this.getB(), 2) - 4*this.getA()*c;
    }
}

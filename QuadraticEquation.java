public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double[] nghiem;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a) {
    }

    public QuadraticEquation(double a, double b) {
    }

    public QuadraticEquation(double a, double b, double c) {
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant()) )/ (2 * a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
//         return this.delta;
    }

    public double[] caculated() {
        double delta = getDiscriminant();
        nghiem = new double[]{getRoot1(),getRoot2()};
        if (delta >= 0) {
            return nghiem;
        } else if (delta == 0) {
            return nghiem;
        }else {
            return new double[] {0,0};
        }
    }
}

public class Temperature {
    double c ;
    double f;
    double k;
    public Temperature(){
    }

    public Temperature(double c) {
        this.c = c;
    }

    public Temperature(double c, double f) {
        this.c = c;
        this.f = f;
    }

    public Temperature(double c, double f, double k) {
        this.c = c;
        this.f = f;
        this.k = k;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if(c >= -273 ){
            this.c=c;
        }
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }
    public double cSangF(){
        return (double) 9 / 5 * this.c + 32;
    }
    public  double cSangKelvin(){
        return  (double) this.c + 273.15;
    }
}

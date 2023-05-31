public class Battery {
    int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int decreaseEnergy(int energy ){
        if(this.energy > 0){
            return energy;
        }
        return energy;
    }
}


public class Human {
    String name;
    boolean gender;
    int weight;

    public Human() {

    }

    public boolean isMale() {
        return false;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean checkAppler(Apple apple) {
        if (apple.  weight > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Apple apple) {
        if (apple.weight > 0) {
            apple.decrease();
            this.weight++;
        }
    }

    public void say(String say) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

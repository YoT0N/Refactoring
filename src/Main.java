// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(80,1.52);
        System.out.println(humanBMI.getBmiCategory());
    }
}
class HumanBMI {
    public double weight; // Human Weight
    public double height; // Human Height

    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateBmi() {
        return weight / (height * height);
    }

    public String getBmiCategory() {
        double bmi = calculateBmi();
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}
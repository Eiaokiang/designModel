package eiaokiang.behavior.iterator;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:28 2023/4/10
 */
public class Vehicle {
    private String name;
    private String number;

    public Vehicle(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

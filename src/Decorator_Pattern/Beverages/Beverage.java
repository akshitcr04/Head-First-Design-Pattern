package Decorator_Pattern.Beverages;

public abstract class Beverage {
    String description = "Unknown beverage";
    Size size = Size.TALL; // Default size

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}

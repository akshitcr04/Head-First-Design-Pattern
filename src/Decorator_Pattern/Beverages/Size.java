package Decorator_Pattern.Beverages;
//suppose we have a beverage class that has different sizes.

public enum Size {
    TALL("Tall"),
    GRANDE("Grande"),
    VENTI("Venti");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}

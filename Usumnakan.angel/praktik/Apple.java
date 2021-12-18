package praktik;

public enum Apple {
    JONATHAN(10),
    GOLDENDEL(9);
    private int price;

    Apple(int p) {
        this.price = p;
    }

    public int getPrice() {
        return price;
    }

}


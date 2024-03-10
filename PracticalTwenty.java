public class PracticalTwenty {
    private int value;

    public PracticalTwenty(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        PracticalTwenty wrapper = new PracticalTwenty(10);
        System.out.println("Initial value: " + wrapper.getValue());

        wrapper.setValue(20);
        System.out.println("Updated value: " + wrapper.getValue());
    }
}

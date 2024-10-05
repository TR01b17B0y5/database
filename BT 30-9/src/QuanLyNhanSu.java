package BT.src;

public class QuanLyNhanSu {
    private final String name;
    private final int birthYear;

    public QuanLyNhanSu(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return name + " nam sinh: " + birthYear;
    }
}
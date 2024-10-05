package BT.src;

public class GiangVien extends QuanLyNhanSu {
    public GiangVien(String name, int birthYear) {

        super(name, birthYear);
    }

    @Override

    public String toString() {
        return "Giang Vien: " + super.toString();
    }
}

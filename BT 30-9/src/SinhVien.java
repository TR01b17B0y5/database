package BT.src;

public class SinhVien extends QuanLyNhanSu {
    private final String MaSV;

    public SinhVien(String name, int birthYear, String maSV) {
        super(name, birthYear);
        this.MaSV = maSV;
    }

    @Override

    public String toString() {
        return "Sinh vien: " + super.toString() + " msv: " + MaSV;
    }
}

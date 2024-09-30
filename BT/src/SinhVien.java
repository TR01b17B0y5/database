public class SinhVien extends QuanLyNhanSu {
    private final String MaSV;

    public SinhVien(String name, int birthYear, String maSV) {
        super(name, birthYear);
        this.MaSV = maSV;
    }
}

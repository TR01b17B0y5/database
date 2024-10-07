public class QuanLyTrangTrai {
    public static void main(String[] args) {
        TrangTrai trangTrai = new TrangTrai();

        Lon lon = new Lon();
        Vit vit = new Vit();
        Ca ca = new Ca();

        trangTrai.themDongVat(lon);
        trangTrai.themDongVat(vit);
        trangTrai.themDongVat(ca);
    }
}
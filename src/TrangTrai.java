import java.util.ArrayList;
import java.util.List;

public class TrangTrai {
    private List<DongVat> dongvat;

    TrangTrai() {
        dongvat = new ArrayList<>();
    }
    void themDongVat(DongVat a) {
        dongvat.add(a);
    }

}

package tuan7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class QuanLyGiaoDich {
    public static void main(String[] args) {
        List<GiaoDich> danhSach = new ArrayList<>();
        danhSach.add(new GiaoDichDat("GDD01", LocalDate.of(2013, 9, 15),
                10_000_000, 100, "A"));
        danhSach.add(new GiaoDichDat("GDD02", LocalDate.of(2013, 10, 20),
                8_000_000, 200, "B"));
        danhSach.add(new GiaoDichDat("GDD03", LocalDate.of(2014, 1, 10),
                12_000_000, 150, "C"));
        
        danhSach.add(new GiaoDichNha("GDN01", LocalDate.of(2013, 9, 25),
                15_000_000, 80, "cao cấp", "Quận 1"));
        danhSach.add(new GiaoDichNha("GDN02", LocalDate.of(2013, 8, 5),
                10_000_000, 120, "thường", "Quận 3"));
        danhSach.add(new GiaoDichNha("GDN03", LocalDate.of(2014, 2, 14),
                20_000_000, 60, "cao cấp", "Quận 7"));
        int soLuongDat = 0, soLuongNha = 0;
        for (GiaoDich gd : danhSach) {
            if (gd instanceof GiaoDichDat) {
                soLuongDat++;
            } else if (gd instanceof GiaoDichNha) {
                soLuongNha++;
            }
        }
        System.out.println("Số giao dịch đất: " + soLuongDat);
        System.out.println("Số giao dịch nhà: " + soLuongNha);
        double tongTienDat = 0;
        for (GiaoDich gd : danhSach) {
            if (gd instanceof GiaoDichDat) {
                tongTienDat += gd.thanhTien();
            }
        }
        double trungBinh = (soLuongDat > 0) ? tongTienDat / soLuongDat : 0;
        System.out.printf("Trung bình thành tiền đất: %,.0f%n", trungBinh);
        System.out.println("\n=== Giao dịch tháng 9/2013 ===");
        for (GiaoDich gd : danhSach) {
            if (gd.getNgayGiaoDich().getMonthValue() == 9
                    && gd.getNgayGiaoDich().getYear() == 2013) {
                System.out.println(gd);
            }
        }
    }
}
package tuan1;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;
    

    public static final double PI = 3.1416;

  
    public HinhTron() {
        super();
        this.tam = new ToaDo();
        this.banKinh = 0.0;
    }

    public HinhTron(ToaDo tam, double banKinh) {
        super();
        this.tam = tam;
        setBanKinh(banKinh); 
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        // Kiểm tra bán kính phải > 0
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            this.banKinh = 0.0;
            System.out.println("Lỗi: Bán kính phải lớn hơn 0!");
        }
    }


    public double tinhChuVi() {
        return 2 * PI * banKinh;
    }

    public double tinhDienTich() {
        return PI * banKinh * banKinh;
    }

  
    @Override
    public String toString() {
        String thongTinTam = (tam != null) ? 
                ("Tâm " + tam.getTen() + " có tọa độ (" + tam.getX() + ", " + tam.getY() + ")") : 
                "Chưa có tâm";
        
        return "Thông tin hình tròn:\n" +
               "- " + thongTinTam + "\n" +
               "- Bán kính: " + banKinh + "\n" +
               "- Chu vi: " + tinhChuVi() + "\n" +
               "- Diện tích: " + tinhDienTich();
    }

    // Hàm main để chạy thử chương trình
    public static void main(String[] args) {
        ToaDo t = new ToaDo("O", 3, 4);
        HinhTron h1 = new HinhTron(t, 12);
        
        // In thông tin sử dụng phương thức toString()
        System.out.println(h1.toString());
    }
}
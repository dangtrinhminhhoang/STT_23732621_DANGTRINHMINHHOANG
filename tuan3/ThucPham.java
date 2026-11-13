package tuan3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThucPham {
	 private String maHang;
	    private String tenHang;
	    private double donGia;
	    private LocalDate ngaySanXuat;
	    private LocalDate ngayHetHan;

	    
	    public ThucPham() {
	        this.maHang = "000";
	        this.tenHang = "Chưa xác định";
	        this.donGia = 0;
	        this.ngaySanXuat = LocalDate.now();
	        this.ngayHetHan = LocalDate.now();
	    }

	   
	    public ThucPham(String maHang, String tenHang, double donGia,
	                        LocalDate ngaySanXuat, LocalDate ngayHetHan) {

	        if (maHang == null || maHang.trim().isEmpty()) {
	            throw new IllegalArgumentException("Mã hàng không được rỗng!");
	        }

	        this.maHang = maHang;

	        setTenHang(tenHang);
	        setDonGia(donGia);
	        setNgaySanXuat(ngaySanXuat);
	        setNgayHetHan(ngayHetHan);
	    }

	
	    public String getMaHang() {
	        return maHang;
	    }

	    public void setMaHang(String maHang) {
	        if (maHang == null || maHang.trim().isEmpty()) {
	            throw new IllegalArgumentException("Mã hàng không được rỗng!");
	        }
	        this.maHang = maHang;
	    }

	
	    public String getTenHang() {
	        return tenHang;
	    }

	    public void setTenHang(String tenHang) {
	        if (tenHang == null || tenHang.trim().isEmpty()) {
	            this.tenHang = "Chưa xác định";
	        } else {
	            this.tenHang = tenHang;
	        }
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        if (donGia < 0) {
	            this.donGia = 0;
	        } else {
	            this.donGia = donGia;
	        }
	    }


	    public LocalDate getNgaySanXuat() {
	        return ngaySanXuat;
	    }

	    public void setNgaySanXuat(LocalDate ngaySanXuat) {
	        if (ngaySanXuat == null) {
	            this.ngaySanXuat = LocalDate.now();
	        } else {
	            this.ngaySanXuat = ngaySanXuat;
	        }
	    }


	    public LocalDate getNgayHetHan() {
	        return ngayHetHan;
	    }

	    public void setNgayHetHan(LocalDate ngayHetHan) {
	        if (ngayHetHan == null) {
	            this.ngayHetHan = this.ngaySanXuat;
	        } else if (ngayHetHan.isBefore(this.ngaySanXuat)) {
	            this.ngayHetHan = this.ngaySanXuat;
	        } else {
	            this.ngayHetHan = ngayHetHan;
	        }
	    }

	    public boolean daHetHan() {
	        return LocalDate.now().isAfter(ngayHetHan);
	    }


	    private String dinhDangNgay(LocalDate ngay) {
	        DateTimeFormatter formatter =
	                DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return ngay.format(formatter);
	    }

	  
	    @Override
	    public String toString() {
	        String ghiChu = daHetHan() ? "Hàng hết hạn" : "";

	        return String.format(
	                "%-8s %-15s %,.2fVND %-15s %-15s %s",
	                maHang,
	                tenHang,
	                donGia,
	                dinhDangNgay(ngaySanXuat),
	                dinhDangNgay(ngayHetHan),
	                ghiChu
	        );
	    }
}
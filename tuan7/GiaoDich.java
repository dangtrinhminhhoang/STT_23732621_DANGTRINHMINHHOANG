package tuan7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class GiaoDich{
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	protected double dienTich;
	
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public GiaoDich() {
	}
	public abstract double thanhTien();
	
	protected String getMaGiaoDich() {return maGiaoDich;}
	protected LocalDate getNgayGiaoDich() {	return ngayGiaoDich;}
	protected double getDonGia() {return donGia;}
	protected double getDienTich() {return dienTich;}
	protected void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	protected void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	protected void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	protected void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	@Override
	public String toString() {
		return String.format("Ma: %-6s | Ngay : %s | Don gia : %,.0f | Dien tich : %.1f | Thanh tien : %,.0f", maGiaoDich,ngayGiaoDich.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				donGia,dienTich,thanhTien());
	}
	
}
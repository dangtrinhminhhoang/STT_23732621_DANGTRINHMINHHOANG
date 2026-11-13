package tuan7;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	@Override
	public double thanhTien() {
		if (loaiNha.equalsIgnoreCase("Cao Cap")) {
			return dienTich * donGia;			
		}
		return dienTich * donGia * 0.9;
	}
	@Override
	public String toString() {
		return "[Dat]" + super.toString() + "| Loai: " + loaiNha + "| Dia chi: " + diaChi;
	}
}
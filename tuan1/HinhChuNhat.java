package tuan1;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	/**
	 * @return the chieuDai
	 */
	public double getChieuDai() {
		return chieuDai;
	}

	/**
	 * @param chieuDai the chieuDai to set
	 * @throws Exception 
	 */
	public void setChieuDai(double cD) throws Exception {
		if (cD>0) {
			this.chieuDai = cD;
		} else {
			throw new Exception("loi");
		}
		
	}

	/**
	 * @return the chieuRong
	 */
	public double getChieuRong() {
		return chieuRong;
	}

	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	/**
	 * 
	 */
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param chieuDai
	 * @param chieuRong
	 */
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public double getDT() {
		return this.chieuDai * this.chieuRong;
	}
	public double getCV() {
		return (this.chieuDai + this.chieuRong) * 2;
	}

	public static void main(String[] args) {
		HinhChuNhat h1 = new HinhChuNhat(7, 5);
		System.out.println(h1.getChieuDai());
		System.out.println(h1.getChieuRong());
		System.out.println("Dien tich hinh chu nhat: ");
		System.out.println(h1.getDT());
		System.out.println("Chu vi hinh chu nhat: ");
		System.out.println(h1.getCV());
	}




}
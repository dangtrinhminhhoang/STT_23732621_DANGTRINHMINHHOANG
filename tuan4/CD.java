/**
 * 
 */
package tuan4;

/**
 * 
 */


public class CD {

	/**
	 * @param args
	 */
	private int maCD;
	private String tuaCD;
	private String caSy;
	private int soBaiHat;
	private float giaThanh;
	
	
	
	
	/**
	 * @param maCD
	 * @param tuaCD
	 * @param caSy
	 * @param soBaiHat
	 * @param giaThanh
	 */
	public CD() {
	}

	/**
	 * @param maCD
	 * @param tuaCD
	 * @param caSy
	 * @param soBaiHat
	 * @param giaThanh
	 * @throws Exception 
	 */
	public CD(int maCD, String tuaCD, String caSy, int soBaiHat, float giaThanh) throws Exception {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}

	public String getCaSy() {
		return caSy;
	}

	/**
	 * @param caSy the caSy to set
	 */
	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}

	
	/**
	 * @return the maCD
	 */
	public int getMaCD() {
		return maCD;
	}

	/**
	 * @param maCD the maCD to set
	 */
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	/**
	 * @return the tuaCD
	 */
	public String getTuaCD() {
		return tuaCD;
	}

	/**
	 * @param tuaCD the tuaCD to set
	 */
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	/**
	 * @return the soBaiHat
	 */
	public int getSoBaiHat() {
		return soBaiHat;
	}

	/**
	 * @param soBaiHat the soBaiHat to set
	 * @throws Exception 
	 */
	public void setSoBaiHat(int soBaiHat) throws Exception {
		if (soBaiHat>0) {
			this.soBaiHat = soBaiHat;
		} else {
			throw new Exception("So bai hat > 0");
		}
		
	}

	/**
	 * @return the giaThanh
	 */
	public float getGiaThanh() {
		return giaThanh;
	}

	/**
	 * @param giaThanh the giaThanh to set
	 * @throws Exception 
	 */
	public void setGiaThanh(float giaThanh) throws Exception {
		if (giaThanh < 0) {
			throw new Exception("Invalid giaThanh > 0");
		} else {
			this.giaThanh = giaThanh;
		}
		
		
	}
    @Override
    public String toString() {
        return String.format("%-10d %-25s %-20s %-10d %18.2f", maCD, tuaCD, caSy, soBaiHat, giaThanh);
    }

}
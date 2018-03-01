package login;

public class ZipCodeBean {
	String zipCode;
	String zipCountyName;
	String zipTownName;
	
	public ZipCodeBean() {
		super();
	}

	public ZipCodeBean(String zipCode, String zipCountyName, String zipTownName) {
		super();
		this.zipCode = zipCode;
		this.zipCountyName = zipCountyName;
		this.zipTownName = zipTownName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCountyName() {
		return zipCountyName;
	}

	public void setZipCountyName(String zipCountyName) {
		this.zipCountyName = zipCountyName;
	}

	public String getZipTownName() {
		return zipTownName;
	}

	public void setZipTownName(String zipTownName) {
		this.zipTownName = zipTownName;
	}

	@Override
	public String toString() {
		return "ZipCodeBean [zipCode=" + zipCode + ", zipCountyName=" + zipCountyName + ", zipTownName=" + zipTownName
				+ "]";
	}

	
	
}

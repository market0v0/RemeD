package Projecthelper;

public class Address {
       private String street;
       private String barangay;
       private String town;
       private String province;
       private int postal;
       
	public Address() {
		super();
	}

	public Address(String street, String barangay, String town, String province, int postal) {
		super();
		this.street = street;
		this.barangay = barangay;
		this.town = town;
		this.province = province;
		this.postal = postal;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBarangay() {
		return barangay;
	}

	public void setBarangay(String barangay) {
		this.barangay = barangay;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getPostal() {
		return postal;
	}

	public void setPostal(int postal) {
		this.postal = postal;
	}

	@Override
	public String toString() {
		return "" + street + ", " + barangay + ", " + town + ", " + province
				+ ", " + postal;
	}
       
       
}

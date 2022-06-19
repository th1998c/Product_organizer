package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	private Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return 	getName() + " (used) $ "
				+ String.format("%.2f", getPrice()) +
				"(Manufacture date: "+sdf.format(manufactureDate) + ")";
	}
}
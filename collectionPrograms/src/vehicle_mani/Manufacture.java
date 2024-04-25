package vehicle_mani;

public class Manufacture {

	private String name;
	private String modelName;
	private String brandName;
	
	
	public Manufacture(String name, String modelName, String brandName) {
		this.name = name;
		this.modelName = modelName;
		this.brandName = brandName;
	}


	public String getManufactureInfo()
	{
		return "Name : "+name+" \nBrand Name : "+brandName+" \nModel Name : "+modelName+"";
	}
}


public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		String avail = "";
		
		if (this.getIsAvailable()) { 
			avail = "Available";
		} else {
			avail = "Not Available";
		}
		
		output = String.format("Asset Tag: %s\nDescription: %s\nDue Date: %s\nAvailability: %s", this.getAssetTag(), this.getDescription(), this.getDueDate(), avail);
		
		return output;
	}
}



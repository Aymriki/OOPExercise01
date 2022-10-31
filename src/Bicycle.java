public class Bicycle{

	private String ownerName, tagNo;

	public Bicycle() {
		ownerName = "Unknown";
		tagNo = "Unasigned";
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getTagNo() {
		return tagNo;
	}

	public void setOwnerName(String name) {

		ownerName = name;
		return;
	}

	public void setTagNo(String TagNo) {

		tagNo = TagNo;
		return;
	}
}

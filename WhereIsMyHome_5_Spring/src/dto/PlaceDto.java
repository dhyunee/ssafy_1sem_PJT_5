package dto;

public class PlaceDto {
	private String num;
	private String name;
	
	public PlaceDto(String num,String name) {
		this.num = num;
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PlaceDto [num=" + num + ", name=" + name + "]";
	}
	
}

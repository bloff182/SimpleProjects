package enumm.type;

public enum Seasons {

	SPRING(15),
	SUMMER(25),
	AUTHUM(10),
	WINTER(5);
	
	private Integer AvgTemp;

	private Seasons(Integer avgTemp) {
		AvgTemp = avgTemp;
	}

	public Integer getAvgTemp() {
		return AvgTemp;
	}

	public void setAvgTemp(Integer avgTemp) {
		AvgTemp = avgTemp;
	}
	
}

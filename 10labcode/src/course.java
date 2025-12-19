public class course {

	private String id;
	private String name;
	private int weeklyDuration;

	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getWeeklyDuration() {
		return this.weeklyDuration;
	}

	/**
	 * 
	 * @param weeklyDuration
	 */
	public void setWeeklyDuration(int weeklyDuration) {
		this.weeklyDuration = weeklyDuration;
	}

}
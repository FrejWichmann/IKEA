public Class Chair{
	private int numberOfLegs;
	private String name;
	private boolean softToSitOn;
	private String material;

	public Chair(){

}

	public Chair(int numberOfLegs, String name, boolean softToSitOn ){
		this.numberOfLegs = numberOfLegs;
		this.name = name;
		this.softToSitOn = softToSitOn;
}

	public boolean isSoftToSitOn(){
		return softToSitOn;
}

	public int getNumberOfLegs(){
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs){
		this.numberOfLegs = numberOfLegs;
	}
	public void getMaterial(){
		return material;
	}

}

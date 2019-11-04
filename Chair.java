public Class Chair{
	private int numberOfLegs;
	private String name;
	private boolean softToSitOn;
	private String designer;	

	public Chair(){

}

	public Chair(int numberOfLegs, String name, boolean softToSitOn, String designer ){
		this.numberOfLegs = numberOfLegs;
		this.name = name;
		this.softToSitOn = softToSitOn;
		this.designer = designer;
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
	public String getDesigner(){
		 return designer;
	}

}

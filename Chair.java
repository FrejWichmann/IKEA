public Class Chair{
	private int numberOfLegs;
	private String name;
	private boolean softToSitOn;
	private String material;
	private String designer;	

	public Chair() extends Product{

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
	public void getMaterial(){
		return material;

}
	public String getDesigner(){
		 return designer;
	}
	
	public void lostALeg(){
		numberOfLegs-1;
	 }
	
}

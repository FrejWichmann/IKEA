public class Main{
	private List<Chair> chairList = new ArrayList<>();

	public static void main(String[] args){
		

	
	System.out.println("Is this chair soft to sit on? " + getChair(0).isSoftToSitOn());
	}
		
	public void addNewChair(int numberOfLegs, String name, boolean softness){
		Chair chair = new Chair(numberOfLegs,name,softness);
		chairList.add(chair);

	}
	public Chair getChair(int index){
		return chairlist.get(index);

	}

}


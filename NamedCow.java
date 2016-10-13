class NamedCow extends Cow
{
	private String myType;
	private String mySound;
	private String myName;
	public NamedCow(String type, String sound, String name){
		myName = name; 
		myType = type;
		mySound = sound;
	}
	void getName() {
		return myName; 
	}
}
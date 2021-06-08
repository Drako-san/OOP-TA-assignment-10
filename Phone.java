public interface Phone {
	String Call = "RING!!!";
	String Games = "Let's play!!!";
	String OS = " ";
	default String Assist(){
		return null;
		}
}
abstract class Iphone implements Phone{
	String OS = "IOS";
	String Call = "IPHONE RINGTONE";
	public String Assist(){
		return null;
	}
}
class MyIphone extends Iphone{
	String OS = "IOS";
	String Call = "IPHONE RINGTONE";
	String Owner = "Weihan";
	public String Assist(){
		return "Hey siri";
	}
	int NumContacts(){
		return 40;
	}
}

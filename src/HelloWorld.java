

public class HelloWorld {
    public static void main(String[] args) {
    	String response = sendWittyMessage();
    	System.out.println(response);
    }
    
    public static String AwkwardSilence() {
    	return "";
    }
    
    public static String sendWittyMessage() {
    	CuteGirl cuteGirl = new CuteGirl();
    	boolean waitingForResponse = true;
    	while (waitingForResponse) {
    		String str = Console.getString("respond to cheesy tinder message?: ");
    		if (str.equals("yes")) {
    			cuteGirl.responds();
    			break;
    		} else {
    			return AwkwardSilence();
    		}
		}
		if (cuteGirl.acceptsDate()) {
			return "wow this worked";
		} else {
			return "awww damn it";
		}
    }
    
}


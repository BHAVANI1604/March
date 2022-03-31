package march;

public interface LightSwitch {
	
	default String findLight(boolean isOn) {
		if(isOn==true) {
			return "is on";
			
		}
		else {
			return "not on";
		}
	}

}

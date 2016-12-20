// launch and timed commands to execute audio recordings

public class TimedAudio {
	
	public static void main(String[] args) {

		System.out.println("Starting sequence");
		
		recursiveTime(0);

	}

	public static void recursiveTime(int time) {
		
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Slept for 5 seconds");
		
	}

}
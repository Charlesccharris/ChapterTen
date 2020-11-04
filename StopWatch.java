public class StopWatch{

	private long startTime;
	private long endTime;

	public void start(){
		this.startTime = System.currentTimeMillis();
	}

	public void stop(){
		this.endTime = System.currentTimeMillis();
		long elapsedTime = this.endTime - this.startTime;
		System.out.println("It took " + elapsedTime + " milliseconds to finish the calculations");
	}
}

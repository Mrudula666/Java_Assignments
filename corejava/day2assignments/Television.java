/**
 * 
 */
package corejava.day2assignments;

/**
 * @author mrnimmal
 * Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
 state (on/off), 
 current volume, 
 current channel, 
 increase and decrease volume and 
 change channel
 turn it on and off.
     
Design this class, create an instance, turn on, increase and decrease the volume, change channels..
get information about state, volume and channel..finally turn it off.
 *
 */
public class Television {
	private boolean state;
	private int currentVolume;
	private int currentChannel;
	private int incresedVolume;
	private int decreasedVolume;
	private int changeChannel;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(boolean state, int currentVolume, int currentChannel) {
		super();
		this.state = state;
		this.currentVolume = currentVolume;
		this.currentChannel = currentChannel;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}
	public void setIncresedVolume(int currentVolume2, boolean b) {
		incresedVolume = currentVolume2;
		if(isState() == true){
		while(!b){
		 incresedVolume++;
		}
		}
	}
	public int getIncreasedVolume() {
		
		return incresedVolume;
	}
	public void setDecresedVolume(int currentVolume2, boolean b) {
		decreasedVolume = currentVolume2;
		if(isState() == true){
		while(!b){
		 decreasedVolume--;
		}
		}
	}
	public int getDecreasedVolume() {
		return decreasedVolume;
	}
	public void setChangedChanel(int currentChannel2, int channelNumber) {
		int changeChannel = currentChannel2;
		if(isState() == true){
			changeChannel = channelNumber;
		}	
		
	}
	public int getChangedChannel() {
		return changeChannel;
	}
	
	

}

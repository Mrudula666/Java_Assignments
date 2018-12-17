package corejava.day2assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day2assignments.Television;

public class TelevisionTest {
	private Television television;
	
	@Before
	public void setUp(){
		television = new Television();
		television.setState(true);
	}
	
	@Test
	public void testToTurnOn() {
		television.setState(true);
		boolean TelevisionState = television.isState();
		assertTrue(TelevisionState);
	}
	
	@Test
	public void testToIncreaseVolume() {
		television.setIncresedVolume(television.getCurrentVolume(),false);
		int increasedVolume = television.getIncreasedVolume();
		System.out.println(increasedVolume);
	}
	
	@Test
	public void testToDecreseVolume() {
		television.setDecresedVolume(television.getCurrentVolume(),false);
		int increasedVolume = television.getDecreasedVolume();
		System.out.println(increasedVolume);
	}
	
	@Test
	public void testToChangeChannel() {
		television.setState(true);
		int channelNumber = 765;
		television.setChangedChanel(television.getCurrentChannel(),channelNumber);
		int changedChannel = television.getChangedChannel();
		System.out.println("Changed Channel: "+changedChannel);
	}
}
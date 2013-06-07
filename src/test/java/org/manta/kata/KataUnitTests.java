package org.manta.kata;

import java.util.Arrays;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.junit.Assert.*;

public class KataUnitTests {
	
	private Yahtzee game;
	private int[] hold;
	
	@Given("^the game of yahtzee is initiated$")
	public void the_game_of_yahtzee_is_initiated(){
		
		game = new Yahtzee();
	    
	    assertNotNull("game was not able to be initiated", game);
	}


	@Then("^make sure we have (\\d+) dizes$")
	public void make_sure_we_have_dizes(int arg1) {
	    
		int [] dices = game.getDices();
		
		assertTrue("5 dices was not created", dices.length == 5);
		for ( int i = 0 ; i < 5 ; i++)
			assertTrue("Dice # " + i+1 + "is not 0", dices[i] == 0);
	}


	@When("^the dices are rolled$")
	public void the_dices_are_rolled(){
		
		int [] dices = game.roll();
		
		assertTrue("5 dices was not created", dices.length == 5);
		for ( int i = 0 ; i < 5 ; i++)
			assertTrue("Dice # " + i+1 + "is not 0", dices[i] != 0);
	}
	
	@Then("^count the number of dices that are the same$")
	public void count_the_number_of_dices_that_are_the_same(){
	    
	}
	
	@When("^we give the numbers \"([^\"]*)\"$")
	public void we_give_the_numbers(String arg1){
	    
		int[] dices = {2,3,2,3,5};
		int[] origin = {2,3,2,3,5};
		
		hold = game.bubbleSort(dices);

		assertFalse("dice and hold should not be the same", Arrays.equals(dices, origin));
	}

	@Then("^we should get \"([^\"]*)\"$")
	public void we_should_get(String arg1){
	   
		int[] answer = {5,3,3,2,2};
		
		assertTrue("Anser and hold should not be the same", Arrays.equals(hold,answer));	
	}

}
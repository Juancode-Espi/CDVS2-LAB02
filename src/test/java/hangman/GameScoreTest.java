package hangman;

import org.junit.Test;
import junit.framework.*;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;

public class GameScoreTest{

	@SuppressWarnings("deprecation")
	@Test
	public void originalScoreTestCorrecto(){
		OriginalScore score=new OriginalScore();
		int valor = score.calculateScore(3,4);		
		Assert.assertEquals(valor,60);
	}
	@Test
	@SuppressWarnings("deprecation")
	public void originalScoreTestFrontera(){
		OriginalScore score=new OriginalScore();
		int valor = score.calculateScore(3,12);		
		Assert.assertEquals(valor,0);
	}
	@Test
	@SuppressWarnings("deprecation")
	public void BonusScoreTestCorrecto(){
		BonusScore score=new BonusScore();
		int valor = score.calculateScore(3,4);		
		Assert.assertEquals(valor,10);
	}
	@Test
	@SuppressWarnings("deprecation")
	public void BonusScoreTestFrontera(){
		BonusScore score=new BonusScore();
		int valor = score.calculateScore(3,12);		
		Assert.assertEquals(valor,0);
	}
	@Test
	@SuppressWarnings("deprecation")
	public void PowerBonusScoreTestCorrecto(){
		PowerBonusScore score=new PowerBonusScore();
		int valor = score.calculateScore(3,3);		
		Assert.assertEquals(valor,101);
	}
	@Test
	@SuppressWarnings("deprecation")
	public void PowerBonusScoreTestFronteraInferior(){
		PowerBonusScore score=new PowerBonusScore();
		int valor = score.calculateScore(2,12);		
		Assert.assertEquals(valor,0);
	}
	@Test
	public void PowerBonusScoreTestFronteraSuperior(){
		PowerBonusScore score=new PowerBonusScore();
		int valor = score.calculateScore(4,0);		
		Assert.assertEquals(valor,500);
	}
}
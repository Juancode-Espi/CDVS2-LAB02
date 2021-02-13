package hangman.model;

public class PowerBonusScore implements GameScore {
	private int score = 0;
	/**
     * Calculo del puntaje La $i-ésima$ letra correcta se bonifica con $5^i$. e incorrectas resta 8 puntos
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @return puntaje calculado en base a los parámetros
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {


		score = (int) (score - incorrectCount*8 + Math.pow(5, correctCount));
		if (score > 500) {
			return 500;
		}else {
			if (score > 0) {
				return score;
			}else {
				return 0;
			}		
		}
	}

}

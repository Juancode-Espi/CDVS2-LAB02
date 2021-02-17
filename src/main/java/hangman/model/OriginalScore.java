package hangman.model;

public class OriginalScore implements GameScore {
	private int score = 100;	
	/**
     * Calculo del puntaje entre 0 y 100 letras correctas no bonifican e incorrectas resta 10 puntos
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @return puntaje calculado en base a los parámetros
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub

		score = score - incorrectCount*10;
		if (score < 0) {
			return 0;
		}else {
			return score;
		}
	}
	@Override
	public int reset() {
		this.score=100;
		return 100;
	}

}

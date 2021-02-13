package hangman.model;

public class BonusScore implements GameScore {

	/**
     * Calculo del puntaje letras correctas bonifican con 10 puntos e incorrectas resta 5 puntos
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @return puntaje calculado en base a los parámetros
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		int score = 0;
		score = score + correctCount*10  - incorrectCount*5;
		if (score < 0) {
			return 0;
		}else {
			return score;
		}
	}

}

package hangman.model;

public interface GameScore {
	/**
     * Calculo del puntaje
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @return puntaje calculado en base a los parámetros
     */
	public abstract int calculateScore(int correctCount,int incorrectCount);
}

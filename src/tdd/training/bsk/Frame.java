package tdd.training.bsk;

public class Frame {

	/**
	 * It initializes a frame given the pins knocked down in the first and second
	 * throws, respectively.
	 * 
	 * @param firstThrow  The pins knocked down in the first throw.
	 * @param secondThrow The pins knocked down in the second throw.
	 * @throws BowlingException
	 */
	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		// To be implemented
	}

	/**
	 * It returns the pins knocked down in the first throw of this frame.
	 * 
	 * @return The pins knocked down in the first throw.
	 */
	public int getFirstThrow() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns the pins knocked down in the second throw of this frame.
	 * 
	 * @return The pins knocked down in the second throw.
	 */
	public int getSecondThrow() {
		// To be implemented
		return 0;
	}

	/**
	 * It sets the bonus of this frame.
	 *
	 * @param bonus The bonus.
	 */
	public void setBonus(int bonus) {
		// To be implemented
	}

	/**
	 * It returns the bonus of this frame.
	 *
	 * @return The bonus.
	 */
	public int getBonus() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns the score of this frame (including the bonus).
	 * 
	 * @return The score
	 */
	public int getScore() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns whether, or not, this frame is strike.
	 * 
	 * @return <true> if strike, <false> otherwise.
	 */
	public boolean isStrike() {
		// To be implemented
		return false;
	}

	/**
	 * It returns whether, or not, this frame is spare.
	 * 
	 * @return <true> if spare, <false> otherwise.
	 */
	public boolean isSpare() {
		// To be implemented
		return false;
	}

}

public class Hanoi {
	/*
	 * Part4: Tower of Hanoi
	 */

	private Stack moves;
	private Stack[] towers = new Stack[3];
	private int numRings;
	
	public Hanoi(int numDisks) {
		moves = new Stack();
		for (int i = 0; i < 3; i++) {
			towers[i] = new Stack(numDisks);
		}
		this.numRings= numDisks;
		for (int i = 0; i < numRings; i++) {
			towers[0].push(new Disk());
		}
	}
		
	/*
	 * Part 2A: update 'towers' and add (push) a move to 'moves'
	 */
	public void moveOneRing(int from, int to){
		/* TODO */
	}
	
	/*
	 * Part 2B: recursive calls to play the Hanoi game
	 * 
	 * Hint: use recursive calls to both 'movePile' and also to 'moveOneRing'
	 */
	public void movePile(int n,int from,int to,int via){
		/* TODO */
	}
	
	public Stack getMoves() {
		return replayMoves();
	}
	
	public Stack[] getTowers() {
		return towers;
	}

	public void playHanoiMoves() {
		movePile(numRings,0,1,2);
	}
	
	private Stack replayMoves() {
		Stack copy = (Stack) moves.clone();
		Stack newStack = new Stack(copy.size());
		while (!copy.isEmpty()) {
			newStack.push(copy.pop());
		}
		return newStack;
	}
}

class Move {
	private int from, to;
	public Move(int from, int to) {
		this.from=from;
		this.to=to;
	}
	public int getFrom() {
		return from;
	}
	public int getTo() {
		return to;
	}
}

class Disk {
	public Disk() {}
}

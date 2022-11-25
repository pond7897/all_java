package Lab10Ex;


public class PieceWorker extends Employee {
	private double wage;
	private int piece;
	public PieceWorker(String first, String last, String ssn, double wagePerPiece, int piecesProduced) {
		// TODO Auto-generated constructor stub
		super(first, last, ssn);
		setPieceWorkerWage(wagePerPiece);
		setPieceProduced(piecesProduced);
	}
	public void setPieceWorkerWage(double wagePerPiece) {
		wage = (wagePerPiece < 0.0) ? 0.0 : wagePerPiece;
	}
	public double getPieceWorkerWage() {
		return wage;
	}
	public void setPieceProduced(int piecesProduced) {
		piece = (piecesProduced < 0) ? 0 : piecesProduced;
	}
	public int getPieceProduced() {
		return piece;
	}
	public double earning() {
		return getPieceWorkerWage()*getPieceProduced();
	}
	public String toString() {
		return String.format("piece worker: %s\n%s: $%,.2f; %s: %2d", 
				super.toString(),"wage per piece ", getPieceWorkerWage(),
				"pieces produced: ", getPieceProduced());
		
	}

}

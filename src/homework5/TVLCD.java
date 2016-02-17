

public class TVLCD extends TV {

	private int diagonal;

	public TvSetLCD(String vendor, String device, int hz, int Diagonal) {
		super(producer, device, hz);
		this.Diagonal = Diagonal;
	}

	public int getDiagonal() {
		return Diagonal;
	}

	public void setDiagonal(int Diagonal) {
		this.Diagonal = Diagonal;
	}

	
	
}
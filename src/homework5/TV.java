

public class TV extends Tech

{

private int Hz;
 public TvSet(String vendor, String device, int hz) {
	super(vendor);
	super(device);
	this.hz = hz;
}
public int getHz() {
	return hz;
}
public void setHz(int hz) {
	this.hz = hz;
}
}
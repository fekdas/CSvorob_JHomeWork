

public class Tech

{
 private boolean v220;
 private String vendor;
 private String device;

public Tech(String vendor, String device) {
	super();
	this.vendor = vendor;
	this.device = device;
}

public void isOn()
   {
	v220 = true;
   }

public boolean On() {
	return v220;
}

public void setOn(boolean v220) {
	this.v220 = v220;
}

public String getVendor() {
	return Vendor;
}

public void setVendor(String Vendor) {
	this.vendor = vendor;
}

public String getDevice() {
	return Device;
}

public void setDevice(String Device) {
	this.Device = Device;
}

}

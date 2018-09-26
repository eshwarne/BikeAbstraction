package bikes;

abstract class Skeleton {
	public String vehicleNumber;
	public String vehicleOwner;
	public String vehicleType;
	Skeleton(String vm, String vo,String vt){
		this.vehicleNumber=vm;
		this.vehicleOwner=vo;
		this.vehicleType=vt;
	}
	abstract void silencerSound();
	protected void changeVehicleOwner(String a) {
		this.vehicleOwner=a;
		
	}
	public String[] getDetails() {
		String[] details= {this.vehicleNumber,this.vehicleOwner,this.vehicleType};
		return details;
	}
}
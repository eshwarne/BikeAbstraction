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
}
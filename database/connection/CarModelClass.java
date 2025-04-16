package database.connection;

public class CarModelClass {
	
	private String carname;
	private int model;
	private String cherecter;
	private String engine;
	private String topverent;
	private String baseverent;
	public CarModelClass(String carname, int model, String cherecter, String engine, String topverent, String baseverent) {
		super();
		this.carname = carname;
		this.model = model;
		this.cherecter = cherecter;
		this.engine = engine;
		this.topverent = topverent;
		this.baseverent = baseverent;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCherecter() {
		return cherecter;
	}
	public void setCherecter(String cherecter) {
		this.cherecter = cherecter;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTopverent() {
		return topverent;
	}
	public void setTopverent(String topverent) {
		this.topverent = topverent;
	}
	public String getBaseverent() {
		return baseverent;
	}
	public void setBaseverent(String baseverent) {
		this.baseverent = baseverent;
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return carname+" "+model+" "+cherecter+" "+engine+" "+topverent+" "+baseverent;
    }

	

}

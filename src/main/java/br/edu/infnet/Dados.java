package br.edu.infnet;

public class Dados {

	private String date;
	private String open;
	private String high;
	private String low;
	private String adjClose;
	private String close;
	private String volume;
	public Dados(String date, String open, String high, String low, String close, String adjClose, String volume) {
		super();
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.adjClose = adjClose;
		this.close = close;
		this.volume = volume;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getAdjClose() {
		return adjClose;
	}
	public void setAdjClose(String adjClose) {
		this.adjClose = adjClose;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	

}

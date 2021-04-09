package br.com.unip.tcc.bean;

import java.io.Serializable;


public class ControleCombustivelBean implements Serializable {

	private static final long serialVersionUID = -2059245746777162803L;
	
	public String volume = "50 litros";

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
	

}

package com.svgatodvi;

public class SvgaToDviAdapter implements Svga {

	private Dvi dvi;
	
	public SvgaToDviAdapter(Dvi dvi) {	
		this.dvi = dvi;
	}
	
	@Override
	public void transferAnalogSignal(String information) {
		dvi.transferInformation(information);
	}

}

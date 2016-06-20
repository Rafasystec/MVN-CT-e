package br.com.barcadero.cte.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import br.com.barcadero.cte.xml.enums.EnumTomador03;

@XmlAccessorType(XmlAccessType.FIELD)
public class Tomador03 extends SuperTomador {

	@XmlElement(name="toma")
	private EnumTomador03 toma;
	@XmlElement(name="enderToma",required=true)
	private EnderToma enderTomador;
	
	public EnumTomador03 getToma() {
		return toma;
	}
	public void setToma(EnumTomador03 toma) {
		this.toma = toma;
	}
	public EnderToma getEnderTomador() {
		return enderTomador;
	}
	public void setEnderTomador(EnderToma enderTomador) {
		this.enderTomador = enderTomador;
	}

}


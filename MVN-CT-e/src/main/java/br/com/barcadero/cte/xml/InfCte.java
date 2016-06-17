package br.com.barcadero.cte.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="InfCte")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfCte {

	@XmlAttribute(name="versao")
	private String versao;
	@XmlAttribute(name="Id")
	private String id;
	@XmlElement(name="ide")
	private Ide ide;
	
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Ide getIde() {
		return ide;
	}
	public void setIde(Ide ide) {
		this.ide = ide;
	}
	
	
}

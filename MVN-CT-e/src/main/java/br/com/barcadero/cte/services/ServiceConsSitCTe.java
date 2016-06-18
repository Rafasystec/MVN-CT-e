package br.com.barcadero.cte.services;

import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import br.com.barcadero.mensageria.soap.EnumTpAmbiente;
import br.com.barcadero.mensageria.soap.SOAPMessageUtil;
import br.com.barcadero.mensageria.soap.Services;

/**
 * 
 * @author root
 *
 */
public class ServiceConsSitCTe extends Services {

	public String getNameSpaceDeclaration() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getURLService(EnumTpAmbiente tpAmb) {
		// TODO Auto-generated method stub
		return null;
	}

	public SOAPMessage buildSoapMessage(String xMLMessage, SOAPMessage sOPAMessage) throws SOAPException {
		// TODO Auto-generated method stub
		/*
	 <?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
<soap12:Header>
<cteCabecMsg xmlns="http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao">
<cUF>string</cUF>
<versaoDados>string</versaoDados>
</cteCabecMsg>
</soap12:Header>
<soap12:Body>
<cteDadosMsg xmlns="http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcao">xml</cteDadosMsg>
</soap12:Body>
</soap12:Envelope>

		 * 
		 * 	
		 */
		

		return null;
	}

}

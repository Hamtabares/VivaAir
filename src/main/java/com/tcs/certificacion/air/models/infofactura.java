package com.tcs.certificacion.air.models;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.tcs.certificacion.air.user_interfaces.InfoFactura;

import net.serenitybdd.screenplay.Actor;

public class infofactura { 
	
	public infofactura(Actor actor) {
		
		String factura = InfoFactura.FACTURA_COMPRA.resolveFor(actor).getText();
		
		try {
		
		 DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		 
		 //Creacion de documento
		 Document doc = docBuilder.newDocument();

		 //Elemento raiz que contiene los datos de la factura de compra de tiquetes del vuelo
		 Element Factura = doc.createElement("FacturaCompra");
		 Factura.appendChild(doc.createTextNode(factura));
		 doc.appendChild(Factura);
		 
		 //Escribimos el contenido en un archivo .xml
		 TransformerFactory transformerFactory = TransformerFactory.newInstance();
		 Transformer transformer = transformerFactory.newTransformer();
		 DOMSource source = new DOMSource(doc);
		 StreamResult result = new StreamResult(new File("FacturaCompra.xml"));
		 
		 transformer.transform(source, result);
		 
//		 System.out.println("Archivo con factura guardado exitosamente!");
		 
	 } catch (ParserConfigurationException pce) {
		 pce.printStackTrace();
		 } catch (TransformerException tfe) {
	 		tfe.printStackTrace();
	}
		 
	}
	
	public static infofactura delVuelo(Actor actor) {
		return new infofactura(actor);
	}

}

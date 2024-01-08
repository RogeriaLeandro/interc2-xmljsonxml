package br.mil.md.sc1.interc2xmljsonxml.service;

import br.mil.md.sc1.interc2xmljsonxml.model.registros.PlanRegistro;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class PlanRegistroService {


    public Object transformaXmlEmObjeto(String xmlPlan) {
        PlanRegistro planRegitro = new PlanRegistro();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PlanRegistro.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StringReader(xmlPlan));
        } catch(JAXBException e) {
            throw new IllegalArgumentException("Erro na conversão de XML para Objeto - ERROR: " + e.getMessage());
        }


    }
}

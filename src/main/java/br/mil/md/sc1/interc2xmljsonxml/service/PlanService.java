package br.mil.md.sc1.interc2xmljsonxml.service;

import br.mil.md.sc1.interc2xmljsonxml.model.registros.Plan;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class PlanService {

    public Object transformaXmlEmObjeto(String xmlPlan, Class<?> clazz) {
        Plan planRegitro = new Plan();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StringReader(xmlPlan));
        } catch(JAXBException e) {
            throw new IllegalArgumentException("Erro na conversão de XML para Objeto - ERROR: " + e.getMessage());
        }

    }

    public static Object xmlToObject(String xml, Class<?> clazz) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StringReader(xml));
        } catch (JAXBException e) {
            throw new IllegalArgumentException("Error while converting xml to object", e);
        }
    }
}

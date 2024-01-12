package br.mil.md.sc1.interc2xmljsonxml.controller;

import br.mil.md.sc1.interc2xmljsonxml.model.registros.Plan;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.xml.transform.StringSource;

@RestController
public class PlanController {

    private Jaxb2Marshaller marshaller;

    @PostMapping("/xmltoplan")
    public Plan unmarshall(@RequestBody String xmlPlan) {
        Object objPlan = marshaller.unmarshal(new StringSource(xmlPlan));
        System.out.println(objPlan.getClass());
        return (Plan) objPlan;
    }
}

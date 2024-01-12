package br.mil.md.sc1.interc2xmljsonxml;

import br.mil.md.sc1.interc2xmljsonxml.model.Customer;
import br.mil.md.sc1.interc2xmljsonxml.model.registros.Plan;
import br.mil.md.sc1.interc2xmljsonxml.service.PlanService;
import org.json.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;


public class PlanTest {

    @Autowired
    public PlanService service;

    @Test
    void deveTransformarXmlEmObjetoPlan() {
        String xmlPlan = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ns0:Plan \n" +
                "    xmlns:ns0=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3ActionTask.xsd\"\n" +
                "    xmlns:ns1=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3Common.xsd\"\n" +
                "    xmlns:ns2=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3Types.xsd\"\n" +
                "    xmlns:ns3=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3Location.xsd\"\n" +
                "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n" +
                "\txsi:schemaLocation=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3ActionTask.xsd Jc3ActionTask.xsd\"\n" +
                "    uri=\"urn:uuid:02b04074-a60b-47c2-91ac-a0dcc3d06q40\" Source=\"MD\">\n" +
                "    <ns1:Metadata>\n" +
                "        <ns1:Classification>\n" +
                "            <ns2:LvlCode>Restricted</ns2:LvlCode>\n" +
                "        </ns1:Classification>\n" +
                "        <ns1:ReportingDatetime>2016-07-11T17:53:53.000Z</ns1:ReportingDatetime>\n" +
                "        <ns1:EffectiveDatetimeStart>2016-07-11T17:53:53.000Z</ns1:EffectiveDatetimeStart>\n" +
                "        <ns1:EffectiveDatetimeEnd>2016-07-11T17:53:53.000Z</ns1:EffectiveDatetimeEnd>\n" +
                "    </ns1:Metadata>\n" +
                "    <ns1:CommentText/>\n" +
                "    <ns1:Extension>\n" +
                "        <!-- Modalidade da Operação: OpCj (operação conjunta) ou OpSg (operação singular)  -->\n" +
                "        <ModalidadeOperacao>OpCj</ModalidadeOperacao>\n" +
                "    </ns1:Extension>\n" +
                "    <ns0:NameTxt>AGATA 2016</ns0:NameTxt>\n" +
                "    <ns0:SymbolAnnotationTxt/>\n" +
                "    <ns0:PlanningIndCode>YES</ns0:PlanningIndCode>\n" +
                "    <ns0:ProgressCode>PLAN</ns0:ProgressCode>\n" +
                "    <ns0:PlndStartDttm>2016-01-30T10:05:54.000Z</ns0:PlndStartDttm>\n" +
                "    <ns0:PlndEndDttm>2016-08-30T10:05:54.000Z</ns0:PlndEndDttm>\n" +
                "    <ns0:Hostility>FR</ns0:Hostility>\n" +
                "</ns0:Plan>";

        Plan plan = (Plan) service.xmlToObject(xmlPlan, Plan.class);
        Assertions.assertEquals("YES", plan.getPlanningIndCode());

    }

    @Test
    void deveTransformarXmlCustomerEmObject() {
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<Customer id=\"071238\" xmlns=\"urn:br.mil.sd1.interc2xmljsonxml\">\n" +
                "    <Name>John</Name>\n" +
                "    <Age>35</Age>\n" +
                "</Customer>";
        Customer customer = (Customer) service.xmlToObject(xml, Customer.class);
        Assertions.assertEquals("071238", customer.getId());

    }


}

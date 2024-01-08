package br.mil.md.sc1.interc2xmljsonxml;

import br.mil.md.sc1.interc2xmljsonxml.service.PlanRegistroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PlanRegistroTest {

    public PlanRegistroService service;

    @Test
    void deveTransformarXmlPlanRegistroEmObjeto(String xml) {
        String xmlPlan = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ns0:Plan xmlns:ns0=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3ActionTask.xsd\" \n" +
                "xmlns:ns1=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3Common.xsd\"  \n" +
                "xmlns:ns2=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3Types.xsd\"  \n" +
                "xmlns:ns3=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3Location.xsd\" \n" +
                "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \t\n" +
                "xsi:schemaLocation=\"http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3ActionTask.xsd Jc3ActionTask.xsd\"  \n" +
                "uri=\"urn:uuid:61d459e1-230b-418d-ac4e-ac7ab9ca36ac\" Source=\"EB\">\n" +
                "<ns1:Metadata><ns1:Classification><ns2:LvlCode>Restricted</ns2:LvlCode></ns1:Classification>\n" +
                "<ns1:ReportingDatetime>2018-12-17T17:42:15.081Z</ns1:ReportingDatetime>\n" +
                "<ns1:EffectiveDatetimeStart>2018-10-02T00:00:59.999Z</ns1:EffectiveDatetimeStart>\n" +
                "<ns1:EffectiveDatetimeEnd>2019-11-04T21:00:59.999Z</ns1:EffectiveDatetimeEnd></ns1:Metadata>\n" +
                "<ns1:CommentText/>\n" +
                "<ns1:Extension>\n" +
                "<ModalidadeOperacao>OpSg</ModalidadeOperacao>\n" +
                "</ns1:Extension>\n" +
                "<ns0:NameTxt>AGATA EB TESTE</ns0:NameTxt>\n" +
                "<ns0:SymbolAnnotationTxt/>\n" +
                "<ns0:PlanningIndCode>YES</ns0:PlanningIndCode>\n" +
                "<ns0:ProgressCode>IPR</ns0:ProgressCode>\n" +
                "<ns0:PlndStartDttm>2016-01-30T10:05:54.000Z</ns0:PlndStartDttm>\n" +
                "<ns0:PlndEndDttm>2019-11-04T21:00:59.999Z</ns0:PlndEndDttm>\n" +
                "<ns0:Hostility>FR</ns0:Hostility>\n" +
                "</ns0:Plan>";
        Object transformadoXmlEmObjeto = service.transformaXmlEmObjeto(xmlPlan);
        Assertions.assertNotNull(transformadoXmlEmObjeto);

    }
}

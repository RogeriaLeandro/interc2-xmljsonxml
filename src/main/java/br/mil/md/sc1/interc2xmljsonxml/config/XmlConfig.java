package br.mil.md.sc1.interc2xmljsonxml.config;

import br.mil.md.sc1.interc2xmljsonxml.model.registros.Plan;
import br.mil.md.sc1.interc2xmljsonxml.model.registros.SurfaceVesselRegistro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class XmlConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(Plan.class); // Include more classes if needed TODO
        return marshaller;
    }

}

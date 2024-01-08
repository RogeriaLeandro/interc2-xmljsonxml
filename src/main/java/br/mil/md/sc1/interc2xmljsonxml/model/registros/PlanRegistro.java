package br.mil.md.sc1.interc2xmljsonxml.model.registros;

import br.mil.md.sc1.interc2xmljsonxml.model.aux.Extension;
import br.mil.md.sc1.interc2xmljsonxml.model.aux.Metadata;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@XmlRootElement(name = "Plan", namespace = "default")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanRegistro {

    @XmlElement(name = "Metadata")
    private Metadata metadata;

    @XmlElement(name = "Extension")
    private Extension extension;

    @Id
    @XmlAttribute(name = "uri")
    private String uri;

    @XmlElement(name = "Source")
    private String source;

    @XmlElement(name = "NameTxt")
    private String nameTxt;

    @XmlElement(name = "PlanningIndCode")
    private String planningIndCode;

    @XmlElement(name = "ProgressCode")
    private String progressCode;

    @XmlElement(name = "PlndStartDttm")
    private String plndStartDttm;

    @XmlElement(name = "PlndEndDttm")
    private String plndEndDttm;

}

package br.mil.md.sc1.interc2xmljsonxml.model.registros;

import br.mil.md.sc1.interc2xmljsonxml.model.aux.Extension;
import br.mil.md.sc1.interc2xmljsonxml.model.aux.Metadata;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@XmlRootElement (name = "Plan", namespace = "http://mip-interop.org/schemas/ADEM/2014/04/11/Jc3ActionTask.xsd")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plan {

    @XmlElement(name = "Metadata")
    private Metadata metadata;

    @XmlElement(name = "CommentText")
    public Object commentText;

    @XmlElement(name = "Extension")
    private Extension extension;

    @XmlElement(name = "NameTxt")
    private String nameTxt;

    @XmlElement(name = "SymbolAnnotationTxt")
    public Object symbolAnnotationTxt;

    @XmlElement(name = "PlanningIndCode")
    private String planningIndCode;

    @XmlElement(name = "ProgressCode")
    private String progressCode;

    @XmlElement(name = "PlndStartDttm")
    private String plndStartDttm;

    @XmlElement(name = "PlndEndDttm")
    private String plndEndDttm;

    @XmlElement(name = "ns0")
    public String ns0;

    @XmlElement(name = "ns1")
    public String ns1;

    @XmlElement(name = "ns2")
    public String ns2;

    @XmlElement(name = "ns3")
    public String ns3;

    @XmlElement(name = "xsi")
    public String xsi;

    @XmlElement(name = "schemaLocation")
    public String schemaLocation;

    @XmlElement(name = "uri")
    private String uri;

    @XmlElement(name = "Source")
    private String source;

    @XmlElement(name = "text")
    private String text;

}

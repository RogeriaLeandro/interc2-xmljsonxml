package br.mil.md.sc1.interc2xmljsonxml.model.aux;

import lombok.*;

import javax.xml.bind.annotation.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@XmlRootElement(name = "Metadata")
@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata {

    @XmlElement(name = "Classification")
    private Classification classification;

    @XmlElement(name = "ReportingDatetime")
    private Date reportingDatetime;

    @XmlElement(name = "EffectiveDatetimeStart")
    private Date effectiveDatetimeStart;

    @XmlElement(name = "EffectiveDatetimeEnd")
    private Date effectiveDatetimeEnd;

}

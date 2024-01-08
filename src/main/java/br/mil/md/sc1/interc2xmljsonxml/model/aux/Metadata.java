package br.mil.md.sc1.interc2xmljsonxml.model.aux;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Metadata {

    @XmlAttribute(name = "Classification")
    private Classification classification;

    @XmlAttribute(name = "ReportingDatetime")
    private String reportingDatetime;

    @XmlAttribute(name = "EffectiveDatetimeStart")
    private String effectiveDatetimeStart;

    @XmlAttribute(name = "EffectiveDatetimeEnd")
    private String effectiveDatetimeEnd;

}

package br.mil.md.sc1.interc2xmljsonxml.model.aux;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@XmlRootElement(name = "Classification")
@XmlAccessorType(XmlAccessType.FIELD)
public class Classification {

    @XmlAttribute(name = "LvlCode")
    private String lvlCode;
}

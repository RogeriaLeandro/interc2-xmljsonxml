package br.mil.md.sc1.interc2xmljsonxml.model.aux;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@XmlRootElement(name = "VerticalPoint")
@XmlAccessorType(XmlAccessType.FIELD)
public class VerticalPoint {

    private String latCoord;

    private String longCoord;
}

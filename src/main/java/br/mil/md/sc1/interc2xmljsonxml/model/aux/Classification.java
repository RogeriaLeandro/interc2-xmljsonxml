package br.mil.md.sc1.interc2xmljsonxml.model.aux;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Classification {

    @XmlAttribute(name = "LvlCode")
    private String lvlCode;
}

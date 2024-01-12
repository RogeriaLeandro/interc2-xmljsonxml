package br.mil.md.sc1.interc2xmljsonxml.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;

@Entity
@XmlRootElement (name = "Customer", namespace = "urn:br.mil.sd1.interc2xmljsonxml")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Customer {
    @Id
    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "Name", namespace = "urn:br.mil.sd1.interc2xmljsonxml")
    private String name;

    @XmlElement(name = "Age", namespace = "urn:br.mil.sd1.interc2xmljsonxml")
    private int age;


}
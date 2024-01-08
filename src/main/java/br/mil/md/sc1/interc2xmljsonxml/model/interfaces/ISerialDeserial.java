package br.mil.md.sc1.interc2xmljsonxml.model.interfaces;

public interface ISerialDeserial {

    public Object xmlToJava(String xml);
    public String javaToJson(Object object);
    public Object jsonToJava(String json);
    public String javaToXml(Object object);

}

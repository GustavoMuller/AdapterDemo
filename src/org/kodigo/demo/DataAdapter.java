package org.kodigo.demo;

public class DataAdapter extends Data implements ICompatible {

    @Override
    public String getData(){
        String xml = jsonToXml(getJson());
        System.out.println("Adapter calls service...");
        String returnedXML = service.getData(xml);
        return xmlToJson(returnedXML);
    }

    @Override
    public String jsonToXml(String json){
        System.out.println("Adapter converts JSON to XML...");
        return json.replace("JSON", "XML");
    }

    @Override
    public String xmlToJson(String xml){
        System.out.println("Adapter converts XML to JSON...");
        return xml.concat(" converted to JSON");
    }
}

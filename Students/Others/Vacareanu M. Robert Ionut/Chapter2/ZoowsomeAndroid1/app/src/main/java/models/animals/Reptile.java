package models.animals;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
    Reptile(double maintenanceCost, double dangerPerc) {
        super(maintenanceCost, dangerPerc);
    }

    private Boolean layEggs;

    Reptile(int nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
            Boolean layEggs) {
        super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
        this.layEggs = layEggs;
    }

    public Boolean getLayEggs() {
        return this.layEggs;
    }

    public void setLayEggs(Boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        String attributes = new String();
        attributes = attributes + super.toString();
        attributes = attributes + "Eggs: " + this.getLayEggs() + "\n\n";

        return attributes;
    }

    public void printAllAttributes() {
        System.out.println(this.toString());
    }

/*    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "layEggs", String.valueOf(getLayEggs()));
    }*/

    public void decodeFromXml(Element element) {
        super.decodeFromXml(element);
        setLayEggs(Boolean.valueOf(element.getElementsByTagName("layEggs").item(0).getTextContent()));
    }
}
package models.animals;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Monkey extends Mammal {
    private static long counter;
    private final long id = counter++;

    public Monkey(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost,
                  double dangerPerc, boolean takenCareOf) {
        super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, normalBodyTemp, percBodyHair);
    }

    // Keep the order from above;
    public Monkey(List<String> attributes) {
        super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
                Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)), Float.valueOf(attributes.get(0)),
                Float.valueOf(attributes.get(1)));
    }

    public Monkey() {
        super(3, 0.25);
        setName("Monkey" + id);
        setNrOfLegs(2);
        setNormalBodyTemp(37);
        setPercBodyHair(0.99f);
    }

    public Monkey(String name) {
        super(3, 0.25);
        setName(name);
        setNrOfLegs(2);
        setNormalBodyTemp(37);
        setPercBodyHair(0.99f);
    }

    public Monkey(int legs, float bodyTemp, float bodyHair) {
        super(3, 0.25);
        setName("Monkey" + id);
        setNrOfLegs(legs);
        setNormalBodyTemp(bodyTemp);
        setPercBodyHair(bodyHair);
    }

    @Override
    public double getPredisposition() {

        Calendar date = GregorianCalendar.getInstance();
        if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            return 0.2;
        } else {
            return 0;
        }
    }

/*    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
    }*/
}

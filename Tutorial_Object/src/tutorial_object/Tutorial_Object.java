package tutorial_object;

public class Tutorial_Object {

    public static void main(String[] args) {
        //  Person p = new Person("Håkon", "Smørvik", "Furry");
        Person p = new Person("Håkon", "Smørvik", "Mann");
        p.setFornavn("Carl");
        Boks b = new Boks();
        b.setFarge("brun");
        Person person = new Person("Oscar", "Vladau-Husevold", "Mann", b);
        p.setEtternavn("spaghetti");
        Boks a = p.getBoks();
        p.setBoks(person);
        p.setKjønn("spaghetti");
        p.setKjønn("Kvinne");
        System.out.println(p.toString());
        System.out.println(person.toString());
        System.out.println(p.getBoks() == person.getBoks());
        System.out.println(p.getBoks().equals(person.getBoks()));
        p.setBoks(b);
        System.out.println(p.getBoks() == person.getBoks());
        System.out.println(p.compareTo(person));

    }

}

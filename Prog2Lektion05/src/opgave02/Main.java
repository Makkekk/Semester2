package opgave02;



public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));
        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

        System.out.println("Første person i listen med alderen 44: " + peopleArray.findFirst(p -> p.getAge() == 44));
        System.out.println("Find første person, hvis nav starter med S: " + peopleArray.findFirst(p -> p.getName().startsWith("S")));
        System.out.println("Find første person i listen, hvis navn indeholder mere end et i: " + peopleArray.findFirst(p -> p.getName().indexOf('i') != p.getName().lastIndexOf('i')));
        System.out.println("Find personer, hvis alder er lig længden af navnet: " + peopleArray.findAll(p -> p.getAge() == p.getName().length()));
        System.out.println("Find alle personer, hvis navn indeholder et 'I': " + peopleArray.findAll(p -> p.getName().toLowerCase().contains("i")));
        System.out.println("Find alle personer hvis navn starter med S: " + peopleArray.findAll(p -> p.getName().startsWith("S")));
        System.out.println("Find alle personer, hvis navn har længden 5: " + peopleArray.findAll(p -> p.getName().length() == 5));


    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
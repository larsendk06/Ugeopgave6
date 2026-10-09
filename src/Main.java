import java.util.ArrayList;
public class Main {
/*
    public static void main(String[] args) {

        // Opret bygning
        Building building = new Building("Kontorbygning");


        //Mødelokale

        Room meetingRoom = new Room("Mødelokale");

        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(100));

        meetingRoom.addWindow(new Window(120, 90));
        meetingRoom.addWindow(new Window(120, 90));

        building.addRoom(meetingRoom);


        //Køkken

        Room kitchen = new Room("Køkken");

        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));

        kitchen.addWindow(new Window(60, 60));

        building.addRoom(kitchen);


        //Kontor

        Room office = new Room("Kontor");

        office.addLamp(new Lamp(75));
        office.addLamp(new Lamp(75));
        office.addLamp(new Lamp(90));

        office.addWindow(new Window(100, 120));

        building.addRoom(office);


        // Print hele bygningen
        building.printBuilding();


        // Svar på spørgsmålene
        System.out.println();
        System.out.println("Hvor mange lamper er der i hele bygningen?");
        System.out.println(building.getTotalLampCount());

        System.out.println();

        System.out.println("Hvad er det samlede wattal?");
        System.out.println(building.getTotalWatt() + "W");
    }
 */


        public static void main(String[] args) {

            ArrayList<Animal> animals = new ArrayList<>();

            Animal Bassil = new Lion("Bassil", 80);
            Animal Balto = new Lion("Balto", 70);
            Animal wolf = new Wolf("Frede", 75);
            Animal rabbit = new Rabbit("Bailey", 100);

            animals.add(Bassil);
            animals.add(Balto);
            animals.add(wolf);
            animals.add(rabbit);

            System.out.println("Alle dyr:");

            for (Animal animal : animals) {
                System.out.println(animal);
            }

            System.out.println();

            // Kamp 1
            Contest contest1 = new Contest(Bassil, rabbit);

            while (Bassil.isActive() && rabbit.isActive()) {
                contest1.playRound();
            }

            Animal winner1 = contest1.getWinner();

            if (winner1 != null) {
                System.out.println("Vinderen er: " + winner1.getName());
            }

            System.out.println();
            System.out.println("----------------------");
            System.out.println();

            // Kamp 2
            Contest contest2 = new Contest(Balto, wolf);

            while (Balto.isActive() && wolf.isActive()) {
                contest2.playRound();
            }

            Animal winner2 = contest2.getWinner();

            if (winner2 != null) {
                System.out.println("Vinderen er: " + winner2.getName());
            }
        }
    }

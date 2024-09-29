package lab02;

public class Scenario {
    public static void main(String[] args) {
        // Create Jack's soda cans
        SodaCan rootBeer = new SodaCan("Root Beer");
        SodaCan gingerAle = new SodaCan("Ginger Ale");

        // Create Jill's soda cans
        SodaCan cherry = new SodaCan("Cherry");
        SodaCan grape = new SodaCan("Grape");

        // Create Jack and Jill as Person objects
        Person jack = new Person("Jack");
        Person jill = new Person("Jill");

        // Debugging print statements
        System.out.println("Jack's name: " + jack.getName());  // Should print "Jack"
        System.out.println("Jill's name: " + jill.getName());  // Should print "Jill"

        // Jack opens his RootBeer and gives it to Jill, Jill drinks it all
        rootBeer.open();
        while (rootBeer.getAmount() > 0) {
            jill.gulpFrom(rootBeer);
        }

        // Jack asks Jill if she is still thirsty
        System.out.println(jack.getName() + ": Are you still thirsty?");
        System.out.println(jill.getName() + ": " + jill.getThirstStatus());

        // Jill opens her Cherry soda and drinks until satisfied
        cherry.open();
        while (!jill.getThirstStatus().equals("satisfied")) {
            jill.gulpFrom(cherry);
        }

        // Jill gives Cherry soda to Jack, who takes a sip and doesn't like it
        jack.sipFrom(cherry);
        System.out.println(jack.getName() + ": I don't like this soda!");

        // Jill checks how much soda is left but decides not to drink any more
        System.out.println(jill.getName() + ": There is " + cherry.getAmount() + "cc left in the Cherry soda, but I won't drink more.");

        // Jack asks Jill if he can try her Grape soda, and he drinks about half
        grape.open();
        jack.gulpFrom(grape);
        jack.gulpFrom(grape);

        // Jack tells Jill how he feels
        System.out.println(jack.getName() + ": I'm " + jack.getThirstStatus() + " now.");

        // Finally, they check the amount of soda left in all cans
        System.out.println("Amount left in Root Beer: " + rootBeer.getAmount() + "cc");
        System.out.println("Amount left in Ginger Ale: " + gingerAle.getAmount() + "cc");
        System.out.println("Amount left in Cherry soda: " + cherry.getAmount() + "cc");
        System.out.println("Amount left in Grape soda: " + grape.getAmount() + "cc");
    }
}

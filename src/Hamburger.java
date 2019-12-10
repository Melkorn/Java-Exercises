<<<<<<< HEAD
public class Hamburger {
    private String breadRollType;
    private String meatType;
    private int lettuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int fries = 0;

    private int basePrice = 15;
    private int lettucePrice = 3;
    private int tomatoPrice = 2;
    private  int carrotPrice = 2;
    private int friesPrice = 4;


    public Hamburger(String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
    }

    public void addLettuce(){
    this.lettuce ++;
    }

    public void addTomato(){
        this.tomato ++;
    }

    public void addCarrot(){
        this.carrot ++;
    }

    public void addFries(){
        this.fries ++;
    }

    public void showPrice(){
        System.out.println("Burger price:" + basePrice);
        System.out.println("Additions: ");
        System.out.println("Lettuce: " + lettuce + "price (each)" + lettucePrice + ". Total: " + lettucePrice*lettuce);
        System.out.println("Tomato: " + tomato + "price (each)" + tomatoPrice + ". Total: " + tomatoPrice*tomato);
        System.out.println("Carrot: " + carrot + "price (each)" + carrotPrice + ". Total: " + carrotPrice*carrot);
        System.out.println("Fries: " + lettuce + "price (each)" + friesPrice + ". Total: " + friesPrice*fries);
        System.out.println("Total: " + (basePrice+lettucePrice*lettuce+tomatoPrice*tomato+carrotPrice*carrot+friesPrice*fries);
    }

    class HealthyBurger extends Hamburger{
        private int onion = 0;
        private int egg = 0;
        private int onionPrice = 2;
        private int eggPrice = 4;

        @Override
        public void showPrice() {
            System.out.println("Burger price:" + basePrice);
            System.out.println("Additions: ");
            System.out.println("Lettuce: " + lettuce + "price (each)" + lettucePrice + ". Total: " + lettucePrice*lettuce);
            System.out.println("Tomato: " + tomato + "price (each)" + tomatoPrice + ". Total: " + tomatoPrice*tomato);
            System.out.println("Carrot: " + carrot + "price (each)" + carrotPrice + ". Total: " + carrotPrice*carrot);
            System.out.println("Fries: " + lettuce + "price (each)" + friesPrice + ". Total: " + friesPrice*fries);
            System.out.println("Onion: " + onion + "price (each)" + onionPrice + ". Total: " + onionPrice*onion);
            System.out.println("Egg: " + egg + "price (each)" + eggPrice + ". Total: " + eggPrice*egg);
            System.out.println("Total: " + (basePrice+lettucePrice*lettuce+tomatoPrice*tomato+carrotPrice*carrot+friesPrice*fries+eggPrice*egg+onion*onionPrice);
        }

        public void addOnion(){
            this.onion ++;
        }

        public void addEgg(){
            this.egg ++;
        }
        public HealthyBurger(String breadRollType, String meatType) {
            super(breadRollType, meatType);
        }


    }

    class DeluxeBurger extends Hamburger{
        private int drink = 1;
        private int chips = 1;
        private int drinkPrice = 4;
        private int chipsPrice = 4;

        @Override
        public void showPrice() {
            System.out.println("Burger price:" + basePrice);
            System.out.println("Additions: ");
            System.out.println("Drink: " + drink + "price (each)" + drinkPrice + ". Total: " + drinkPrice*drink);
            System.out.println("Chips: " + chips + "price (each)" + chipsPrice + ". Total: " + chipsPrice*chips);
            System.out.println("Total: " + (basePrice + chipsPrice*chips+drink*drinkPrice);
        }

        public DeluxeBurger(String breadRollType, String meatType) {
            super(breadRollType, meatType);
        }
    }

}


// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
//////// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
=======
public class Hamburger {
    private String breadRollType;
    private String meatType;
    private int lettuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int fries = 0;

    private int basePrice = 15;
    private int lettucePrice = 3;
    private int tomatoPrice = 2;
    private  int carrotPrice = 2;
    private int friesPrice = 4;


    public Hamburger(String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
    }

    public void addLettuce(){
    this.lettuce ++;
    }

    public void addTomato(){
        this.tomato ++;
    }

    public void addCarrot(){
        this.carrot ++;
    }

    public void addFries(){
        this.fries ++;
    }

    public void showPrice(){
        System.out.println("Burger price:" + basePrice);
        System.out.println("Additions: ");
        System.out.println("Lettuce: " + lettuce + "price (each)" + lettucePrice + ". Total: " + lettucePrice*lettuce);
        System.out.println("Tomato: " + tomato + "price (each)" + tomatoPrice + ". Total: " + tomatoPrice*tomato);
        System.out.println("Carrot: " + carrot + "price (each)" + carrotPrice + ". Total: " + carrotPrice*carrot);
        System.out.println("Fries: " + lettuce + "price (each)" + friesPrice + ". Total: " + friesPrice*fries);
        System.out.println("Total: " + (basePrice+lettucePrice*lettuce+tomatoPrice*tomato+carrotPrice*carrot+friesPrice*fries);
    }

    class HealthyBurger extends Hamburger{
        private int onion = 0;
        private int egg = 0;
        private int onionPrice = 2;
        private int eggPrice = 4;

        @Override
        public void showPrice() {
            System.out.println("Burger price:" + basePrice);
            System.out.println("Additions: ");
            System.out.println("Lettuce: " + lettuce + "price (each)" + lettucePrice + ". Total: " + lettucePrice*lettuce);
            System.out.println("Tomato: " + tomato + "price (each)" + tomatoPrice + ". Total: " + tomatoPrice*tomato);
            System.out.println("Carrot: " + carrot + "price (each)" + carrotPrice + ". Total: " + carrotPrice*carrot);
            System.out.println("Fries: " + lettuce + "price (each)" + friesPrice + ". Total: " + friesPrice*fries);
            System.out.println("Onion: " + onion + "price (each)" + onionPrice + ". Total: " + onionPrice*onion);
            System.out.println("Egg: " + egg + "price (each)" + eggPrice + ". Total: " + eggPrice*egg);
            System.out.println("Total: " + (basePrice+lettucePrice*lettuce+tomatoPrice*tomato+carrotPrice*carrot+friesPrice*fries+eggPrice*egg+onion*onionPrice);
        }

        public void addOnion(){
            this.onion ++;
        }

        public void addEgg(){
            this.egg ++;
        }
        public HealthyBurger(String breadRollType, String meatType) {
            super(breadRollType, meatType);
        }


    }

    class DeluxeBurger extends Hamburger{
        private int drink = 1;
        private int chips = 1;
        private int drinkPrice = 4;
        private int chipsPrice = 4;

        @Override
        public void showPrice() {
            System.out.println("Burger price:" + basePrice);
            System.out.println("Additions: ");
            System.out.println("Drink: " + drink + "price (each)" + drinkPrice + ". Total: " + drinkPrice*drink);
            System.out.println("Chips: " + chips + "price (each)" + chipsPrice + ". Total: " + chipsPrice*chips);
            System.out.println("Total: " + (basePrice + chipsPrice*chips+drink*drinkPrice);
        }

        public DeluxeBurger(String breadRollType, String meatType) {
            super(breadRollType, meatType);
        }
    }

}


// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
//////// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
>>>>>>> c148b0e8dd53663e420d044eed3b6dda6a3b09ce
// adding totals to final price.
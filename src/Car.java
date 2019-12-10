<<<<<<< HEAD
public class Car {
    private int wheels;
    private boolean engine;
    private int cylinders;
    private String name;


    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        if(this.engine == true){
            System.out.println("engine started");
        }else System.out.println("No engine to start");

    }

    public void accelerate(){
        System.out.println(name + " is going faster now");
    }
}

class Mustang extends Car {

    public Mustang(int cylinders, String name) {

        super(cylinders, name);
    }
}

class Porsche extends Car {

    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }
}

class Volvo extends Car {

    public Volvo(int cylinders, String name) {

        super(cylinders, name);
    }
}

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
=======
public class Car {
    private int wheels;
    private boolean engine;
    private int cylinders;
    private String name;


    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        if(this.engine == true){
            System.out.println("engine started");
        }else System.out.println("No engine to start");

    }

    public void accelerate(){
        System.out.println(name + " is going faster now");
    }
}

class Mustang extends Car {

    public Mustang(int cylinders, String name) {

        super(cylinders, name);
    }
}

class Porsche extends Car {

    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }
}

class Volvo extends Car {

    public Volvo(int cylinders, String name) {

        super(cylinders, name);
    }
}

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
>>>>>>> c148b0e8dd53663e420d044eed3b6dda6a3b09ce
// put all classes in the one java file (this one).
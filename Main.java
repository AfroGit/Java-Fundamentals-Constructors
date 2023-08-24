// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");
//   }
// }
/* Constructor declarations look like method declarations—except that they use the name of the class and have no return type. For example, Bicycle has one constructor: */ 

//   public Bicycle(int startCadence, int startSpeed, int startGear) {
//     gear = startGear;
//     cadence = startCadence;
//     speed = startSpeed;
// }

// Bicycle roverBike = new Bicycle(30, 0, 8);
// a constructor is called by the new operator.
// creates space in memory for the object and initializes its fields

// You can use access modifiers in a constructor's declaration to control which other classes can call the constructor.

// The compiler automatically provides a no-argument, default constructor for any class without constructors. This default constructor will call the no-argument constructor of the superclass. In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does. If your class has no explicit superclass, then it has an implicit superclass of Object, which does have a no-argument constructor.
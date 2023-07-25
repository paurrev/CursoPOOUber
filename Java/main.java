class Main {
  public static void main(String[] args) {
    System.out.println("hola mundo");
    Car car = new Car();
    car.id = 1;
    car.driver = "Marco Hanz";
    car.license = "PDG3123";
    car.passengers = 4;
    car.printCar();

    Car car2 = new Car();
    car2.id = 2;
    car2.driver = "Andres Lopez";
    car2.license = "PTE3091";
    car2.passengers = 4;
    car2.printCar();
  }
}
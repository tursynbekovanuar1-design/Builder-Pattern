    package builder;

    public class Main {

        public static void main(String[] args) {

            CarDirector director = new CarDirector();

            // Build a sports car
            CarBuilder sportsBuilder = new SportsCarBuilder();
            Car sportsCar = director.buildSportsCar(sportsBuilder);

            // Build a family car
            CarBuilder familyBuilder = new FamilyCarBuilder();
            Car familyCar = director.buildFamilyCar(familyBuilder);

            // Display results
            System.out.println("Sports car:");
            System.out.println(sportsCar);

            System.out.println();

            System.out.println("Family car:");
            System.out.println(familyCar);
        }
    } 

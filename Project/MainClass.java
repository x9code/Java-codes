class Restaurant {
    String name;
    String loc;
    double rating;
    static double delfees = 30;
    static String appName = "j-eats";

    // No-arg constructor
    public Restaurant() {
    }

    // Parameterized constructor
    public Restaurant(String name, String loc, double rating) {
        this.name = name;
        this.loc = loc;
        this.rating = rating;
    }

    public void showDetails() {
        System.out.println("Appname: " + appName);
        System.out.println("delfees: " + delfees);
        System.out.println("name: " + name);
        System.out.println("loc: " + loc);
        System.out.println("rating: " + rating);
        System.out.println();
    }
}

class MainClass {
    public static void main(String[] args) {
        Restaurant ref1 = new Restaurant("PizzaHut", "Hebbal", 4.1);
        ref1.showDetails();

        Restaurant ref2 = new Restaurant();
        ref2.name = "Dominos";
        ref2.loc = "Hebbal";
        ref2.rating = 4.3;
        ref2.showDetails();
    }
}

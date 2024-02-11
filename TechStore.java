import java.util.*;

class Laptop {
    private String model;
    private int ramGB;
    private int hddGB;
    private String operatingSystem;
    private String color;

    public Laptop(String model, int ramGB, int hddGB, String operatingSystem, String color) {
        this.model = model;
        this.ramGB = ramGB;
        this.hddGB = hddGB;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRamGB() {
        return ramGB;
    }

    public int getHddGB() {
        return hddGB;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }
}

public class TechStore {
    private Set<Laptop> laptops;

    public TechStore(Set<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void findMatchingLaptops() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome my show we have for you the best price and the best quality Laptops");
        System.out.println("");

        System.out.println("We have(MacBook, Acer, Dell, Lenova, HP, Asus, LG )");
        System.out.println("");

        System.out.println("Enter parameters for laptop search");

        System.out.println("");

        System.out.println("We have (8 ,16 ,32) GB Ram choose one of them");
        System.out.print("Minimum RAM (GB): ");
        int minRamGB = scanner.nextInt();

        System.out.println("");

        System.out.println("Dear User choose which storage you want we have (200, 500 ,1000) GB");

        System.out.println("");

        System.out.print("Minimum HDD capacity (GB): ");
        int minHddGB = scanner.nextInt();

        System.out.println("");

        System.out.println("We have three (MacOS) laptop ");
        System.out.println("And we have three (Windows) laptops ");
        System.out.println("Also we have three (Linux) laptop");

        System.out.println("");

        System.out.print("Operating system: ");
        String operatingSystem = scanner.next();

        System.out.println("");

        System.out.println(
                "My man it's last step you should choose which color will be your laptop so we have (Black, White, and Silver)");

        System.out.println("");

        System.out.print("Color: ");
        String color = scanner.next();

        System.out.println("So so so my mate we finish :) ");

        filterLaptops(minRamGB, minHddGB, operatingSystem, color);
    }

    public void filterLaptops(int minRamGB, int minHddGB, String operatingSystem, String color) {
        laptops.stream()
                .filter(laptop -> laptop.getRamGB() >= minRamGB &&
                        laptop.getHddGB() >= minHddGB &&
                        laptop.getOperatingSystem().equalsIgnoreCase(operatingSystem) &&
                        laptop.getColor().equalsIgnoreCase(color))
                .forEach(laptop -> System.out.println("Matching laptop: " + laptop.getModel()));
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("MacBook Pro", 8, 200, "MacOS", "Black");
        Laptop laptop2 = new Laptop("MacBook Pro", 16, 500, "MacOS", "Silver");
        Laptop laptop3 = new Laptop("MacBook Pro", 32, 200, "MacOS", "White");

        Laptop laptop4 = new Laptop("MacBook Air", 8, 200, "MacOS", "Silver");
        Laptop laptop5 = new Laptop("MacBook Air", 16, 500, "MacOS", "Black");
        Laptop laptop6 = new Laptop("MacBook Air", 32, 1000, "MacOS", "White");

        Laptop laptop7 = new Laptop("MacBook", 8, 200, "MacOS", "Black");
        Laptop laptop8 = new Laptop("MacBook", 16, 500, "MacOS", "Silver");
        Laptop laptop9 = new Laptop("MacBook", 32, 1000, "MacOS", "White");

        Laptop laptop10 = new Laptop("Acer Aspire", 8, 200, "Windows", "Black");
        Laptop laptop11 = new Laptop("Acer Aspire", 16, 500, "Windows", "Silver");
        Laptop laptop12 = new Laptop("Acer Aspire", 32, 1000, "Windows", "White");

        Laptop laptop13 = new Laptop("Dell XPS", 8, 200, "Windows", "Black");
        Laptop laptop14 = new Laptop("Dell XPS", 16, 500, "Windows", "Silver");
        Laptop laptop15 = new Laptop("Dell XPS", 32, 1000, "Windows", "White");

        Laptop laptop16 = new Laptop("Lenovo ThinkPad", 8, 200, "Windows", "Black");
        Laptop laptop17 = new Laptop("Lenovo ThinkPad", 16, 500, "Windows", "Silver");
        Laptop laptop18 = new Laptop("Lenovo ThinkPad", 32, 1000, "Windows", "White");

        Laptop laptop19 = new Laptop("HP Pavilion", 8, 200, "Linux", "Black");
        Laptop laptop20 = new Laptop("HP Pavilion", 16, 500, "Linux", "Silver");
        Laptop laptop21 = new Laptop("HP Pavilion", 32, 1000, "Linux", "White");

        Laptop laptop22 = new Laptop("Asus ZenBook", 8, 200, "Linux", "Black");
        Laptop laptop23 = new Laptop("Asus ZenBook", 16, 500, "Linux", "Silver");
        Laptop laptop24 = new Laptop("Asus ZenBook", 32, 1000, "Linux", "White");

        Laptop laptop25 = new Laptop("LG Gram", 8, 200, "Linux", "Black");
        Laptop laptop26 = new Laptop("LG Gram", 16, 500, "Linux", "Silver");
        Laptop laptop27 = new Laptop("LG Gram", 32, 1000, "Linux", "White");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop7, laptop8, laptop9,
                laptop10, laptop11, laptop12, laptop13, laptop14, laptop15, laptop16, laptop17, laptop18, laptop19,
                laptop20, laptop21, laptop22, laptop23, laptop24, laptop25, laptop26, laptop27));

        TechStore techStore = new TechStore(laptops);

        techStore.findMatchingLaptops();
    }
}

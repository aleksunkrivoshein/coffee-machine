import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    public void makeEspresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 250;
            beans = beans - 16;
            cups = cups - 1;
            money = money + 4;
            System.out.println();
        } else {
            System.out.println("I can't make a cup of coffee.");
            System.out.println();
        }

    }
    public void makeLatte() {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 350;
            milk = milk - 75;
            beans = beans - 20;
            cups = cups - 1;
            money = money + 7;
            System.out.println();
        } else {
            System.out.println("I can't make a cup of coffee.");
            System.out.println();
        }
    }
    public void makeCappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water = water - 200;
            milk = milk - 100;
            beans = beans - 12;
            cups = cups - 1;
            money = money + 6;
            System.out.println();
        } else {
            System.out.println("I can't make a cup of coffee.");
            System.out.println();
        }

    }
    public void print (int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
    public void buy() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String num = scanner.next();
        switch (num) {
            case "1":
                coffeeMachine.makeEspresso();
                break;
            case "2":
                coffeeMachine.makeLatte();
                break;
            case "3":
                coffeeMachine.makeCappuccino();
                break;
            case "back":
                System.out.println();
                return;
            default:
                System.out.println("error");
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int w = scanner.nextInt();
        water = water + w;
        System.out.println("Write how many ml of milk do you want to add:");
        int m = scanner.nextInt();
        milk = milk + m;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int b = scanner.nextInt();
        beans = beans + b;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int c = scanner.nextInt();
        cups = cups + c;
        System.out.println();

    }
    public void take() {

        System.out.println("I gave you " + money);
        money = 0;
        System.out.println();
    }

    public static void input() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            if(action.equals("exit")) {
                break;
            }
            System.out.println();

            switch (action) {
                case "buy":
                    coffeeMachine.buy();
                    break;
                case "fill":
                    coffeeMachine.fill();
                    break;
                case "take":
                    coffeeMachine.take();
                    break;
                case "remaining":
                    coffeeMachine.print(water, milk, beans, cups, money);
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
    public static void main(String[] args) {
        input();


    }
}

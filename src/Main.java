public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        System.out.println("+-----------------------------+");
        System.out.println("|  Find toy by price        |");
        System.out.println(toyShop.findToysByPrice(2.50,6.00));
        System.out.println("+-----------------------------+");
        System.out.println("| Find toy by name    |");
        System.out.println(toyShop.findToyByName("Football ball"));
        System.out.println("+-----------------------------+");
        System.out.println("| Calculate total value       |");
        System.out.println(toyShop.calculateTotalValue());
        System.out.println("+-----------------------------+");
        System.out.println("| Sort toy by price      |");
        toyShop.sortToysByPrice().forEach(System.out::println);
        System.out.println("+-----------------------------+");
        System.out.println("Sort toy by name");
        toyShop.sortToysByName().forEach(System.out::println);
        System.out.println("Get toy with max price");
//        System.out.println(toyShop.findMostExpensiveToy());

    }
}
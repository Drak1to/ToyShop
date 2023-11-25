
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class ToyShop {
    private List<Toy> toyList = new ArrayList<>();

    public ToyShop() {
        toyList.add(new Toy("Soldiers", 5.00, 60));
        toyList.add(new Toy("Football ball", 3.50, 100));
        toyList.add(new Toy("Cars", 1.1, 35));
        toyList.add(new Toy("Planes", 1.2, 40));
        toyList.add(new Toy("Toy cats", 0.5, 30));
        toyList.add(new Toy("Robots", 2.5, 50));

        toyList.forEach(System.out::println);
    }
    public List<Toy> findToysByPrice(double minPrice, double maxPrice){
            return toyList
                    .stream()
                    .filter(t -> t.getPrice() >= minPrice && t.getPrice() <= maxPrice)
                    .collect(Collectors.toList());
    }
    public List<Toy> findToyByName(String name) {
        return toyList
                .stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
       
    }
    public int calculateTotalValue(){
        return toyList
                .stream()
                .mapToInt(Toy::getQuantity)
                .sum();
    }
    public List<Toy> sortToysByPrice(){
        return toyList
                .stream()
                .sorted(Comparator.comparingDouble(Toy::getPrice))
                .collect(Collectors.toList());
    }
    public List<Toy> sortToysByName(){
        return toyList
                .stream()
                .sorted(Comparator.comparing(Toy::getName))
                .collect(Collectors.toList());
    }
    public List<Toy> findToysByQuantity(int minQuantity, int maxQuantity){
        return toyList
                .stream()
                .filter(t -> t.getQuantity() >= minQuantity && t.getPrice() <= maxQuantity)
                .collect(Collectors.toList());
    }
//    public Optional<Toy> findMostExpensiveToy(){
//        return toyList
//                .stream()
//                .sorted(Comparator.comparingDouble(Toy::getPrice ) )
//                .collect(Collectors.toList());
//    }
}

package tech.itpark.manager;
import tech.itpark.model.Flat;
import java.util.ArrayList;

public class FlatManager {
    private ArrayList<Flat> items = new ArrayList<>();
    private int nextId = 1;
    public Flat save(Flat item){
        if (item.getId() == 0){
            item.setId(nextId);
            nextId++;
            items.add(item);
            return item;
        }
        for (Flat flat : items){
            if (flat.getId() != item.getId()){
                continue;
            }
            flat.setFloor(item.getFloor());
            flat.setDistrict(item.getDistrict());
            flat.setNumberOfRooms(item.getNumberOfRooms());
            flat.setPrice(item.getPrice());
        }
        return null;
    }
    public ArrayList<Flat> search (ArrayList<String> districts, int minPrice, int maxPrice, int minRooms, int maxRooms, int checkFloor){
        ArrayList<Flat> result = new ArrayList<>();
        for (Flat item : items) {
            if ((item.getPrice() < minPrice) && (item.getPrice() > maxPrice)) {
                continue;
            }
            if ((item.getNumberOfRooms() < minRooms) && (item.getNumberOfRooms() > maxRooms)) {
                continue;
            }
            if (item.getFloor() != checkFloor) {
                continue;
            }
            if (!districts.contains(item.getDistrict())) {
                continue;
            }
                result.add(item);
        }
        return result;
    }
}

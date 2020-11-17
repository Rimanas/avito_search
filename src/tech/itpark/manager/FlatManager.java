package tech.itpark.manager;

import tech.itpark.model.Flat;

import java.util.ArrayList;
import java.util.List;

public class FlatManager {
    private List<Flat> items = new ArrayList<>();
    private int nextId = 1;

    public Flat save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
            return item;
        }
        for (Flat flat : items) {
            if (flat.getId() != item.getId()) {
                continue;
            }
            flat.setFloor(item.getFloor());
            flat.setDistrict(item.getDistrict());
            flat.setNumberOfRooms(item.getNumberOfRooms());
            flat.setPrice(item.getPrice());
            flat.setId(item.getId());
            return item;
        }
        return null;
    }

    public List<Flat> search(List<String> districts, int minPrice, int maxPrice, int minRooms, int maxRooms, int checkFloor) {
        List<Flat> result = new ArrayList<>();
        for (Flat item : items) {
            if ((item.getPrice() < minPrice) || (item.getPrice() > maxPrice)) {
                continue;
            }
            if ((item.getNumberOfRooms() < minRooms) || (item.getNumberOfRooms() > maxRooms)) {
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

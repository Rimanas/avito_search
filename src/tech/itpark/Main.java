package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> districts = new ArrayList<>();
        districts.add("Ново - Савиновский");
        districts.add("Кировский");
        districts.add("Вахитовский");
        districts.add("Советский");
        districts.add("Московский");
        districts.add("Приволжский");
        districts.add("Авиастроительный");

        List<String> districtSearch = new ArrayList<>();
        districtSearch.add(districts.get(3));
        districtSearch.add(districts.get(2));

        FlatManager manager = new FlatManager();
        manager.save(new Flat(0, districts.get(1), 2_000_000, 2, 1));
        manager.save(new Flat(0, districts.get(2), 3_000_000, 9, 2));
        manager.save(new Flat(0, districts.get(3), 3_000_000, 4, 4));
        manager.save(new Flat(0, districts.get(0), 5_500_000, 3, 3));
        manager.save(new Flat(0, districts.get(4), 3_000_000, 9, 2));

        List<Flat> searchResults = manager.search(districtSearch, 2_500_000, 3_200_000, 2, 4, 4);
        System.out.println(searchResults);
    }
}

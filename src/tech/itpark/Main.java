package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

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
        Flat f1 = manager.save(new Flat(0, districts.get(1), 2_000_000, 2, 1));
        Flat f2 = manager.save(new Flat(0, districts.get(2), 3_000_000, 9, 2));
        Flat f3 = manager.save(new Flat(0, districts.get(3), 3_000_000, 4, 4));
        Flat f4 = manager.save(new Flat(0, districts.get(0), 5_500_000, 3, 3));
        Flat f5 = manager.save(new Flat(0, districts.get(4), 3_000_000, 9, 2));
        Flat f6 = manager.save(new Flat(0, districts.get(2), 3_000_000, 4, 2));

        Flat flat4 = new Flat(4, districts.get(2), 2_500_000, 4, 2);
        Flat f7 = manager.save(flat4);
        if (flat4.getId() == f7.getId()) {
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }

        List<Flat> searchResults = manager.search(districtSearch, 2_500_000, 3_200_000, 2, 4, 4);
        System.out.println(searchResults);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f4);
        System.out.println(f7);
    }
}

package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AssetsRunAPP {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        House LoganVactionHouse = new House("Lake House", "10-01-2020",
                new BigDecimal("250000"),
                "2 walker street, Westbrook ME", 1, 1200, 1000);

        Vehicle oneOfLogansTruck = new Vehicle("Work Truck", "2020-05-15", new BigDecimal("25000.00"),
                "Ford F-150", 2020, 50000);

        //initialize the vehicle
        Vehicle simbaTruck = new Vehicle("Family SUV", "2022-08-10", new BigDecimal("32000.00"),
                "Cadillac Escalade", 2022, 18000);

        assets.add(LoganVactionHouse);
        assets.add(oneOfLogansTruck);
        assets.add(simbaTruck);
        assets.add(new Cash("Mattress money", "2025-01-01", new BigDecimal("500")));

        //iterate through the arraylist
        for (Asset asset : assets) {
            if (asset instanceof Vehicle) {
                System.out.println(asset.getDescription() + "  value " + ((Vehicle) asset).getMakeModel());
            } else if (asset instanceof House) {
                System.out.println(asset.getDescription() + " address " + ((House) asset).getAddress() +
                        " " + ((House) asset).getDescription());
            } else if (asset instanceof Cash) {
                System.out.println(asset.getDescription() + " $" + ((Cash) asset).getValue());

            }


        }
    }
}

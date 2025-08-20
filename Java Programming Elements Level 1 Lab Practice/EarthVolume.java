// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____


public class EarthVolume {
    public static void main(String[] args) {
        // Step 1: Initialize radius of Earth in km
        double radiusKm = 6378;

        // Step 2: Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Step 3: Convert km³ to miles³ (1 mile = 1.60934 km)
        double radiusMiles = radiusKm / 1.60934;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Step 4: Display results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                " and in cubic miles is " + volumeMiles3 + ".");
    }
}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carcsvreader {

    public static void main(String[] args) {
        List<cars> carslist = new ArrayList<>();
        String csvFile = "src/cars.csv";
        try (Scanner scanner = new Scanner(new File(csvFile))) {

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Reading the data lines
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] carData = line.split(",");

                // Creating a Car object
                cars car = new cars(carData[0], carData[1], Integer.parseInt(carData[2]), carData[3],
                        Double.parseDouble(carData[4]), carData[5], Double.parseDouble(carData[6]));

                // Adding the car to the list
                carslist.add(car);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (cars car : carslist) {
            System.out.println(car);
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CVSsort {

    private Set<CSVEntity> entities = new TreeSet<>();

    public void sort(){


        String filePath = "Tst.csv";
        File file = new File(filePath);


        try {
            Scanner inputSc = new Scanner(file);

            while (inputSc.hasNextLine()){
                String line = inputSc.nextLine();
                String[] entityArray = line.split(";");
                if (checkLine(entityArray[0])) {
                    entities.add(new CSVEntity(Integer.valueOf(entityArray[0]), entityArray[1], entityArray[2], entityArray[3], entityArray[4], entityArray[5], entityArray[6], entityArray[7]));
                    System.gc();
                }
                else
                    continue;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(entities);

    }

    public boolean checkLine(String income){

        boolean test = true;
        try {
            Integer.valueOf(income);
        } catch (Exception e){
            test = false;
        }
        return test;
    }

    public Set<CSVEntity> getEntities() {
        return entities;
    }
}

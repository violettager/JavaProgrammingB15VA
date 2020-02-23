package day62_collections4;
import java.util.*;
import java.nio.file.*;
import java.io.*;
public class CSVDataToMap {
    public static void main(String[] args) throws Exception {
        String fileName = "countryCodes.csv"; //filename with path
        File dataFile = new File(fileName);
        System.out.println(dataFile.exists());

        Scanner scan = new Scanner(dataFile);
       // System.out.println(scan.nextLine());
       // System.out.println(scan.nextLine());
        int counter = 1;
        List<String> fileDataList = new ArrayList<>();
        while(scan.hasNextLine()){
            String row = scan.nextLine();
            System.out.println(counter+". "+row);
            fileDataList.add(row);
            counter++;
        }
        scan.close();
        System.out.println(fileName+" contains = "+fileDataList.size()+" rows.");

        System.out.println("-------Read from csv file using new way-------");
        List<String> countryCodesList = Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodesList.size());
        System.out.println(countryCodesList.get(57));

        System.out.println(countryCodesList.toString());

        //how to retrieve unique - non-duplicate country codes?

        Set<String> countryCodeSet   = new HashSet<>(countryCodesList);

        System.out.println("Unique country codes count: "+countryCodeSet.size());
        System.out.println(countryCodeSet.toString());


        //Store each countrycode and country name into HashMap
        //Key-> Country code,Value -> Country name
        Map<String,String> countriesMap = new HashMap<>();
        //loop through countryCodesSet
        for(String eachLine:countryCodeSet) {
            System.out.println(eachLine);
            //split each value with coma
            String[] arr = eachLine.split(","); //RU,Russia
            //store index 0 as a key, and index 1 as a value to the Map
            countriesMap.put(arr[0],arr[1]);
        }
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.toString());

        if(countriesMap.containsValue("Mongolia")){
            System.out.println("mongolia is on the map!");
        }else{
            System.out.println("keep coding java!");
        }
        //PE
        System.out.println(countriesMap.get("PE"));
        System.out.println(countriesMap.get("US"));
        System.out.println(countriesMap.get("UA"));
        System.out.println(countriesMap.get("TR"));
        System.out.println(countriesMap.get("AF"));

        System.out.println("-----Print all values using forEach method+ lambda-----");
        countriesMap.forEach((k,v)-> System.out.println(k+"|"+v));
        System.out.println("-----Print all values using forEach loop-----");
        for(String eachKey: countriesMap.keySet()){
            System.out.println(eachKey+" | "+countriesMap.get(eachKey));

        }
        System.out.println("-----Print all values using iterator and entryset-----");
        for(Map.Entry<String,String>entry:countriesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        String name = "java";
        name = name.toUpperCase();
        System.out.println(name);
    }
}

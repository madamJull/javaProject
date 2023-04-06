package org.example.seminar_6.hw_1.model;

import java.util.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {
    public static List filter(List notebooks, Map filters){
        List filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks){
            boolean allFiltersMatch = true;
            for (String filterKey : filters.keySet()){
                Object filterValue = filters.get(filterKey);
                switch (filterKey){
                    case "name":
                        if(!notebook.getName().equals(filterValue)){
                            allFiltersMatch = false;
                        }
                        break;
                    case "ramSize":
                        if (notebook.getRamSize() != (int) filterValue){
                            allFiltersMatch = false;
                    }
                        break;
                    case "hddSize":
                        if (notebook.getHddSize() != (int) filterValue){
                            allFiltersMatch = false;
                    }
                    break;
                    case "osName":
                        if (!notebook.getOsName().equals(filterValue)){
                            allFiltersMatch = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equals(filterValue)){
                            allFiltersMatch = false;
                        }
                        break;
                }
                if (!allFiltersMatch){
                    break;
                }
            }
            if (allFiltersMatch){
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
    public  Filter(){
        Map filters = new HashMap();
        System.out.println("name");
        System.out.println("ramSize");
        System.out.println("hddSize");
        System.out.println("osName");
        System.out.println("color");
        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();
        String filterKey = "";
        switch (filterNumber){
            case 1:
                filterKey = "name";
                System.out.println("Add name: ");
                String name = scanner.next();
                filters.put(filterKey, name);
                break;
            case 2:
                filterKey = "ramSize";
                System.out.println("Add ramSize: ");
                int ramSize = scanner.nextInt();
                filters.put(filterKey, ramSize);
                break;
            case 3:
                filterKey = "hddSize";
                System.out.println("Add hddSize: ");
                int hddSize = scanner.nextInt();
                filters.put(filterKey, hddSize);
                break;
            case 4:
                filterKey = "osName";
                System.out.println("Add osName: ");
                String osName = scanner.next();
                filters.put(filterKey, osName);
                break;
            case 5:
                filterKey = "color";
                System.out.println("Add color: ");
                String color = scanner.next();
                filters.put(filterKey, color);
                break;
        }
    }
}




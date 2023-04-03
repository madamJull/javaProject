package org.example.seminar_6.hw_1.model;

import java.util.*;

import java.util.HashSet;

public class Filter {
    private ArrayList<Notebook> list;

    public Filter() {
        list = new ArrayList<Notebook>();
    }

    public void addNotebook(Notebook newItem){
        list.add(newItem);
    }

    public ArrayList getNotebookByName(String searchName) {
        ArrayList<Notebook> result = new ArrayList<Notebook>();
        for (Notebook item : list){
            if(item.getName().contains(searchName)){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getNotebookByRam(int searchRamSize) {
        ArrayList<Notebook> result = new ArrayList<Notebook>();
        for (Notebook item : list){
            if(item.getName().equals(searchRamSize)){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getNotebookByHdd(int searchHddSize) {
        ArrayList<Notebook> result = new ArrayList<Notebook>();
        for (Notebook item : list){
            if(item.getName().equals(searchHddSize)){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getNotebookByOs(String searchOs) {
        ArrayList<Notebook> result = new ArrayList<Notebook>();
        for (Notebook item : list) {
            if (item.getName().contains(searchOs)) {
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getNotebookByColor(String searchColor) {
        ArrayList<Notebook> result = new ArrayList<Notebook>();
        for (Notebook item : list) {
            if (item.getName().contains(searchColor)) {
                result.add(item);
            }
        }
        return result;
    }
}



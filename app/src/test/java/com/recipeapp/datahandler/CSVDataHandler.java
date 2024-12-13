package com.recipeapp.datahandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.recipeapp.model.Recipe;

public class CSVDataHandler implements DataHandler{
    private String filePath;

    public CSVDataHandler(){
        this.filePath = ("app/src/main/resources/recipes.csv");
    }

    public CSVDataHandler(String filePath){
        this.filePath = filePath;
    }

    @Override
    public String getMode(){
        return "CSV";
    }

    // ArrayList<Recipe> readData = new ArrayList<>();
    @Override
    public ArrayList<Recipe> readData(){
        // try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        //     String line;
        //     while ((line = reader.readLine()) != null) {
        //         return readData.add(line);
        //     }
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        return null;
    }

    @Override
    public void writeData(Recipe recipe){

    }

    @Override
    public ArrayList<Recipe> searchData(){
        return null;
    }

}

package com.recipeapp.datahandler;

import java.util.ArrayList;

import com.recipeapp.model.Recipe;

public class JSONDataHandler implements DataHandler {

    @Override
    public String getMode(){
        return "CSV";
    }

    @Override
    public ArrayList<Recipe> readData(){
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

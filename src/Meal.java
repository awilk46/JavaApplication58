/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Meal {
    public String mealID;
    public String meal;
    public String type;

    public Meal(String mealID, String meal, String type) {
        this.mealID = mealID;
        this.meal = meal;
        this.type = type;
    }

    public String getMealID() {
        return mealID;
    }

    public String getMeal() {
        return meal;
    }

    public String getType() {
        return type;
    }

    public void setMealID(String mealID) {
        this.mealID = mealID;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Meal{" + "mealID=" + mealID + ", meal=" + meal + ", type=" + type + '}';
    }
    
    
}

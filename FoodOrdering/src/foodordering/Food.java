package foodordering;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anwar Misbah
 */
public class Food {
    private String foodName;
    private int foodPrice;

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }
    public void setFoodPrice(int foodPrice){
        this.foodPrice = foodPrice;
    }
    public String getFoodName(){
        return foodName;
    }
    public int getFoodPrice(){
        return foodPrice;
    }
    public String toString(){
        return this.foodName;
    }
}

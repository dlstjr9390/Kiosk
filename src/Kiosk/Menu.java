package Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    String food;
    String description;
    String Type ;
    static List<String> foodMenu = new ArrayList<String>();
    static List<String> koreanList = new ArrayList<String>();
    static List<Double> Koreanbill = new ArrayList<>();
    static List<String> westernList = new ArrayList<String>();
    static List<Double> westernbill = new ArrayList<>();
    static List<String> chinaList = new ArrayList<String>();
    static List<Double> chinabill = new ArrayList<>();
    static List<String> japanList = new ArrayList<String>();
    static List<Double> japanbill = new ArrayList<>();

    public void setMenu(String Food, String Description) {
        Product product = new Product();
        this.food = Food;
        this.description = Description;
        this.Type = Food;
        foodMenu.add(food + " : " + description);
        product.setMenu(Type);
    }

    void setKoreanMenu(String Food, String Description, Double Price, String type){
        Menu.koreanList.add(Food + " | " + "W " + String.valueOf(Price) + " | " + Description);
        Menu.Koreanbill.add(Price);
    }
    void setWesternMenu(String Food, String Description, Double Price, String type){
        Menu.westernList.add(Food + " | " + "W " + String.valueOf(Price) + " | " + Description);
        Menu.westernbill.add(Price);
    }
    void setChinaMenu(String Food, String Description, Double Price, String type){
        Menu.chinaList.add(Food + " | " + "W " + String.valueOf(Price) + " | " + Description);
        Menu.chinabill.add(Price);
    }

    void setJapanMenu(String Food, String Description, Double Price, String type){
        Menu.japanList.add(Food + " | " + "W " + String.valueOf(Price) + " | " + Description);
        Menu.japanbill.add(Price);
    }

    public void setMenu() {
        setMenu("한식     ", "식사류, 찌개류 등 한국 음식");
        setMenu("양식     ", "파스타, 스테이크 등 서양 음식");
        setMenu("중식     ", "면요리, 볶음밥 등 중국 음식");
        setMenu("일식     ", "덮밥, 튀김 등 일본 음식");
    }

}

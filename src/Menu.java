import java.util.*;

public class Menu {
    private String Food;
    private String Description;
    static List<String> foodMenu = new ArrayList<String>();
    static List<String> descMenu = new ArrayList<String>();
    static List<String> burgerList = new ArrayList<String>();
    static List<String> frozenList = new ArrayList<String>();

    static void setMenu(String Food, String Description) {
        foodMenu.add(Food);
        descMenu.add(Description);
    }

    static void setMenu() {
        setMenu("Burgers       ", "앵거스 비프 통살을 다져만든 버거");
        setMenu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        setMenu("Drinks        ", "매장에서 직접 만드는 음료");
        setMenu("Beer          ", "뉴욕 브루클린 브루어리에서 양조한 맥주");
    }

    static void burgerView(){
        for (int i =0; i<Product.burgerList.size(); i++){
            System.out.println((i+1) + ". " + Product.burgerList.get(i));
        }
    }

    static void frozenView(){
        for (int i =0; i<Product.frozenList.size(); i++){
            System.out.println((i+1) + ". " + Product.frozenList.get(i));
        }
    }
}

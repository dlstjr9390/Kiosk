import java.lang.*;

public class Product extends Menu{
    double price;

    public static void setBurgerList(String Name, String Description, double price) {
        burgerList.add(Name + " // " + "W " + String.valueOf(price) + " // " + Description);
    }

    public static void setFrozenList(String Name, String Description, double price) {
        frozenList.add(Name + " // " + "W " + String.valueOf(price) + " // " + Description);
    }

    static void setBurgerList() {
        setBurgerList("ShackBurger  ",
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                6.9
        );
        setBurgerList("SmokeShack   ",
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" ,
                8.9
        );
        setBurgerList("Shroom Burger",
                "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
                9.4
        );
        setBurgerList("Cheeseburger ",
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                6.9
        );
        setBurgerList("Hamburger    ",
                "비프패티를 기반으로 야채가 들어간 기본버거",
                6.9
        );
    }
    static void setFrozenList() {
        setFrozenList("우유 아이스크림  ",
                "신선한 우유로 만든 아이스크림",
                2.0
        );
        setFrozenList("딸기 아이스크림  ",
                "신선한 딸기로 만든 아이스크림",
                3.0
        );
        setFrozenList("팥빙수          ",
                "팥과 우유, 젤리, 떡, 시럽이 들어간 맛있는 팥빙수",
                3.0
        );
    }
}

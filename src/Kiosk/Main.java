package Kiosk;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        View view = new View();
        menu.setMenu(); // 메인 메뉴 입력
        view.mainView();

    }
}
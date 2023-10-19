import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu.setMenu();
        Product.setFrozenList();
        Product.setBurgerList();
        View.mainView();

    }
}
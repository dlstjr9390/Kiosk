import java.io.*;

public class View extends Menu{
    public static void mainView() throws IOException {
        System.out.println(); // 메인 메뉴
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");
        menuView();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        switch (num) {
            case 1 :
                burgerView();
                break;

            case 2 :
                frozenView();
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                System.out.println();
                mainView();
        }
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
    public static void menuView(){
        for(int i=0; i<foodMenu.size(); i++){
            System.out.println((i+1) + ". " + foodMenu.get(i) + " // " + descMenu.get(i));
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println(foodMenu.size()+1 + " . " + "Order" + " // " + "장바구니를 확인 후 주문합니다.");
        System.out.println(foodMenu.size()+2 + " . " + "Cancel" + " // " + "진행중인 주문을 취소합니다.");
        System.out.println();
    }
}

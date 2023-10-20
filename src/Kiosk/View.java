package Kiosk;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class View extends Menu {
    static List<String> nowList = new ArrayList<String>();
    static List<Double> nowBillList = new ArrayList<>();
    int typeNum;
    Order order = new Order();
    public void mainView() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(); // 메인 메뉴
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");
        menuView();

        while(true){
            int num2 = Integer.parseInt(bf.readLine());
            if(num2 > nowList.size()+2){
                break;
            } else if(num2 == nowList.size()+1){
                int i = order.orderDetail();
                if(i == Order.orderList.size()+1){
                    System.out.println("주문이 완료되었습니다.");
                    break;
                } else{
                    typeView(typeNum);
                }
            } else if(num2 == nowList.size()+2){
                nowList = null;
                menuView();
            } else {
                order.setOrderList(nowList,num2);
                order.setBillList(nowBillList,num2);
                nowListView();
            }
        }
    }

    public void menuView() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        nowList = foodMenu;
        for(int i = 0; i< nowList.size(); i++){
            System.out.println((i+1) + ". " +nowList.get(i));
        }
        System.out.println();
        orderMenu();
        System.out.println();
        int num = Integer.parseInt(bf.readLine());
        typeView(num);


    }

    public void typeView(int typenum) throws IOException{
        System.out.println("메뉴를 골라 주세요.");
        this.typeNum = typenum;
        switch (typenum) {
            case 1 :
                nowList = Menu.koreanList;
                nowBillList = Menu.Koreanbill;
                typeDetail();
                break;

            case 2 :
                nowList = Menu.westernList;
                nowBillList = Menu.westernbill;
                typeDetail();
                break;

            case 5 :
                int i = order.orderDetail();
                if(i == Order.orderList.size()+1){
                    System.out.println("주문이 완료되었습니다.");
                    System.exit(0);
                } else{
                    menuView();
                }
            case 6 :
                nowList = null;
                menuView();
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                System.out.println();
                mainView();
        }
    }
    void nowListView(){
        for (int i =0; i<nowList.size(); i++){
            System.out.println((i+1) + ". " + nowList.get(i));
        }
        orderMenu();
    }

    void orderMenu(){
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println(nowList.size()+1 + " . " + "장바구니 확인" + " | " + "장바구니를 확인 후 주문합니다.");
        System.out.println(nowList.size()+2 + " . " + "뒤로 가기" + " | " + "현재 화면에서 뒤로 돌아갑니다.");
        System.out.println();
    }

    void typeDetail(){
        for (int i =0; i<nowList.size(); i++){
            System.out.println((i+1) + ". " + nowList.get(i));
        }
        orderMenu();
    }

}

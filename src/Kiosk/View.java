package Kiosk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        menuView();  // 메뉴 출력

        while(true){  // 종류 입력받기
            try{
                int num2 = Integer.parseInt(bf.readLine());

                if(num2 > nowList.size()+2){  // 메뉴판 정해진 숫자 이상 입력했을 경우
                    System.out.println("잘못된 입력입니다.");
                    nowListView();
                } else if(num2 == nowList.size()+1){  // 주문 정보
                    int i = order.orderDetail();
                    if(i == Order.orderList.size()+1){  // 주문 완료
                        if(Order.orderList.size()==0){
                            System.out.println("장바구니가 비었습니다.");
                        } else{
                            System.out.println();
                            System.out.println("주문이 완료되었습니다.");
                            int waitingNum = order.finishOrder();
                            System.out.println("대기 번호는 [ " + waitingNum + " ] 입니다.");
                            try {
                                System.out.println("잠시 후 메뉴로 돌아갑니다.");
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println();
                        menuView();

                    } else if(i == Order.orderList.size()+2){  // 뒤로가기
                        nowListView();
                    } else{ // 주문 정보 안에서 정해진 숫자 이상 입력했을 경우
                        System.out.println("잘못된 입력입니다.");
                        System.out.println();
                        order.orderDetail();
                    }
                }
                else if(num2 == nowList.size()+2){ // 메뉴판 뒤로가기
                    nowList = null;
                    menuView();
                } else { // 장바구니에 담기
                    System.out.println(nowList.get(num2 -1));
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인         2. 취소");
                    int check = Integer.parseInt(bf.readLine());
                    if(check == 1){ // 확인
                        order.setOrderList(nowList,num2);
                        order.setBillList(nowBillList,num2);
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println();
                    } else if (check == 2){  // 취소
                        System.out.println();
                        System.out.println("취소 되었습니다.");
                    } else{  // 잘못된 입력
                        System.out.println("잘못된 입력입니다.");
                    }

                    nowListView();
                }
            } catch (NumberFormatException e){ // 숫자가 아닌 값을 입력했을 경우
                System.out.println("숫자를 입력해주세요");
                nowListView();
            }

        }
    }

    public void menuView() throws IOException{  // 메뉴 출력하기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        nowList = foodMenu;
        for(int i = 0; i< nowList.size(); i++){
            System.out.println((i+1) + ". " +nowList.get(i));
        }
        System.out.println();
        orderMainMenu();
        System.out.println();
        try{
            int num = Integer.parseInt(bf.readLine());
            typeView(num);
        } catch (NumberFormatException e){
            System.out.println("잘못된 입력입니다.");
            menuView();
        }


    }

    public void typeView(int typenum) throws IOException{ // 상세 메뉴 출력
        this.typeNum = typenum;
        switch (typenum) {
            case 1 :
                nowList = Menu.koreanList;
                nowBillList = Menu.Koreanbill;
                nowListView();
                break;

            case 2 :
                nowList = Menu.westernList;
                nowBillList = Menu.westernbill;
                nowListView();
                break;

            case 3 :
                nowList = Menu.chinaList;
                nowBillList = Menu.chinabill;
                nowListView();
                break;

            case 4 :
                nowList = Menu.japanList;
                nowBillList = Menu.japanbill;
                nowListView();
                break;

            case 5 :
                int i = order.orderDetail();
                if(i == Order.orderList.size()+1){
                    if(Order.orderList.size()==0){
                        System.out.println("장바구니가 비었습니다.");
                    } else{
                        System.out.println();
                        System.out.println("주문이 완료되었습니다.");
                        int waitingNum = order.finishOrder();
                        System.out.println("대기 번호는 [ " + waitingNum + " ] 입니다.");
                        try {
                            System.out.println("잠시 후 메뉴로 돌아갑니다.");
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println();
                    menuView();

                } else{
                    menuView();
                }
                break;

            case 6 :
                System.out.println("주문이 취소되었습니다.");
                System.exit(0);
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                System.out.println();
                mainView();
        }
    }
    void nowListView(){  // 현재 리스트 출력
        for (int i =0; i<nowList.size(); i++){
            System.out.println((i+1) + ". " + nowList.get(i));
        }
        orderMenu();
    }

    void orderMenu(){ // 주문 메뉴 출력
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println(nowList.size()+1 + " . " + "장바구니 확인" + " | " + "장바구니를 확인 후 주문합니다.");
        System.out.println(nowList.size()+2 + " . " + "뒤로 가기" + " | " + "현재 화면에서 뒤로 돌아갑니다.");
        System.out.println();
    }

    void orderMainMenu(){ // 메인에서 주문메뉴 출력
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println(nowList.size()+1 + " . " + "장바구니 확인" + " | " + "장바구니를 확인 후 주문합니다.");
        System.out.println(nowList.size()+2 + " . " + "취소" + " | " + "주문을 취소합니다.");
        System.out.println();
    }

}

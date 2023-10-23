package Kiosk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Order {
    static List<String> orderList = new ArrayList<String>();
    static List<Double> billList = new ArrayList<>();
    List<String> newOrderList = new ArrayList<String>();
    double totalBill;
    int waitingNum = 0;
    public void setOrderList(List<String> list,int num){
        orderList.add(list.get(num-1));
    }

    public void setBillList(List<Double> list, int num){
        billList.add(list.get(num-1));
    }
    public int orderDetail() throws IOException{
        totalBill = 0;
        Set<String> orderSet = new HashSet<String>(orderList);
        newOrderList = new ArrayList<String>(orderSet);
        System.out.println("======== 장바구니 확인 ========");
        for(int i = 0; i<newOrderList.size(); i++) {
            int orderNum = Collections.frequency(orderList, newOrderList.get(i));
            System.out.println(i + 1 + "." + newOrderList.get(i) + " | 개수 : " + orderNum);

        }
        System.out.println("======== 총 가격 ========");
        for(int i = 0; i<billList.size(); i++){
            totalBill += billList.get(i);
        }
        System.out.println("W " + totalBill);
        System.out.println("=========================");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println(orderList.size()+1 + " . " + "주문" + " // " + "주문 완료하기");
        System.out.println(orderList.size()+2 + " . " + "뒤로 가기" + " // " + "현재 화면에서 뒤로 돌아갑니다.");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine());
        return i;
    }

    int finishOrder(){
        orderList.clear();
        billList.clear();
        waitingNum++;
        return waitingNum;
    }
}

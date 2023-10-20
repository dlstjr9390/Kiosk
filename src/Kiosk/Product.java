package Kiosk;

import java.lang.*;

public class Product extends Menu {
    double Price;

   void setMenu(String Type) {
        switch (Type){
            case "한식     " :
                setKoreanMenu("김치찌개    ",
                        "묵은지로 만든 김치찌개",
                        8.0,
                        this.Type = Type
                );
                setKoreanMenu("차돌된장찌개",
                        "차돌박이가 가득 들어간 된장찌개" ,
                        9.0,
                        this.Type = Type
                );
                setKoreanMenu("제육 덮밥   ",
                        "매콤 달콤한 제육볶음 덮밥",
                        8.0,
                        this.Type = Type
                );
                setKoreanMenu("오징어 덮밥 ",
                        "쫄깃한 오징어가 들어간 오징어 덮밥",
                        8.0,
                        this.Type = Type
                );
                setKoreanMenu("떡볶이      ",
                        "고추장 베이스의 매콤한 떡볶이",
                        5.0,
                        this.Type = Type
                );
                break;

            case "양식     " :
                setWesternMenu("봉골레 파스타  ",
                        "조개 육수로 깊은 맛을 낸 파스타",
                        9.0,
                         this.Type = Type
                );
                setWesternMenu("미트소스 파스타  ",
                        "다진고기와 토마토를 끓여 만든 소스로 맛을 낸 파스타",
                        9.0,
                         this.Type = Type
                );
                setWesternMenu("안심 스테이크    ",
                        "신선한 소고기를 그릴에 구워낸 안심 스테이크",
                        40.0,
                        this.Type = Type
                );

                setWesternMenu("리코타 치즈 샐러드    ",
                        "리코타 치즈와 각종 신선한 채소들로 만든 샐러드",
                        7.0,
                        this.Type = Type
                );


                break;

        }
    }

}

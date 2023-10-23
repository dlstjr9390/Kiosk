package Kiosk;

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

            case "중식     " :
                setChinaMenu("짜장면   ",
                        "돼지고기와 춘장을 볶아낸 면요리",
                        6.0,
                        this.Type = Type

                );

                setChinaMenu("짬뽕   ",
                        "각종 해물과 채소가 들어간 매콤한 면요리",
                        7.0,
                        this.Type = Type

                );

                setChinaMenu("볶음밥   ",
                        "다양한 채소와 고기, 계란을 밥과 함께 볶은 요리",
                        7.0,
                        this.Type = Type

                );

                setChinaMenu("탕수육   ",
                        "돼지고기를 찹쌀가루에 뭍혀 튀겨 새콤달콤한 소스와 곁들여 먹는 요리",
                        15.0,
                        this.Type = Type

                );

                setChinaMenu("고추잡채   ",
                        "고추,부추,피망 등의 채소들을 양념과 볶아 쫄깃한 빵과 함께 곁들여 먹는 요리",
                        30.0,
                        this.Type = Type

                );
                break;

            case "일식     " :
                setJapanMenu("모듬초밥   ",
                        "신선하고 다양한 재료들을 밥위에 얹어 낸 요리",
                        13.0,
                        this.Type = Type

                );

                setJapanMenu("텐동   ",
                        "여러가지 튀김을 올려먹는 덮밥 ",
                        12.0,
                        this.Type = Type

                );
                setJapanMenu("유부우동   ",
                        "커다란 유부가 들어간 일식 우동",
                        8.0,
                        this.Type = Type

                );
                setJapanMenu("일식돈가스   ",
                        "두껍게 튀겨낸 돼지고기를 소스와 함께 곁들여 먹는 요리",
                        8.0,
                        this.Type = Type

                );
                break;
        }
    }

}

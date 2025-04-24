package ch08_methods;

import java.util.Scanner;

/*
    bmi 계산기 method를 정의하고 실행시킬겁니다.
    메서드명 : calculateBmi()
    return type : void
    매개변수 유무 : 없음
 */
public class Method04 {
    public static void main(String[] args) {
        calculateBmi();
        /*
            실행 예
            키(cm)를 입력하세요 >>> 172.5
            몸무게(kg)를 입력하세요 >>> 68.7
            당신의 BMI 지수는 23.08이고, 과체중입니다.

            ch09_classes -> ClassA
         */
    }
    public static void calculateBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("키(cm)를 입력하세요 >>> ");
        double cm = scanner.nextDouble();
        double m = cm/100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double kg = scanner.nextDouble();
        double BMI = kg / (m*m);
        if(BMI < 18.5) {
            System.out.println("당신의 BMI 지수는 " + BMI + "이고, 저체중입니다,");
        } else if(BMI>=18.5 && BMI < 23){
            System.out.println("당신의 BMI 지수는 " + BMI + "이고, 정상입니다.");
        } else if(BMI>=23 && BMI < 25){
            System.out.println("당신의 BMI 지수는 " + BMI + "이고, 과체중입니다.");
        } else {
            System.out.println("당신의 BMI 지수는 " + BMI + "이고, 비만입니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 7");
        // ЗАДАНИЕ 1

        int clientOs= 1;
        if (clientOs==0 ){
            System.out.println("Установите версию приложения для iOS по ссылке ");}
        else {
            System.out.println( " Установите версию приложения для Android по ссылке");}

        //ЗАДАНИЕ 2
         int clientDeviceYear= 2011;
        int clientOS= 0;
        if ( clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");}
        else {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");

        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println( "Установите версию приложения для iOS по ссылке");}
        else {
            System.out.println( " Установите облегченную версию приложения для iOS по ссылке");}

        // задание3
        int year= 2021;
        if (year% 4==0||year ==year/100||year==year/400 ){
            System.out.println( " Год является високосным");}
        else {
            System.out.println(" Год не является високосным");}

        // задание 4
        int deliveryDistance= 95;
        int days = 1;
        if(deliveryDistance > 20){
            days = (deliveryDistance / 40) + days;}
            System.out.println( " Потребуется деней" +  days);
         //задание 5

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println( " Январь, ЗИМА");
                break;
            case 2:
                System.out.println( " Февраль,ЗИМА");
                break;
            case 3:
                System.out.println( " Март, ВЕСНА");
                break;
            case 4 :
                System.out.println( " Апрель ,ВЕСНА");
                break;
            case 5:
                System.out.println( " Май,ВЕСНА");
                break;
            case 6:
                System.out.println( "Июнь, ВЕСНА");
                break;
            case 7:
                System.out.println( " Июль , ЛЕТО");
                break;
            case 8:
                System.out.println( " Август, ЛЕТО");
                break;
            case 9:
                System.out.println( " Сентябрь, ОСЕНЬ");
                break;
            case 10:
                System.out.println( " Октябрь , ОСЕНЬ");
                break;
            case 11:
                System.out.println( " Ноябрь, ОСЕНЬ");
                break;
            case 12:
                System.out.println( " Декабрь, ЗИМА");
                break;
            default:
                System.out.println(" Твкого месяца не существует");



        }

    }








}
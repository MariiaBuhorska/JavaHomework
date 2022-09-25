//package exam;
//
//import java.util.Scanner;
//
//public class Task66 {
//    //Написать программу, которая принимает стоимость покупок в магазине и выдает сумму к оплате с учетом следующей скидки:
//    //- 0 – 250: нет скидки
//    //- 251 – 500: скидка 5%
//    //- 501 – 1000: скидка 10%
//    // - 1001 и более: скидка 15%
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner (System.in);
//            System.out.println ("Введите сумму покупок!");
//            scanner.hasNextDouble ();
//            double a = scanner.nextDouble ();
//            double b = getRangeInArray (a);
//            getTotalPayable (a, b);
//            public static void main (String[] args) {
//                Scanner scanner = new Scanner (System.in);
//                System.out.println ("Введите сумму покупок!");
//                scanner.hasNextDouble ();
//                double a = scanner.nextDouble ();
//                getTotalPayable (a); }
//
//            public static void getTotalPayable ( double a){
//
//
//            }
//
//            static double getRangeInArray (double a) {
//                double b = 0;
//                for ( ; a > 0; a++){
//                    for (int i = 0; i < 15 + 1; i += 5) {
//                        if (a > 0 && a < 251) {
//                            b = i;
//                            break;
//                        }
//                        if (a >= 251 && a < 501) {
//                            b *= i;
//                            break;
//                        }
//                        if (i >= 501 && i < 1001) {
//                            b *= i;
//                            break;
//                        }
//                        if (i >= 1001) {
//                            b *= i;
//                            break;
//                        }
//                    }
//                }
//                System.out.print ("Сумма покупки = " + a + ". Ваша скидка = " + b + " %");
//                double c = (a / 100) * b;
//                return c;
//            }
//
//
//            public static void getTotalPayable ( double a, double c){
////            while (b < 15) {
////                b += 5;
////                if (b == 15) {
////                    break;
////                }
////            }
//                //double discount = (a / 100) * b;
//                double amountPayable = a - c;
//                // System.out.print ("Сумма покупки = " + a + ". Ваша скидка = " + b + " %");
//                System.out.print (" Сумма к оплате = " + amountPayable);
//            }
//        }
//// switch (range) {
////        case 1 -> System.out.println ("Неверное значение. Повторите еще раз!");
////        case 2 -> System.out.println ("У Вас нет скидок. Сумма к оплате = " + amountPayable);
////        case 3 -> System.out.println ("Ваша скидка = 5 %. Сумма к оплате = " + (amountPayable -);
////        case 4 -> System.out.println ("Ваша скидка = 10 %. Сумма к оплате = " + amountPayable);
////        case 5 -> System.out.println ("Ваша скидка = 15 %. Сумма к оплате = " + amountPayable);
////    }
////
////    }
////        }
////            discount += 5;
////
//
//
//
//
//
//    double price = 10001;// создаем переменную,можно сразу присвоить значение
//            if (price > 1000)// создаем условие
//                price = price*0.9;
//            System.out.println("Стоимость вашей покупки " + price + " рублей"); //выводим
//        }
//    }
//}
//        if ( i > 0 && i <= 250) {
////                discount = 0;
////
////                System.out.println ("У Вас нет скидок. Сумма к оплате = " + amountPayable);
////            }
////            if (i >= 251 && i <= 500) {
////                purchaseAmount = i;
////                discount = 5;
////                //amountPayable = (purchaseAmount * discount)/100;
////                System.out.println ("Ваша скидка = 5 %. Сумма к оплате = " + amountPayable);
////            }
////            if (i >= 501 && i <= 1000) {
////                purchaseAmount = i;
////                discount = 10;
////                // amountPayable = (purchaseAmount * discount)/100;
////                System.out.println ("Ваша скидка = 10 %. Сумма к оплате = " + amountPayable);
////            }
////            if (i >= 1001) {
////                purchaseAmount = i;
////                discount = 15;}
////
////             else if (purchaseAmount < 0) {
////                    System.out.println ("Неверное значение. Повторите еще раз!");
////                }
////            }
////                System.out.println ("Ваша скидка = " + discount + " %. Сумма к оплате = " + amountPayable);}
//        }
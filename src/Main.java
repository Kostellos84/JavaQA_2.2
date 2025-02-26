public class Main {
    public static void main(String[] args) {
        int score = 100;
        int supplement = 1000;
        int bonuses = (supplement / 100);
        if (supplement > 1000) {
            System.out.println("На вашем счету " + (supplement / 100 + score + supplement) + " рублей");
            System.out.println("Сумма начисленых бонусов: " + bonuses + " рублей");
        } else {
            System.out.println("На вашем счету " + (supplement + score) + " Рублей");
            System.out.println("Для получения бонусов сумма пополнения доложна быть более тысячи рублей");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        int start = 100;
        int add = 2000;
        int min = 100;
        int bonus = add / min;
        if (min <= 1000) {
            bonus = add / min;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус" + bonus);
        System.out.println("Итоговый счет" + (start + add + bonus));
    }
}




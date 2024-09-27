public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int num = i;
            
            Thread thread = new Thread(() -> {
                if (num % 2 == 0) {
                    PrintTwo.printTwo(num);
                } else if (num % 3 == 0) {
                    PrintThree.printThree(num);
                } else if (num % 4 == 0) {
                    PrintFour.printFour(num);
                } else if (num % 5 == 0) {
                    PrintFive.printFive(num);
                } else {
                    PrintNumber.printNumber(num);
                }
            });
            thread.start();
        }
    }
}

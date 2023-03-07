package slow_app;

public class Preprocessing {
    public static int processEntry(int data) {
        int newData = data;
        newData = process1(newData);
        newData = process2(newData);
        newData = process3(newData);
        newData = process4(newData);
        return newData;
    }


    private static int process1(int data) {
        doWork(20000);
        return data + 1;
    }

    private static int process2(int data) {
        doWork(40000);
        return data + 2;
    }

    private static int process3(int data) {
        doWork(30000);
        return data + 3;
    }

    private static int process4(int data) {
        doWork(15000);
        return data + 4;
    }

    private static void doWork(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res = res * i * j;
            }
        }
    }
}

package slow_app;

public class SlowApplication {

    public static void main(String[] asd) {
        int data = 40000;
        data = brandNewPostprocessing(data);

        Database database = new Database();
        database.addEntry(data);

        data = doRelatedJobs();
    }

    public static int brandNewPostprocessing(int data) {
        int res = Preprocessing.processEntry(data);

        int n = 35000;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res = res * i * j;
            }
        }
        return res;
    }

    public static int doRelatedJobs() {
        int n = 20000;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res = res * i * j;
            }
        }
        return res;
    }
}

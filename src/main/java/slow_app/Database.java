package slow_app;

public class Database {
    public Database() {
        initDatabase();
    }

    public void addEntry(int entry) {
        int n = 15000;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res = res * i * j;
            }
        }
    }

    private void initDatabase() {
        int n = 5000;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res = res * i * j;
            }
        }
    }
}

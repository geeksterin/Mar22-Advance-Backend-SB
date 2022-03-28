package threadlocals;


public class NameStore {

    private static final ThreadLocal<String> nameStore = new ThreadLocal<>();

    // SecurityContext / ApplicationContext

//    private static String nameStore = "";
    public static void setNameStore(final String string) {
        nameStore.set(string);
//        nameStore = string;
    }

    public static String getNameStore() {
        return nameStore.get();
//        return nameStore;
    }

    public static void clearAll() {
        nameStore.remove();
    }
}

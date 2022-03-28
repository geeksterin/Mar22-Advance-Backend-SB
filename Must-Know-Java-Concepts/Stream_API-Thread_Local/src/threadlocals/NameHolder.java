package threadlocals;

public class NameHolder {

    private static final ThreadLocal<String> NAME_HOLDER = new ThreadLocal<>();

    public static void setNameHolder(final String nameHolder) {
        NAME_HOLDER.set(nameHolder);
    }

    public static String getNameHolder() {
        return NAME_HOLDER.get();
    }

    public static void clearAll() {
        NAME_HOLDER.remove();
    }
}

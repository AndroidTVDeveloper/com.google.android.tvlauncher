package defpackage;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: to  reason: default package */
/* compiled from: PG */
public final class to extends Enum {
    public static final to a = new to("PREFER_ARGB_8888", 0);
    public static final to b;
    public static final to c;
    private static final /* synthetic */ to[] d;

    static {
        to toVar = new to("PREFER_RGB_565", 1);
        b = toVar;
        to toVar2 = a;
        d = new to[]{toVar2, toVar};
        c = toVar2;
    }

    private to(String str, int i) {
    }

    public static to[] values() {
        return (to[]) d.clone();
    }
}

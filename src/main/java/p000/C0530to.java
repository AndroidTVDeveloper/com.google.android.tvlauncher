package p000;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: to */
/* compiled from: PG */
public final class C0530to extends Enum {

    /* renamed from: a */
    public static final C0530to f10517a = new C0530to("PREFER_ARGB_8888", 0);

    /* renamed from: b */
    public static final C0530to f10518b;

    /* renamed from: c */
    public static final C0530to f10519c;

    /* renamed from: d */
    private static final /* synthetic */ C0530to[] f10520d;

    static {
        C0530to toVar = new C0530to("PREFER_RGB_565", 1);
        f10518b = toVar;
        C0530to toVar2 = f10517a;
        f10520d = new C0530to[]{toVar2, toVar};
        f10519c = toVar2;
    }

    private C0530to(String str, int i) {
    }

    public static C0530to[] values() {
        return (C0530to[]) f10520d.clone();
    }
}

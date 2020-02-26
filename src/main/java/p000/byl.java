package p000;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: byl */
/* compiled from: PG */
public abstract class byl {

    /* renamed from: a */
    public static ContentResolver f5017a = null;

    /* renamed from: b */
    public final String f5018b;

    /* renamed from: c */
    public final Object f5019c;

    /* renamed from: a */
    public abstract Object mo2541a();

    protected byl(String str, Object obj) {
        this.f5018b = str;
        this.f5019c = obj;
    }

    /* renamed from: a */
    public static void m4378a(Context context) {
        f5017a = context.getContentResolver();
    }

    /* renamed from: a */
    public static byl m4377a(String str, Integer num) {
        return new byk(str, num);
    }

    /* renamed from: a */
    public static byl m4376a(String str) {
        return new byj(str, false);
    }
}

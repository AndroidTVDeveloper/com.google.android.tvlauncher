package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: byl  reason: default package */
/* compiled from: PG */
public abstract class byl {
    public static ContentResolver a = null;
    public final String b;
    public final Object c;

    public abstract Object a();

    protected byl(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void a(Context context) {
        a = context.getContentResolver();
    }

    public static byl a(String str, Integer num) {
        return new byk(str, num);
    }

    public static byl a(String str) {
        return new byj(str, false);
    }
}

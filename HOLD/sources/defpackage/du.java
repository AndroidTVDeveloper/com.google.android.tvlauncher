package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: du  reason: default package */
/* compiled from: PG */
abstract class du {
    private final int a;
    private final Class b;
    private final int c;

    public du(int i, Class cls) {
        this(i, cls, (byte) 0);
    }

    public abstract Object a(View view);

    public du(int i, Class cls, byte b2) {
        this.a = i;
        this.b = cls;
        this.c = 28;
    }

    /* access modifiers changed from: package-private */
    public final Object b(View view) {
        if (Build.VERSION.SDK_INT >= this.c) {
            return a(view);
        }
        int i = Build.VERSION.SDK_INT;
        Object tag = view.getTag(this.a);
        if (!this.b.isInstance(tag)) {
            return null;
        }
        return tag;
    }
}

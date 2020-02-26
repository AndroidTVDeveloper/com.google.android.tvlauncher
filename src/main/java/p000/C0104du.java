package p000;

import android.os.Build;
import android.view.View;

/* renamed from: du */
/* compiled from: PG */
abstract class C0104du {

    /* renamed from: a */
    private final int f9102a;

    /* renamed from: b */
    private final Class f9103b;

    /* renamed from: c */
    private final int f9104c;

    public C0104du(int i, Class cls) {
        this(i, cls, (byte) 0);
    }

    /* renamed from: a */
    public abstract Object mo4683a(View view);

    public C0104du(int i, Class cls, byte b) {
        this.f9102a = i;
        this.f9103b = cls;
        this.f9104c = 28;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo4687b(View view) {
        if (Build.VERSION.SDK_INT >= this.f9104c) {
            return mo4683a(view);
        }
        int i = Build.VERSION.SDK_INT;
        Object tag = view.getTag(this.f9102a);
        if (!this.f9103b.isInstance(tag)) {
            return null;
        }
        return tag;
    }
}

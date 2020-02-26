package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: bc  reason: default package */
/* compiled from: PG */
public final class bc {
    private final WeakReference a;
    private final int b;
    private final int c;

    public bc() {
    }

    public static final void a() {
        new Handler(Looper.getMainLooper()).post(new bb());
    }

    public final void b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new ba(this, typeface));
    }

    public bc(hj hjVar, int i, int i2) {
        this.a = new WeakReference(hjVar);
        this.b = i;
        this.c = i2;
    }

    public final void a(Typeface typeface) {
        int i;
        boolean z;
        hj hjVar = (hj) this.a.get();
        if (hjVar != null) {
            if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
                if ((this.c & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = Typeface.create(typeface, i, z);
            }
            hjVar.a.post(new hi(this.a, typeface));
        }
    }
}

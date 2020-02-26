package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: btn  reason: default package */
/* compiled from: PG */
public final class btn {
    private final SparseIntArray a;
    private bnv b;

    public btn() {
        this(bnu.a);
    }

    public btn(bnv bnv) {
        this.a = new SparseIntArray();
        buh.a(bnv);
        this.b = bnv;
    }

    public final void a() {
        this.a.clear();
    }

    public final int a(Context context, boj boj) {
        buh.a(context);
        buh.a(boj);
        boj.l();
        int c = boj.c();
        int i = this.a.get(c, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.size()) {
                    break;
                }
                int keyAt = this.a.keyAt(i2);
                if (keyAt > c && this.a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            }
            if (i == -1) {
                i = this.b.a(context, c);
            }
            this.a.put(c, i);
        }
        return i;
    }
}

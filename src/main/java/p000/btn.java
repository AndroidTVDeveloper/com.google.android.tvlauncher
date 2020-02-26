package p000;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: btn */
/* compiled from: PG */
public final class btn {

    /* renamed from: a */
    private final SparseIntArray f4824a;

    /* renamed from: b */
    private bnv f4825b;

    public btn() {
        this(bnu.f4493a);
    }

    public btn(bnv bnv) {
        this.f4824a = new SparseIntArray();
        buh.m4199a(bnv);
        this.f4825b = bnv;
    }

    /* renamed from: a */
    public final void mo2436a() {
        this.f4824a.clear();
    }

    /* renamed from: a */
    public final int mo2435a(Context context, boj boj) {
        buh.m4199a(context);
        buh.m4199a(boj);
        boj.mo2236l();
        int c = boj.mo2183c();
        int i = this.f4824a.get(c, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f4824a.size()) {
                    break;
                }
                int keyAt = this.f4824a.keyAt(i2);
                if (keyAt > c && this.f4824a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            }
            if (i == -1) {
                i = this.f4825b.mo2214a(context, c);
            }
            this.f4824a.put(c, i);
        }
        return i;
    }
}

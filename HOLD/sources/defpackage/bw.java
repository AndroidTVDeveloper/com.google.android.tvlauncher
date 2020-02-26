package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: bw  reason: default package */
/* compiled from: PG */
final class bw implements Callable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ bv b;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;

    public bw(Context context, bv bvVar, int i, String str) {
        this.a = context;
        this.b = bvVar;
        this.c = i;
        this.d = str;
    }

    /* renamed from: a */
    public final cc call() {
        cc a2 = cd.a(this.a, this.b, this.c);
        if (a2.a != null) {
            cd.a.a(this.d, a2.a);
        }
        return a2;
    }
}

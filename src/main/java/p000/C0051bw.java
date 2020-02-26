package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: bw */
/* compiled from: PG */
final class C0051bw implements Callable {

    /* renamed from: a */
    private final /* synthetic */ Context f4930a;

    /* renamed from: b */
    private final /* synthetic */ C0050bv f4931b;

    /* renamed from: c */
    private final /* synthetic */ int f4932c;

    /* renamed from: d */
    private final /* synthetic */ String f4933d;

    public C0051bw(Context context, C0050bv bvVar, int i, String str) {
        this.f4930a = context;
        this.f4931b = bvVar;
        this.f4932c = i;
        this.f4933d = str;
    }

    /* renamed from: a */
    public final C0058cc call() {
        C0058cc a = C0059cd.m4556a(this.f4930a, this.f4931b, this.f4932c);
        if (a.f5234a != null) {
            C0059cd.f5297a.mo3693a(this.f4933d, a.f5234a);
        }
        return a;
    }
}

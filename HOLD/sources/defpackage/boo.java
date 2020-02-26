package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* renamed from: boo  reason: default package */
/* compiled from: PG */
public final class boo implements bmz {
    public final Context a;
    public final bok b;
    public final bpk c;
    public final Looper d;
    public final int e;
    public final bos f;
    public final bri g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boo(android.content.Context r5) {
        /*
            r4 = this;
            bok r0 = defpackage.bmy.a
            bpj r1 = new bpj
            r1.<init>()
            bom r2 = new bom
            r2.<init>()
            java.lang.String r3 = "StatusExceptionMapper must not be null."
            defpackage.buh.a(r1, r3)
            r2.a = r1
            bon r1 = r2.a()
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boo.<init>(android.content.Context):void");
    }

    private boo(Context context, bok bok, bon bon) {
        buh.a(context, "Null context is not permitted.");
        buh.a(bok, "Api must not be null.");
        buh.a(bon, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = bok;
        this.d = bon.c;
        this.c = new bpk(this.b);
        this.f = new brj(this);
        bri a2 = bri.a(this.a);
        this.g = a2;
        this.e = a2.i.getAndIncrement();
        bsa bsa = bon.b;
        Handler handler = this.g.l;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public final bsu a() {
        bsu bsu = new bsu();
        Set emptySet = Collections.emptySet();
        if (bsu.a == null) {
            bsu.a = new cn();
        }
        bsu.a.addAll(emptySet);
        bsu.c = this.a.getClass().getName();
        bsu.b = this.a.getPackageName();
        return bsu;
    }

    public final bpn a(bpn bpn) {
        bpn.c();
        bri bri = this.g;
        bpf bpf = new bpf(bpn);
        Handler handler = bri.l;
        handler.sendMessage(handler.obtainMessage(4, new brt(bpf, bri.j.get(), this)));
        return bpn;
    }

    public boo(Context context, byte b2) {
        this(context, buv.a, bon.a);
        byl.a(context.getApplicationContext());
    }
}

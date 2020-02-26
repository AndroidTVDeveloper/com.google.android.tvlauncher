package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* renamed from: boo */
/* compiled from: PG */
public final class boo implements bmz {

    /* renamed from: a */
    public final Context f4515a;

    /* renamed from: b */
    public final bok f4516b;

    /* renamed from: c */
    public final bpk f4517c;

    /* renamed from: d */
    public final Looper f4518d;

    /* renamed from: e */
    public final int f4519e;

    /* renamed from: f */
    public final bos f4520f;

    /* renamed from: g */
    public final bri f4521g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boo(android.content.Context r5) {
        /*
            r4 = this;
            bok r0 = p000.bmy.f4435a
            bpj r1 = new bpj
            r1.<init>()
            bom r2 = new bom
            r2.<init>()
            java.lang.String r3 = "StatusExceptionMapper must not be null."
            p000.buh.m4200a(r1, r3)
            r2.f4510a = r1
            bon r1 = r2.mo2239a()
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boo.<init>(android.content.Context):void");
    }

    private boo(Context context, bok bok, bon bon) {
        buh.m4200a(context, "Null context is not permitted.");
        buh.m4200a(bok, "Api must not be null.");
        buh.m4200a(bon, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f4515a = context.getApplicationContext();
        this.f4516b = bok;
        this.f4518d = bon.f4514c;
        this.f4517c = new bpk(this.f4516b);
        this.f4520f = new brj(this);
        bri a = bri.m4059a(this.f4515a);
        this.f4521g = a;
        this.f4519e = a.f4694i.getAndIncrement();
        bsa bsa = bon.f4513b;
        Handler handler = this.f4521g.f4697l;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* renamed from: a */
    public final bsu mo2241a() {
        bsu bsu = new bsu();
        Set emptySet = Collections.emptySet();
        if (bsu.f4765a == null) {
            bsu.f4765a = new C0069cn();
        }
        bsu.f4765a.addAll(emptySet);
        bsu.f4767c = this.f4515a.getClass().getName();
        bsu.f4766b = this.f4515a.getPackageName();
        return bsu;
    }

    /* renamed from: a */
    public final bpn mo2240a(bpn bpn) {
        bpn.mo3198c();
        bri bri = this.f4521g;
        bpf bpf = new bpf(bpn);
        Handler handler = bri.f4697l;
        handler.sendMessage(handler.obtainMessage(4, new brt(bpf, bri.f4695j.get(), this)));
        return bpn;
    }

    public boo(Context context, byte b) {
        this(context, buv.f4862a, bon.f4512a);
        byl.m4378a(context.getApplicationContext());
    }
}

package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: brz */
/* compiled from: PG */
public final class brz extends bwm implements boq, bor {

    /* renamed from: h */
    private static final cel f4712h = bwh.f4945b;

    /* renamed from: a */
    public final Context f4713a;

    /* renamed from: b */
    public final Handler f4714b;

    /* renamed from: c */
    public final Set f4715c;

    /* renamed from: d */
    public final bsv f4716d;

    /* renamed from: e */
    public bwi f4717e;

    /* renamed from: f */
    public bry f4718f;

    /* renamed from: g */
    public final cel f4719g;

    public brz(Context context, Handler handler, bsv bsv) {
        cel cel = f4712h;
        this.f4713a = context;
        this.f4714b = handler;
        this.f4716d = (bsv) buh.m4200a(bsv, "ClientSettings must not be null");
        this.f4715c = bsv.f4769a;
        this.f4719g = cel;
    }

    /* renamed from: a */
    public final void mo2289a(Bundle bundle) {
        this.f4717e.mo2490a(this);
    }

    /* renamed from: a */
    public final void mo2290a(bno bno) {
        this.f4718f.mo2354b(bno);
    }

    /* renamed from: a */
    public final void mo2288a(int i) {
        this.f4717e.mo2228d();
    }

    /* renamed from: a */
    public final void mo2316a(bwt bwt) {
        this.f4714b.post(new brx(this, bwt));
    }
}

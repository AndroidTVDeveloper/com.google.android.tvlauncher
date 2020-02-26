package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: brh  reason: default package */
/* compiled from: PG */
final class brh implements bry, bsn {
    public final boj a;
    public final bpk b;
    public btp c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ bri f;

    public brh(bri bri, boj boj, bpk bpk) {
        this.f = bri;
        this.a = boj;
        this.b = bpk;
    }

    public final void a(bno bno) {
        bri bri = this.f;
        Status status = bri.a;
        bri.l.post(new brg(this, bno));
    }

    public final void b(bno bno) {
        bri bri = this.f;
        Status status = bri.a;
        bre bre = (bre) bri.k.get(this.b);
        buh.a(bre.h.l);
        bre.b.d();
        bre.a(bno);
    }

    public final void a() {
        btp btp;
        if (this.e && (btp = this.c) != null) {
            this.a.a(btp, this.d);
        }
    }
}

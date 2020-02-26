package p000;

import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: brh */
/* compiled from: PG */
final class brh implements bry, bsn {

    /* renamed from: a */
    public final boj f4679a;

    /* renamed from: b */
    public final bpk f4680b;

    /* renamed from: c */
    public btp f4681c = null;

    /* renamed from: d */
    public Set f4682d = null;

    /* renamed from: e */
    public boolean f4683e = false;

    /* renamed from: f */
    public final /* synthetic */ bri f4684f;

    public brh(bri bri, boj boj, bpk bpk) {
        this.f4684f = bri;
        this.f4679a = boj;
        this.f4680b = bpk;
    }

    /* renamed from: a */
    public final void mo2314a(bno bno) {
        bri bri = this.f4684f;
        Status status = bri.f4685a;
        bri.f4697l.post(new brg(this, bno));
    }

    /* renamed from: b */
    public final void mo2354b(bno bno) {
        bri bri = this.f4684f;
        Status status = bri.f4685a;
        bre bre = (bre) bri.f4696k.get(this.f4680b);
        buh.m4202a(bre.f4671h.f4697l);
        bre.f4665b.mo2228d();
        bre.mo2290a(bno);
    }

    /* renamed from: a */
    public final void mo2353a() {
        btp btp;
        if (this.f4683e && (btp = this.f4681c) != null) {
            this.f4679a.mo2226a(btp, this.f4682d);
        }
    }
}

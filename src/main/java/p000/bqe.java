package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: bqe */
/* compiled from: PG */
public final class bqe implements bqu {

    /* renamed from: a */
    private final bqx f4576a;

    public bqe(bqx bqx) {
        this.f4576a = bqx;
    }

    /* renamed from: a */
    public final void mo2306a() {
    }

    /* renamed from: a */
    public final void mo2308a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo2309a(bno bno, bok bok, boolean z) {
    }

    /* renamed from: b */
    public final void mo2311b() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo2312c() {
        bqt bqt = this.f4576a.f4655l;
        bqt.f4618b.lock();
        try {
            Set set = bqt.f4624h;
            bqt.f4618b.unlock();
            this.f4576a.mo2333d();
        } catch (Throwable th) {
            bqt.f4618b.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final bpn mo2305a(bpn bpn) {
        return mo2310b(bpn);
    }

    /* renamed from: b */
    public final bpn mo2310b(bpn bpn) {
        try {
            this.f4576a.f4655l.f4625i.mo2368a(bpn);
            bqt bqt = this.f4576a.f4655l;
            boj boj = (boj) bqt.f4622f.get(bpn.f4550b);
            buh.m4200a(boj, "Appropriate Api was not requested.");
            if (boj.mo2229e() || !this.f4576a.f4650g.containsKey(bpn.f4550b)) {
                if (boj instanceof bue) {
                    bue bue = (bue) boj;
                    boj = null;
                }
                bpn.mo2281b(boj);
                return bpn;
            }
            bpn.mo2282b(new Status(17));
            return bpn;
        } catch (DeadObjectException e) {
            this.f4576a.mo2332a(new bqd(this, this));
        }
    }

    /* renamed from: a */
    public final void mo2307a(int i) {
        this.f4576a.mo2333d();
        this.f4576a.f4656m.mo2291a(i);
    }
}

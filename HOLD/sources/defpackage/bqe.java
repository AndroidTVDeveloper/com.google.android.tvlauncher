package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: bqe  reason: default package */
/* compiled from: PG */
public final class bqe implements bqu {
    private final bqx a;

    public bqe(bqx bqx) {
        this.a = bqx;
    }

    public final void a() {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(bno bno, bok bok, boolean z) {
    }

    public final void b() {
    }

    /* JADX INFO: finally extract failed */
    public final void c() {
        bqt bqt = this.a.l;
        bqt.b.lock();
        try {
            Set set = bqt.h;
            bqt.b.unlock();
            this.a.d();
        } catch (Throwable th) {
            bqt.b.unlock();
            throw th;
        }
    }

    public final bpn a(bpn bpn) {
        return b(bpn);
    }

    public final bpn b(bpn bpn) {
        try {
            this.a.l.i.a(bpn);
            bqt bqt = this.a.l;
            boj boj = (boj) bqt.f.get(bpn.b);
            buh.a(boj, "Appropriate Api was not requested.");
            if (boj.e() || !this.a.g.containsKey(bpn.b)) {
                if (boj instanceof bue) {
                    bue bue = (bue) boj;
                    boj = null;
                }
                bpn.b(boj);
                return bpn;
            }
            bpn.b(new Status(17));
            return bpn;
        } catch (DeadObjectException e) {
            this.a.a(new bqd(this, this));
        }
    }

    public final void a(int i) {
        this.a.d();
        this.a.m.a(i);
    }
}

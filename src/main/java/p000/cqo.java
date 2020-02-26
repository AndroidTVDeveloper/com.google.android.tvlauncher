package p000;

import android.database.Cursor;

/* renamed from: cqo */
/* compiled from: PG */
final class cqo extends C0285km implements crj, cri, crh, C0360ng {

    /* renamed from: p */
    public final cqz f6973p;

    /* renamed from: q */
    public final /* synthetic */ cqp f6974q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cqo(cqp cqp, cqz cqz) {
        super(cqz.mo3472a());
        this.f6974q = cqp;
        this.f6973p = cqz;
        cqz.mo3475a((crj) this);
        cqz.mo3474a((cri) this);
        cqz.mo3473a((crh) this);
    }

    /* renamed from: a */
    public final Object mo2791a() {
        int a = this.f6974q.mo2794a();
        int d = mo5436d();
        if (d == -1) {
            return null;
        }
        int i = this.f9788f;
        if (i == 1) {
            Cursor cursor = this.f6974q.f7034z;
            if (cursor == null || cursor.getCount() <= 0) {
                return null;
            }
            cqp cqp = this.f6974q;
            return cqp.f7024p == 0 ? cqp.f7019k : cqp.f7018j;
        } else if (d == a - 1 && i == 6) {
            return this.f6974q.f7021m;
        } else {
            if (d == a - 2 && cqp.m5521f(this.f6974q.f7024p) && (i == 3 || i == 2 || i == 4 || i == 5)) {
                return this.f6974q.f7022n;
            }
            if (d == a - 3 && cqp.m5521f(this.f6974q.f7024p)) {
                return this.f6974q.f7023o;
            }
            if (i == 4 || i == 5) {
                return this.f6974q.f7020l;
            }
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cqp.b(int, boolean):void
     arg types: [int, int]
     candidates:
      jp.b(int, int):void
      cqp.b(int, boolean):void */
    /* renamed from: u */
    public final void mo3585u() {
        int d = mo5436d();
        if (d != -1) {
            this.f6974q.mo3593b(d, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: c */
    public final void mo3584c(int i) {
        cqp cqp = this.f6974q;
        int a = cqp.m5518a(i, dcy.m6193b(cqp.f7010b));
        int i2 = cqp.f7024p;
        if (i2 != a) {
            boolean z = true;
            if (i2 == 1) {
                cfp cfp = cqp.f7012d;
                cfs cfs = new cfs(3, 0);
                cfs.mo2729b(dhs.f8540d);
                cfp.mo2714a(cfs);
            } else if (i2 == 2) {
                cfp cfp2 = cqp.f7012d;
                cfs cfs2 = new cfs(5, 0);
                cfs2.mo2729b(dhs.f8540d);
                cfp2.mo2714a(cfs2);
            } else if (i2 == 3) {
                cfp cfp3 = cqp.f7012d;
                cfs cfs3 = new cfs(7, (byte) 0);
                cfs3.mo2729b(dhs.f8540d);
                cfp3.mo2714a(cfs3);
            }
            cqp.f7024p = a;
            if (a == 1) {
                cfp cfp4 = cqp.f7012d;
                cfs cfs4 = new cfs(2, 0);
                cfs4.mo2729b(dhs.f8540d);
                cfp4.mo2714a(cfs4);
            } else if (a == 2) {
                cfp cfp5 = cqp.f7012d;
                cfs cfs5 = new cfs(4, 0);
                cfs5.mo2729b(dhs.f8540d);
                cfp5.mo2714a(cfs5);
            } else if (a == 3) {
                cfp cfp6 = cqp.f7012d;
                cfs cfs6 = new cfs(6, (byte) 0);
                cfs6.mo2729b(dhs.f8554r);
                cfs6.mo2725a(dhs.f8540d);
                cfp6.mo2714a(cfs6);
            }
            cse cse = cqp.f7031w;
            if (cqp.f7024p == 3) {
                z = false;
            }
            cse.f7169c = z;
            if (cqp.f7013e.mo892l()) {
                cqp.f6976B.post(cqp.f6988N);
            } else {
                cqp.f6988N.run();
            }
        }
    }
}

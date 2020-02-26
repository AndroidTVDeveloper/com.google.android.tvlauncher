package defpackage;

import android.database.Cursor;

/* renamed from: cqo  reason: default package */
/* compiled from: PG */
final class cqo extends km implements crj, cri, crh, ng {
    public final cqz p;
    public final /* synthetic */ cqp q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cqo(cqp cqp, cqz cqz) {
        super(cqz.a());
        this.q = cqp;
        this.p = cqz;
        cqz.a((crj) this);
        cqz.a((cri) this);
        cqz.a((crh) this);
    }

    public final Object a() {
        int a = this.q.a();
        int d = d();
        if (d == -1) {
            return null;
        }
        int i = this.f;
        if (i == 1) {
            Cursor cursor = this.q.z;
            if (cursor == null || cursor.getCount() <= 0) {
                return null;
            }
            cqp cqp = this.q;
            return cqp.p == 0 ? cqp.k : cqp.j;
        } else if (d == a - 1 && i == 6) {
            return this.q.m;
        } else {
            if (d == a - 2 && cqp.f(this.q.p) && (i == 3 || i == 2 || i == 4 || i == 5)) {
                return this.q.n;
            }
            if (d == a - 3 && cqp.f(this.q.p)) {
                return this.q.o;
            }
            if (i == 4 || i == 5) {
                return this.q.l;
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
    public final void u() {
        int d = d();
        if (d != -1) {
            this.q.b(d, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void c(int i) {
        cqp cqp = this.q;
        int a = cqp.a(i, dcy.b(cqp.b));
        int i2 = cqp.p;
        if (i2 != a) {
            boolean z = true;
            if (i2 == 1) {
                cfp cfp = cqp.d;
                cfs cfs = new cfs(3, 0);
                cfs.b(dhs.d);
                cfp.a(cfs);
            } else if (i2 == 2) {
                cfp cfp2 = cqp.d;
                cfs cfs2 = new cfs(5, 0);
                cfs2.b(dhs.d);
                cfp2.a(cfs2);
            } else if (i2 == 3) {
                cfp cfp3 = cqp.d;
                cfs cfs3 = new cfs(7, (byte) 0);
                cfs3.b(dhs.d);
                cfp3.a(cfs3);
            }
            cqp.p = a;
            if (a == 1) {
                cfp cfp4 = cqp.d;
                cfs cfs4 = new cfs(2, 0);
                cfs4.b(dhs.d);
                cfp4.a(cfs4);
            } else if (a == 2) {
                cfp cfp5 = cqp.d;
                cfs cfs5 = new cfs(4, 0);
                cfs5.b(dhs.d);
                cfp5.a(cfs5);
            } else if (a == 3) {
                cfp cfp6 = cqp.d;
                cfs cfs6 = new cfs(6, (byte) 0);
                cfs6.b(dhs.r);
                cfs6.a(dhs.d);
                cfp6.a(cfs6);
            }
            cse cse = cqp.w;
            if (cqp.p == 3) {
                z = false;
            }
            cse.c = z;
            if (cqp.e.l()) {
                cqp.B.post(cqp.N);
            } else {
                cqp.N.run();
            }
        }
    }
}

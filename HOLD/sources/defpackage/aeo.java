package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aeo  reason: default package */
/* compiled from: PG */
final class aeo {
    public final tj a;
    public final List b = new ArrayList();
    public final sx c;
    public boolean d;
    public ael e;
    public boolean f;
    public ael g;
    public Bitmap h;
    public ael i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final xg n;
    private boolean o;
    private su p;

    public aeo(si siVar, tj tjVar, int i2, int i3, ub ubVar, Bitmap bitmap) {
        xg xgVar = siVar.a;
        sx c2 = si.c(siVar.a());
        su a2 = si.c(siVar.a()).d().b(agj.b(vy.a).h().g().a(i2, i3));
        this.c = c2;
        Handler handler = new Handler(Looper.getMainLooper(), new aen(this));
        this.n = xgVar;
        this.m = handler;
        this.p = a2;
        this.a = tjVar;
        a(ubVar, bitmap);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return ((tn) this.a).g.c;
    }

    public final void c() {
        int i2;
        int i3;
        if (this.d && !this.o) {
            ael ael = this.i;
            if (ael == null) {
                this.o = true;
                tn tnVar = (tn) this.a;
                tl tlVar = tnVar.g;
                int i4 = tlVar.c;
                if (i4 <= 0 || (i3 = tnVar.f) < 0) {
                    i2 = 0;
                } else {
                    i2 = i3 < i4 ? ((tk) tlVar.e.get(i3)).i : -1;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                this.a.a();
                this.g = new ael(this.m, ((tn) this.a).f, uptimeMillis + ((long) i2));
                su a2 = this.p.b(new agj((byte) 0).a(new aho(Double.valueOf(Math.random()))));
                a2.a(this.a);
                a2.a((ahg) this.g);
                return;
            }
            this.i = null;
            a(ael);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ael ael) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, ael).sendToTarget();
        } else if (this.d) {
            if (ael.b != null) {
                d();
                ael ael2 = this.e;
                this.e = ael;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    ((aem) this.b.get(size)).c();
                }
                if (ael2 != null) {
                    this.m.obtainMessage(2, ael2).sendToTarget();
                }
            }
            c();
        } else {
            this.i = ael;
        }
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.a(bitmap);
            this.h = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ub ubVar, Bitmap bitmap) {
        ub ubVar2 = (ub) aic.a(ubVar);
        this.h = (Bitmap) aic.a(bitmap);
        this.p = this.p.b(new agj((byte) 0).a(ubVar));
        this.j = aie.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void b() {
        this.d = false;
    }
}

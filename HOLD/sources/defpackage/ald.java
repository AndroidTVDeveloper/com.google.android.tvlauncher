package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ald  reason: default package */
/* compiled from: PG */
public final class ald extends aiy implements akt {
    public final ajy b;
    public final Handler c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet g = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final bhn j;
    public final alk k;
    public final aiv l;
    public Surface m;
    public boolean n;
    public SurfaceHolder o;
    public int p;
    public float q;
    public awv r;
    public List s;
    private final akx[] t;
    private final alc u = new alc(this);
    private int v;
    private int w;
    private boolean x;

    @Deprecated
    public ald(Context context, ala ala, bgq bgq, akk akk, bhn bhn, alk alk, bkf bkf, Looper looper) {
        Context context2 = context;
        bhn bhn2 = bhn;
        alk alk2 = alk;
        this.j = bhn2;
        this.k = alk2;
        Handler handler = new Handler(looper);
        this.c = handler;
        alc alc = this.u;
        ArrayList arrayList = new ArrayList();
        ajg ajg = (ajg) ala;
        arrayList.add(new blx(ajg.a, ajg.b, handler, alc));
        Context context3 = ajg.a;
        boolean z = false;
        arrayList.add(new amy(context3, ajg.b, handler, alc, new amu(alr.a(context3), new alu[0])));
        arrayList.add(new bdt(alc, handler.getLooper()));
        arrayList.add(new auc(alc, handler.getLooper()));
        arrayList.add(new bml());
        this.t = (akx[]) arrayList.toArray(new akx[0]);
        this.q = 1.0f;
        this.p = 0;
        alq alq = alq.a;
        this.s = Collections.emptyList();
        ajy ajy = new ajy(this.t, bgq, akk, bhn, bkf, looper);
        this.b = ajy;
        bks.b(alk2.c == null || alk2.b.a.isEmpty());
        alk2.c = (akt) bks.a(ajy);
        a((aks) alk2);
        a((aks) this.u);
        this.h.add(alk2);
        this.d.add(alk2);
        this.i.add(alk2);
        this.e.add(alk2);
        this.g.add(alk2);
        Handler handler2 = this.c;
        bkn bkn = ((bid) bhn2).f;
        bks.a(handler2 != null ? true : z);
        bkn.a(alk2);
        bkn.a.add(new bkm(handler2, alk2));
        new akr(context2, this.c);
        this.l = new aiv(context2, this.c, this.u);
        new bsh(context2);
    }

    public final void a(aks aks) {
        u();
        this.b.e.addIfAbsent(new aiw(aks));
    }

    public final Looper e() {
        return this.b.c.getLooper();
    }

    public final long q() {
        u();
        return this.b.q();
    }

    public final int o() {
        u();
        return this.b.o();
    }

    public final int p() {
        u();
        return this.b.p();
    }

    public final long l() {
        u();
        return this.b.l();
    }

    public final alh r() {
        u();
        return this.b.r();
    }

    public final int k() {
        u();
        return this.b.k();
    }

    public final boolean h() {
        u();
        return this.b.g;
    }

    public final int f() {
        u();
        return this.b.f();
    }

    public final int g() {
        u();
        return this.b.h;
    }

    public final int i() {
        u();
        return this.b.i;
    }

    public final boolean j() {
        u();
        return this.b.j;
    }

    public final long m() {
        u();
        return this.b.m();
    }

    public final boolean n() {
        u();
        return this.b.n();
    }

    public final void a(int i2, int i3) {
        if (i2 != this.v || i3 != this.w) {
            this.v = i2;
            this.w = i3;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((bmb) it.next()).o();
            }
        }
    }

    public final void b(aks aks) {
        u();
        ajy ajy = this.b;
        Iterator it = ajy.e.iterator();
        while (it.hasNext()) {
            aiw aiw = (aiw) it.next();
            if (aiw.a.equals(aks)) {
                aiw.b = true;
                ajy.e.remove(aiw);
            }
        }
    }

    public final void s() {
        SurfaceHolder surfaceHolder = this.o;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.u);
            this.o = null;
        }
    }

    public final void t() {
        float f2 = this.q * this.l.c;
        for (akx akx : this.t) {
            if (akx.a() == 1) {
                akw a = this.b.a(akx);
                a.a(2);
                a.a(Float.valueOf(f2));
                a.b();
            }
        }
    }

    public final void a(boolean z) {
        u();
        aiv aiv = this.l;
        int f2 = f();
        int i2 = 1;
        if (!z) {
            aiv.b();
            i2 = -1;
        } else if (f2 != 1) {
            i2 = aiv.a();
        }
        a(z, i2);
    }

    @Deprecated
    public final void a(bmk bmk) {
        this.h.retainAll(Collections.singleton(this.k));
        if (bmk != null) {
            this.h.add(bmk);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [?[OBJECT, ARRAY], int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ald.a(android.view.Surface, boolean):void
     arg types: [android.view.Surface, int]
     candidates:
      ald.a(int, int):void
      ald.a(boolean, int):void
      ald.a(android.view.Surface, boolean):void */
    public final void a(SurfaceHolder surfaceHolder) {
        u();
        s();
        this.o = surfaceHolder;
        if (surfaceHolder == null) {
            a((Surface) null, false);
            a(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.u);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            a((Surface) null, false);
            a(0, 0);
            return;
        }
        a(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        a(surfaceFrame.width(), surfaceFrame.height());
    }

    public final void a(Surface surface, boolean z) {
        ArrayList<akw> arrayList = new ArrayList<>();
        for (akx akx : this.t) {
            if (akx.a() == 2) {
                akw a = this.b.a(akx);
                a.a(1);
                a.a(surface);
                a.b();
                arrayList.add(a);
            }
        }
        Surface surface2 = this.m;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (akw a2 : arrayList) {
                    a2.a();
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
            if (this.n) {
                this.m.release();
            }
        }
        this.m = surface;
        this.n = z;
    }

    public final void a(boolean z, int i2) {
        boolean z2;
        int i3;
        boolean z3 = true;
        if (z) {
            z2 = i2 != -1;
        } else {
            z2 = false;
        }
        if (!z2) {
            i3 = 0;
        } else {
            i3 = i2 != 1 ? 1 : 0;
        }
        ajy ajy = this.b;
        boolean a = ajy.a();
        int i4 = (!ajy.g || ajy.h != 0) ? 0 : 1;
        int i5 = (z2 && i3 == 0) ? 1 : 0;
        if (i4 != i5) {
            ajy.d.a.a(1, i5).sendToTarget();
        }
        boolean z4 = ajy.g != z2;
        boolean z5 = ajy.h != i3;
        ajy.g = z2;
        ajy.h = i3;
        if (a == ajy.a()) {
            z3 = false;
        }
        if (z4 || z5 || z3) {
            ajy.a(new aji(z4, ajy.p.e, z5, z3));
        }
    }

    public final void u() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() != e()) {
            if (!this.x) {
                illegalStateException = new IllegalStateException();
            } else {
                illegalStateException = null;
            }
            Log.w("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
            this.x = true;
        }
    }
}

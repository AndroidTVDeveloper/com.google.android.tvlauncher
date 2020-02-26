package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.R;
import java.util.Map;

/* renamed from: agj  reason: default package */
/* compiled from: PG */
public class agj implements Cloneable {
    private int a;
    public float c;
    public vy d;
    public sm e;
    public Drawable f;
    public int g;
    public Drawable h;
    public boolean i;
    public int j;
    public int k;
    public ts l;
    public boolean m;
    public boolean n;
    public Drawable o;
    public tx p;
    public Map q;
    public Class r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public agj() {
        this.c = 1.0f;
        this.d = vy.d;
        this.e = sm.NORMAL;
        this.i = true;
        this.j = -1;
        this.k = -1;
        this.l = ahn.b;
        this.n = true;
        this.p = new tx();
        this.q = new ahs();
        this.r = Object.class;
        this.u = true;
    }

    private static boolean b(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public agj b(agj agj) {
        if (this.t) {
            return clone().b(agj);
        }
        if (b(agj.a, 2)) {
            this.c = agj.c;
        }
        if (b(agj.a, 1048576)) {
            this.v = agj.v;
        }
        if (b(agj.a, 4)) {
            this.d = agj.d;
        }
        if (b(agj.a, 8)) {
            this.e = agj.e;
        }
        if (b(agj.a, 16)) {
            this.f = agj.f;
            this.g = 0;
            this.a &= -33;
        }
        if (b(agj.a, 32)) {
            this.g = agj.g;
            this.f = null;
            this.a &= -17;
        }
        if (b(agj.a, 64)) {
            this.h = agj.h;
            this.a &= -129;
        }
        if (b(agj.a, 128)) {
            this.h = null;
            this.a &= -65;
        }
        if (b(agj.a, 256)) {
            this.i = agj.i;
        }
        if (b(agj.a, 512)) {
            this.k = agj.k;
            this.j = agj.j;
        }
        if (b(agj.a, 1024)) {
            this.l = agj.l;
        }
        if (b(agj.a, 4096)) {
            this.r = agj.r;
        }
        if (b(agj.a, 8192)) {
            this.o = agj.o;
            this.a &= -16385;
        }
        if (b(agj.a, 16384)) {
            this.o = null;
            this.a &= -8193;
        }
        if (b(agj.a, 65536)) {
            this.n = agj.n;
        }
        if (b(agj.a, 131072)) {
            this.m = agj.m;
        }
        if (b(agj.a, 2048)) {
            this.q.putAll(agj.q);
            this.u = agj.u;
        }
        if (!this.n) {
            this.q.clear();
            int i2 = this.a;
            this.m = false;
            this.a = i2 & -133121;
            this.u = true;
        }
        this.a |= agj.a;
        this.p.a(agj.p);
        return b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(acu, ub, boolean):agj
     arg types: [acu, acj, int]
     candidates:
      agj.a(java.lang.Class, ub, boolean):agj
      agj.a(acu, ub, boolean):agj */
    public final agj d() {
        return a(acu.c, (ub) new acj(), true);
    }

    /* renamed from: a */
    public agj clone() {
        try {
            agj agj = (agj) super.clone();
            tx txVar = new tx();
            agj.p = txVar;
            txVar.a(this.p);
            ahs ahs = new ahs();
            agj.q = ahs;
            ahs.putAll(this.q);
            agj.s = false;
            agj.t = false;
            return agj;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final agj b(Class cls) {
        if (this.t) {
            return clone().b(cls);
        }
        this.r = (Class) aic.a(cls);
        this.a |= 4096;
        return b();
    }

    public final agj a(vy vyVar) {
        if (this.t) {
            return clone().a(vyVar);
        }
        this.d = (vy) aic.a(vyVar);
        this.a |= 4;
        return b();
    }

    public final agj a(acu acu) {
        return a(acu.g, (acu) aic.a(acu));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agj) {
            agj agj = (agj) obj;
            if (Float.compare(agj.c, this.c) != 0 || this.g != agj.g || !aie.a(this.f, agj.f) || !aie.a(this.h, agj.h) || !aie.a(this.o, agj.o) || this.i != agj.i || this.j != agj.j || this.k != agj.k || this.m != agj.m || this.n != agj.n || !this.d.equals(agj.d) || this.e != agj.e || !this.p.equals(agj.p) || !this.q.equals(agj.q) || !this.r.equals(agj.r) || !aie.a(this.l, agj.l) || !aie.a((Object) null, (Object) null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final agj f() {
        if (this.t) {
            return clone().f();
        }
        this.g = R.drawable.ic_action_inputs_black;
        int i2 = this.a;
        this.f = null;
        this.a = (i2 | 32) & -17;
        return b();
    }

    public final agj c(Drawable drawable) {
        if (this.t) {
            return clone().c(drawable);
        }
        this.f = drawable;
        int i2 = this.a;
        this.g = 0;
        this.a = (i2 | 16) & -33;
        return b();
    }

    public final agj b(Drawable drawable) {
        if (this.t) {
            return clone().b(drawable);
        }
        this.o = drawable;
        this.a = (this.a | 8192) & -16385;
        return b();
    }

    public final int hashCode() {
        int a2 = aie.a(this.c);
        int a3 = aie.a(this.o, aie.b(0, aie.a(this.h, aie.b(0, aie.a(this.f, aie.b(this.g, a2))))));
        boolean z = this.i;
        int i2 = this.j;
        int i3 = this.k;
        boolean z2 = this.m;
        boolean z3 = this.n;
        return aie.a((Object) null, aie.a(this.l, aie.a(this.r, aie.a(this.q, aie.a(this.p, aie.a(this.e, aie.a(this.d, aie.b(0, aie.b(0, aie.b(z3 ? 1 : 0, aie.b(z2 ? 1 : 0, aie.b(i3, aie.b(i2, aie.b(z ? 1 : 0, a3))))))))))))));
    }

    public final boolean a(int i2) {
        return b(this.a, i2);
    }

    public final boolean e() {
        return aie.a(this.k, this.j);
    }

    public final void i() {
        this.s = true;
    }

    public final agj c() {
        return b(acu.c, new acj());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(acu, ub, boolean):agj
     arg types: [acu, ub, int]
     candidates:
      agj.a(java.lang.Class, ub, boolean):agj
      agj.a(acu, ub, boolean):agj */
    public final agj b(acu acu, ub ubVar) {
        return a(acu, ubVar, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(ub, boolean):agj
     arg types: [ub, int]
     candidates:
      agj.a(tw, java.lang.Object):agj
      agj.a(int, int):agj
      agj.a(acu, ub):agj
      agj.a(ub, boolean):agj */
    public final agj a(acu acu, ub ubVar) {
        if (this.t) {
            return clone().a(acu, ubVar);
        }
        a(acu);
        return a(ubVar, false);
    }

    public final agj a(int i2, int i3) {
        if (this.t) {
            return clone().a(i2, i3);
        }
        this.k = i2;
        this.j = i3;
        this.a |= 512;
        return b();
    }

    public final agj a(Drawable drawable) {
        if (this.t) {
            return clone().a(drawable);
        }
        this.h = drawable;
        this.a = (this.a | 64) & -129;
        return b();
    }

    public final agj a(sm smVar) {
        if (this.t) {
            return clone().a(smVar);
        }
        this.e = (sm) aic.a(smVar);
        this.a |= 8;
        return b();
    }

    private final agj a(acu acu, ub ubVar, boolean z) {
        agj agj;
        if (z) {
            agj = c(acu, ubVar);
        } else {
            agj = a(acu, ubVar);
        }
        agj.u = true;
        return agj;
    }

    private final agj b() {
        if (!this.s) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    private final agj a(tw twVar, Object obj) {
        if (this.t) {
            return clone().a(twVar, obj);
        }
        aic.a(twVar);
        aic.a(obj);
        this.p.a(twVar, obj);
        return b();
    }

    public final agj a(ts tsVar) {
        if (this.t) {
            return clone().a(tsVar);
        }
        this.l = (ts) aic.a(tsVar);
        this.a |= 1024;
        return b();
    }

    public final agj g() {
        if (this.t) {
            return clone().g();
        }
        this.i = false;
        this.a |= 256;
        return b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(ub, boolean):agj
     arg types: [ub, int]
     candidates:
      agj.a(tw, java.lang.Object):agj
      agj.a(int, int):agj
      agj.a(acu, ub):agj
      agj.a(ub, boolean):agj */
    public final agj a(ub ubVar) {
        return a(ubVar, true);
    }

    private final agj a(ub ubVar, boolean z) {
        if (this.t) {
            return clone().a(ubVar, z);
        }
        ada ada = new ada(ubVar, z);
        a(Bitmap.class, ubVar, z);
        a(Drawable.class, ada, z);
        a(BitmapDrawable.class, ada, z);
        a(aeh.class, new aek(ubVar), z);
        return b();
    }

    private final agj c(acu acu, ub ubVar) {
        if (this.t) {
            return clone().c(acu, ubVar);
        }
        a(acu);
        return a(ubVar);
    }

    private final agj a(Class cls, ub ubVar, boolean z) {
        if (this.t) {
            return clone().a(cls, ubVar, z);
        }
        aic.a(cls);
        aic.a(ubVar);
        this.q.put(cls, ubVar);
        int i2 = this.a;
        this.n = true;
        int i3 = i2 | 67584;
        this.a = i3;
        this.u = false;
        if (z) {
            this.a = i3 | 131072;
            this.m = true;
        }
        return b();
    }

    public final agj h() {
        if (this.t) {
            return clone().h();
        }
        this.v = true;
        this.a |= 1048576;
        return b();
    }

    public agj(byte b) {
        this();
    }

    public static agj a(Class cls) {
        return new agj((byte) 0).b(cls);
    }

    public static agj b(vy vyVar) {
        return new agj((byte) 0).a(vyVar);
    }
}

package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.R;
import java.util.Map;

/* renamed from: agj */
/* compiled from: PG */
public class agj implements Cloneable {

    /* renamed from: a */
    private int f271a;

    /* renamed from: c */
    public float f272c;

    /* renamed from: d */
    public C0594vy f273d;

    /* renamed from: e */
    public C0501sm f274e;

    /* renamed from: f */
    public Drawable f275f;

    /* renamed from: g */
    public int f276g;

    /* renamed from: h */
    public Drawable f277h;

    /* renamed from: i */
    public boolean f278i;

    /* renamed from: j */
    public int f279j;

    /* renamed from: k */
    public int f280k;

    /* renamed from: l */
    public C0534ts f281l;

    /* renamed from: m */
    public boolean f282m;

    /* renamed from: n */
    public boolean f283n;

    /* renamed from: o */
    public Drawable f284o;

    /* renamed from: p */
    public C0539tx f285p;

    /* renamed from: q */
    public Map f286q;

    /* renamed from: r */
    public Class f287r;

    /* renamed from: s */
    public boolean f288s;

    /* renamed from: t */
    public boolean f289t;

    /* renamed from: u */
    public boolean f290u;

    /* renamed from: v */
    public boolean f291v;

    public agj() {
        this.f272c = 1.0f;
        this.f273d = C0594vy.f10652d;
        this.f274e = C0501sm.NORMAL;
        this.f278i = true;
        this.f279j = -1;
        this.f280k = -1;
        this.f281l = ahn.f372b;
        this.f283n = true;
        this.f285p = new C0539tx();
        this.f286q = new ahs();
        this.f287r = Object.class;
        this.f290u = true;
    }

    /* renamed from: b */
    private static boolean m345b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    public agj mo202b(agj agj) {
        if (this.f289t) {
            return clone().mo202b(agj);
        }
        if (m345b(agj.f271a, 2)) {
            this.f272c = agj.f272c;
        }
        if (m345b(agj.f271a, 1048576)) {
            this.f291v = agj.f291v;
        }
        if (m345b(agj.f271a, 4)) {
            this.f273d = agj.f273d;
        }
        if (m345b(agj.f271a, 8)) {
            this.f274e = agj.f274e;
        }
        if (m345b(agj.f271a, 16)) {
            this.f275f = agj.f275f;
            this.f276g = 0;
            this.f271a &= -33;
        }
        if (m345b(agj.f271a, 32)) {
            this.f276g = agj.f276g;
            this.f275f = null;
            this.f271a &= -17;
        }
        if (m345b(agj.f271a, 64)) {
            this.f277h = agj.f277h;
            this.f271a &= -129;
        }
        if (m345b(agj.f271a, 128)) {
            this.f277h = null;
            this.f271a &= -65;
        }
        if (m345b(agj.f271a, 256)) {
            this.f278i = agj.f278i;
        }
        if (m345b(agj.f271a, 512)) {
            this.f280k = agj.f280k;
            this.f279j = agj.f279j;
        }
        if (m345b(agj.f271a, 1024)) {
            this.f281l = agj.f281l;
        }
        if (m345b(agj.f271a, 4096)) {
            this.f287r = agj.f287r;
        }
        if (m345b(agj.f271a, 8192)) {
            this.f284o = agj.f284o;
            this.f271a &= -16385;
        }
        if (m345b(agj.f271a, 16384)) {
            this.f284o = null;
            this.f271a &= -8193;
        }
        if (m345b(agj.f271a, 65536)) {
            this.f283n = agj.f283n;
        }
        if (m345b(agj.f271a, 131072)) {
            this.f282m = agj.f282m;
        }
        if (m345b(agj.f271a, 2048)) {
            this.f286q.putAll(agj.f286q);
            this.f290u = agj.f290u;
        }
        if (!this.f283n) {
            this.f286q.clear();
            int i = this.f271a;
            this.f282m = false;
            this.f271a = i & -133121;
            this.f290u = true;
        }
        this.f271a |= agj.f271a;
        this.f285p.mo5989a(agj.f285p);
        return mo5940b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(acu, ub, boolean):agj
     arg types: [acu, acj, int]
     candidates:
      agj.a(java.lang.Class, ub, boolean):agj
      agj.a(acu, ub, boolean):agj */
    /* renamed from: d */
    public final agj mo207d() {
        return m337a(acu.f101c, (C0544ub) new acj(), true);
    }

    /* renamed from: a */
    public agj clone() {
        try {
            agj agj = (agj) super.clone();
            C0539tx txVar = new C0539tx();
            agj.f285p = txVar;
            txVar.mo5989a(this.f285p);
            ahs ahs = new ahs();
            agj.f286q = ahs;
            ahs.putAll(this.f286q);
            agj.f288s = false;
            agj.f289t = false;
            return agj;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private final agj m343b(Class cls) {
        if (this.f289t) {
            return clone().m343b(cls);
        }
        this.f287r = (Class) aic.m542a(cls);
        this.f271a |= 4096;
        return mo5940b();
    }

    /* renamed from: a */
    public final agj mo199a(C0594vy vyVar) {
        if (this.f289t) {
            return clone().mo199a(vyVar);
        }
        this.f273d = (C0594vy) aic.m542a(vyVar);
        this.f271a |= 4;
        return mo5940b();
    }

    /* renamed from: a */
    public final agj mo193a(acu acu) {
        return m340a(acu.f105g, (acu) aic.m542a(acu));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agj) {
            agj agj = (agj) obj;
            if (Float.compare(agj.f272c, this.f272c) != 0 || this.f276g != agj.f276g || !aie.m561a(this.f275f, agj.f275f) || !aie.m561a(this.f277h, agj.f277h) || !aie.m561a(this.f284o, agj.f284o) || this.f278i != agj.f278i || this.f279j != agj.f279j || this.f280k != agj.f280k || this.f282m != agj.f282m || this.f283n != agj.f283n || !this.f273d.equals(agj.f273d) || this.f274e != agj.f274e || !this.f285p.equals(agj.f285p) || !this.f286q.equals(agj.f286q) || !this.f287r.equals(agj.f287r) || !aie.m561a(this.f281l, agj.f281l) || !aie.m561a((Object) null, (Object) null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final agj mo210f() {
        if (this.f289t) {
            return clone().mo210f();
        }
        this.f276g = R.drawable.ic_action_inputs_black;
        int i = this.f271a;
        this.f275f = null;
        this.f271a = (i | 32) & -17;
        return mo5940b();
    }

    /* renamed from: c */
    public final agj mo205c(Drawable drawable) {
        if (this.f289t) {
            return clone().mo205c(drawable);
        }
        this.f275f = drawable;
        int i = this.f271a;
        this.f276g = 0;
        this.f271a = (i | 16) & -33;
        return mo5940b();
    }

    /* renamed from: b */
    public final agj mo203b(Drawable drawable) {
        if (this.f289t) {
            return clone().mo203b(drawable);
        }
        this.f284o = drawable;
        this.f271a = (this.f271a | 8192) & -16385;
        return mo5940b();
    }

    public final int hashCode() {
        int a = aie.m553a(this.f272c);
        int a2 = aie.m556a(this.f284o, aie.m562b(0, aie.m556a(this.f277h, aie.m562b(0, aie.m556a(this.f275f, aie.m562b(this.f276g, a))))));
        boolean z = this.f278i;
        int i = this.f279j;
        int i2 = this.f280k;
        boolean z2 = this.f282m;
        boolean z3 = this.f283n;
        return aie.m556a((Object) null, aie.m556a(this.f281l, aie.m556a(this.f287r, aie.m556a(this.f286q, aie.m556a(this.f285p, aie.m556a(this.f274e, aie.m556a(this.f273d, aie.m562b(0, aie.m562b(0, aie.m562b(z3 ? 1 : 0, aie.m562b(z2 ? 1 : 0, aie.m562b(i2, aie.m562b(i, aie.m562b(z ? 1 : 0, a2))))))))))))));
    }

    /* renamed from: a */
    public final boolean mo200a(int i) {
        return m345b(this.f271a, i);
    }

    /* renamed from: e */
    public final boolean mo208e() {
        return aie.m560a(this.f280k, this.f279j);
    }

    /* renamed from: i */
    public final void mo214i() {
        this.f288s = true;
    }

    /* renamed from: c */
    public final agj mo204c() {
        return mo201b(acu.f101c, new acj());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(acu, ub, boolean):agj
     arg types: [acu, ub, int]
     candidates:
      agj.a(java.lang.Class, ub, boolean):agj
      agj.a(acu, ub, boolean):agj */
    /* renamed from: b */
    public final agj mo201b(acu acu, C0544ub ubVar) {
        return m337a(acu, ubVar, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(ub, boolean):agj
     arg types: [ub, int]
     candidates:
      agj.a(tw, java.lang.Object):agj
      agj.a(int, int):agj
      agj.a(acu, ub):agj
      agj.a(ub, boolean):agj */
    /* renamed from: a */
    public final agj mo194a(acu acu, C0544ub ubVar) {
        if (this.f289t) {
            return clone().mo194a(acu, ubVar);
        }
        mo193a(acu);
        return m341a(ubVar, false);
    }

    /* renamed from: a */
    public final agj mo192a(int i, int i2) {
        if (this.f289t) {
            return clone().mo192a(i, i2);
        }
        this.f280k = i;
        this.f279j = i2;
        this.f271a |= 512;
        return mo5940b();
    }

    /* renamed from: a */
    public final agj mo195a(Drawable drawable) {
        if (this.f289t) {
            return clone().mo195a(drawable);
        }
        this.f277h = drawable;
        this.f271a = (this.f271a | 64) & -129;
        return mo5940b();
    }

    /* renamed from: a */
    public final agj mo196a(C0501sm smVar) {
        if (this.f289t) {
            return clone().mo196a(smVar);
        }
        this.f274e = (C0501sm) aic.m542a(smVar);
        this.f271a |= 8;
        return mo5940b();
    }

    /* renamed from: a */
    private final agj m337a(acu acu, C0544ub ubVar, boolean z) {
        agj agj;
        if (z) {
            agj = m346c(acu, ubVar);
        } else {
            agj = mo194a(acu, ubVar);
        }
        agj.f290u = true;
        return agj;
    }

    /* renamed from: b */
    private final agj mo5940b() {
        if (!this.f288s) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: a */
    private final agj m340a(C0538tw twVar, Object obj) {
        if (this.f289t) {
            return clone().m340a(twVar, obj);
        }
        aic.m542a(twVar);
        aic.m542a(obj);
        this.f285p.mo5988a(twVar, obj);
        return mo5940b();
    }

    /* renamed from: a */
    public final agj mo197a(C0534ts tsVar) {
        if (this.f289t) {
            return clone().mo197a(tsVar);
        }
        this.f281l = (C0534ts) aic.m542a(tsVar);
        this.f271a |= 1024;
        return mo5940b();
    }

    /* renamed from: g */
    public final agj mo211g() {
        if (this.f289t) {
            return clone().mo211g();
        }
        this.f278i = false;
        this.f271a |= 256;
        return mo5940b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agj.a(ub, boolean):agj
     arg types: [ub, int]
     candidates:
      agj.a(tw, java.lang.Object):agj
      agj.a(int, int):agj
      agj.a(acu, ub):agj
      agj.a(ub, boolean):agj */
    /* renamed from: a */
    public final agj mo198a(C0544ub ubVar) {
        return m341a(ubVar, true);
    }

    /* renamed from: a */
    private final agj m341a(C0544ub ubVar, boolean z) {
        if (this.f289t) {
            return clone().m341a(ubVar, z);
        }
        ada ada = new ada(ubVar, z);
        m339a(Bitmap.class, ubVar, z);
        m339a(Drawable.class, ada, z);
        m339a(BitmapDrawable.class, ada, z);
        m339a(aeh.class, new aek(ubVar), z);
        return mo5940b();
    }

    /* renamed from: c */
    private final agj m346c(acu acu, C0544ub ubVar) {
        if (this.f289t) {
            return clone().m346c(acu, ubVar);
        }
        mo193a(acu);
        return mo198a(ubVar);
    }

    /* renamed from: a */
    private final agj m339a(Class cls, C0544ub ubVar, boolean z) {
        if (this.f289t) {
            return clone().m339a(cls, ubVar, z);
        }
        aic.m542a(cls);
        aic.m542a(ubVar);
        this.f286q.put(cls, ubVar);
        int i = this.f271a;
        this.f283n = true;
        int i2 = i | 67584;
        this.f271a = i2;
        this.f290u = false;
        if (z) {
            this.f271a = i2 | 131072;
            this.f282m = true;
        }
        return mo5940b();
    }

    /* renamed from: h */
    public final agj mo212h() {
        if (this.f289t) {
            return clone().mo212h();
        }
        this.f291v = true;
        this.f271a |= 1048576;
        return mo5940b();
    }

    public agj(byte b) {
        this();
    }

    /* renamed from: a */
    public static agj m338a(Class cls) {
        return new agj((byte) 0).m343b(cls);
    }

    /* renamed from: b */
    public static agj m344b(C0594vy vyVar) {
        return new agj((byte) 0).mo199a(vyVar);
    }
}

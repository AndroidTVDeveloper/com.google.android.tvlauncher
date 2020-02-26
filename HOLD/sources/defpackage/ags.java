package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ags  reason: default package */
/* compiled from: PG */
public final class ags implements agm, ahf, agr {
    private final ain a = ain.a();
    private final Object b;
    private final agq c;
    private final ago d;
    private final Context e;
    private final sl f;
    private final Object g;
    private final Class h;
    private final agj i;
    private final int j;
    private final int k;
    private final sm l;
    private final ahg m;
    private final List n;
    private final Executor o;
    private ww p;
    private we q;
    private long r;
    private volatile wf s;
    private Drawable t;
    private Drawable u;
    private Drawable v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    public ags(Context context, sl slVar, Object obj, Object obj2, Class cls, agj agj, int i2, int i3, sm smVar, ahg ahg, agq agq, List list, ago ago, wf wfVar, Executor executor) {
        this.b = obj;
        this.e = context;
        this.f = slVar;
        this.g = obj2;
        this.h = cls;
        this.i = agj;
        this.j = i2;
        this.k = i3;
        this.l = smVar;
        this.m = ahg;
        this.c = agq;
        this.n = list;
        this.d = ago;
        this.s = wfVar;
        this.o = executor;
        this.z = 1;
    }

    private final void i() {
        if (this.y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            r6.i()     // Catch:{ all -> 0x0086 }
            ain r1 = r6.a     // Catch:{ all -> 0x0086 }
            r1.b()     // Catch:{ all -> 0x0086 }
            long r1 = defpackage.ahy.a()     // Catch:{ all -> 0x0086 }
            r6.r = r1     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = r6.g     // Catch:{ all -> 0x0086 }
            r2 = 5
            r3 = 3
            if (r1 != 0) goto L_0x003e
            int r1 = r6.j     // Catch:{ all -> 0x0086 }
            int r4 = r6.k     // Catch:{ all -> 0x0086 }
            boolean r1 = defpackage.aie.a(r1, r4)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0029
            int r1 = r6.j     // Catch:{ all -> 0x0086 }
            r6.w = r1     // Catch:{ all -> 0x0086 }
            int r1 = r6.k     // Catch:{ all -> 0x0086 }
            r6.x = r1     // Catch:{ all -> 0x0086 }
        L_0x0029:
            android.graphics.drawable.Drawable r1 = r6.k()     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 3
        L_0x0032:
            wq r1 = new wq     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x0086 }
            r6.a(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x003e:
            int r1 = r6.z     // Catch:{ all -> 0x0086 }
            r4 = 2
            if (r1 == r4) goto L_0x007e
            r5 = 4
            if (r1 == r5) goto L_0x0077
            r6.z = r3     // Catch:{ all -> 0x0086 }
            int r1 = r6.j     // Catch:{ all -> 0x0086 }
            int r2 = r6.k     // Catch:{ all -> 0x0086 }
            boolean r1 = defpackage.aie.a(r1, r2)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x005a
            int r1 = r6.j     // Catch:{ all -> 0x0086 }
            int r2 = r6.k     // Catch:{ all -> 0x0086 }
            r6.a(r1, r2)     // Catch:{ all -> 0x0086 }
            goto L_0x005f
        L_0x005a:
            ahg r1 = r6.m     // Catch:{ all -> 0x0086 }
            r1.a(r6)     // Catch:{ all -> 0x0086 }
        L_0x005f:
            int r1 = r6.z     // Catch:{ all -> 0x0086 }
            if (r1 == r4) goto L_0x0066
            if (r1 == r3) goto L_0x0066
            goto L_0x0075
        L_0x0066:
            boolean r1 = r6.l()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0075
            ahg r1 = r6.m     // Catch:{ all -> 0x0086 }
            android.graphics.drawable.Drawable r2 = r6.j()     // Catch:{ all -> 0x0086 }
            r1.b(r2)     // Catch:{ all -> 0x0086 }
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0077:
            ww r1 = r6.p     // Catch:{ all -> 0x0086 }
            r6.a(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x007e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x0086 }
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ags.a():void");
    }

    private final boolean l() {
        ago ago = this.d;
        return ago == null || ago.c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        if (r3.d(r6) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        defpackage.wf.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            r6.i()     // Catch:{ all -> 0x005c }
            ain r1 = r6.a     // Catch:{ all -> 0x005c }
            r1.b()     // Catch:{ all -> 0x005c }
            int r1 = r6.z     // Catch:{ all -> 0x005c }
            r2 = 6
            if (r1 == r2) goto L_0x005a
            r6.i()     // Catch:{ all -> 0x005c }
            ain r1 = r6.a     // Catch:{ all -> 0x005c }
            r1.b()     // Catch:{ all -> 0x005c }
            ahg r1 = r6.m     // Catch:{ all -> 0x005c }
            r1.b(r6)     // Catch:{ all -> 0x005c }
            we r1 = r6.q     // Catch:{ all -> 0x005c }
            r3 = 0
            if (r1 == 0) goto L_0x0033
            wf r4 = r1.c     // Catch:{ all -> 0x005c }
            monitor-enter(r4)     // Catch:{ all -> 0x005c }
            wk r5 = r1.a     // Catch:{ all -> 0x0030 }
            agr r1 = r1.b     // Catch:{ all -> 0x0030 }
            r5.a(r1)     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            r6.q = r3     // Catch:{ all -> 0x005c }
            goto L_0x0033
        L_0x0030:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x005c }
        L_0x0033:
            ww r1 = r6.p     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x003a
            r6.p = r3     // Catch:{ all -> 0x005c }
            goto L_0x003c
        L_0x003a:
            r1 = r3
        L_0x003c:
            ago r3 = r6.d     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            boolean r3 = r3.d(r6)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0050
        L_0x0047:
            ahg r3 = r6.m     // Catch:{ all -> 0x005c }
            android.graphics.drawable.Drawable r4 = r6.j()     // Catch:{ all -> 0x005c }
            r3.a(r4)     // Catch:{ all -> 0x005c }
        L_0x0050:
            r6.z = r2     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0059
            defpackage.wf.a(r1)
        L_0x0059:
            return
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ags.b():void");
    }

    private final Drawable k() {
        if (this.v == null) {
            this.v = this.i.o;
        }
        return this.v;
    }

    public final Object h() {
        this.a.b();
        return this.b;
    }

    private final Drawable j() {
        if (this.u == null) {
            this.u = this.i.h;
        }
        return this.u;
    }

    public final boolean g() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.z == 4;
        }
        return z2;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.z == 6;
        }
        return z2;
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.z == 4;
        }
        return z2;
    }

    public final boolean a(agm agm) {
        int i2;
        int i3;
        Object obj;
        Class cls;
        agj agj;
        sm smVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        agj agj2;
        sm smVar2;
        int i6;
        agm agm2 = agm;
        if (!(agm2 instanceof ags)) {
            return false;
        }
        synchronized (this.b) {
            i2 = this.j;
            i3 = this.k;
            obj = this.g;
            cls = this.h;
            agj = this.i;
            smVar = this.l;
            List list = this.n;
            size = list != null ? list.size() : 0;
        }
        ags ags = (ags) agm2;
        synchronized (ags.b) {
            i4 = ags.j;
            i5 = ags.k;
            obj2 = ags.g;
            cls2 = ags.h;
            agj2 = ags.i;
            smVar2 = ags.l;
            List list2 = ags.n;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        return i2 == i4 && i3 == i5 && aie.b(obj, obj2) && cls.equals(cls2) && agj.equals(agj2) && smVar == smVar2 && size == i6;
    }

    private final void m() {
        ago ago = this.d;
        if (ago == null || ago.h().g()) {
        }
    }

    public final boolean d() {
        boolean z2;
        synchronized (this.b) {
            int i2 = this.z;
            z2 = true;
            if (!(i2 == 2 || i2 == 3)) {
                z2 = false;
            }
        }
        return z2;
    }

    private static int a(int i2, float f2) {
        if (i2 != Integer.MIN_VALUE) {
            return Math.round(f2 * ((float) i2));
        }
        return Integer.MIN_VALUE;
    }

    public final void a(wq wqVar) {
        a(wqVar, 5);
    }

    /* JADX INFO: finally extract failed */
    private final void a(wq wqVar, int i2) {
        int i3;
        this.a.b();
        synchronized (this.b) {
            if (this.f.g <= i2) {
                String valueOf = String.valueOf(this.g);
                int i4 = this.w;
                int i5 = this.x;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("Load failed for ");
                sb.append(valueOf);
                sb.append(" with size [");
                sb.append(i4);
                sb.append("x");
                sb.append(i5);
                sb.append("]");
                Log.w("Glide", sb.toString(), wqVar);
                List a2 = wqVar.a();
                int size = a2.size();
                int i6 = 0;
                while (i6 < size) {
                    int i7 = i6 + 1;
                    StringBuilder sb2 = new StringBuilder(39);
                    sb2.append("Root cause (");
                    sb2.append(i7);
                    sb2.append(" of ");
                    sb2.append(size);
                    sb2.append(")");
                    sb2.toString();
                    Throwable th = (Throwable) a2.get(i6);
                    i6 = i7;
                }
            }
            Drawable drawable = null;
            this.q = null;
            this.z = 5;
            this.y = true;
            try {
                List<agq> list = this.n;
                if (list != null) {
                    for (agq a3 : list) {
                        m();
                        a3.a(wqVar);
                    }
                }
                agq agq = this.c;
                if (agq != null) {
                    m();
                    agq.a(wqVar);
                }
                if (l()) {
                    if (this.g == null) {
                        drawable = k();
                    }
                    if (drawable == null) {
                        if (this.t == null) {
                            agj agj = this.i;
                            Drawable drawable2 = agj.f;
                            this.t = drawable2;
                            if (drawable2 == null && (i3 = agj.g) > 0) {
                                Resources.Theme theme = this.e.getTheme();
                                sl slVar = this.f;
                                this.t = adx.a(slVar, slVar, i3, theme);
                            }
                        }
                        drawable = this.t;
                    }
                    if (drawable == null) {
                        drawable = j();
                    }
                    this.m.c(drawable);
                }
                this.y = false;
                ago ago = this.d;
                if (ago != null) {
                    ago.f(this);
                }
            } catch (Throwable th2) {
                this.y = false;
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bb, code lost:
        r12 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ww r11, int r12) {
        /*
            r10 = this;
            ain r0 = r10.a
            r0.b()
            r0 = 0
            java.lang.Object r1 = r10.b     // Catch:{ all -> 0x01c0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01c0 }
            r10.q = r0     // Catch:{ all -> 0x01b6 }
            if (r11 != 0) goto L_0x003d
            wq r11 = new wq     // Catch:{ all -> 0x01b6 }
            java.lang.Class r12 = r10.h     // Catch:{ all -> 0x01b6 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01b6 }
            int r2 = r2.length()     // Catch:{ all -> 0x01b6 }
            int r2 = r2 + 82
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            r3.<init>(r2)     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r3.append(r2)     // Catch:{ all -> 0x01b6 }
            r3.append(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.String r12 = " inside, but instead got null."
            r3.append(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x01b6 }
            r11.<init>(r12)     // Catch:{ all -> 0x01b6 }
            r10.a(r11)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b6 }
            return
        L_0x003d:
            java.lang.Object r2 = r11.b()     // Catch:{ all -> 0x01b6 }
            if (r2 == 0) goto L_0x0129
            java.lang.Class r3 = r10.h     // Catch:{ all -> 0x01b6 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x01b6 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x01b6 }
            if (r3 == 0) goto L_0x0129
            ago r3 = r10.d     // Catch:{ all -> 0x01b6 }
            r4 = 4
            if (r3 == 0) goto L_0x0065
            boolean r3 = r3.b(r10)     // Catch:{ all -> 0x01b6 }
            if (r3 == 0) goto L_0x005b
            goto L_0x0065
        L_0x005b:
            r10.p = r0     // Catch:{ all -> 0x01b4 }
            r10.z = r4     // Catch:{ all -> 0x01b4 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b4 }
        L_0x0061:
            defpackage.wf.a(r11)
            return
        L_0x0065:
            r10.m()     // Catch:{ all -> 0x01b6 }
            r10.z = r4     // Catch:{ all -> 0x01b6 }
            r10.p = r11     // Catch:{ all -> 0x01b6 }
            sl r11 = r10.f     // Catch:{ all -> 0x01b6 }
            int r11 = r11.g     // Catch:{ all -> 0x01b6 }
            r3 = 3
            if (r11 > r3) goto L_0x00f1
            java.lang.Class r11 = r2.getClass()     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x01b6 }
            java.lang.String r12 = defpackage.boc.a(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r3 = r10.g     // Catch:{ all -> 0x01b6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b6 }
            int r4 = r10.w     // Catch:{ all -> 0x01b6 }
            int r5 = r10.x     // Catch:{ all -> 0x01b6 }
            long r6 = r10.r     // Catch:{ all -> 0x01b6 }
            long r8 = defpackage.ahy.a()     // Catch:{ all -> 0x01b6 }
            long r8 = r8 - r6
            double r6 = (double) r8     // Catch:{ all -> 0x01b6 }
            double r8 = defpackage.ahy.a     // Catch:{ all -> 0x01b6 }
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01b6 }
            int r8 = r8.length()     // Catch:{ all -> 0x01b6 }
            int r8 = r8 + 95
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01b6 }
            int r9 = r9.length()     // Catch:{ all -> 0x01b6 }
            int r8 = r8 + r9
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b6 }
            int r9 = r9.length()     // Catch:{ all -> 0x01b6 }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            r9.<init>(r8)     // Catch:{ all -> 0x01b6 }
            java.lang.String r8 = "Finished loading "
            r9.append(r8)     // Catch:{ all -> 0x01b6 }
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = " from "
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            r9.append(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = " for "
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            r9.append(r3)     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = " with size ["
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            r9.append(r4)     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = "x"
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            r9.append(r5)     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = "] in "
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            r9.append(r6)     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = " ms"
            r9.append(r11)     // Catch:{ all -> 0x01b6 }
            r9.toString()     // Catch:{ all -> 0x01b6 }
        L_0x00f1:
            r11 = 1
            r10.y = r11     // Catch:{ all -> 0x01b6 }
            r11 = 0
            java.util.List r12 = r10.n     // Catch:{ all -> 0x0125 }
            if (r12 == 0) goto L_0x010d
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0125 }
        L_0x00fd:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x010d
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x0125 }
            agq r3 = (defpackage.agq) r3     // Catch:{ all -> 0x0125 }
            r3.b(r2)     // Catch:{ all -> 0x0125 }
            goto L_0x00fd
        L_0x010d:
            agq r12 = r10.c     // Catch:{ all -> 0x0125 }
            if (r12 != 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r12.b(r2)     // Catch:{ all -> 0x0125 }
        L_0x0115:
            ahg r12 = r10.m     // Catch:{ all -> 0x0125 }
            r12.a(r2)     // Catch:{ all -> 0x0125 }
            r10.y = r11     // Catch:{ all -> 0x01b6 }
            ago r11 = r10.d     // Catch:{ all -> 0x01b6 }
            if (r11 == 0) goto L_0x0123
            r11.e(r10)     // Catch:{ all -> 0x01b6 }
        L_0x0123:
            monitor-exit(r1)     // Catch:{ all -> 0x01b6 }
            return
        L_0x0125:
            r12 = move-exception
            r10.y = r11     // Catch:{ all -> 0x01b6 }
            throw r12     // Catch:{ all -> 0x01b6 }
        L_0x0129:
            r10.p = r0     // Catch:{ all -> 0x01b4 }
            wq r12 = new wq     // Catch:{ all -> 0x01b4 }
            java.lang.Class r0 = r10.h     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b4 }
            if (r2 != 0) goto L_0x0139
            java.lang.String r3 = ""
            goto L_0x013d
        L_0x0139:
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x01b4 }
        L_0x013d:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01b4 }
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01b4 }
            if (r2 != 0) goto L_0x014e
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
            goto L_0x0150
        L_0x014e:
            java.lang.String r2 = ""
        L_0x0150:
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b4 }
            int r6 = r6.length()     // Catch:{ all -> 0x01b4 }
            int r6 = r6 + 71
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b4 }
            int r7 = r7.length()     // Catch:{ all -> 0x01b4 }
            int r6 = r6 + r7
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01b4 }
            int r7 = r7.length()     // Catch:{ all -> 0x01b4 }
            int r6 = r6 + r7
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01b4 }
            int r7 = r7.length()     // Catch:{ all -> 0x01b4 }
            int r6 = r6 + r7
            int r7 = r2.length()     // Catch:{ all -> 0x01b4 }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r7.<init>(r6)     // Catch:{ all -> 0x01b4 }
            java.lang.String r6 = "Expected to receive an object of "
            r7.append(r6)     // Catch:{ all -> 0x01b4 }
            r7.append(r0)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = " but instead got "
            r7.append(r0)     // Catch:{ all -> 0x01b4 }
            r7.append(r3)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "{"
            r7.append(r0)     // Catch:{ all -> 0x01b4 }
            r7.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "} inside Resource{"
            r7.append(r0)     // Catch:{ all -> 0x01b4 }
            r7.append(r5)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "}."
            r7.append(r0)     // Catch:{ all -> 0x01b4 }
            r7.append(r2)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x01b4 }
            r12.<init>(r0)     // Catch:{ all -> 0x01b4 }
            r10.a(r12)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b4 }
            goto L_0x0061
        L_0x01b4:
            r12 = move-exception
            goto L_0x01bf
        L_0x01b6:
            r11 = move-exception
            r12 = r11
            r11 = r0
        L_0x01b9:
            monitor-exit(r1)     // Catch:{ all -> 0x01be }
            throw r12     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r12 = move-exception
            goto L_0x01c3
        L_0x01be:
            r12 = move-exception
        L_0x01bf:
            goto L_0x01b9
        L_0x01c0:
            r11 = move-exception
            r12 = r11
            r11 = r0
        L_0x01c3:
            if (r11 == 0) goto L_0x01c8
            defpackage.wf.a(r11)
        L_0x01c8:
            goto L_0x01ca
        L_0x01c9:
            throw r12
        L_0x01ca:
            goto L_0x01c9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ags.a(ww, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.a(r7, 5);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0172, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[Catch:{ all -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015e A[Catch:{ all -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016e A[Catch:{ all -> 0x0176, all -> 0x017c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r27, int r28) {
        /*
            r26 = this;
            r1 = r26
            ain r0 = r1.a
            r0.b()
            java.lang.Object r2 = r1.b
            monitor-enter(r2)
            int r0 = r1.z     // Catch:{ all -> 0x017c }
            r3 = 3
            if (r0 != r3) goto L_0x017a
            r0 = 2
            r1.z = r0     // Catch:{ all -> 0x017c }
            agj r3 = r1.i     // Catch:{ all -> 0x017c }
            float r3 = r3.c     // Catch:{ all -> 0x017c }
            r4 = r27
            int r4 = a(r4, r3)     // Catch:{ all -> 0x017c }
            r1.w = r4     // Catch:{ all -> 0x017c }
            r4 = r28
            int r3 = a(r4, r3)     // Catch:{ all -> 0x017c }
            r1.x = r3     // Catch:{ all -> 0x017c }
            wf r3 = r1.s     // Catch:{ all -> 0x017c }
            sl r4 = r1.f     // Catch:{ all -> 0x017c }
            java.lang.Object r14 = r1.g     // Catch:{ all -> 0x017c }
            agj r5 = r1.i     // Catch:{ all -> 0x017c }
            ts r15 = r5.l     // Catch:{ all -> 0x017c }
            int r13 = r1.w     // Catch:{ all -> 0x017c }
            int r12 = r1.x     // Catch:{ all -> 0x017c }
            java.lang.Class r11 = r5.r     // Catch:{ all -> 0x017c }
            java.lang.Class r10 = r1.h     // Catch:{ all -> 0x017c }
            sm r9 = r1.l     // Catch:{ all -> 0x017c }
            vy r8 = r5.d     // Catch:{ all -> 0x017c }
            java.util.Map r7 = r5.q     // Catch:{ all -> 0x017c }
            boolean r6 = r5.m     // Catch:{ all -> 0x017c }
            boolean r0 = r5.u     // Catch:{ all -> 0x017c }
            r27 = r0
            tx r0 = r5.p     // Catch:{ all -> 0x017c }
            r28 = r4
            boolean r4 = r5.i     // Catch:{ all -> 0x017c }
            boolean r5 = r5.v     // Catch:{ all -> 0x017c }
            r16 = r4
            java.util.concurrent.Executor r4 = r1.o     // Catch:{ all -> 0x017c }
            wm r1 = new wm     // Catch:{ all -> 0x0176 }
            r17 = r4
            r4 = r5
            r5 = r1
            r18 = r6
            r6 = r14
            r19 = r7
            r7 = r15
            r20 = r8
            r8 = r13
            r21 = r9
            r9 = r12
            r22 = r10
            r10 = r19
            r23 = r11
            r24 = r12
            r12 = r22
            r25 = r13
            r13 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0176 }
            monitor-enter(r3)     // Catch:{ all -> 0x0176 }
            r5 = 1
            if (r16 == 0) goto L_0x00ae
            vf r7 = r3.f     // Catch:{ all -> 0x00a9 }
            wo r7 = r7.b(r1)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x0081
            r7.e()     // Catch:{ all -> 0x00a9 }
        L_0x0081:
            if (r7 != 0) goto L_0x00b0
            yj r7 = r3.b     // Catch:{ all -> 0x00a9 }
            ww r7 = r7.a(r1)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x0099
            boolean r8 = r7 instanceof defpackage.wo     // Catch:{ all -> 0x00a9 }
            if (r8 != 0) goto L_0x0096
            wo r8 = new wo     // Catch:{ all -> 0x00a9 }
            r8.<init>(r7, r5, r1, r3)     // Catch:{ all -> 0x00a9 }
            r7 = r8
            goto L_0x009b
        L_0x0096:
            wo r7 = (defpackage.wo) r7     // Catch:{ all -> 0x00a9 }
            goto L_0x009b
        L_0x0099:
            r7 = 0
        L_0x009b:
            if (r7 == 0) goto L_0x00a5
            r7.e()     // Catch:{ all -> 0x00a9 }
            vf r8 = r3.f     // Catch:{ all -> 0x00a9 }
            r8.a(r1, r7)     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            if (r7 == 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            goto L_0x00af
        L_0x00a9:
            r0 = move-exception
            r1 = r26
            goto L_0x0174
        L_0x00ae:
        L_0x00af:
            r7 = 0
        L_0x00b0:
            if (r7 != 0) goto L_0x015e
            ws r7 = r3.a     // Catch:{ all -> 0x00a9 }
            java.util.Map r7 = r7.a     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x00a9 }
            wk r7 = (defpackage.wk) r7     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x014e
            wc r7 = r3.c     // Catch:{ all -> 0x00a9 }
            cz r7 = r7.f     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = r7.a()     // Catch:{ all -> 0x00a9 }
            wk r7 = (defpackage.wk) r7     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = defpackage.aic.a(r7)     // Catch:{ all -> 0x00a9 }
            wk r7 = (defpackage.wk) r7     // Catch:{ all -> 0x00a9 }
            r8 = r16
            r7.a(r1, r8, r4)     // Catch:{ all -> 0x00a9 }
            wa r4 = r3.e     // Catch:{ all -> 0x00a9 }
            cz r8 = r4.b     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x00a9 }
            vs r8 = (defpackage.vs) r8     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = defpackage.aic.a(r8)     // Catch:{ all -> 0x00a9 }
            vs r8 = (defpackage.vs) r8     // Catch:{ all -> 0x00a9 }
            int r9 = r4.c     // Catch:{ all -> 0x00a9 }
            int r10 = r9 + 1
            r4.c = r10     // Catch:{ all -> 0x00a9 }
            vm r4 = r8.a     // Catch:{ all -> 0x00a9 }
            vq r10 = r8.b     // Catch:{ all -> 0x00a9 }
            r11 = r28
            r4.c = r11     // Catch:{ all -> 0x00a9 }
            r4.d = r14     // Catch:{ all -> 0x00a9 }
            r4.n = r15     // Catch:{ all -> 0x00a9 }
            r12 = r25
            r4.e = r12     // Catch:{ all -> 0x00a9 }
            r13 = r24
            r4.f = r13     // Catch:{ all -> 0x00a9 }
            r14 = r20
            r4.p = r14     // Catch:{ all -> 0x00a9 }
            r6 = r23
            r4.g = r6     // Catch:{ all -> 0x00a9 }
            r4.h = r10     // Catch:{ all -> 0x00a9 }
            r6 = r22
            r4.k = r6     // Catch:{ all -> 0x00a9 }
            r6 = r21
            r4.o = r6     // Catch:{ all -> 0x00a9 }
            r4.i = r0     // Catch:{ all -> 0x00a9 }
            r10 = r19
            r4.j = r10     // Catch:{ all -> 0x00a9 }
            r10 = r18
            r4.q = r10     // Catch:{ all -> 0x00a9 }
            r10 = r27
            r4.r = r10     // Catch:{ all -> 0x00a9 }
            r8.d = r11     // Catch:{ all -> 0x00a9 }
            r8.e = r15     // Catch:{ all -> 0x00a9 }
            r8.f = r6     // Catch:{ all -> 0x00a9 }
            r8.g = r1     // Catch:{ all -> 0x00a9 }
            r8.h = r12     // Catch:{ all -> 0x00a9 }
            r8.i = r13     // Catch:{ all -> 0x00a9 }
            r8.j = r14     // Catch:{ all -> 0x00a9 }
            r4 = 0
            r8.n = r4     // Catch:{ all -> 0x00a9 }
            r8.k = r0     // Catch:{ all -> 0x00a9 }
            r8.l = r7     // Catch:{ all -> 0x00a9 }
            r8.m = r9     // Catch:{ all -> 0x00a9 }
            r8.q = r5     // Catch:{ all -> 0x00a9 }
            ws r0 = r3.a     // Catch:{ all -> 0x00a9 }
            java.util.Map r0 = r0.a     // Catch:{ all -> 0x00a9 }
            r0.put(r1, r7)     // Catch:{ all -> 0x00a9 }
            r1 = r26
            r0 = r17
            r7.a(r1, r0)     // Catch:{ all -> 0x0173 }
            r7.b(r8)     // Catch:{ all -> 0x0173 }
            we r0 = new we     // Catch:{ all -> 0x0173 }
            r0.<init>(r3, r1, r7)     // Catch:{ all -> 0x0173 }
            r6 = r0
            goto L_0x015c
        L_0x014e:
            r1 = r26
            r0 = r17
            r7.a(r1, r0)     // Catch:{ all -> 0x0173 }
            we r0 = new we     // Catch:{ all -> 0x0173 }
            r0.<init>(r3, r1, r7)     // Catch:{ all -> 0x0173 }
            r6 = r0
        L_0x015c:
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            goto L_0x0167
        L_0x015e:
            r1 = r26
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            r0 = 5
            r1.a(r7, r0)     // Catch:{ all -> 0x017c }
            r6 = 0
        L_0x0167:
            r1.q = r6     // Catch:{ all -> 0x017c }
            int r0 = r1.z     // Catch:{ all -> 0x017c }
            r3 = 2
            if (r0 == r3) goto L_0x0171
            r0 = 0
            r1.q = r0     // Catch:{ all -> 0x017c }
        L_0x0171:
            monitor-exit(r2)     // Catch:{ all -> 0x017c }
            return
        L_0x0173:
            r0 = move-exception
        L_0x0174:
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x0176:
            r0 = move-exception
            r1 = r26
            goto L_0x017d
        L_0x017a:
            monitor-exit(r2)     // Catch:{ all -> 0x017c }
            return
        L_0x017c:
            r0 = move-exception
        L_0x017d:
            monitor-exit(r2)     // Catch:{ all -> 0x017c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ags.a(int, int):void");
    }

    public final void c() {
        synchronized (this.b) {
            if (d()) {
                b();
            }
        }
    }
}

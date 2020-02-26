package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ags */
/* compiled from: PG */
public final class ags implements agm, ahf, agr {

    /* renamed from: a */
    private final ain f313a = ain.m578a();

    /* renamed from: b */
    private final Object f314b;

    /* renamed from: c */
    private final agq f315c;

    /* renamed from: d */
    private final ago f316d;

    /* renamed from: e */
    private final Context f317e;

    /* renamed from: f */
    private final C0500sl f318f;

    /* renamed from: g */
    private final Object f319g;

    /* renamed from: h */
    private final Class f320h;

    /* renamed from: i */
    private final agj f321i;

    /* renamed from: j */
    private final int f322j;

    /* renamed from: k */
    private final int f323k;

    /* renamed from: l */
    private final C0501sm f324l;

    /* renamed from: m */
    private final ahg f325m;

    /* renamed from: n */
    private final List f326n;

    /* renamed from: o */
    private final Executor f327o;

    /* renamed from: p */
    private C0619ww f328p;

    /* renamed from: q */
    private C0601we f329q;

    /* renamed from: r */
    private long f330r;

    /* renamed from: s */
    private volatile C0602wf f331s;

    /* renamed from: t */
    private Drawable f332t;

    /* renamed from: u */
    private Drawable f333u;

    /* renamed from: v */
    private Drawable f334v;

    /* renamed from: w */
    private int f335w;

    /* renamed from: x */
    private int f336x;

    /* renamed from: y */
    private boolean f337y;

    /* renamed from: z */
    private int f338z;

    public ags(Context context, C0500sl slVar, Object obj, Object obj2, Class cls, agj agj, int i, int i2, C0501sm smVar, ahg ahg, agq agq, List list, ago ago, C0602wf wfVar, Executor executor) {
        this.f314b = obj;
        this.f317e = context;
        this.f318f = slVar;
        this.f319g = obj2;
        this.f320h = cls;
        this.f321i = agj;
        this.f322j = i;
        this.f323k = i2;
        this.f324l = smVar;
        this.f325m = ahg;
        this.f315c = agq;
        this.f326n = list;
        this.f316d = ago;
        this.f331s = wfVar;
        this.f327o = executor;
        this.f338z = 1;
    }

    /* renamed from: i */
    private final void m419i() {
        if (this.f337y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo215a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f314b
            monitor-enter(r0)
            r6.m419i()     // Catch:{ all -> 0x0086 }
            ain r1 = r6.f313a     // Catch:{ all -> 0x0086 }
            r1.mo320b()     // Catch:{ all -> 0x0086 }
            long r1 = p000.ahy.m529a()     // Catch:{ all -> 0x0086 }
            r6.f330r = r1     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = r6.f319g     // Catch:{ all -> 0x0086 }
            r2 = 5
            r3 = 3
            if (r1 != 0) goto L_0x003e
            int r1 = r6.f322j     // Catch:{ all -> 0x0086 }
            int r4 = r6.f323k     // Catch:{ all -> 0x0086 }
            boolean r1 = p000.aie.m560a(r1, r4)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0029
            int r1 = r6.f322j     // Catch:{ all -> 0x0086 }
            r6.f335w = r1     // Catch:{ all -> 0x0086 }
            int r1 = r6.f323k     // Catch:{ all -> 0x0086 }
            r6.f336x = r1     // Catch:{ all -> 0x0086 }
        L_0x0029:
            android.graphics.drawable.Drawable r1 = r6.m421k()     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 3
        L_0x0032:
            wq r1 = new wq     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x0086 }
            r6.m418a(r1, r2)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x003e:
            int r1 = r6.f338z     // Catch:{ all -> 0x0086 }
            r4 = 2
            if (r1 == r4) goto L_0x007e
            r5 = 4
            if (r1 == r5) goto L_0x0077
            r6.f338z = r3     // Catch:{ all -> 0x0086 }
            int r1 = r6.f322j     // Catch:{ all -> 0x0086 }
            int r2 = r6.f323k     // Catch:{ all -> 0x0086 }
            boolean r1 = p000.aie.m560a(r1, r2)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x005a
            int r1 = r6.f322j     // Catch:{ all -> 0x0086 }
            int r2 = r6.f323k     // Catch:{ all -> 0x0086 }
            r6.mo245a(r1, r2)     // Catch:{ all -> 0x0086 }
            goto L_0x005f
        L_0x005a:
            ahg r1 = r6.f325m     // Catch:{ all -> 0x0086 }
            r1.mo230a(r6)     // Catch:{ all -> 0x0086 }
        L_0x005f:
            int r1 = r6.f338z     // Catch:{ all -> 0x0086 }
            if (r1 == r4) goto L_0x0066
            if (r1 == r3) goto L_0x0066
            goto L_0x0075
        L_0x0066:
            boolean r1 = r6.m422l()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0075
            ahg r1 = r6.f325m     // Catch:{ all -> 0x0086 }
            android.graphics.drawable.Drawable r2 = r6.m420j()     // Catch:{ all -> 0x0086 }
            r1.mo233b(r2)     // Catch:{ all -> 0x0086 }
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0077:
            ww r1 = r6.f328p     // Catch:{ all -> 0x0086 }
            r6.mo243a(r1, r2)     // Catch:{ all -> 0x0086 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ags.mo215a():void");
    }

    /* renamed from: l */
    private final boolean m422l() {
        ago ago = this.f316d;
        return ago == null || ago.mo220c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        if (r3.mo222d(r6) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        p000.C0602wf.m8535a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo217b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f314b
            monitor-enter(r0)
            r6.m419i()     // Catch:{ all -> 0x005c }
            ain r1 = r6.f313a     // Catch:{ all -> 0x005c }
            r1.mo320b()     // Catch:{ all -> 0x005c }
            int r1 = r6.f338z     // Catch:{ all -> 0x005c }
            r2 = 6
            if (r1 == r2) goto L_0x005a
            r6.m419i()     // Catch:{ all -> 0x005c }
            ain r1 = r6.f313a     // Catch:{ all -> 0x005c }
            r1.mo320b()     // Catch:{ all -> 0x005c }
            ahg r1 = r6.f325m     // Catch:{ all -> 0x005c }
            r1.mo232b(r6)     // Catch:{ all -> 0x005c }
            we r1 = r6.f329q     // Catch:{ all -> 0x005c }
            r3 = 0
            if (r1 == 0) goto L_0x0033
            wf r4 = r1.f10668c     // Catch:{ all -> 0x005c }
            monitor-enter(r4)     // Catch:{ all -> 0x005c }
            wk r5 = r1.f10666a     // Catch:{ all -> 0x0030 }
            agr r1 = r1.f10667b     // Catch:{ all -> 0x0030 }
            r5.mo6067a(r1)     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            r6.f329q = r3     // Catch:{ all -> 0x005c }
            goto L_0x0033
        L_0x0030:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r1     // Catch:{ all -> 0x005c }
        L_0x0033:
            ww r1 = r6.f328p     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x003a
            r6.f328p = r3     // Catch:{ all -> 0x005c }
            goto L_0x003c
        L_0x003a:
            r1 = r3
        L_0x003c:
            ago r3 = r6.f316d     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            boolean r3 = r3.mo222d(r6)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0050
        L_0x0047:
            ahg r3 = r6.f325m     // Catch:{ all -> 0x005c }
            android.graphics.drawable.Drawable r4 = r6.m420j()     // Catch:{ all -> 0x005c }
            r3.mo113a(r4)     // Catch:{ all -> 0x005c }
        L_0x0050:
            r6.f338z = r2     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0059
            p000.C0602wf.m8535a(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ags.mo217b():void");
    }

    /* renamed from: k */
    private final Drawable m421k() {
        if (this.f334v == null) {
            this.f334v = this.f321i.f284o;
        }
        return this.f334v;
    }

    /* renamed from: h */
    public final Object mo244h() {
        this.f313a.mo320b();
        return this.f314b;
    }

    /* renamed from: j */
    private final Drawable m420j() {
        if (this.f333u == null) {
            this.f333u = this.f321i.f277h;
        }
        return this.f333u;
    }

    /* renamed from: g */
    public final boolean mo227g() {
        boolean z;
        synchronized (this.f314b) {
            z = this.f338z == 4;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo226f() {
        boolean z;
        synchronized (this.f314b) {
            z = this.f338z == 6;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo224e() {
        boolean z;
        synchronized (this.f314b) {
            z = this.f338z == 4;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo216a(agm agm) {
        int i;
        int i2;
        Object obj;
        Class cls;
        agj agj;
        C0501sm smVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        agj agj2;
        C0501sm smVar2;
        int i5;
        agm agm2 = agm;
        if (!(agm2 instanceof ags)) {
            return false;
        }
        synchronized (this.f314b) {
            i = this.f322j;
            i2 = this.f323k;
            obj = this.f319g;
            cls = this.f320h;
            agj = this.f321i;
            smVar = this.f324l;
            List list = this.f326n;
            size = list != null ? list.size() : 0;
        }
        ags ags = (ags) agm2;
        synchronized (ags.f314b) {
            i3 = ags.f322j;
            i4 = ags.f323k;
            obj2 = ags.f319g;
            cls2 = ags.f320h;
            agj2 = ags.f321i;
            smVar2 = ags.f324l;
            List list2 = ags.f326n;
            if (list2 != null) {
                i5 = list2.size();
            } else {
                i5 = 0;
            }
        }
        return i == i3 && i2 == i4 && aie.m565b(obj, obj2) && cls.equals(cls2) && agj.equals(agj2) && smVar == smVar2 && size == i5;
    }

    /* renamed from: m */
    private final void m423m() {
        ago ago = this.f316d;
        if (ago == null || ago.mo228h().mo227g()) {
        }
    }

    /* renamed from: d */
    public final boolean mo221d() {
        boolean z;
        synchronized (this.f314b) {
            int i = this.f338z;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static int m417a(int i, float f) {
        if (i != Integer.MIN_VALUE) {
            return Math.round(f * ((float) i));
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void mo242a(C0613wq wqVar) {
        m418a(wqVar, 5);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final void m418a(C0613wq wqVar, int i) {
        int i2;
        this.f313a.mo320b();
        synchronized (this.f314b) {
            if (this.f318f.f10388g <= i) {
                String valueOf = String.valueOf(this.f319g);
                int i3 = this.f335w;
                int i4 = this.f336x;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("Load failed for ");
                sb.append(valueOf);
                sb.append(" with size [");
                sb.append(i3);
                sb.append("x");
                sb.append(i4);
                sb.append("]");
                Log.w("Glide", sb.toString(), wqVar);
                List a = wqVar.mo6079a();
                int size = a.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    StringBuilder sb2 = new StringBuilder(39);
                    sb2.append("Root cause (");
                    sb2.append(i6);
                    sb2.append(" of ");
                    sb2.append(size);
                    sb2.append(")");
                    sb2.toString();
                    Throwable th = (Throwable) a.get(i5);
                    i5 = i6;
                }
            }
            Drawable drawable = null;
            this.f329q = null;
            this.f338z = 5;
            this.f337y = true;
            try {
                List<agq> list = this.f326n;
                if (list != null) {
                    for (agq a2 : list) {
                        m423m();
                        a2.mo231a(wqVar);
                    }
                }
                agq agq = this.f315c;
                if (agq != null) {
                    m423m();
                    agq.mo231a(wqVar);
                }
                if (m422l()) {
                    if (this.f319g == null) {
                        drawable = m421k();
                    }
                    if (drawable == null) {
                        if (this.f332t == null) {
                            agj agj = this.f321i;
                            Drawable drawable2 = agj.f275f;
                            this.f332t = drawable2;
                            if (drawable2 == null && (i2 = agj.f276g) > 0) {
                                Resources.Theme theme = this.f317e.getTheme();
                                C0500sl slVar = this.f318f;
                                this.f332t = adx.m223a(slVar, slVar, i2, theme);
                            }
                        }
                        drawable = this.f332t;
                    }
                    if (drawable == null) {
                        drawable = m420j();
                    }
                    this.f325m.mo235c(drawable);
                }
                this.f337y = false;
                ago ago = this.f316d;
                if (ago != null) {
                    ago.mo225f(this);
                }
            } catch (Throwable th2) {
                this.f337y = false;
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo243a(p000.C0619ww r11, int r12) {
        /*
            r10 = this;
            ain r0 = r10.f313a
            r0.mo320b()
            r0 = 0
            java.lang.Object r1 = r10.f314b     // Catch:{ all -> 0x01c0 }
            monitor-enter(r1)     // Catch:{ all -> 0x01c0 }
            r10.f329q = r0     // Catch:{ all -> 0x01b6 }
            if (r11 != 0) goto L_0x003d
            wq r11 = new wq     // Catch:{ all -> 0x01b6 }
            java.lang.Class r12 = r10.f320h     // Catch:{ all -> 0x01b6 }
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
            r10.mo242a(r11)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b6 }
            return
        L_0x003d:
            java.lang.Object r2 = r11.mo33b()     // Catch:{ all -> 0x01b6 }
            if (r2 == 0) goto L_0x0129
            java.lang.Class r3 = r10.f320h     // Catch:{ all -> 0x01b6 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x01b6 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x01b6 }
            if (r3 == 0) goto L_0x0129
            ago r3 = r10.f316d     // Catch:{ all -> 0x01b6 }
            r4 = 4
            if (r3 == 0) goto L_0x0065
            boolean r3 = r3.mo218b(r10)     // Catch:{ all -> 0x01b6 }
            if (r3 == 0) goto L_0x005b
            goto L_0x0065
        L_0x005b:
            r10.f328p = r0     // Catch:{ all -> 0x01b4 }
            r10.f338z = r4     // Catch:{ all -> 0x01b4 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b4 }
        L_0x0061:
            p000.C0602wf.m8535a(r11)
            return
        L_0x0065:
            r10.m423m()     // Catch:{ all -> 0x01b6 }
            r10.f338z = r4     // Catch:{ all -> 0x01b6 }
            r10.f328p = r11     // Catch:{ all -> 0x01b6 }
            sl r11 = r10.f318f     // Catch:{ all -> 0x01b6 }
            int r11 = r11.f10388g     // Catch:{ all -> 0x01b6 }
            r3 = 3
            if (r11 > r3) goto L_0x00f1
            java.lang.Class r11 = r2.getClass()     // Catch:{ all -> 0x01b6 }
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x01b6 }
            java.lang.String r12 = p000.boc.m3817a(r12)     // Catch:{ all -> 0x01b6 }
            java.lang.Object r3 = r10.f319g     // Catch:{ all -> 0x01b6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b6 }
            int r4 = r10.f335w     // Catch:{ all -> 0x01b6 }
            int r5 = r10.f336x     // Catch:{ all -> 0x01b6 }
            long r6 = r10.f330r     // Catch:{ all -> 0x01b6 }
            long r8 = p000.ahy.m529a()     // Catch:{ all -> 0x01b6 }
            long r8 = r8 - r6
            double r6 = (double) r8     // Catch:{ all -> 0x01b6 }
            double r8 = p000.ahy.f389a     // Catch:{ all -> 0x01b6 }
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
            r10.f337y = r11     // Catch:{ all -> 0x01b6 }
            r11 = 0
            java.util.List r12 = r10.f326n     // Catch:{ all -> 0x0125 }
            if (r12 == 0) goto L_0x010d
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0125 }
        L_0x00fd:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x010d
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x0125 }
            agq r3 = (p000.agq) r3     // Catch:{ all -> 0x0125 }
            r3.mo234b(r2)     // Catch:{ all -> 0x0125 }
            goto L_0x00fd
        L_0x010d:
            agq r12 = r10.f315c     // Catch:{ all -> 0x0125 }
            if (r12 != 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r12.mo234b(r2)     // Catch:{ all -> 0x0125 }
        L_0x0115:
            ahg r12 = r10.f325m     // Catch:{ all -> 0x0125 }
            r12.mo114a(r2)     // Catch:{ all -> 0x0125 }
            r10.f337y = r11     // Catch:{ all -> 0x01b6 }
            ago r11 = r10.f316d     // Catch:{ all -> 0x01b6 }
            if (r11 == 0) goto L_0x0123
            r11.mo223e(r10)     // Catch:{ all -> 0x01b6 }
        L_0x0123:
            monitor-exit(r1)     // Catch:{ all -> 0x01b6 }
            return
        L_0x0125:
            r12 = move-exception
            r10.f337y = r11     // Catch:{ all -> 0x01b6 }
            throw r12     // Catch:{ all -> 0x01b6 }
        L_0x0129:
            r10.f328p = r0     // Catch:{ all -> 0x01b4 }
            wq r12 = new wq     // Catch:{ all -> 0x01b4 }
            java.lang.Class r0 = r10.f320h     // Catch:{ all -> 0x01b4 }
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
            r10.mo242a(r12)     // Catch:{ all -> 0x01b4 }
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
            p000.C0602wf.m8535a(r11)
        L_0x01c8:
            goto L_0x01ca
        L_0x01c9:
            throw r12
        L_0x01ca:
            goto L_0x01c9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ags.mo243a(ww, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.mo243a(r7, 5);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0172, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[Catch:{ all -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015e A[Catch:{ all -> 0x0173 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016e A[Catch:{ all -> 0x0176, all -> 0x017c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo245a(int r27, int r28) {
        /*
            r26 = this;
            r1 = r26
            ain r0 = r1.f313a
            r0.mo320b()
            java.lang.Object r2 = r1.f314b
            monitor-enter(r2)
            int r0 = r1.f338z     // Catch:{ all -> 0x017c }
            r3 = 3
            if (r0 != r3) goto L_0x017a
            r0 = 2
            r1.f338z = r0     // Catch:{ all -> 0x017c }
            agj r3 = r1.f321i     // Catch:{ all -> 0x017c }
            float r3 = r3.f272c     // Catch:{ all -> 0x017c }
            r4 = r27
            int r4 = m417a(r4, r3)     // Catch:{ all -> 0x017c }
            r1.f335w = r4     // Catch:{ all -> 0x017c }
            r4 = r28
            int r3 = m417a(r4, r3)     // Catch:{ all -> 0x017c }
            r1.f336x = r3     // Catch:{ all -> 0x017c }
            wf r3 = r1.f331s     // Catch:{ all -> 0x017c }
            sl r4 = r1.f318f     // Catch:{ all -> 0x017c }
            java.lang.Object r14 = r1.f319g     // Catch:{ all -> 0x017c }
            agj r5 = r1.f321i     // Catch:{ all -> 0x017c }
            ts r15 = r5.f281l     // Catch:{ all -> 0x017c }
            int r13 = r1.f335w     // Catch:{ all -> 0x017c }
            int r12 = r1.f336x     // Catch:{ all -> 0x017c }
            java.lang.Class r11 = r5.f287r     // Catch:{ all -> 0x017c }
            java.lang.Class r10 = r1.f320h     // Catch:{ all -> 0x017c }
            sm r9 = r1.f324l     // Catch:{ all -> 0x017c }
            vy r8 = r5.f273d     // Catch:{ all -> 0x017c }
            java.util.Map r7 = r5.f286q     // Catch:{ all -> 0x017c }
            boolean r6 = r5.f282m     // Catch:{ all -> 0x017c }
            boolean r0 = r5.f290u     // Catch:{ all -> 0x017c }
            r27 = r0
            tx r0 = r5.f285p     // Catch:{ all -> 0x017c }
            r28 = r4
            boolean r4 = r5.f278i     // Catch:{ all -> 0x017c }
            boolean r5 = r5.f291v     // Catch:{ all -> 0x017c }
            r16 = r4
            java.util.concurrent.Executor r4 = r1.f327o     // Catch:{ all -> 0x017c }
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
            vf r7 = r3.f10674f     // Catch:{ all -> 0x00a9 }
            wo r7 = r7.mo6021b(r1)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x0081
            r7.mo6073e()     // Catch:{ all -> 0x00a9 }
        L_0x0081:
            if (r7 != 0) goto L_0x00b0
            yj r7 = r3.f10670b     // Catch:{ all -> 0x00a9 }
            ww r7 = r7.mo6131a(r1)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x0099
            boolean r8 = r7 instanceof p000.C0611wo     // Catch:{ all -> 0x00a9 }
            if (r8 != 0) goto L_0x0096
            wo r8 = new wo     // Catch:{ all -> 0x00a9 }
            r8.<init>(r7, r5, r1, r3)     // Catch:{ all -> 0x00a9 }
            r7 = r8
            goto L_0x009b
        L_0x0096:
            wo r7 = (p000.C0611wo) r7     // Catch:{ all -> 0x00a9 }
            goto L_0x009b
        L_0x0099:
            r7 = 0
        L_0x009b:
            if (r7 == 0) goto L_0x00a5
            r7.mo6073e()     // Catch:{ all -> 0x00a9 }
            vf r8 = r3.f10674f     // Catch:{ all -> 0x00a9 }
            r8.mo6019a(r1, r7)     // Catch:{ all -> 0x00a9 }
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
            ws r7 = r3.f10669a     // Catch:{ all -> 0x00a9 }
            java.util.Map r7 = r7.f10727a     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x00a9 }
            wk r7 = (p000.C0607wk) r7     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x014e
            wc r7 = r3.f10671c     // Catch:{ all -> 0x00a9 }
            cz r7 = r7.f10663f     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = r7.mo317a()     // Catch:{ all -> 0x00a9 }
            wk r7 = (p000.C0607wk) r7     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = p000.aic.m542a(r7)     // Catch:{ all -> 0x00a9 }
            wk r7 = (p000.C0607wk) r7     // Catch:{ all -> 0x00a9 }
            r8 = r16
            r7.mo6069a(r1, r8, r4)     // Catch:{ all -> 0x00a9 }
            wa r4 = r3.f10673e     // Catch:{ all -> 0x00a9 }
            cz r8 = r4.f10655b     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = r8.mo317a()     // Catch:{ all -> 0x00a9 }
            vs r8 = (p000.C0588vs) r8     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p000.aic.m542a(r8)     // Catch:{ all -> 0x00a9 }
            vs r8 = (p000.C0588vs) r8     // Catch:{ all -> 0x00a9 }
            int r9 = r4.f10656c     // Catch:{ all -> 0x00a9 }
            int r10 = r9 + 1
            r4.f10656c = r10     // Catch:{ all -> 0x00a9 }
            vm r4 = r8.f10618a     // Catch:{ all -> 0x00a9 }
            vq r10 = r8.f10619b     // Catch:{ all -> 0x00a9 }
            r11 = r28
            r4.f10591c = r11     // Catch:{ all -> 0x00a9 }
            r4.f10592d = r14     // Catch:{ all -> 0x00a9 }
            r4.f10602n = r15     // Catch:{ all -> 0x00a9 }
            r12 = r25
            r4.f10593e = r12     // Catch:{ all -> 0x00a9 }
            r13 = r24
            r4.f10594f = r13     // Catch:{ all -> 0x00a9 }
            r14 = r20
            r4.f10604p = r14     // Catch:{ all -> 0x00a9 }
            r6 = r23
            r4.f10595g = r6     // Catch:{ all -> 0x00a9 }
            r4.f10596h = r10     // Catch:{ all -> 0x00a9 }
            r6 = r22
            r4.f10599k = r6     // Catch:{ all -> 0x00a9 }
            r6 = r21
            r4.f10603o = r6     // Catch:{ all -> 0x00a9 }
            r4.f10597i = r0     // Catch:{ all -> 0x00a9 }
            r10 = r19
            r4.f10598j = r10     // Catch:{ all -> 0x00a9 }
            r10 = r18
            r4.f10605q = r10     // Catch:{ all -> 0x00a9 }
            r10 = r27
            r4.f10606r = r10     // Catch:{ all -> 0x00a9 }
            r8.f10621d = r11     // Catch:{ all -> 0x00a9 }
            r8.f10622e = r15     // Catch:{ all -> 0x00a9 }
            r8.f10623f = r6     // Catch:{ all -> 0x00a9 }
            r8.f10624g = r1     // Catch:{ all -> 0x00a9 }
            r8.f10625h = r12     // Catch:{ all -> 0x00a9 }
            r8.f10626i = r13     // Catch:{ all -> 0x00a9 }
            r8.f10627j = r14     // Catch:{ all -> 0x00a9 }
            r4 = 0
            r8.f10631n = r4     // Catch:{ all -> 0x00a9 }
            r8.f10628k = r0     // Catch:{ all -> 0x00a9 }
            r8.f10629l = r7     // Catch:{ all -> 0x00a9 }
            r8.f10630m = r9     // Catch:{ all -> 0x00a9 }
            r8.f10634q = r5     // Catch:{ all -> 0x00a9 }
            ws r0 = r3.f10669a     // Catch:{ all -> 0x00a9 }
            java.util.Map r0 = r0.f10727a     // Catch:{ all -> 0x00a9 }
            r0.put(r1, r7)     // Catch:{ all -> 0x00a9 }
            r1 = r26
            r0 = r17
            r7.mo6068a(r1, r0)     // Catch:{ all -> 0x0173 }
            r7.mo6070b(r8)     // Catch:{ all -> 0x0173 }
            we r0 = new we     // Catch:{ all -> 0x0173 }
            r0.<init>(r3, r1, r7)     // Catch:{ all -> 0x0173 }
            r6 = r0
            goto L_0x015c
        L_0x014e:
            r1 = r26
            r0 = r17
            r7.mo6068a(r1, r0)     // Catch:{ all -> 0x0173 }
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
            r1.mo243a(r7, r0)     // Catch:{ all -> 0x017c }
            r6 = 0
        L_0x0167:
            r1.f329q = r6     // Catch:{ all -> 0x017c }
            int r0 = r1.f338z     // Catch:{ all -> 0x017c }
            r3 = 2
            if (r0 == r3) goto L_0x0171
            r0 = 0
            r1.f329q = r0     // Catch:{ all -> 0x017c }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ags.mo245a(int, int):void");
    }

    /* renamed from: c */
    public final void mo219c() {
        synchronized (this.f314b) {
            if (mo221d()) {
                mo217b();
            }
        }
    }
}

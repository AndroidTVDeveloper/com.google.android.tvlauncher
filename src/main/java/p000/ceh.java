package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ceh */
/* compiled from: PG */
public abstract class ceh {

    /* renamed from: a */
    public static Context f5359a = null;

    /* renamed from: b */
    private static final Object f5360b = new Object();

    /* renamed from: c */
    private static dff f5361c;

    /* renamed from: g */
    private static final AtomicInteger f5362g = new AtomicInteger();

    /* renamed from: d */
    private final ceg f5363d;

    /* renamed from: e */
    private final String f5364e;

    /* renamed from: f */
    private final Object f5365f;

    /* renamed from: h */
    private volatile int f5366h = -1;

    /* renamed from: i */
    private volatile Object f5367i;

    /* renamed from: a */
    public abstract Object mo2690a(Object obj);

    public /* synthetic */ ceh(ceg ceg, String str, Object obj) {
        String str2 = ceg.f5353a;
        if (str2 == null && ceg.f5354b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || ceg.f5354b == null) {
            this.f5363d = ceg;
            this.f5364e = str;
            this.f5365f = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo2694c() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = p000.ceh.f5362g
            int r0 = r0.get()
            int r1 = r7.f5366h
            if (r1 >= r0) goto L_0x00a2
            monitor-enter(r7)
            int r1 = r7.f5366h     // Catch:{ all -> 0x009f }
            if (r1 >= r0) goto L_0x009d
            android.content.Context r1 = p000.ceh.f5359a     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0095
            dff r1 = p000.ceh.f5361c     // Catch:{ all -> 0x009f }
            java.lang.Object r1 = r1.mo2551a()     // Catch:{ all -> 0x009f }
            dfc r1 = (p000.dfc) r1     // Catch:{ all -> 0x009f }
            boolean r2 = r1.mo4219a()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r1 = r1.mo4220b()     // Catch:{ all -> 0x009f }
            cea r1 = (p000.cea) r1     // Catch:{ all -> 0x009f }
            ceg r2 = r7.f5363d     // Catch:{ all -> 0x009f }
            android.net.Uri r3 = r2.f5354b     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r2.f5353a     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.f5356d     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r7.f5364e     // Catch:{ all -> 0x009f }
            r6 = 0
            if (r3 != 0) goto L_0x0038
            if (r4 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            goto L_0x0065
        L_0x0038:
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x009f }
        L_0x003c:
            java.util.Map r1 = r1.f5348a     // Catch:{ all -> 0x009f }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x009f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0047
            goto L_0x0037
        L_0x0047:
            if (r2 == 0) goto L_0x005d
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x009f }
            int r4 = r3.length()     // Catch:{ all -> 0x009f }
            if (r4 != 0) goto L_0x0059
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x009f }
            r5.<init>(r2)     // Catch:{ all -> 0x009f }
            goto L_0x005d
        L_0x0059:
            java.lang.String r5 = r2.concat(r3)     // Catch:{ all -> 0x009f }
        L_0x005d:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x009f }
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x009f }
        L_0x0065:
            if (r6 != 0) goto L_0x006a
            java.lang.Object r1 = r7.f5365f     // Catch:{ all -> 0x009f }
            goto L_0x0090
        L_0x006a:
            java.lang.Object r1 = r7.mo2690a(r6)     // Catch:{ all -> 0x009f }
            goto L_0x0090
        L_0x006f:
            ceg r1 = r7.f5363d     // Catch:{ all -> 0x009f }
            boolean r1 = r1.f5357e     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0082
            java.lang.Object r1 = r7.m4610d()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
            java.lang.Object r1 = r7.m4611e()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
            goto L_0x008e
        L_0x0082:
            java.lang.Object r1 = r7.m4611e()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
            java.lang.Object r1 = r7.m4610d()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            java.lang.Object r1 = r7.f5365f     // Catch:{ all -> 0x009f }
        L_0x0090:
            r7.f5367i = r1     // Catch:{ all -> 0x009f }
            r7.f5366h = r0     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009f }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            goto L_0x00a2
        L_0x009f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            throw r0
        L_0x00a2:
            java.lang.Object r0 = r7.f5367i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ceh.mo2694c():java.lang.Object");
    }

    /* renamed from: b */
    public final String mo2693b() {
        return m4606a(this.f5363d.f5356d);
    }

    /* renamed from: a */
    private final String m4606a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f5364e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f5364e);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static void m4608a(Context context) {
        synchronized (f5360b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f5359a != context) {
                cdt.m4589a();
                cej.m4616a();
                cdz.m4596a();
                m4607a();
                f5359a = context;
                f5361c = dgx.m6399a(ced.f5352a);
            }
        }
    }

    /* renamed from: a */
    static void m4607a() {
        f5362g.incrementAndGet();
    }

    /* renamed from: e */
    private final Object m4611e() {
        String b = cdz.m4595a(f5359a).mo2685a(m4606a(this.f5363d.f5355c));
        if (b != null) {
            return mo2690a((Object) b);
        }
        return null;
    }

    /* renamed from: d */
    private final Object m4610d() {
        cdw cdw;
        Object a;
        String b;
        if (this.f5363d.f5358f || (b = cdz.m4595a(f5359a).mo2685a("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) == null || !byi.f5005b.matcher(b).matches()) {
            if (this.f5363d.f5354b != null) {
                cdw = ceb.m4599a(f5359a, this.f5363d.f5354b) ? cdt.m4588a(f5359a.getContentResolver(), this.f5363d.f5354b) : null;
            } else {
                cdw = cej.m4615a(f5359a, this.f5363d.f5353a);
            }
            if (!(cdw == null || (a = cdw.mo2685a(mo2693b())) == null)) {
                return mo2690a(a);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m4609b(Context context) {
        synchronized (f5360b) {
            if (f5359a == null) {
                m4608a(context);
            }
        }
    }
}

package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ceh  reason: default package */
/* compiled from: PG */
public abstract class ceh {
    public static Context a = null;
    private static final Object b = new Object();
    private static dff c;
    private static final AtomicInteger g = new AtomicInteger();
    private final ceg d;
    private final String e;
    private final Object f;
    private volatile int h = -1;
    private volatile Object i;

    public abstract Object a(Object obj);

    public /* synthetic */ ceh(ceg ceg, String str, Object obj) {
        String str2 = ceg.a;
        if (str2 == null && ceg.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || ceg.b == null) {
            this.d = ceg;
            this.e = str;
            this.f = obj;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.ceh.g
            int r0 = r0.get()
            int r1 = r7.h
            if (r1 >= r0) goto L_0x00a2
            monitor-enter(r7)
            int r1 = r7.h     // Catch:{ all -> 0x009f }
            if (r1 >= r0) goto L_0x009d
            android.content.Context r1 = defpackage.ceh.a     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0095
            dff r1 = defpackage.ceh.c     // Catch:{ all -> 0x009f }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x009f }
            dfc r1 = (defpackage.dfc) r1     // Catch:{ all -> 0x009f }
            boolean r2 = r1.a()     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x009f }
            cea r1 = (defpackage.cea) r1     // Catch:{ all -> 0x009f }
            ceg r2 = r7.d     // Catch:{ all -> 0x009f }
            android.net.Uri r3 = r2.b     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r7.e     // Catch:{ all -> 0x009f }
            r6 = 0
            if (r3 != 0) goto L_0x0038
            if (r4 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            goto L_0x0065
        L_0x0038:
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x009f }
        L_0x003c:
            java.util.Map r1 = r1.a     // Catch:{ all -> 0x009f }
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
            java.lang.Object r1 = r7.f     // Catch:{ all -> 0x009f }
            goto L_0x0090
        L_0x006a:
            java.lang.Object r1 = r7.a(r6)     // Catch:{ all -> 0x009f }
            goto L_0x0090
        L_0x006f:
            ceg r1 = r7.d     // Catch:{ all -> 0x009f }
            boolean r1 = r1.e     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0082
            java.lang.Object r1 = r7.d()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
            java.lang.Object r1 = r7.e()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
            goto L_0x008e
        L_0x0082:
            java.lang.Object r1 = r7.e()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
            java.lang.Object r1 = r7.d()     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            java.lang.Object r1 = r7.f     // Catch:{ all -> 0x009f }
        L_0x0090:
            r7.i = r1     // Catch:{ all -> 0x009f }
            r7.h = r0     // Catch:{ all -> 0x009f }
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
            java.lang.Object r0 = r7.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceh.c():java.lang.Object");
    }

    public final String b() {
        return a(this.d.d);
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.e);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public static void a(Context context) {
        synchronized (b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (a != context) {
                cdt.a();
                cej.a();
                cdz.a();
                a();
                a = context;
                c = dgx.a(ced.a);
            }
        }
    }

    static void a() {
        g.incrementAndGet();
    }

    private final Object e() {
        String b2 = cdz.a(a).a(a(this.d.c));
        if (b2 != null) {
            return a((Object) b2);
        }
        return null;
    }

    private final Object d() {
        cdw cdw;
        Object a2;
        String b2;
        if (this.d.f || (b2 = cdz.a(a).a("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) == null || !byi.b.matcher(b2).matches()) {
            if (this.d.b != null) {
                cdw = ceb.a(a, this.d.b) ? cdt.a(a.getContentResolver(), this.d.b) : null;
            } else {
                cdw = cej.a(a, this.d.a);
            }
            if (!(cdw == null || (a2 = cdw.a(b())) == null)) {
                return a(a2);
            }
        }
        return null;
    }

    public static void b(Context context) {
        synchronized (b) {
            if (a == null) {
                a(context);
            }
        }
    }
}

package defpackage;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* renamed from: bkb  reason: default package */
/* compiled from: PG */
public final class bkb implements bjk {
    public static /* synthetic */ int e;
    private static final HashSet f = new HashSet();
    public final File a;
    public final bjq b;
    public final bjv c;
    public bji d;
    private final HashMap g;
    private final Random h;
    private final boolean i;
    private long j;

    @Deprecated
    public bkb(File file, bjq bjq) {
        bjv bjv = new bjv(file);
        if (a(file)) {
            this.a = file;
            this.b = bjq;
            this.c = bjv;
            this.g = new HashMap();
            this.h = new Random();
            this.i = true;
            ConditionVariable conditionVariable = new ConditionVariable();
            new bka(this, "SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final void a(bkc bkc) {
        this.c.a(bkc.a).c.add(bkc);
        this.j += bkc.c;
        ArrayList arrayList = (ArrayList) this.g.get(bkc.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bjj) arrayList.get(size)).a(this, bkc);
            }
        }
        this.b.a(this, bkc);
    }

    public final synchronized void a(String str, bjx bjx) {
        bks.b(true);
        a();
        bjv bjv = this.c;
        bjs a2 = bjv.a(str);
        bjy bjy = a2.d;
        a2.d = bjy.a(bjx);
        if (!a2.d.equals(bjy)) {
            bjv.c.a();
        }
        try {
            this.c.a();
        } catch (IOException e2) {
            throw new bji(e2);
        }
    }

    private final synchronized void a() {
        bji bji = this.d;
        if (bji != null) {
            throw bji;
        }
    }

    public final synchronized void a(File file, long j2) {
        boolean z = true;
        bks.b(true);
        if (!file.exists()) {
            return;
        }
        if (j2 != 0) {
            bkc bkc = (bkc) bks.a(bkc.a(file, j2, this.c));
            bjs bjs = (bjs) bks.a(this.c.b(bkc.a));
            bks.b(bjs.e);
            long a2 = cbp.a(bjs.d);
            if (a2 != -1) {
                if (bkc.b + bkc.c > a2) {
                    z = false;
                }
                bks.b(z);
            }
            a(bkc);
            try {
                this.c.a();
                notifyAll();
            } catch (IOException e2) {
                throw new bji(e2);
            }
        } else {
            file.delete();
        }
    }

    public final synchronized bjw a(String str) {
        bjs b2;
        bks.b(true);
        b2 = this.c.b(str);
        return b2 != null ? b2.d : bjy.a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkb.a(java.io.File, boolean, java.io.File[]):void
     arg types: [java.io.File, int, java.io.File[]]
     candidates:
      bkb.a(java.lang.String, long, long):java.io.File
      bjk.a(java.lang.String, long, long):java.io.File
      bkb.a(java.io.File, boolean, java.io.File[]):void */
    public final void a(File file, boolean z, File[] fileArr) {
        if (fileArr != null && (r0 = fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        a(file2, false, file2.listFiles());
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                bkc a2 = bkc.a(file2, -1, this.c);
                if (a2 != null) {
                    a(a2);
                } else {
                    file2.delete();
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    private static synchronized boolean a(File file) {
        boolean add;
        synchronized (bkb.class) {
            add = f.add(file.getAbsoluteFile());
        }
        return add;
    }

    public final synchronized void a(bjr bjr) {
        bks.b(true);
        bjs b2 = this.c.b(bjr.a);
        bks.a(b2);
        bks.b(b2.e);
        b2.e = false;
        this.c.c(b2.b);
        notifyAll();
    }

    public final synchronized void b(bjr bjr) {
        bks.b(true);
        c(bjr);
    }

    private final void c(bjr bjr) {
        bjs b2 = this.c.b(bjr.a);
        if (b2 != null && b2.c.remove(bjr)) {
            bjr.e.delete();
            this.j -= bjr.c;
            this.c.c(b2.b);
            ArrayList arrayList = (ArrayList) this.g.get(bjr.a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((bjj) arrayList.get(size)).a(bjr);
                }
            }
            this.b.a(bjr);
        }
    }

    private final void b() {
        ArrayList arrayList = new ArrayList();
        for (bjs bjs : this.c.a.values()) {
            Iterator it = bjs.c.iterator();
            while (it.hasNext()) {
                bjr bjr = (bjr) it.next();
                if (bjr.e.length() != bjr.c) {
                    arrayList.add(bjr);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c((bjr) arrayList.get(i2));
        }
    }

    public final synchronized File a(String str, long j2, long j3) {
        bjs b2;
        File file;
        bks.b(true);
        a();
        b2 = this.c.b(str);
        bks.a(b2);
        bks.b(b2.e);
        if (!this.a.exists()) {
            this.a.mkdirs();
            b();
        }
        bjq bjq = this.b;
        if (j3 != -1) {
            ((bjz) bjq).a(this, j3);
        }
        file = new File(this.a, Integer.toString(this.h.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return bkc.a(file, b2.a, j2, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.bjr a(java.lang.String r13, long r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 1
            defpackage.bks.b(r0)     // Catch:{ all -> 0x0139 }
            r12.a()     // Catch:{ all -> 0x0139 }
            bjv r1 = r12.c     // Catch:{ all -> 0x0139 }
            bjs r1 = r1.b(r13)     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x006e
        L_0x0010:
            java.lang.String r3 = r1.b     // Catch:{ all -> 0x0139 }
            bkc r11 = new bkc     // Catch:{ all -> 0x0139 }
            r6 = -1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r2 = r11
            r4 = r14
            r2.<init>(r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r2 = r1.c     // Catch:{ all -> 0x0139 }
            java.lang.Object r2 = r2.floor(r11)     // Catch:{ all -> 0x0139 }
            bkc r2 = (defpackage.bkc) r2     // Catch:{ all -> 0x0139 }
            if (r2 == 0) goto L_0x0034
            long r3 = r2.b     // Catch:{ all -> 0x0139 }
            long r5 = r2.c     // Catch:{ all -> 0x0139 }
            long r3 = r3 + r5
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x0059
        L_0x0034:
            java.util.TreeSet r2 = r1.c     // Catch:{ all -> 0x0139 }
            java.lang.Object r2 = r2.ceiling(r11)     // Catch:{ all -> 0x0139 }
            bkc r2 = (defpackage.bkc) r2     // Catch:{ all -> 0x0139 }
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = r1.b     // Catch:{ all -> 0x0139 }
            bkc r2 = defpackage.bkc.a(r2, r14)     // Catch:{ all -> 0x0139 }
            goto L_0x0059
        L_0x0045:
            java.lang.String r3 = r1.b     // Catch:{ all -> 0x0139 }
            long r4 = r2.b     // Catch:{ all -> 0x0139 }
            bkc r11 = new bkc     // Catch:{ all -> 0x0139 }
            long r6 = r4 - r14
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r2 = r11
            r4 = r14
            r2.<init>(r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0139 }
            r2 = r11
        L_0x0059:
            boolean r3 = r2.d     // Catch:{ all -> 0x0139 }
            if (r3 == 0) goto L_0x0072
            java.io.File r3 = r2.e     // Catch:{ all -> 0x0139 }
            long r3 = r3.length()     // Catch:{ all -> 0x0139 }
            long r5 = r2.c     // Catch:{ all -> 0x0139 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            r12.b()     // Catch:{ all -> 0x0139 }
            goto L_0x0010
        L_0x006e:
            bkc r2 = defpackage.bkc.a(r13, r14)     // Catch:{ all -> 0x0139 }
        L_0x0072:
            boolean r14 = r2.d     // Catch:{ all -> 0x0139 }
            if (r14 != 0) goto L_0x0087
            bjv r14 = r12.c     // Catch:{ all -> 0x0139 }
            bjs r13 = r14.a(r13)     // Catch:{ all -> 0x0139 }
            boolean r14 = r13.e     // Catch:{ all -> 0x0139 }
            if (r14 != 0) goto L_0x0084
            r13.e = r0     // Catch:{ all -> 0x0139 }
            monitor-exit(r12)
            return r2
        L_0x0084:
            r13 = 0
            monitor-exit(r12)
            return r13
        L_0x0087:
            boolean r14 = r12.i     // Catch:{ all -> 0x0139 }
            if (r14 == 0) goto L_0x0136
            java.io.File r14 = r2.e     // Catch:{ all -> 0x0139 }
            java.lang.Object r14 = defpackage.bks.a(r14)     // Catch:{ all -> 0x0139 }
            java.io.File r14 = (java.io.File) r14     // Catch:{ all -> 0x0139 }
            r14.getName()     // Catch:{ all -> 0x0139 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0139 }
            bjv r14 = r12.c     // Catch:{ all -> 0x0139 }
            bjs r13 = r14.b(r13)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r14 = r13.c     // Catch:{ all -> 0x0139 }
            boolean r14 = r14.remove(r2)     // Catch:{ all -> 0x0139 }
            defpackage.bks.b(r14)     // Catch:{ all -> 0x0139 }
            java.io.File r14 = r2.e     // Catch:{ all -> 0x0139 }
            java.io.File r3 = r14.getParentFile()     // Catch:{ all -> 0x0139 }
            long r5 = r2.b     // Catch:{ all -> 0x0139 }
            int r4 = r13.a     // Catch:{ all -> 0x0139 }
            r7 = r9
            java.io.File r15 = defpackage.bkc.a(r3, r4, r5, r7)     // Catch:{ all -> 0x0139 }
            boolean r0 = r14.renameTo(r15)     // Catch:{ all -> 0x0139 }
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0139 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0139 }
            int r1 = r1.length()     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0139 }
            int r3 = r3.length()     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            int r1 = r1 + 21
            int r1 = r1 + r3
            r4.<init>(r1)     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "Failed to rename "
            r4.append(r1)     // Catch:{ all -> 0x0139 }
            r4.append(r0)     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = " to "
            r4.append(r0)     // Catch:{ all -> 0x0139 }
            r4.append(r15)     // Catch:{ all -> 0x0139 }
            java.lang.String r15 = "CachedContent"
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0139 }
            android.util.Log.w(r15, r0)     // Catch:{ all -> 0x0139 }
            r11 = r14
            goto L_0x00fa
        L_0x00f9:
            r11 = r15
        L_0x00fa:
            boolean r14 = r2.d     // Catch:{ all -> 0x0139 }
            defpackage.bks.b(r14)     // Catch:{ all -> 0x0139 }
            bkc r14 = new bkc     // Catch:{ all -> 0x0139 }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x0139 }
            long r5 = r2.b     // Catch:{ all -> 0x0139 }
            long r7 = r2.c     // Catch:{ all -> 0x0139 }
            r3 = r14
            r3.<init>(r4, r5, r7, r9, r11)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r13 = r13.c     // Catch:{ all -> 0x0139 }
            r13.add(r14)     // Catch:{ all -> 0x0139 }
            java.util.HashMap r13 = r12.g     // Catch:{ all -> 0x0139 }
            java.lang.String r15 = r2.a     // Catch:{ all -> 0x0139 }
            java.lang.Object r13 = r13.get(r15)     // Catch:{ all -> 0x0139 }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x0139 }
            if (r13 == 0) goto L_0x0130
            int r15 = r13.size()     // Catch:{ all -> 0x0139 }
            int r15 = r15 + -1
        L_0x0122:
            if (r15 < 0) goto L_0x0130
            java.lang.Object r0 = r13.get(r15)     // Catch:{ all -> 0x0139 }
            bjj r0 = (defpackage.bjj) r0     // Catch:{ all -> 0x0139 }
            r0.a(r12, r2, r14)     // Catch:{ all -> 0x0139 }
            int r15 = r15 + -1
            goto L_0x0122
        L_0x0130:
            bjq r13 = r12.b     // Catch:{ all -> 0x0139 }
            r13.a(r12, r2, r14)     // Catch:{ all -> 0x0139 }
            goto L_0x0137
        L_0x0136:
            r14 = r2
        L_0x0137:
            monitor-exit(r12)
            return r14
        L_0x0139:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x013d
        L_0x013c:
            throw r13
        L_0x013d:
            goto L_0x013c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.a(java.lang.String, long):bjr");
    }
}

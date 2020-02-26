package p000;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* renamed from: bkb */
/* compiled from: PG */
public final class bkb implements bjk {

    /* renamed from: e */
    public static /* synthetic */ int f4189e;

    /* renamed from: f */
    private static final HashSet f4190f = new HashSet();

    /* renamed from: a */
    public final File f4191a;

    /* renamed from: b */
    public final bjq f4192b;

    /* renamed from: c */
    public final bjv f4193c;

    /* renamed from: d */
    public bji f4194d;

    /* renamed from: g */
    private final HashMap f4195g;

    /* renamed from: h */
    private final Random f4196h;

    /* renamed from: i */
    private final boolean f4197i;

    /* renamed from: j */
    private long f4198j;

    @Deprecated
    public bkb(File file, bjq bjq) {
        bjv bjv = new bjv(file);
        if (m3462a(file)) {
            this.f4191a = file;
            this.f4192b = bjq;
            this.f4193c = bjv;
            this.f4195g = new HashMap();
            this.f4196h = new Random();
            this.f4197i = true;
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

    /* renamed from: a */
    private final void m3461a(bkc bkc) {
        this.f4193c.mo2012a(bkc.f4160a).f4168c.add(bkc);
        this.f4198j += bkc.f4162c;
        ArrayList arrayList = (ArrayList) this.f4195g.get(bkc.f4160a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bjj) arrayList.get(size)).mo1995a(this, bkc);
            }
        }
        this.f4192b.mo1995a(this, bkc);
    }

    /* renamed from: a */
    public final synchronized void mo2003a(String str, bjx bjx) {
        bks.m3512b(true);
        m3460a();
        bjv bjv = this.f4193c;
        bjs a = bjv.mo2012a(str);
        bjy bjy = a.f4169d;
        a.f4169d = bjy.mo2019a(bjx);
        if (!a.f4169d.equals(bjy)) {
            bjv.f4176c.mo2011a();
        }
        try {
            this.f4193c.mo2013a();
        } catch (IOException e) {
            throw new bji(e);
        }
    }

    /* renamed from: a */
    private final synchronized void m3460a() {
        bji bji = this.f4194d;
        if (bji != null) {
            throw bji;
        }
    }

    /* renamed from: a */
    public final synchronized void mo2002a(File file, long j) {
        boolean z = true;
        bks.m3512b(true);
        if (!file.exists()) {
            return;
        }
        if (j != 0) {
            bkc bkc = (bkc) bks.m3507a(bkc.m3473a(file, j, this.f4193c));
            bjs bjs = (bjs) bks.m3507a(this.f4193c.mo2014b(bkc.f4160a));
            bks.m3512b(bjs.f4170e);
            long a = cbp.m4508a(bjs.f4169d);
            if (a != -1) {
                if (bkc.f4161b + bkc.f4162c > a) {
                    z = false;
                }
                bks.m3512b(z);
            }
            m3461a(bkc);
            try {
                this.f4193c.mo2013a();
                notifyAll();
            } catch (IOException e) {
                throw new bji(e);
            }
        } else {
            file.delete();
        }
    }

    /* renamed from: a */
    public final synchronized bjw mo1999a(String str) {
        bjs b;
        bks.m3512b(true);
        b = this.f4193c.mo2014b(str);
        return b != null ? b.f4169d : bjy.f4181a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkb.a(java.io.File, boolean, java.io.File[]):void
     arg types: [java.io.File, int, java.io.File[]]
     candidates:
      bkb.a(java.lang.String, long, long):java.io.File
      bjk.a(java.lang.String, long, long):java.io.File
      bkb.a(java.io.File, boolean, java.io.File[]):void */
    /* renamed from: a */
    public final void mo2025a(File file, boolean z, File[] fileArr) {
        if (fileArr != null && (r0 = fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        mo2025a(file2, false, file2.listFiles());
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                bkc a = bkc.m3473a(file2, -1, this.f4193c);
                if (a != null) {
                    m3461a(a);
                } else {
                    file2.delete();
                }
            }
        } else if (!z) {
            file.delete();
        }
    }

    /* renamed from: a */
    private static synchronized boolean m3462a(File file) {
        boolean add;
        synchronized (bkb.class) {
            add = f4190f.add(file.getAbsoluteFile());
        }
        return add;
    }

    /* renamed from: a */
    public final synchronized void mo2001a(bjr bjr) {
        bks.m3512b(true);
        bjs b = this.f4193c.mo2014b(bjr.f4160a);
        bks.m3507a(b);
        bks.m3512b(b.f4170e);
        b.f4170e = false;
        this.f4193c.mo2015c(b.f4167b);
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void mo2004b(bjr bjr) {
        bks.m3512b(true);
        m3464c(bjr);
    }

    /* renamed from: c */
    private final void m3464c(bjr bjr) {
        bjs b = this.f4193c.mo2014b(bjr.f4160a);
        if (b != null && b.f4168c.remove(bjr)) {
            bjr.f4164e.delete();
            this.f4198j -= bjr.f4162c;
            this.f4193c.mo2015c(b.f4167b);
            ArrayList arrayList = (ArrayList) this.f4195g.get(bjr.f4160a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((bjj) arrayList.get(size)).mo1997a(bjr);
                }
            }
            this.f4192b.mo1997a(bjr);
        }
    }

    /* renamed from: b */
    private final void m3463b() {
        ArrayList arrayList = new ArrayList();
        for (bjs bjs : this.f4193c.f4174a.values()) {
            Iterator it = bjs.f4168c.iterator();
            while (it.hasNext()) {
                bjr bjr = (bjr) it.next();
                if (bjr.f4164e.length() != bjr.f4162c) {
                    arrayList.add(bjr);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m3464c((bjr) arrayList.get(i));
        }
    }

    /* renamed from: a */
    public final synchronized File mo2000a(String str, long j, long j2) {
        bjs b;
        File file;
        bks.m3512b(true);
        m3460a();
        b = this.f4193c.mo2014b(str);
        bks.m3507a(b);
        bks.m3512b(b.f4170e);
        if (!this.f4191a.exists()) {
            this.f4191a.mkdirs();
            m3463b();
        }
        bjq bjq = this.f4192b;
        if (j2 != -1) {
            ((bjz) bjq).mo2022a(this, j2);
        }
        file = new File(this.f4191a, Integer.toString(this.f4196h.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return bkc.m3475a(file, b.f4166a, j, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        return r14;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p000.bjr mo1998a(java.lang.String r13, long r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 1
            p000.bks.m3512b(r0)     // Catch:{ all -> 0x0139 }
            r12.m3460a()     // Catch:{ all -> 0x0139 }
            bjv r1 = r12.f4193c     // Catch:{ all -> 0x0139 }
            bjs r1 = r1.mo2014b(r13)     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x006e
        L_0x0010:
            java.lang.String r3 = r1.f4167b     // Catch:{ all -> 0x0139 }
            bkc r11 = new bkc     // Catch:{ all -> 0x0139 }
            r6 = -1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r2 = r11
            r4 = r14
            r2.<init>(r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r2 = r1.f4168c     // Catch:{ all -> 0x0139 }
            java.lang.Object r2 = r2.floor(r11)     // Catch:{ all -> 0x0139 }
            bkc r2 = (p000.bkc) r2     // Catch:{ all -> 0x0139 }
            if (r2 == 0) goto L_0x0034
            long r3 = r2.f4161b     // Catch:{ all -> 0x0139 }
            long r5 = r2.f4162c     // Catch:{ all -> 0x0139 }
            long r3 = r3 + r5
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x0059
        L_0x0034:
            java.util.TreeSet r2 = r1.f4168c     // Catch:{ all -> 0x0139 }
            java.lang.Object r2 = r2.ceiling(r11)     // Catch:{ all -> 0x0139 }
            bkc r2 = (p000.bkc) r2     // Catch:{ all -> 0x0139 }
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = r1.f4167b     // Catch:{ all -> 0x0139 }
            bkc r2 = p000.bkc.m3474a(r2, r14)     // Catch:{ all -> 0x0139 }
            goto L_0x0059
        L_0x0045:
            java.lang.String r3 = r1.f4167b     // Catch:{ all -> 0x0139 }
            long r4 = r2.f4161b     // Catch:{ all -> 0x0139 }
            bkc r11 = new bkc     // Catch:{ all -> 0x0139 }
            long r6 = r4 - r14
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r2 = r11
            r4 = r14
            r2.<init>(r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0139 }
            r2 = r11
        L_0x0059:
            boolean r3 = r2.f4163d     // Catch:{ all -> 0x0139 }
            if (r3 == 0) goto L_0x0072
            java.io.File r3 = r2.f4164e     // Catch:{ all -> 0x0139 }
            long r3 = r3.length()     // Catch:{ all -> 0x0139 }
            long r5 = r2.f4162c     // Catch:{ all -> 0x0139 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            r12.m3463b()     // Catch:{ all -> 0x0139 }
            goto L_0x0010
        L_0x006e:
            bkc r2 = p000.bkc.m3474a(r13, r14)     // Catch:{ all -> 0x0139 }
        L_0x0072:
            boolean r14 = r2.f4163d     // Catch:{ all -> 0x0139 }
            if (r14 != 0) goto L_0x0087
            bjv r14 = r12.f4193c     // Catch:{ all -> 0x0139 }
            bjs r13 = r14.mo2012a(r13)     // Catch:{ all -> 0x0139 }
            boolean r14 = r13.f4170e     // Catch:{ all -> 0x0139 }
            if (r14 != 0) goto L_0x0084
            r13.f4170e = r0     // Catch:{ all -> 0x0139 }
            monitor-exit(r12)
            return r2
        L_0x0084:
            r13 = 0
            monitor-exit(r12)
            return r13
        L_0x0087:
            boolean r14 = r12.f4197i     // Catch:{ all -> 0x0139 }
            if (r14 == 0) goto L_0x0136
            java.io.File r14 = r2.f4164e     // Catch:{ all -> 0x0139 }
            java.lang.Object r14 = p000.bks.m3507a(r14)     // Catch:{ all -> 0x0139 }
            java.io.File r14 = (java.io.File) r14     // Catch:{ all -> 0x0139 }
            r14.getName()     // Catch:{ all -> 0x0139 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0139 }
            bjv r14 = r12.f4193c     // Catch:{ all -> 0x0139 }
            bjs r13 = r14.mo2014b(r13)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r14 = r13.f4168c     // Catch:{ all -> 0x0139 }
            boolean r14 = r14.remove(r2)     // Catch:{ all -> 0x0139 }
            p000.bks.m3512b(r14)     // Catch:{ all -> 0x0139 }
            java.io.File r14 = r2.f4164e     // Catch:{ all -> 0x0139 }
            java.io.File r3 = r14.getParentFile()     // Catch:{ all -> 0x0139 }
            long r5 = r2.f4161b     // Catch:{ all -> 0x0139 }
            int r4 = r13.f4166a     // Catch:{ all -> 0x0139 }
            r7 = r9
            java.io.File r15 = p000.bkc.m3475a(r3, r4, r5, r7)     // Catch:{ all -> 0x0139 }
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
            boolean r14 = r2.f4163d     // Catch:{ all -> 0x0139 }
            p000.bks.m3512b(r14)     // Catch:{ all -> 0x0139 }
            bkc r14 = new bkc     // Catch:{ all -> 0x0139 }
            java.lang.String r4 = r2.f4160a     // Catch:{ all -> 0x0139 }
            long r5 = r2.f4161b     // Catch:{ all -> 0x0139 }
            long r7 = r2.f4162c     // Catch:{ all -> 0x0139 }
            r3 = r14
            r3.<init>(r4, r5, r7, r9, r11)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r13 = r13.f4168c     // Catch:{ all -> 0x0139 }
            r13.add(r14)     // Catch:{ all -> 0x0139 }
            java.util.HashMap r13 = r12.f4195g     // Catch:{ all -> 0x0139 }
            java.lang.String r15 = r2.f4160a     // Catch:{ all -> 0x0139 }
            java.lang.Object r13 = r13.get(r15)     // Catch:{ all -> 0x0139 }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x0139 }
            if (r13 == 0) goto L_0x0130
            int r15 = r13.size()     // Catch:{ all -> 0x0139 }
            int r15 = r15 + -1
        L_0x0122:
            if (r15 < 0) goto L_0x0130
            java.lang.Object r0 = r13.get(r15)     // Catch:{ all -> 0x0139 }
            bjj r0 = (p000.bjj) r0     // Catch:{ all -> 0x0139 }
            r0.mo1996a(r12, r2, r14)     // Catch:{ all -> 0x0139 }
            int r15 = r15 + -1
            goto L_0x0122
        L_0x0130:
            bjq r13 = r12.f4192b     // Catch:{ all -> 0x0139 }
            r13.mo1996a(r12, r2, r14)     // Catch:{ all -> 0x0139 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.bkb.mo1998a(java.lang.String, long):bjr");
    }
}

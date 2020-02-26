package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: bjo  reason: default package */
/* compiled from: PG */
public final class bjo implements bhv {
    private final bjk a;
    private final bhv b;
    private final bhv c;
    private final bhv d;
    private bhv e;
    private boolean f;
    private Uri g;
    private Uri h;
    private int i;
    private int j;
    private String k;
    private long l;
    private long m;
    private bjr n;
    private long o;
    private long p;

    public bjo(bjk bjk, bhv bhv, bhv bhv2, bht bht) {
        this.a = bjk;
        this.b = bhv2;
        this.d = bhv;
        this.c = new bje(bhv, bht);
    }

    private final boolean f() {
        return this.e == this.b;
    }

    private final boolean g() {
        return this.e == this.c;
    }

    public final Uri a() {
        return this.h;
    }

    public final void a(bjf bjf) {
        this.b.a(bjf);
        this.d.a(bjf);
    }

    public final void c() {
        this.g = null;
        this.h = null;
        this.i = 1;
        h();
    }

    private final void h() {
        bhv bhv = this.e;
        if (bhv != null) {
            try {
                bhv.c();
                this.e = null;
                this.f = false;
                bjr bjr = this.n;
                if (bjr != null) {
                    this.a.a(bjr);
                    this.n = null;
                }
            } catch (Throwable th) {
                this.e = null;
                this.f = false;
                bjr bjr2 = this.n;
                if (bjr2 != null) {
                    this.a.a(bjr2);
                    this.n = null;
                }
                throw th;
            }
        }
    }

    public final Map b() {
        if (e()) {
            return this.d.b();
        }
        return Collections.emptyMap();
    }

    private final boolean e() {
        return !f();
    }

    public final long a(bhy bhy) {
        String str = bhy.g;
        if (str == null) {
            str = bhy.a.toString();
        }
        this.k = str;
        Uri uri = bhy.a;
        this.g = uri;
        String b2 = this.a.a(this.k).b("exo_redir");
        Uri parse = b2 != null ? Uri.parse(b2) : null;
        if (parse != null) {
            uri = parse;
        }
        this.h = uri;
        this.i = bhy.b;
        this.j = bhy.h;
        this.l = bhy.e;
        long j2 = bhy.f;
        if (j2 == -1) {
            long a2 = cbp.a(this.a.a(this.k));
            this.m = a2;
            if (a2 != -1) {
                long j3 = a2 - bhy.e;
                this.m = j3;
                if (j3 <= 0) {
                    throw new bhw();
                }
            }
        } else {
            this.m = j2;
        }
        a(false);
        return this.m;
    }

    private final void a(boolean z) {
        bhv bhv;
        bhy bhy;
        long j2;
        boolean z2;
        long j3;
        bjr a2 = this.a.a(this.k, this.l);
        if (a2 == null) {
            bhv bhv2 = this.d;
            Uri uri = this.g;
            int i2 = this.i;
            long j4 = this.l;
            bhv = bhv2;
            bhy = new bhy(uri, i2, j4, j4, this.m, this.k, this.j);
        } else if (a2.d) {
            Uri fromFile = Uri.fromFile(a2.e);
            long j5 = this.l - a2.b;
            long j6 = a2.c - j5;
            long j7 = this.m;
            if (j7 != -1) {
                j6 = Math.min(j6, j7);
            }
            bhy = new bhy(fromFile, this.l, j5, j6, this.k, this.j);
            bhv = this.b;
        } else {
            long j8 = a2.c;
            if (j8 != -1) {
                long j9 = this.m;
                if (j9 != -1) {
                    j8 = Math.min(j8, j9);
                }
                j3 = j8;
            } else {
                j3 = this.m;
            }
            Uri uri2 = this.g;
            int i3 = this.i;
            long j10 = this.l;
            bhy = new bhy(uri2, i3, j10, j10, j3, this.k, this.j);
            bhv = this.c;
        }
        bhv bhv3 = this.d;
        if (bhv == bhv3) {
            j2 = this.l + 102400;
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.p = j2;
        boolean z3 = false;
        if (z) {
            if (this.e == bhv3) {
                z2 = true;
            } else {
                z2 = false;
            }
            bks.b(z2);
            if (bhv != this.d) {
                try {
                    h();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (a2.a()) {
                        this.a.a(a2);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (a2 != null && a2.a()) {
            this.n = a2;
        }
        this.e = bhv;
        if (bhy.f == -1) {
            z3 = true;
        }
        this.f = z3;
        long a3 = bhv.a(bhy);
        bjx bjx = new bjx();
        if (this.f && a3 != -1) {
            this.m = a3;
            bjx.a(bjx, this.l + a3);
        }
        if (e()) {
            Uri a4 = this.e.a();
            this.h = a4;
            Uri uri3 = this.g.equals(a4) ^ true ? this.h : null;
            if (uri3 == null) {
                bjx.b.add("exo_redir");
                bjx.a.remove("exo_redir");
            } else {
                bjx.a("exo_redir", uri3.toString());
            }
        }
        if (g()) {
            this.a.a(this.k, bjx);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r10.f != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r12 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        if ((r12 instanceof defpackage.bhw) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        r12 = r12.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        r12 = (defpackage.bhw) r12;
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0077
            long r1 = r10.m
            r3 = 0
            r5 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0076
            long r1 = r10.l     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r6 = r10.p     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            r1 = 1
            r10.a(r1)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x0019:
            bhv r1 = r10.e     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r1 = r1.a(r11, r12, r13)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r6 = -1
            if (r1 != r5) goto L_0x0040
            boolean r2 = r10.f     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r2 != 0) goto L_0x003c
            long r8 = r10.m     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0031
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
        L_0x0031:
            r10.h()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r10.a(r0)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r11 = r10.a(r11, r12, r13)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            return r11
        L_0x003c:
            r10.d()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            goto L_0x005b
        L_0x0040:
            boolean r11 = r10.f()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r11 == 0) goto L_0x004c
            long r11 = r10.o     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r2 = (long) r1     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r11 = r11 + r2
            r10.o = r11     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x004c:
            long r11 = r10.l     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r2 = (long) r1     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r11 = r11 + r2
            r10.l = r11     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r11 = r10.m     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x005b
            long r11 = r11 - r2
            r10.m = r11     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x005b:
            return r1
        L_0x005c:
            r11 = move-exception
            throw r11
        L_0x005e:
            r11 = move-exception
            boolean r12 = r10.f
            if (r12 == 0) goto L_0x0075
            r12 = r11
        L_0x0064:
            if (r12 == 0) goto L_0x0075
            boolean r13 = r12 instanceof defpackage.bhw
            if (r13 != 0) goto L_0x006f
            java.lang.Throwable r12 = r12.getCause()
            goto L_0x0064
        L_0x006f:
            bhw r12 = (defpackage.bhw) r12
            r10.d()
            return r5
        L_0x0075:
            throw r11
        L_0x0076:
            return r5
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjo.a(byte[], int, int):int");
    }

    private final void d() {
        this.m = 0;
        if (g()) {
            bjx bjx = new bjx();
            bjx.a(bjx, this.l);
            this.a.a(this.k, bjx);
        }
    }
}

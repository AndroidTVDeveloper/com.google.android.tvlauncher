package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: bjo */
/* compiled from: PG */
public final class bjo implements bhv {

    /* renamed from: a */
    private final bjk f4141a;

    /* renamed from: b */
    private final bhv f4142b;

    /* renamed from: c */
    private final bhv f4143c;

    /* renamed from: d */
    private final bhv f4144d;

    /* renamed from: e */
    private bhv f4145e;

    /* renamed from: f */
    private boolean f4146f;

    /* renamed from: g */
    private Uri f4147g;

    /* renamed from: h */
    private Uri f4148h;

    /* renamed from: i */
    private int f4149i;

    /* renamed from: j */
    private int f4150j;

    /* renamed from: k */
    private String f4151k;

    /* renamed from: l */
    private long f4152l;

    /* renamed from: m */
    private long f4153m;

    /* renamed from: n */
    private bjr f4154n;

    /* renamed from: o */
    private long f4155o;

    /* renamed from: p */
    private long f4156p;

    public bjo(bjk bjk, bhv bhv, bhv bhv2, bht bht) {
        this.f4141a = bjk;
        this.f4142b = bhv2;
        this.f4144d = bhv;
        this.f4143c = new bje(bhv, bht);
    }

    /* renamed from: f */
    private final boolean m3426f() {
        return this.f4145e == this.f4142b;
    }

    /* renamed from: g */
    private final boolean m3427g() {
        return this.f4145e == this.f4143c;
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f4148h;
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        this.f4142b.mo1501a(bjf);
        this.f4144d.mo1501a(bjf);
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f4147g = null;
        this.f4148h = null;
        this.f4149i = 1;
        m3428h();
    }

    /* renamed from: h */
    private final void m3428h() {
        bhv bhv = this.f4145e;
        if (bhv != null) {
            try {
                bhv.mo1503c();
                this.f4145e = null;
                this.f4146f = false;
                bjr bjr = this.f4154n;
                if (bjr != null) {
                    this.f4141a.mo2001a(bjr);
                    this.f4154n = null;
                }
            } catch (Throwable th) {
                this.f4145e = null;
                this.f4146f = false;
                bjr bjr2 = this.f4154n;
                if (bjr2 != null) {
                    this.f4141a.mo2001a(bjr2);
                    this.f4154n = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final Map mo1502b() {
        if (m3425e()) {
            return this.f4144d.mo1502b();
        }
        return Collections.emptyMap();
    }

    /* renamed from: e */
    private final boolean m3425e() {
        return !m3426f();
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        String str = bhy.f4004g;
        if (str == null) {
            str = bhy.f3998a.toString();
        }
        this.f4151k = str;
        Uri uri = bhy.f3998a;
        this.f4147g = uri;
        String b = this.f4141a.mo1999a(this.f4151k).mo2017b("exo_redir");
        Uri parse = b != null ? Uri.parse(b) : null;
        if (parse != null) {
            uri = parse;
        }
        this.f4148h = uri;
        this.f4149i = bhy.f3999b;
        this.f4150j = bhy.f4005h;
        this.f4152l = bhy.f4002e;
        long j = bhy.f4003f;
        if (j == -1) {
            long a = cbp.m4508a(this.f4141a.mo1999a(this.f4151k));
            this.f4153m = a;
            if (a != -1) {
                long j2 = a - bhy.f4002e;
                this.f4153m = j2;
                if (j2 <= 0) {
                    throw new bhw();
                }
            }
        } else {
            this.f4153m = j;
        }
        m3423a(false);
        return this.f4153m;
    }

    /* renamed from: a */
    private final void m3423a(boolean z) {
        bhv bhv;
        bhy bhy;
        long j;
        boolean z2;
        long j2;
        bjr a = this.f4141a.mo1998a(this.f4151k, this.f4152l);
        if (a == null) {
            bhv bhv2 = this.f4144d;
            Uri uri = this.f4147g;
            int i = this.f4149i;
            long j3 = this.f4152l;
            bhv = bhv2;
            bhy = new bhy(uri, i, j3, j3, this.f4153m, this.f4151k, this.f4150j);
        } else if (a.f4163d) {
            Uri fromFile = Uri.fromFile(a.f4164e);
            long j4 = this.f4152l - a.f4161b;
            long j5 = a.f4162c - j4;
            long j6 = this.f4153m;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            bhy = new bhy(fromFile, this.f4152l, j4, j5, this.f4151k, this.f4150j);
            bhv = this.f4142b;
        } else {
            long j7 = a.f4162c;
            if (j7 != -1) {
                long j8 = this.f4153m;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
                j2 = j7;
            } else {
                j2 = this.f4153m;
            }
            Uri uri2 = this.f4147g;
            int i2 = this.f4149i;
            long j9 = this.f4152l;
            bhy = new bhy(uri2, i2, j9, j9, j2, this.f4151k, this.f4150j);
            bhv = this.f4143c;
        }
        bhv bhv3 = this.f4144d;
        if (bhv == bhv3) {
            j = this.f4152l + 102400;
        } else {
            j = Long.MAX_VALUE;
        }
        this.f4156p = j;
        boolean z3 = false;
        if (z) {
            if (this.f4145e == bhv3) {
                z2 = true;
            } else {
                z2 = false;
            }
            bks.m3512b(z2);
            if (bhv != this.f4144d) {
                try {
                    m3428h();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (a.mo2007a()) {
                        this.f4141a.mo2001a(a);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (a != null && a.mo2007a()) {
            this.f4154n = a;
        }
        this.f4145e = bhv;
        if (bhy.f4003f == -1) {
            z3 = true;
        }
        this.f4146f = z3;
        long a2 = bhv.mo1499a(bhy);
        bjx bjx = new bjx();
        if (this.f4146f && a2 != -1) {
            this.f4153m = a2;
            bjx.m3448a(bjx, this.f4152l + a2);
        }
        if (m3425e()) {
            Uri a3 = this.f4145e.mo1500a();
            this.f4148h = a3;
            Uri uri3 = this.f4147g.equals(a3) ^ true ? this.f4148h : null;
            if (uri3 == null) {
                bjx.f4180b.add("exo_redir");
                bjx.f4179a.remove("exo_redir");
            } else {
                bjx.mo2018a("exo_redir", uri3.toString());
            }
        }
        if (m3427g()) {
            this.f4141a.mo2003a(this.f4151k, bjx);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r10.f4146f != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r12 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        if ((r12 instanceof p000.bhw) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        r12 = r12.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        r12 = (p000.bhw) r12;
        m3424d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1498a(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0077
            long r1 = r10.f4153m
            r3 = 0
            r5 = -1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0076
            long r1 = r10.f4152l     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r6 = r10.f4156p     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            r1 = 1
            r10.m3423a(r1)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x0019:
            bhv r1 = r10.f4145e     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r1 = r1.mo1498a(r11, r12, r13)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r6 = -1
            if (r1 != r5) goto L_0x0040
            boolean r2 = r10.f4146f     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r2 != 0) goto L_0x003c
            long r8 = r10.f4153m     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0031
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
        L_0x0031:
            r10.m3428h()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r10.m3423a(r0)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r11 = r10.mo1498a(r11, r12, r13)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            return r11
        L_0x003c:
            r10.m3424d()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            goto L_0x005b
        L_0x0040:
            boolean r11 = r10.m3426f()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r11 == 0) goto L_0x004c
            long r11 = r10.f4155o     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r2 = (long) r1     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r11 = r11 + r2
            r10.f4155o = r11     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x004c:
            long r11 = r10.f4152l     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r2 = (long) r1     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r11 = r11 + r2
            r10.f4152l = r11     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r11 = r10.f4153m     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x005b
            long r11 = r11 - r2
            r10.f4153m = r11     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x005b:
            return r1
        L_0x005c:
            r11 = move-exception
            throw r11
        L_0x005e:
            r11 = move-exception
            boolean r12 = r10.f4146f
            if (r12 == 0) goto L_0x0075
            r12 = r11
        L_0x0064:
            if (r12 == 0) goto L_0x0075
            boolean r13 = r12 instanceof p000.bhw
            if (r13 != 0) goto L_0x006f
            java.lang.Throwable r12 = r12.getCause()
            goto L_0x0064
        L_0x006f:
            bhw r12 = (p000.bhw) r12
            r10.m3424d()
            return r5
        L_0x0075:
            throw r11
        L_0x0076:
            return r5
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bjo.mo1498a(byte[], int, int):int");
    }

    /* renamed from: d */
    private final void m3424d() {
        this.f4153m = 0;
        if (m3427g()) {
            bjx bjx = new bjx();
            bjx.m3448a(bjx, this.f4152l);
            this.f4141a.mo2003a(this.f4151k, bjx);
        }
    }
}

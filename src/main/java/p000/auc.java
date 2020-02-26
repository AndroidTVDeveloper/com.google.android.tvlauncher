package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: auc */
/* compiled from: PG */
public final class auc extends aiz implements Handler.Callback {

    /* renamed from: f */
    private final atz f2418f;

    /* renamed from: g */
    private final aub f2419g;

    /* renamed from: h */
    private final Handler f2420h;

    /* renamed from: i */
    private final aua f2421i;

    /* renamed from: j */
    private final atw[] f2422j;

    /* renamed from: k */
    private final long[] f2423k;

    /* renamed from: l */
    private int f2424l;

    /* renamed from: m */
    private int f2425m;

    /* renamed from: n */
    private atx f2426n;

    /* renamed from: o */
    private boolean f2427o;

    /* renamed from: p */
    private long f2428p;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
     arg types: [android.os.Looper, auc]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object, java.lang.Object):boolean
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auc(aub aub, Looper looper) {
        super(4);
        Handler handler;
        atz atz = atz.f2413a;
        this.f2419g = (aub) bks.m3507a(aub);
        if (looper != null) {
            handler = blm.m3634a(looper, (Handler.Callback) this);
        } else {
            handler = null;
        }
        this.f2420h = handler;
        this.f2418f = (atz) bks.m3507a(atz);
        this.f2421i = new aua();
        this.f2422j = new atw[5];
        this.f2423k = new long[5];
    }

    /* renamed from: v */
    public final boolean mo485v() {
        return true;
    }

    /* renamed from: w */
    public final boolean mo486w() {
        return this.f2427o;
    }

    /* renamed from: a */
    private final void m2150a(atw atw, List list) {
        for (int i = 0; i < atw.mo1344a(); i++) {
            akh a = atw.mo1345a(i).mo1253a();
            if (a == null || !this.f2418f.mo1354a(a)) {
                list.add(atw.mo1345a(i));
            } else {
                atx b = this.f2418f.mo1355b(a);
                byte[] bArr = (byte[]) bks.m3507a(atw.mo1345a(i).mo1254b());
                this.f2421i.mo1139a();
                this.f2421i.mo1149c(bArr.length);
                this.f2421i.f1425c.put(bArr);
                this.f2421i.mo1152g();
                atw a2 = b.mo1353a(this.f2421i);
                if (a2 != null) {
                    m2150a(a2, list);
                }
            }
        }
    }

    /* renamed from: x */
    private final void m2151x() {
        Arrays.fill(this.f2422j, (Object) null);
        this.f2424l = 0;
        this.f2425m = 0;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            m2149a((atw) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private final void m2149a(atw atw) {
        this.f2419g.mo501a(atw);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo370r() {
        m2151x();
        this.f2426n = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo349a(long j, boolean z) {
        m2151x();
        this.f2427o = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo352a(akh[] akhArr, long j) {
        this.f2426n = this.f2418f.mo1355b(akhArr[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(aki, anj, boolean):int
     arg types: [aki, aua, int]
     candidates:
      aiz.a(akh[], axx, long):void
      akx.a(akh[], axx, long):void
      aiz.a(aki, anj, boolean):int */
    /* renamed from: a */
    public final void mo484a(long j, long j2) {
        if (!this.f2427o && this.f2425m < 5) {
            this.f2421i.mo1139a();
            aki t = mo372t();
            int a = mo345a(t, (anj) this.f2421i, false);
            if (a == -4) {
                if (this.f2421i.mo1141c()) {
                    this.f2427o = true;
                } else if (!this.f2421i.mo1138T()) {
                    aua aua = this.f2421i;
                    aua.f2417f = this.f2428p;
                    aua.mo1152g();
                    atw a2 = this.f2426n.mo1353a(this.f2421i);
                    if (a2 != null) {
                        ArrayList arrayList = new ArrayList(a2.mo1344a());
                        m2150a(a2, arrayList);
                        if (!arrayList.isEmpty()) {
                            atw atw = new atw(arrayList);
                            int i = this.f2424l;
                            int i2 = this.f2425m;
                            int i3 = (i + i2) % 5;
                            this.f2422j[i3] = atw;
                            this.f2423k[i3] = this.f2421i.f1426d;
                            this.f2425m = i2 + 1;
                        }
                    }
                }
            } else if (a == -5) {
                this.f2428p = t.f576c.f560m;
            }
        }
        if (this.f2425m > 0) {
            long[] jArr = this.f2423k;
            int i4 = this.f2424l;
            if (jArr[i4] <= j) {
                atw atw2 = this.f2422j[i4];
                Handler handler = this.f2420h;
                if (handler != null) {
                    handler.obtainMessage(0, atw2).sendToTarget();
                } else {
                    m2149a(atw2);
                }
                atw[] atwArr = this.f2422j;
                int i5 = this.f2424l;
                atwArr[i5] = null;
                this.f2424l = (i5 + 1) % 5;
                this.f2425m--;
            }
        }
    }

    /* renamed from: a */
    public final int mo487a(akh akh) {
        if (this.f2418f.mo1354a(akh)) {
            return m599a(akh.f559l) ? 4 : 2;
        }
        return 0;
    }
}

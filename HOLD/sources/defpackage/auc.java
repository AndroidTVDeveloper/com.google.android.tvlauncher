package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: auc  reason: default package */
/* compiled from: PG */
public final class auc extends aiz implements Handler.Callback {
    private final atz f;
    private final aub g;
    private final Handler h;
    private final aua i;
    private final atw[] j;
    private final long[] k;
    private int l;
    private int m;
    private atx n;
    private boolean o;
    private long p;

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
        atz atz = atz.a;
        this.g = (aub) bks.a(aub);
        if (looper != null) {
            handler = blm.a(looper, (Handler.Callback) this);
        } else {
            handler = null;
        }
        this.h = handler;
        this.f = (atz) bks.a(atz);
        this.i = new aua();
        this.j = new atw[5];
        this.k = new long[5];
    }

    public final boolean v() {
        return true;
    }

    public final boolean w() {
        return this.o;
    }

    private final void a(atw atw, List list) {
        for (int i2 = 0; i2 < atw.a(); i2++) {
            akh a = atw.a(i2).a();
            if (a == null || !this.f.a(a)) {
                list.add(atw.a(i2));
            } else {
                atx b = this.f.b(a);
                byte[] bArr = (byte[]) bks.a(atw.a(i2).b());
                this.i.a();
                this.i.c(bArr.length);
                this.i.c.put(bArr);
                this.i.g();
                atw a2 = b.a(this.i);
                if (a2 != null) {
                    a(a2, list);
                }
            }
        }
    }

    private final void x() {
        Arrays.fill(this.j, (Object) null);
        this.l = 0;
        this.m = 0;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((atw) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private final void a(atw atw) {
        this.g.a(atw);
    }

    /* access modifiers changed from: protected */
    public final void r() {
        x();
        this.n = null;
    }

    /* access modifiers changed from: protected */
    public final void a(long j2, boolean z) {
        x();
        this.o = false;
    }

    /* access modifiers changed from: protected */
    public final void a(akh[] akhArr, long j2) {
        this.n = this.f.b(akhArr[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(aki, anj, boolean):int
     arg types: [aki, aua, int]
     candidates:
      aiz.a(akh[], axx, long):void
      akx.a(akh[], axx, long):void
      aiz.a(aki, anj, boolean):int */
    public final void a(long j2, long j3) {
        if (!this.o && this.m < 5) {
            this.i.a();
            aki t = t();
            int a = a(t, (anj) this.i, false);
            if (a == -4) {
                if (this.i.c()) {
                    this.o = true;
                } else if (!this.i.T()) {
                    aua aua = this.i;
                    aua.f = this.p;
                    aua.g();
                    atw a2 = this.n.a(this.i);
                    if (a2 != null) {
                        ArrayList arrayList = new ArrayList(a2.a());
                        a(a2, arrayList);
                        if (!arrayList.isEmpty()) {
                            atw atw = new atw(arrayList);
                            int i2 = this.l;
                            int i3 = this.m;
                            int i4 = (i2 + i3) % 5;
                            this.j[i4] = atw;
                            this.k[i4] = this.i.d;
                            this.m = i3 + 1;
                        }
                    }
                }
            } else if (a == -5) {
                this.p = t.c.m;
            }
        }
        if (this.m > 0) {
            long[] jArr = this.k;
            int i5 = this.l;
            if (jArr[i5] <= j2) {
                atw atw2 = this.j[i5];
                Handler handler = this.h;
                if (handler != null) {
                    handler.obtainMessage(0, atw2).sendToTarget();
                } else {
                    a(atw2);
                }
                atw[] atwArr = this.j;
                int i6 = this.l;
                atwArr[i6] = null;
                this.l = (i6 + 1) % 5;
                this.m--;
            }
        }
    }

    public final int a(akh akh) {
        if (this.f.a(akh)) {
            return a(akh.l) ? 4 : 2;
        }
        return 0;
    }
}

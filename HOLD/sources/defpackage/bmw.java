package defpackage;

import android.os.SystemClock;
import java.util.TimeZone;

/* renamed from: bmw  reason: default package */
/* compiled from: PG */
public final class bmw {
    public final bmy a;
    public final boolean b;
    public String c;
    public String d;
    public final int e;
    public final int f;
    public final djb g;
    private boolean h;

    public /* synthetic */ bmw(bmy bmy, byte[] bArr) {
        dik a2 = bArr != null ? dik.a(bArr) : null;
        this.b = true;
        this.g = (djb) dng.i.l();
        this.h = false;
        this.a = bmy;
        this.e = bmy.f;
        this.d = bmy.e;
        this.c = null;
        this.f = bmy.k;
        djb djb = this.g;
        long currentTimeMillis = System.currentTimeMillis();
        if (djb.b) {
            djb.b();
            djb.b = false;
        }
        dng dng = (dng) djb.a;
        dng.b = 1 | dng.b;
        dng.c = currentTimeMillis;
        djb djb2 = this.g;
        long offset = (long) (TimeZone.getDefault().getOffset(((dng) djb2.a).c) / 1000);
        if (djb2.b) {
            djb2.b();
            djb2.b = false;
        }
        dng dng2 = (dng) djb2.a;
        dng2.b |= 65536;
        dng2.g = offset;
        if (bym.a(bmy.c)) {
            djb djb3 = this.g;
            boolean a3 = bym.a(bmy.c);
            if (djb3.b) {
                djb3.b();
                djb3.b = false;
            }
            dng dng3 = (dng) djb3.a;
            dng3.b |= 8388608;
            dng3.h = a3;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            djb djb4 = this.g;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (djb4.b) {
                djb4.b();
                djb4.b = false;
            }
            dng dng4 = (dng) djb4.a;
            dng4.b |= 2;
            dng4.d = elapsedRealtime;
        }
        if (a2 != null) {
            djb djb5 = this.g;
            if (djb5.b) {
                djb5.b();
                djb5.b = false;
            }
            dng dng5 = (dng) djb5.a;
            a2.getClass();
            dng5.b |= 1024;
            dng5.f = a2;
        }
    }

    @Deprecated
    public final bou a() {
        if (!this.h) {
            this.h = true;
            boo boo = (boo) this.a.g;
            return boo.a(new bne(this, boo.f));
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: null, logSourceName: ");
        sb.append(this.d);
        sb.append(", logSource#: ");
        sb.append(this.e);
        sb.append(", qosTier: ");
        sb.append((Object) (this.f == 0 ? "null" : Integer.toString(0)));
        sb.append(", loggingId: null, MessageProducer: ");
        sb.append((Object) null);
        sb.append(", veMessageProducer: ");
        sb.append((Object) null);
        sb.append(", testCodes: ");
        bok bok = bmy.a;
        sb.append("null, dimensions: null, mendelPackages: null, experimentIds: null, experimentTokens: null, experimentTokensBytes: null, addPhenotype: ");
        sb.append(true);
        sb.append("]");
        return sb.toString();
    }
}

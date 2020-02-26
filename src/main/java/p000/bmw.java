package p000;

import android.os.SystemClock;
import java.util.TimeZone;

/* renamed from: bmw */
/* compiled from: PG */
public final class bmw {

    /* renamed from: a */
    public final bmy f4427a;

    /* renamed from: b */
    public final boolean f4428b;

    /* renamed from: c */
    public String f4429c;

    /* renamed from: d */
    public String f4430d;

    /* renamed from: e */
    public final int f4431e;

    /* renamed from: f */
    public final int f4432f;

    /* renamed from: g */
    public final djb f4433g;

    /* renamed from: h */
    private boolean f4434h;

    public /* synthetic */ bmw(bmy bmy, byte[] bArr) {
        dik a = bArr != null ? dik.m6514a(bArr) : null;
        this.f4428b = true;
        this.f4433g = (djb) dng.f8930i.mo4516l();
        this.f4434h = false;
        this.f4427a = bmy;
        this.f4431e = bmy.f4443f;
        this.f4430d = bmy.f4442e;
        this.f4429c = null;
        this.f4432f = bmy.f4447k;
        djb djb = this.f4433g;
        long currentTimeMillis = System.currentTimeMillis();
        if (djb.f8673b) {
            djb.mo4505b();
            djb.f8673b = false;
        }
        dng dng = (dng) djb.f8672a;
        dng.f8931b = 1 | dng.f8931b;
        dng.f8932c = currentTimeMillis;
        djb djb2 = this.f4433g;
        long offset = (long) (TimeZone.getDefault().getOffset(((dng) djb2.f8672a).f8932c) / 1000);
        if (djb2.f8673b) {
            djb2.mo4505b();
            djb2.f8673b = false;
        }
        dng dng2 = (dng) djb2.f8672a;
        dng2.f8931b |= 65536;
        dng2.f8936g = offset;
        if (bym.m4381a(bmy.f4440c)) {
            djb djb3 = this.f4433g;
            boolean a2 = bym.m4381a(bmy.f4440c);
            if (djb3.f8673b) {
                djb3.mo4505b();
                djb3.f8673b = false;
            }
            dng dng3 = (dng) djb3.f8672a;
            dng3.f8931b |= 8388608;
            dng3.f8937h = a2;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            djb djb4 = this.f4433g;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (djb4.f8673b) {
                djb4.mo4505b();
                djb4.f8673b = false;
            }
            dng dng4 = (dng) djb4.f8672a;
            dng4.f8931b |= 2;
            dng4.f8933d = elapsedRealtime;
        }
        if (a != null) {
            djb djb5 = this.f4433g;
            if (djb5.f8673b) {
                djb5.mo4505b();
                djb5.f8673b = false;
            }
            dng dng5 = (dng) djb5.f8672a;
            a.getClass();
            dng5.f8931b |= 1024;
            dng5.f8935f = a;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final bou mo2163a() {
        if (!this.f4434h) {
            this.f4434h = true;
            boo boo = (boo) this.f4427a.f4444g;
            return boo.mo2240a(new bne(this, boo.f4520f));
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: null, logSourceName: ");
        sb.append(this.f4430d);
        sb.append(", logSource#: ");
        sb.append(this.f4431e);
        sb.append(", qosTier: ");
        sb.append((Object) (this.f4432f == 0 ? "null" : Integer.toString(0)));
        sb.append(", loggingId: null, MessageProducer: ");
        sb.append((Object) null);
        sb.append(", veMessageProducer: ");
        sb.append((Object) null);
        sb.append(", testCodes: ");
        bok bok = bmy.f4435a;
        sb.append("null, dimensions: null, mendelPackages: null, experimentIds: null, experimentTokens: null, experimentTokensBytes: null, addPhenotype: ");
        sb.append(true);
        sb.append("]");
        return sb.toString();
    }
}

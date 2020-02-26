package p000;

import android.util.Log;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: bbq */
/* compiled from: PG */
final class bbq implements aov {

    /* renamed from: a */
    private static final akh f3134a = akh.m735a(null, "application/id3", Long.MAX_VALUE);

    /* renamed from: b */
    private final aov f3135b;

    /* renamed from: c */
    private final akh f3136c;

    /* renamed from: d */
    private akh f3137d;

    /* renamed from: e */
    private byte[] f3138e;

    /* renamed from: f */
    private int f3139f;

    static {
        akh.m735a(null, "application/x-emsg", Long.MAX_VALUE);
    }

    public bbq(aov aov, int i) {
        this.f3135b = aov;
        if (i == 1) {
            this.f3136c = f3134a;
            this.f3138e = new byte[0];
            this.f3139f = 0;
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown metadataType: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private final void m2737a(int i) {
        byte[] bArr = this.f3138e;
        if (bArr.length < i) {
            this.f3138e = Arrays.copyOf(bArr, i + (i >> 1));
        }
    }

    /* renamed from: a */
    public final void mo1204a(akh akh) {
        this.f3137d = akh;
        this.f3135b.mo1204a(this.f3136c);
    }

    /* renamed from: a */
    public final int mo1202a(aoj aoj, int i, boolean z) {
        m2737a(this.f3139f + i);
        int a = aoj.mo1189a(this.f3138e, this.f3139f, i);
        if (a != -1) {
            this.f3139f += a;
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public final void mo1205a(bky bky, int i) {
        m2737a(this.f3139f + i);
        bky.mo2069a(this.f3138e, this.f3139f, i);
        this.f3139f += i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    /* renamed from: a */
    public final void mo1203a(long j, int i, int i2, int i3, aou aou) {
        bks.m3507a(this.f3137d);
        int i4 = this.f3139f - i3;
        bky bky = new bky(Arrays.copyOfRange(this.f3138e, i4 - i2, i4));
        byte[] bArr = this.f3138e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f3139f = i3;
        if (!blm.m3652a((Object) this.f3137d.f556i, (Object) this.f3136c.f556i)) {
            if ("application/x-emsg".equals(this.f3137d.f556i)) {
                aue a = auf.m2161a(bky);
                akh a2 = a.mo1253a();
                if (a2 == null || !blm.m3652a((Object) this.f3136c.f556i, (Object) a2.f556i)) {
                    Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f3136c.f556i, a.mo1253a()));
                    return;
                }
                bky = new bky((byte[]) bks.m3507a(a.mo1254b()));
            } else {
                String valueOf = String.valueOf(this.f3137d.f556i);
                Log.w("EmsgUnwrappingTrackOutput", valueOf.length() == 0 ? new String("Ignoring sample for unsupported format: ") : "Ignoring sample for unsupported format: ".concat(valueOf));
                return;
            }
        }
        int b = bky.mo2070b();
        this.f3135b.mo1205a(bky, b);
        this.f3135b.mo1203a(j, i, b, i3, aou);
    }
}

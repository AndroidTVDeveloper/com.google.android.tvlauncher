package defpackage;

import android.util.Log;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: bbq  reason: default package */
/* compiled from: PG */
final class bbq implements aov {
    private static final akh a = akh.a(null, "application/id3", Long.MAX_VALUE);
    private final aov b;
    private final akh c;
    private akh d;
    private byte[] e;
    private int f;

    static {
        akh.a(null, "application/x-emsg", Long.MAX_VALUE);
    }

    public bbq(aov aov, int i) {
        this.b = aov;
        if (i == 1) {
            this.c = a;
            this.e = new byte[0];
            this.f = 0;
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown metadataType: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private final void a(int i) {
        byte[] bArr = this.e;
        if (bArr.length < i) {
            this.e = Arrays.copyOf(bArr, i + (i >> 1));
        }
    }

    public final void a(akh akh) {
        this.d = akh;
        this.b.a(this.c);
    }

    public final int a(aoj aoj, int i, boolean z) {
        a(this.f + i);
        int a2 = aoj.a(this.e, this.f, i);
        if (a2 != -1) {
            this.f += a2;
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a(bky bky, int i) {
        a(this.f + i);
        bky.a(this.e, this.f, i);
        this.f += i;
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
    public final void a(long j, int i, int i2, int i3, aou aou) {
        bks.a(this.d);
        int i4 = this.f - i3;
        bky bky = new bky(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        if (!blm.a((Object) this.d.i, (Object) this.c.i)) {
            if ("application/x-emsg".equals(this.d.i)) {
                aue a2 = auf.a(bky);
                akh a3 = a2.a();
                if (a3 == null || !blm.a((Object) this.c.i, (Object) a3.i)) {
                    Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.i, a2.a()));
                    return;
                }
                bky = new bky((byte[]) bks.a(a2.b()));
            } else {
                String valueOf = String.valueOf(this.d.i);
                Log.w("EmsgUnwrappingTrackOutput", valueOf.length() == 0 ? new String("Ignoring sample for unsupported format: ") : "Ignoring sample for unsupported format: ".concat(valueOf));
                return;
            }
        }
        int b2 = bky.b();
        this.b.a(bky, b2);
        this.b.a(j, i, b2, i3, aou);
    }
}

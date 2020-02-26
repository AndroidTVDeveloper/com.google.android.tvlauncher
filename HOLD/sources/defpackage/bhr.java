package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: bhr  reason: default package */
/* compiled from: PG */
public final class bhr extends bho {
    private bhy a;
    private byte[] b;
    private int c;
    private int d;

    public bhr() {
        super(false);
    }

    public final Uri a() {
        bhy bhy = this.a;
        if (bhy != null) {
            return bhy.a;
        }
        return null;
    }

    public final void c() {
        if (this.b != null) {
            this.b = null;
            d();
        }
        this.a = null;
    }

    public final long a(bhy bhy) {
        e();
        this.a = bhy;
        this.d = (int) bhy.e;
        Uri uri = bhy.a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new ako(valueOf.length() == 0 ? new String("Unsupported scheme: ") : "Unsupported scheme: ".concat(valueOf));
        }
        String[] a2 = blm.a(uri.getSchemeSpecificPart(), ",");
        if (a2.length == 2) {
            String str = a2[1];
            if (a2[0].contains(";base64")) {
                try {
                    this.b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw new ako(valueOf2.length() == 0 ? new String("Error while parsing Base64 encoded string: ") : "Error while parsing Base64 encoded string: ".concat(valueOf2), e);
                }
            } else {
                this.b = blm.c(URLDecoder.decode(str, "US-ASCII"));
            }
            long j = bhy.f;
            int length = j != -1 ? ((int) j) + this.d : this.b.length;
            this.c = length;
            if (length > this.b.length || this.d > length) {
                this.b = null;
                throw new bhw();
            }
            b(bhy);
            return ((long) this.c) - ((long) this.d);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ako(sb.toString());
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.c - this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(blm.a((Object) this.b), this.d, bArr, i, min);
        this.d += min;
        a(min);
        return min;
    }
}

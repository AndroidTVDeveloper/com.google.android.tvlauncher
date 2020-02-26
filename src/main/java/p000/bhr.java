package p000;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* renamed from: bhr */
/* compiled from: PG */
public final class bhr extends bho {

    /* renamed from: a */
    private bhy f3988a;

    /* renamed from: b */
    private byte[] f3989b;

    /* renamed from: c */
    private int f3990c;

    /* renamed from: d */
    private int f3991d;

    public bhr() {
        super(false);
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        bhy bhy = this.f3988a;
        if (bhy != null) {
            return bhy.f3998a;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo1503c() {
        if (this.f3989b != null) {
            this.f3989b = null;
            mo1944d();
        }
        this.f3988a = null;
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        mo1945e();
        this.f3988a = bhy;
        this.f3991d = (int) bhy.f4002e;
        Uri uri = bhy.f3998a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new ako(valueOf.length() == 0 ? new String("Unsupported scheme: ") : "Unsupported scheme: ".concat(valueOf));
        }
        String[] a = blm.m3658a(uri.getSchemeSpecificPart(), ",");
        if (a.length == 2) {
            String str = a[1];
            if (a[0].contains(";base64")) {
                try {
                    this.f3989b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw new ako(valueOf2.length() == 0 ? new String("Error while parsing Base64 encoded string: ") : "Error while parsing Base64 encoded string: ".concat(valueOf2), e);
                }
            } else {
                this.f3989b = blm.m3674c(URLDecoder.decode(str, "US-ASCII"));
            }
            long j = bhy.f4003f;
            int length = j != -1 ? ((int) j) + this.f3991d : this.f3989b.length;
            this.f3990c = length;
            if (length > this.f3989b.length || this.f3991d > length) {
                this.f3989b = null;
                throw new bhw();
            }
            mo1943b(bhy);
            return ((long) this.f3990c) - ((long) this.f3991d);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ako(sb.toString());
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f3990c - this.f3991d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(blm.m3636a((Object) this.f3989b), this.f3991d, bArr, i, min);
        this.f3991d += min;
        mo1942a(min);
        return min;
    }
}

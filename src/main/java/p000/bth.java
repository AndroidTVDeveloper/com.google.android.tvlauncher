package p000;

import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: bth */
/* compiled from: PG */
public final class bth {

    /* renamed from: a */
    public final String f4806a;

    /* renamed from: b */
    private final String f4807b;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public bth(String str, String str2) {
        this.f4807b = buh.m4201a(str);
        this.f4806a = buh.m4201a(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bth) {
            bth bth = (bth) obj;
            return bty.m4184a(this.f4807b, bth.f4807b) && bty.m4184a(this.f4806a, bth.f4806a) && bty.m4184a(null, null);
        }
    }

    /* renamed from: a */
    public final Intent mo2421a() {
        String str = this.f4807b;
        if (str != null) {
            return new Intent(str).setPackage(this.f4806a);
        }
        return new Intent().setComponent(null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4807b, this.f4806a, null, 129, false});
    }

    public final String toString() {
        String str = this.f4807b;
        if (str != null) {
            return str;
        }
        throw null;
    }
}

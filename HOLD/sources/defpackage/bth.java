package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: bth  reason: default package */
/* compiled from: PG */
public final class bth {
    public final String a;
    private final String b;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public bth(String str, String str2) {
        this.b = buh.a(str);
        this.a = buh.a(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bth) {
            bth bth = (bth) obj;
            return bty.a(this.b, bth.b) && bty.a(this.a, bth.a) && bty.a(null, null);
        }
    }

    public final Intent a() {
        String str = this.b;
        if (str != null) {
            return new Intent(str).setPackage(this.a);
        }
        return new Intent().setComponent(null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, null, 129, false});
    }

    public final String toString() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw null;
    }
}

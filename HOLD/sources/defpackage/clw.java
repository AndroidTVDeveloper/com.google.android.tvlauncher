package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: clw  reason: default package */
/* compiled from: PG */
public final class clw {
    public final String a;
    public final long b;

    public clw(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clw) {
            clw clw = (clw) obj;
            if (!TextUtils.equals(this.a, clw.a) || this.b != clw.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b));
    }

    public final String toString() {
        return String.format("TrackingUrl: [url=%s, offsetMillis=%s]", this.a, Long.valueOf(this.b));
    }
}

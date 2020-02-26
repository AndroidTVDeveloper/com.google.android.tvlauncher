package p000;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: clw */
/* compiled from: PG */
public final class clw {

    /* renamed from: a */
    public final String f5953a;

    /* renamed from: b */
    public final long f5954b;

    public clw(String str, long j) {
        this.f5953a = str;
        this.f5954b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clw) {
            clw clw = (clw) obj;
            if (!TextUtils.equals(this.f5953a, clw.f5953a) || this.f5954b != clw.f5954b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5953a, Long.valueOf(this.f5954b));
    }

    public final String toString() {
        return String.format("TrackingUrl: [url=%s, offsetMillis=%s]", this.f5953a, Long.valueOf(this.f5954b));
    }
}

package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: cxs  reason: default package */
/* compiled from: PG */
public final class cxs {
    public final String a;
    public final int b;
    public String c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g = true;

    public cxs(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cxs) && TextUtils.equals(this.a, ((cxs) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("ChannelPackage{packageName='");
        sb.append(str);
        sb.append("', channelCount=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}

package p000;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: cxs */
/* compiled from: PG */
public final class cxs {

    /* renamed from: a */
    public final String f7866a;

    /* renamed from: b */
    public final int f7867b;

    /* renamed from: c */
    public String f7868c;

    /* renamed from: d */
    public long f7869d;

    /* renamed from: e */
    public boolean f7870e;

    /* renamed from: f */
    public boolean f7871f;

    /* renamed from: g */
    public boolean f7872g = true;

    public cxs(String str, int i) {
        this.f7866a = str;
        this.f7867b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cxs) && TextUtils.equals(this.f7866a, ((cxs) obj).f7866a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7866a);
    }

    public final String toString() {
        String str = this.f7866a;
        int i = this.f7867b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("ChannelPackage{packageName='");
        sb.append(str);
        sb.append("', channelCount=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}

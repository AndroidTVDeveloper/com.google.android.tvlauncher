package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: bv */
/* compiled from: PG */
public final class C0050bv {

    /* renamed from: a */
    public final String f4892a;

    /* renamed from: b */
    public final String f4893b;

    /* renamed from: c */
    public final String f4894c;

    /* renamed from: d */
    public final List f4895d;

    /* renamed from: e */
    public final String f4896e = (this.f4892a + "-" + this.f4893b + "-" + this.f4894c);

    public C0050bv(String str, String str2, String str3, List list) {
        this.f4892a = (String) C0086dc.m6103a(str);
        this.f4893b = (String) C0086dc.m6103a(str2);
        this.f4894c = (String) C0086dc.m6103a(str3);
        this.f4895d = (List) C0086dc.m6103a(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4892a + ", mProviderPackage: " + this.f4893b + ", mQuery: " + this.f4894c + ", mCertificates:");
        for (int i = 0; i < this.f4895d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f4895d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}

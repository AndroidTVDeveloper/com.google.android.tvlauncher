package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: dby */
/* compiled from: PG */
public class dby {

    /* renamed from: a */
    public final String f8183a;

    /* renamed from: b */
    public final String f8184b;

    /* renamed from: c */
    public final String f8185c;

    /* renamed from: d */
    public final String f8186d;

    /* renamed from: e */
    public final boolean f8187e;

    /* renamed from: f */
    public final boolean f8188f;

    /* renamed from: g */
    public final String f8189g;

    /* renamed from: h */
    public final String f8190h;

    /* renamed from: i */
    public final String f8191i;

    /* renamed from: j */
    public final List f8192j;

    /* renamed from: k */
    public String f8193k;

    public dby(dbx dbx) {
        this.f8183a = dbx.f8173a;
        this.f8184b = dbx.f8174b;
        this.f8185c = dbx.f8175c;
        this.f8186d = dbx.f8176d;
        this.f8189g = dbx.f8177e;
        this.f8190h = dbx.f8178f;
        this.f8191i = dbx.f8179g;
        this.f8187e = dbx.f8180h;
        boolean z = dbx.f8181i;
        this.f8188f = z;
        this.f8192j = dbx.f8182j;
        if (this.f8193k == null) {
            String str = this.f8184b;
            this.f8193k = str;
            if (z) {
                String concat = String.valueOf(str).concat(":");
                this.f8193k = concat;
                if (this.f8186d != null) {
                    String valueOf = String.valueOf(concat);
                    String valueOf2 = String.valueOf(this.f8186d);
                    this.f8193k = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4082a(String str) {
        this.f8192j.add(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dby) {
            return TextUtils.equals(this.f8193k, ((dby) obj).f8193k);
        }
        return false;
    }

    /* renamed from: a */
    public final List mo4081a() {
        return Collections.unmodifiableList(this.f8192j);
    }

    public final int hashCode() {
        return this.f8193k.hashCode();
    }

    public /* synthetic */ dby(dbx dbx, byte b) {
        this(dbx);
    }
}

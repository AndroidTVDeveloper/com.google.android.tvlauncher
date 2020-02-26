package p000;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* renamed from: chn */
/* compiled from: PG */
public final class chn implements Comparable {

    /* renamed from: a */
    public Intent f5561a;

    /* renamed from: b */
    public CharSequence f5562b;

    /* renamed from: c */
    public String f5563c;

    /* renamed from: d */
    public String f5564d;

    /* renamed from: e */
    public String f5565e;

    /* renamed from: f */
    public String f5566f;

    /* renamed from: g */
    public boolean f5567g;

    /* renamed from: h */
    public boolean f5568h;

    /* renamed from: i */
    public boolean f5569i;

    /* renamed from: j */
    public ResolveInfo f5570j;

    /* renamed from: k */
    public int f5571k = -1;

    /* renamed from: l */
    public long f5572l;

    /* renamed from: m */
    public int f5573m = 1;

    /* renamed from: a */
    public final boolean mo2812a() {
        return this.f5573m != 1;
    }

    /* renamed from: a */
    public final int compareTo(chn chn) {
        CharSequence charSequence = this.f5562b;
        CharSequence charSequence2 = chn.f5562b;
        if (charSequence == null && charSequence2 == null) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 != null) {
            return charSequence.toString().compareToIgnoreCase(charSequence2.toString());
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chn)) {
            return false;
        }
        return TextUtils.equals(this.f5563c, ((chn) obj).f5563c);
    }

    public final int hashCode() {
        return this.f5563c.hashCode();
    }

    /* renamed from: b */
    public final void mo2813b() {
        this.f5571k = -1;
        this.f5573m = 1;
        this.f5561a = null;
        this.f5562b = null;
        this.f5563c = null;
        this.f5569i = false;
        this.f5567g = false;
        this.f5570j = null;
        this.f5564d = null;
        this.f5565e = null;
        this.f5568h = false;
        this.f5566f = null;
    }

    /* renamed from: c */
    public final void mo2814c() {
        this.f5569i = true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5562b);
        String str = this.f5563c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(" -- ");
        sb.append(str);
        return sb.toString();
    }
}

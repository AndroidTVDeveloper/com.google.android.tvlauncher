package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* renamed from: chn  reason: default package */
/* compiled from: PG */
public final class chn implements Comparable {
    public Intent a;
    public CharSequence b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ResolveInfo j;
    public int k = -1;
    public long l;
    public int m = 1;

    public final boolean a() {
        return this.m != 1;
    }

    /* renamed from: a */
    public final int compareTo(chn chn) {
        CharSequence charSequence = this.b;
        CharSequence charSequence2 = chn.b;
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
        return TextUtils.equals(this.c, ((chn) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final void b() {
        this.k = -1;
        this.m = 1;
        this.a = null;
        this.b = null;
        this.c = null;
        this.i = false;
        this.g = false;
        this.j = null;
        this.d = null;
        this.e = null;
        this.h = false;
        this.f = null;
    }

    public final void c() {
        this.i = true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(" -- ");
        sb.append(str);
        return sb.toString();
    }
}

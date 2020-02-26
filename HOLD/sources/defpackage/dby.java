package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: dby  reason: default package */
/* compiled from: PG */
public class dby {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public String k;

    public dby(dbx dbx) {
        this.a = dbx.a;
        this.b = dbx.b;
        this.c = dbx.c;
        this.d = dbx.d;
        this.g = dbx.e;
        this.h = dbx.f;
        this.i = dbx.g;
        this.e = dbx.h;
        boolean z = dbx.i;
        this.f = z;
        this.j = dbx.j;
        if (this.k == null) {
            String str = this.b;
            this.k = str;
            if (z) {
                String concat = String.valueOf(str).concat(":");
                this.k = concat;
                if (this.d != null) {
                    String valueOf = String.valueOf(concat);
                    String valueOf2 = String.valueOf(this.d);
                    this.k = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                }
            }
        }
    }

    public final void a(String str) {
        this.j.add(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dby) {
            return TextUtils.equals(this.k, ((dby) obj).k);
        }
        return false;
    }

    public final List a() {
        return Collections.unmodifiableList(this.j);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public /* synthetic */ dby(dbx dbx, byte b2) {
        this(dbx);
    }
}

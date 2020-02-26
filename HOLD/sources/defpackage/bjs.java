package defpackage;

import java.util.TreeSet;

/* renamed from: bjs  reason: default package */
/* compiled from: PG */
final class bjs {
    public final int a;
    public final String b;
    public final TreeSet c;
    public bjy d;
    public boolean e;

    public bjs(int i, String str) {
        this(i, str, bjy.a);
    }

    public bjs(int i, String str, bjy bjy) {
        this.a = i;
        this.b = str;
        this.d = bjy;
        this.c = new TreeSet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bjs bjs = (bjs) obj;
        return this.a == bjs.a && this.b.equals(bjs.b) && this.c.equals(bjs.c) && this.d.equals(bjs.d);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}

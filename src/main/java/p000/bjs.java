package p000;

import java.util.TreeSet;

/* renamed from: bjs */
/* compiled from: PG */
final class bjs {

    /* renamed from: a */
    public final int f4166a;

    /* renamed from: b */
    public final String f4167b;

    /* renamed from: c */
    public final TreeSet f4168c;

    /* renamed from: d */
    public bjy f4169d;

    /* renamed from: e */
    public boolean f4170e;

    public bjs(int i, String str) {
        this(i, str, bjy.f4181a);
    }

    public bjs(int i, String str, bjy bjy) {
        this.f4166a = i;
        this.f4167b = str;
        this.f4169d = bjy;
        this.f4168c = new TreeSet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bjs bjs = (bjs) obj;
        return this.f4166a == bjs.f4166a && this.f4167b.equals(bjs.f4167b) && this.f4168c.equals(bjs.f4168c) && this.f4169d.equals(bjs.f4169d);
    }

    public final int hashCode() {
        return (((this.f4166a * 31) + this.f4167b.hashCode()) * 31) + this.f4169d.hashCode();
    }
}

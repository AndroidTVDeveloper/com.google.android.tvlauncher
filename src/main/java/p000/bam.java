package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bam */
/* compiled from: PG */
public abstract class bam {

    /* renamed from: a */
    public final akh f3013a;

    /* renamed from: b */
    public final String f3014b;

    /* renamed from: c */
    public final long f3015c;

    /* renamed from: d */
    public final List f3016d;

    /* renamed from: e */
    public final baj f3017e;

    public /* synthetic */ bam(akh akh, String str, bas bas, List list) {
        this.f3013a = akh;
        this.f3014b = str;
        this.f3016d = Collections.unmodifiableList(list);
        this.f3017e = bas.mo1698a(this);
        this.f3015c = blm.m3663b(bas.f3031h, 1000000, bas.f3030g);
    }

    /* renamed from: c */
    public abstract baj mo1691c();

    /* renamed from: d */
    public abstract azr mo1692d();

    /* renamed from: e */
    public abstract String mo1693e();
}

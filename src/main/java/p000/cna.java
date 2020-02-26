package p000;

import org.w3c.dom.Element;

/* renamed from: cna */
/* compiled from: PG */
final class cna extends dej {

    /* renamed from: a */
    private final /* synthetic */ String f6104a;

    /* renamed from: b */
    private final /* synthetic */ String f6105b;

    /* renamed from: c */
    private final /* synthetic */ cnf f6106c;

    public cna(cnf cnf, String str, String str2) {
        this.f6106c = cnf;
        this.f6104a = str;
        this.f6105b = str2;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        if (element.getAttribute(this.f6104a) != null) {
            cnf.m5157b(this.f6106c.mo3147a(), this.f6105b, cnf.m5155a(element, this.f6104a));
        }
    }
}

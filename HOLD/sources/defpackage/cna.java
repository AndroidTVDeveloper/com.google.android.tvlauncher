package defpackage;

import org.w3c.dom.Element;

/* renamed from: cna  reason: default package */
/* compiled from: PG */
final class cna extends dej {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ cnf c;

    public cna(cnf cnf, String str, String str2) {
        this.c = cnf;
        this.a = str;
        this.b = str2;
    }

    public final void a(Element element) {
        if (element.getAttribute(this.a) != null) {
            cnf.b(this.c.a(), this.b, cnf.a(element, this.a));
        }
    }
}

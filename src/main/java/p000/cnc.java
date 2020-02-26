package p000;

import java.util.List;
import org.w3c.dom.Element;

/* renamed from: cnc */
/* compiled from: PG */
final class cnc extends dej {

    /* renamed from: a */
    private final /* synthetic */ String f6109a;

    /* renamed from: b */
    private final /* synthetic */ cnf f6110b;

    public cnc(cnf cnf, String str) {
        this.f6110b = cnf;
        this.f6109a = str;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        List list = this.f6110b.f6111a;
        cnf.m5156a(list.get(list.size() - 2), this.f6109a, this.f6110b.mo3147a());
    }
}

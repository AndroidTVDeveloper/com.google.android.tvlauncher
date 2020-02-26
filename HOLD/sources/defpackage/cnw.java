package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cnw  reason: default package */
/* compiled from: PG */
public final class cnw extends dej {
    private final /* synthetic */ cnf a;

    public cnw(cnf cnf) {
        this.a = cnf;
    }

    public final void a(Element element) {
        ((VideoCreative$VastXml$Builder) this.a.a()).setDuration(VastParser.b(cnf.a(element)));
    }
}

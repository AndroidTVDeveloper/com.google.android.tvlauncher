package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cnw */
/* compiled from: PG */
public final class cnw extends dej {

    /* renamed from: a */
    private final /* synthetic */ cnf f6129a;

    public cnw(cnf cnf) {
        this.f6129a = cnf;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        ((VideoCreative$VastXml$Builder) this.f6129a.mo3147a()).setDuration(VastParser.m5278b(cnf.m5154a(element)));
    }
}

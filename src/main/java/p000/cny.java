package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cny */
/* compiled from: PG */
public final class cny extends dej {

    /* renamed from: a */
    private final /* synthetic */ cnf f6131a;

    public cny(cnf cnf) {
        this.f6131a = cnf;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        VideoCreative$VastXml$Builder videoCreative$VastXml$Builder = (VideoCreative$VastXml$Builder) this.f6131a.mo3147a();
        if (element.getAttribute("type") != null) {
            String attribute = element.getAttribute("type");
            if ("waterfall".equals(attribute) && element.getAttribute("fallback_index") != null) {
                videoCreative$VastXml$Builder.setFallbackIndex(VastParser.m5279c(element.getAttribute("fallback_index")));
            } else if ("pod".equals(attribute) && element.getAttribute("sequence") != null) {
                videoCreative$VastXml$Builder.setSequence(VastParser.m5279c(element.getAttribute("sequence")));
            }
        }
    }
}

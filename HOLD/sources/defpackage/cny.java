package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cny  reason: default package */
/* compiled from: PG */
public final class cny extends dej {
    private final /* synthetic */ cnf a;

    public cny(cnf cnf) {
        this.a = cnf;
    }

    public final void a(Element element) {
        VideoCreative$VastXml$Builder videoCreative$VastXml$Builder = (VideoCreative$VastXml$Builder) this.a.a();
        if (element.getAttribute("type") != null) {
            String attribute = element.getAttribute("type");
            if ("waterfall".equals(attribute) && element.getAttribute("fallback_index") != null) {
                videoCreative$VastXml$Builder.setFallbackIndex(VastParser.c(element.getAttribute("fallback_index")));
            } else if ("pod".equals(attribute) && element.getAttribute("sequence") != null) {
                videoCreative$VastXml$Builder.setSequence(VastParser.c(element.getAttribute("sequence")));
            }
        }
    }
}

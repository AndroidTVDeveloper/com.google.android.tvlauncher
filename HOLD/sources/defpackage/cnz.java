package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastTracking$Builder;
import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import org.w3c.dom.Element;

/* renamed from: cnz  reason: default package */
/* compiled from: PG */
public final class cnz extends dej {
    private final /* synthetic */ cnf a;

    public cnz(cnf cnf) {
        this.a = cnf;
    }

    public final void a(Element element) {
        VideoCreative$VastXml$Builder videoCreative$VastXml$Builder = (VideoCreative$VastXml$Builder) this.a.a();
        String attribute = element.getAttribute("event");
        if ("skip".equals(attribute)) {
            videoCreative$VastXml$Builder.setCustomSkipEventExists(true);
        }
        if ("viewable_impression".equals(attribute)) {
            VideoCreative$VastTracking$Builder videoCreative$VastTracking$Builder = (VideoCreative$VastTracking$Builder) cmx.d.l();
            videoCreative$VastTracking$Builder.setEventName(attribute);
            videoCreative$VastTracking$Builder.setEventUrl(cnf.a(element));
            videoCreative$VastXml$Builder.setVideoViewableImpression((cmx) videoCreative$VastTracking$Builder.g());
        }
    }
}

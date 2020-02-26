package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastTracking$Builder;
import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import org.w3c.dom.Element;

/* renamed from: cnz */
/* compiled from: PG */
public final class cnz extends dej {

    /* renamed from: a */
    private final /* synthetic */ cnf f6132a;

    public cnz(cnf cnf) {
        this.f6132a = cnf;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        VideoCreative$VastXml$Builder videoCreative$VastXml$Builder = (VideoCreative$VastXml$Builder) this.f6132a.mo3147a();
        String attribute = element.getAttribute("event");
        if ("skip".equals(attribute)) {
            videoCreative$VastXml$Builder.setCustomSkipEventExists(true);
        }
        if ("viewable_impression".equals(attribute)) {
            VideoCreative$VastTracking$Builder videoCreative$VastTracking$Builder = (VideoCreative$VastTracking$Builder) cmx.f6059d.mo4516l();
            videoCreative$VastTracking$Builder.setEventName(attribute);
            videoCreative$VastTracking$Builder.setEventUrl(cnf.m5154a(element));
            videoCreative$VastXml$Builder.setVideoViewableImpression((cmx) videoCreative$VastTracking$Builder.mo4509g());
        }
    }
}

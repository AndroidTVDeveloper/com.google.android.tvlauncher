package p000;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastNonLinear$Builder;
import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cnq */
/* compiled from: PG */
public final class cnq extends dej {

    /* renamed from: a */
    private final /* synthetic */ cnf f6123a;

    public cnq(cnf cnf) {
        this.f6123a = cnf;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        if (element.getAttribute("minSuggestedDuration") != null) {
            ((VideoCreative$VastNonLinear$Builder) this.f6123a.mo3147a()).setMinSuggestedDuration(VastParser.m5278b(cnf.m5155a(element, "minSuggestedDuration")));
        }
    }
}

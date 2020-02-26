package defpackage;

import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastNonLinear$Builder;
import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cnq  reason: default package */
/* compiled from: PG */
public final class cnq extends dej {
    private final /* synthetic */ cnf a;

    public cnq(cnf cnf) {
        this.a = cnf;
    }

    public final void a(Element element) {
        if (element.getAttribute("minSuggestedDuration") != null) {
            ((VideoCreative$VastNonLinear$Builder) this.a.a()).setMinSuggestedDuration(VastParser.b(cnf.a(element, "minSuggestedDuration")));
        }
    }
}

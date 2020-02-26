package p000;

import android.text.TextUtils;
import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import org.w3c.dom.Element;

/* renamed from: cnv */
/* compiled from: PG */
public final class cnv extends dej {

    /* renamed from: a */
    private final /* synthetic */ cnf f6128a;

    public cnv(cnf cnf) {
        this.f6128a = cnf;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        VideoCreative$VastXml$Builder videoCreative$VastXml$Builder = (VideoCreative$VastXml$Builder) this.f6128a.mo3147a();
        Element a = dcx.m6181a(element, "Linear");
        Element a2 = dcx.m6181a(element, "NonLinearAds");
        if (a != null || a2 != null) {
            String a3 = cnf.m5155a(element, "id");
            if (!TextUtils.isEmpty(a3)) {
                videoCreative$VastXml$Builder.setAdId(a3);
            }
        }
    }
}

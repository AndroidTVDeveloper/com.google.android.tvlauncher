package defpackage;

import android.text.TextUtils;
import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import org.w3c.dom.Element;

/* renamed from: cnv  reason: default package */
/* compiled from: PG */
public final class cnv extends dej {
    private final /* synthetic */ cnf a;

    public cnv(cnf cnf) {
        this.a = cnf;
    }

    public final void a(Element element) {
        VideoCreative$VastXml$Builder videoCreative$VastXml$Builder = (VideoCreative$VastXml$Builder) this.a.a();
        Element a2 = dcx.a(element, "Linear");
        Element a3 = dcx.a(element, "NonLinearAds");
        if (a2 != null || a3 != null) {
            String a4 = cnf.a(element, "id");
            if (!TextUtils.isEmpty(a4)) {
                videoCreative$VastXml$Builder.setAdId(a4);
            }
        }
    }
}

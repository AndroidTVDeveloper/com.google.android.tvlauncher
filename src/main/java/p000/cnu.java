package p000;

import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cnu */
/* compiled from: PG */
public final class cnu extends dej {

    /* renamed from: a */
    private final /* synthetic */ VastParser f6127a;

    public cnu(VastParser vastParser) {
        this.f6127a = vastParser;
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        VastParser vastParser;
        int i;
        if (element.getAttribute("version") != null) {
            String trim = cnf.m5155a(element, "version").trim();
            if (trim.startsWith("2")) {
                vastParser = this.f6127a;
                i = 2;
            } else if (!trim.startsWith("3")) {
                vastParser = this.f6127a;
                i = -1;
            } else {
                vastParser = this.f6127a;
                i = 3;
            }
            vastParser.f6432a = i;
        }
    }
}

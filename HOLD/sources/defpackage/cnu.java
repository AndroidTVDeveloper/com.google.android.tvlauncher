package defpackage;

import com.google.android.tvlauncher.doubleclick.vast.VastParser;
import org.w3c.dom.Element;

/* renamed from: cnu  reason: default package */
/* compiled from: PG */
public final class cnu extends dej {
    private final /* synthetic */ VastParser a;

    public cnu(VastParser vastParser) {
        this.a = vastParser;
    }

    public final void a(Element element) {
        VastParser vastParser;
        int i;
        if (element.getAttribute("version") != null) {
            String trim = cnf.a(element, "version").trim();
            if (trim.startsWith("2")) {
                vastParser = this.a;
                i = 2;
            } else if (!trim.startsWith("3")) {
                vastParser = this.a;
                i = -1;
            } else {
                vastParser = this.a;
                i = 3;
            }
            vastParser.a = i;
        }
    }
}

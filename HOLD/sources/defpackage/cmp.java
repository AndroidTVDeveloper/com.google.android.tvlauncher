package defpackage;

/* renamed from: cmp  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cmp implements cms {
    public static final cms a = new cmp();

    private cmp() {
    }

    public final Object a(Object obj) {
        cmw cmw = (cmw) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastNonLinear\"={\n");
        dcr.a(sb, "apiFramework", cmw.k);
        dcr.a(sb, "destinationUrl", cmw.f);
        dcr.a(sb, "expandedHeight", Integer.valueOf(cmw.j));
        dcr.a(sb, "expandedWidth", Integer.valueOf(cmw.i));
        dcr.a(sb, "height", Integer.valueOf(cmw.h));
        dcr.a(sb, "htmlResource", cmw.b);
        dcr.a(sb, "iframeResource", cmw.c);
        dcr.a(sb, "maintainAspectRatio", Boolean.valueOf(cmw.m));
        dcr.a(sb, "minSuggestedDuration", Integer.valueOf(cmw.n));
        dcr.a(sb, "scalable", Boolean.valueOf(cmw.l));
        dcr.a(sb, "staticResource", cmw.d);
        dcr.a(sb, "type", cmw.e);
        dcr.a(sb, "width", Integer.valueOf(cmw.g));
        sb.append("},\n");
        return sb.toString();
    }
}

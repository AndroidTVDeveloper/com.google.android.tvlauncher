package defpackage;

/* renamed from: cml  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cml implements cms {
    public static final cms a = new cml();

    private cml() {
    }

    public final Object a(Object obj) {
        cmt cmt = (cmt) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastCompanion\"={\n");
        dcr.a(sb, "apiFramework", cmt.k);
        dcr.a(sb, "destinationUrl", cmt.f);
        dcr.a(sb, "eventTracking", cmt.l, cmr.a);
        dcr.a(sb, "expandedHeight", Integer.valueOf(cmt.j));
        dcr.a(sb, "expandedWidth", Integer.valueOf(cmt.i));
        dcr.a(sb, "height", Integer.valueOf(cmt.h));
        dcr.a(sb, "htmlResource", cmt.b);
        dcr.a(sb, "iframeResource", cmt.c);
        dcr.a(sb, "staticResource", cmt.d);
        dcr.a(sb, "type", cmt.e);
        dcr.a(sb, "width", Integer.valueOf(cmt.g));
        sb.append("},\n");
        return sb.toString();
    }
}

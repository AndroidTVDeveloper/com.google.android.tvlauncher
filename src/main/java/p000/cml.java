package p000;

/* renamed from: cml */
/* compiled from: PG */
public final /* synthetic */ class cml implements cms {

    /* renamed from: a */
    public static final cms f6006a = new cml();

    private cml() {
    }

    /* renamed from: a */
    public final Object mo3115a(Object obj) {
        cmt cmt = (cmt) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastCompanion\"={\n");
        dcr.m6169a(sb, "apiFramework", cmt.f6024k);
        dcr.m6169a(sb, "destinationUrl", cmt.f6019f);
        dcr.m6170a(sb, "eventTracking", cmt.f6025l, cmr.f6012a);
        dcr.m6169a(sb, "expandedHeight", Integer.valueOf(cmt.f6023j));
        dcr.m6169a(sb, "expandedWidth", Integer.valueOf(cmt.f6022i));
        dcr.m6169a(sb, "height", Integer.valueOf(cmt.f6021h));
        dcr.m6169a(sb, "htmlResource", cmt.f6015b);
        dcr.m6169a(sb, "iframeResource", cmt.f6016c);
        dcr.m6169a(sb, "staticResource", cmt.f6017d);
        dcr.m6169a(sb, "type", cmt.f6018e);
        dcr.m6169a(sb, "width", Integer.valueOf(cmt.f6020g));
        sb.append("},\n");
        return sb.toString();
    }
}

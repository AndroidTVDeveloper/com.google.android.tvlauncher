package defpackage;

/* renamed from: cmn  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cmn implements cms {
    public static final cms a = new cmn();

    private cmn() {
    }

    public final Object a(Object obj) {
        cmu cmu = (cmu) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastImpression\"={\n");
        dcr.a(sb, "id", cmu.b);
        dcr.a(sb, "url", cmu.c);
        sb.append("},\n");
        return sb.toString();
    }
}

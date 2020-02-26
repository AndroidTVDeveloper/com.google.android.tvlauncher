package p000;

/* renamed from: cmo */
/* compiled from: PG */
public final /* synthetic */ class cmo implements cms {

    /* renamed from: a */
    public static final cms f6009a = new cmo();

    private cmo() {
    }

    /* renamed from: a */
    public final Object mo3115a(Object obj) {
        cmv cmv = (cmv) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastMedia\"={\n");
        dcr.m6169a(sb, "apiFramework", cmv.f6041j);
        dcr.m6169a(sb, "bitrate", Integer.valueOf(cmv.f6036e));
        dcr.m6169a(sb, "delivery", cmv.f6033b);
        dcr.m6169a(sb, "height", Integer.valueOf(cmv.f6038g));
        dcr.m6169a(sb, "maintainAspectRatio", Boolean.valueOf(cmv.f6040i));
        dcr.m6169a(sb, "scalable", Boolean.valueOf(cmv.f6039h));
        dcr.m6169a(sb, "type", cmv.f6034c);
        dcr.m6169a(sb, "url", cmv.f6035d);
        dcr.m6169a(sb, "width", Integer.valueOf(cmv.f6037f));
        sb.append("},\n");
        return sb.toString();
    }
}

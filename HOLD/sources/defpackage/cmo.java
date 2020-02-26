package defpackage;

/* renamed from: cmo  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cmo implements cms {
    public static final cms a = new cmo();

    private cmo() {
    }

    public final Object a(Object obj) {
        cmv cmv = (cmv) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\"VastMedia\"={\n");
        dcr.a(sb, "apiFramework", cmv.j);
        dcr.a(sb, "bitrate", Integer.valueOf(cmv.e));
        dcr.a(sb, "delivery", cmv.b);
        dcr.a(sb, "height", Integer.valueOf(cmv.g));
        dcr.a(sb, "maintainAspectRatio", Boolean.valueOf(cmv.i));
        dcr.a(sb, "scalable", Boolean.valueOf(cmv.h));
        dcr.a(sb, "type", cmv.c);
        dcr.a(sb, "url", cmv.d);
        dcr.a(sb, "width", Integer.valueOf(cmv.f));
        sb.append("},\n");
        return sb.toString();
    }
}

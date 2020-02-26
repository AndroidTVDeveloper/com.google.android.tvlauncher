package p000;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bnk */
/* compiled from: PG */
public final class bnk implements bmx {

    /* renamed from: a */
    public static final Charset f4463a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final ceg f4464b = new ceg(bvu.m4286a("com.google.android.gms.clearcut.public")).mo2691a("gms:playlog:service:samplingrules_").mo2692b("LogSamplingRules__");

    /* renamed from: d */
    public static final ConcurrentHashMap f4465d = new ConcurrentHashMap();

    /* renamed from: e */
    public static Boolean f4466e = null;

    /* renamed from: f */
    public static Long f4467f = null;

    /* renamed from: c */
    public final Context f4468c;

    public bnk(Context context) {
        this.f4468c = context;
        if (context != null) {
            ceh.m4609b(context);
        }
    }
}

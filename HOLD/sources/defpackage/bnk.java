package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bnk  reason: default package */
/* compiled from: PG */
public final class bnk implements bmx {
    public static final Charset a = Charset.forName("UTF-8");
    public static final ceg b = new ceg(bvu.a("com.google.android.gms.clearcut.public")).a("gms:playlog:service:samplingrules_").b("LogSamplingRules__");
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static Boolean e = null;
    public static Long f = null;
    public final Context c;

    public bnk(Context context) {
        this.c = context;
        if (context != null) {
            ceh.b(context);
        }
    }
}

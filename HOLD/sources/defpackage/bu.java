package defpackage;

import android.os.Build;
import android.os.Trace;

/* renamed from: bu  reason: default package */
/* compiled from: PG */
public final class bu {
    static {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Trace.class.getMethod("isTagEnabled", Long.TYPE);
                Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception e) {
            }
        }
    }

    public static void a(String str) {
        int i = Build.VERSION.SDK_INT;
        Trace.beginSection(str);
    }

    public static void a() {
        int i = Build.VERSION.SDK_INT;
        Trace.endSection();
    }
}

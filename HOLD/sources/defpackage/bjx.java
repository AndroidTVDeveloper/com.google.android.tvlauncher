package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bjx  reason: default package */
/* compiled from: PG */
public final class bjx {
    public final Map a = new HashMap();
    public final List b = new ArrayList();

    public final void a(String str, Object obj) {
        this.a.put((String) bks.a((Object) str), bks.a(obj));
        this.b.remove(str);
    }

    public static void a(bjx bjx, long j) {
        bjx.a("exo_len", Long.valueOf(j));
    }
}

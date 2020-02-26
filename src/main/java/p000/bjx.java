package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bjx */
/* compiled from: PG */
public final class bjx {

    /* renamed from: a */
    public final Map f4179a = new HashMap();

    /* renamed from: b */
    public final List f4180b = new ArrayList();

    /* renamed from: a */
    public final void mo2018a(String str, Object obj) {
        this.f4179a.put((String) bks.m3507a((Object) str), bks.m3507a(obj));
        this.f4180b.remove(str);
    }

    /* renamed from: a */
    public static void m3448a(bjx bjx, long j) {
        bjx.mo2018a("exo_len", Long.valueOf(j));
    }
}

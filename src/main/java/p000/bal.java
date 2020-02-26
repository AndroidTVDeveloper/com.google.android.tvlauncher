package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: bal */
/* compiled from: PG */
public final class bal extends bam {

    /* renamed from: f */
    private final baj f3011f;

    /* renamed from: g */
    private final bat f3012g;

    public bal(akh akh, String str, bar bar, List list) {
        super(akh, str, bar, list);
        Uri.parse(str);
        long j = bar.f3028b;
        bat bat = null;
        baj baj = j > 0 ? new baj(null, bar.f3027a, j) : null;
        this.f3011f = baj;
        this.f3012g = baj == null ? new bat(new baj(null, 0, -1)) : bat;
    }

    /* renamed from: c */
    public final baj mo1691c() {
        return this.f3011f;
    }

    /* renamed from: d */
    public final azr mo1692d() {
        return this.f3012g;
    }

    /* renamed from: e */
    public final String mo1693e() {
        return null;
    }
}

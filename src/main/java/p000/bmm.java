package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: bmm */
/* compiled from: PG */
final class bmm extends Thread {

    /* renamed from: a */
    private final /* synthetic */ Map f4415a;

    public bmm(Map map) {
        this.f4415a = map;
    }

    public final void run() {
        Map map = this.f4415a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        bmp.m3761a(buildUpon.build().toString());
    }
}

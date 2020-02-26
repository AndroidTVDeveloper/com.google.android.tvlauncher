package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: bmm  reason: default package */
/* compiled from: PG */
final class bmm extends Thread {
    private final /* synthetic */ Map a;

    public bmm(Map map) {
        this.a = map;
    }

    public final void run() {
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        bmp.a(buildUpon.build().toString());
    }
}

package defpackage;

import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwr  reason: default package */
/* compiled from: PG */
final class cwr implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ Uri b;
    private final /* synthetic */ cwo c;

    public cwr(cwo cwo, String str, Uri uri) {
        this.c = cwo;
        this.a = str;
        this.b = uri;
    }

    public final void run() {
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.c.a;
        String str = this.a;
        Uri uri = this.b;
        cwv cwv = (cwv) remoteYoutubePlayerService.b.get(str);
        if (cwv != null) {
            if (cwv.e == null) {
                cwv.e = new cxe(cwv.h);
                int i = cwv.b;
                int i2 = cwv.c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) cwv.h.getSystemService(WindowManager.class)).getDefaultDisplay().getMetrics(displayMetrics);
                cwv.f = ((DisplayManager) cwv.h.getSystemService(DisplayManager.class)).createVirtualDisplay("youtube", i, i2, displayMetrics.densityDpi, cwv.a, 8);
                cwv.g = (WindowManager) cwv.h.createDisplayContext(cwv.f.getDisplay()).getSystemService(WindowManager.class);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.width = cwv.b;
                layoutParams.height = cwv.c;
                layoutParams.type = 2030;
                layoutParams.flags = 8;
                cwv.g.addView(cwv.e.a, layoutParams);
            }
            cxe cxe = cwv.e;
            if (Uri.EMPTY.equals(uri) || !(!TextUtils.isEmpty(cxm.a(uri)))) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Malformed youtube uri:");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            cxe.b = uri;
            cxe.c = cxm.a(uri);
            cxe.d = 932;
            cxe.e = 524;
            cwv.e.a(cwv.b, cwv.c);
            cwv.e.c();
            cwv.e.a(true);
            cwv.e.i = new cwu(cwv);
        }
    }
}

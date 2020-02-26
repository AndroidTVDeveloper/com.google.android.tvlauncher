package p000;

import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwr */
/* compiled from: PG */
final class cwr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f7780a;

    /* renamed from: b */
    private final /* synthetic */ Uri f7781b;

    /* renamed from: c */
    private final /* synthetic */ cwo f7782c;

    public cwr(cwo cwo, String str, Uri uri) {
        this.f7782c = cwo;
        this.f7780a = str;
        this.f7781b = uri;
    }

    public final void run() {
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.f7782c.f7772a;
        String str = this.f7780a;
        Uri uri = this.f7781b;
        cwv cwv = (cwv) remoteYoutubePlayerService.f6596b.get(str);
        if (cwv != null) {
            if (cwv.f7795e == null) {
                cwv.f7795e = new cxe(cwv.f7798h);
                int i = cwv.f7792b;
                int i2 = cwv.f7793c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) cwv.f7798h.getSystemService(WindowManager.class)).getDefaultDisplay().getMetrics(displayMetrics);
                cwv.f7796f = ((DisplayManager) cwv.f7798h.getSystemService(DisplayManager.class)).createVirtualDisplay("youtube", i, i2, displayMetrics.densityDpi, cwv.f7791a, 8);
                cwv.f7797g = (WindowManager) cwv.f7798h.createDisplayContext(cwv.f7796f.getDisplay()).getSystemService(WindowManager.class);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.width = cwv.f7792b;
                layoutParams.height = cwv.f7793c;
                layoutParams.type = 2030;
                layoutParams.flags = 8;
                cwv.f7797g.addView(cwv.f7795e.f7820a, layoutParams);
            }
            cxe cxe = cwv.f7795e;
            if (Uri.EMPTY.equals(uri) || !(!TextUtils.isEmpty(cxm.m5905a(uri)))) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Malformed youtube uri:");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            cxe.f7821b = uri;
            cxe.f7822c = cxm.m5905a(uri);
            cxe.f7823d = 932;
            cxe.f7824e = 524;
            cwv.f7795e.mo3883a(cwv.f7792b, cwv.f7793c);
            cwv.f7795e.mo3887c();
            cwv.f7795e.mo3885a(true);
            cwv.f7795e.f7828i = new cwu(cwv);
        }
    }
}

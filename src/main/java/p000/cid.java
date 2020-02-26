package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: cid */
/* compiled from: PG */
final /* synthetic */ class cid implements dav {

    /* renamed from: a */
    private final cie f5596a;

    /* renamed from: b */
    private final chn f5597b;

    /* renamed from: c */
    private final View f5598c;

    public cid(cie cie, chn chn, View view) {
        this.f5596a = cie;
        this.f5597b = chn;
        this.f5598c = view;
    }

    /* renamed from: a */
    public final void mo2802a(day day) {
        cie cie = this.f5596a;
        chn chn = this.f5597b;
        View view = this.f5598c;
        int i = day.f8117a;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                if (i == 2) {
                    cij cij = cie.f5600q;
                    if (cij.f5635q != null) {
                        if (cij.f5633o.mo2892b(chn)) {
                            cie.mo2840a(chn, 20);
                        } else {
                            cie.mo2840a(chn, 19);
                        }
                        cgp cgp = (cgp) cie.f5600q.f5635q;
                        if (!cgp.f5475a.f5480b.mo2892b(chn)) {
                            cgp.f5475a.f5480b.f5689k.mo2866a(chn);
                        } else {
                            cgp.f5475a.f5480b.mo2884a(chn);
                        }
                    }
                } else if (i != 3) {
                    if (cie.f5600q.f5635q != null) {
                        cie.mo2840a(chn, 17);
                        chr chr = cie.f5600q.f5635q;
                        String str = chn.f5563c;
                        cgp cgp2 = (cgp) chr;
                        cgp2.f5475a.f5486h = false;
                        if (cgp2.f5475a.f5480b.mo2901h(str).f5568h) {
                            Intent intent = new Intent("com.android.tv.applink.action.REMOVE_APP_LINK");
                            intent.putExtra("EXTRA_APP_LINK_ID", str);
                            cgp2.f5475a.startActivityForResult(intent, 0);
                        } else {
                            Intent intent2 = new Intent();
                            intent2.setAction("android.intent.action.UNINSTALL_PACKAGE");
                            String valueOf = String.valueOf(str);
                            intent2.setData(Uri.parse(valueOf.length() == 0 ? new String("package:") : "package:".concat(valueOf)));
                            cgp2.f5475a.startActivity(intent2);
                        }
                        cgp2.f5475a.f5483e.mo2766a(false);
                    }
                } else if (cie.f5600q.f5635q != null) {
                    cie.mo2840a(chn, 18);
                    chr chr2 = cie.f5600q.f5635q;
                    String str2 = chn.f5563c;
                    cgp cgp3 = (cgp) chr2;
                    cgp3.f5475a.f5486h = false;
                    Intent intent3 = new Intent();
                    intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    String valueOf2 = String.valueOf(str2);
                    intent3.setData(Uri.parse(valueOf2.length() == 0 ? new String("package:") : "package:".concat(valueOf2)));
                    cgp3.f5475a.startActivity(intent3);
                }
            } else if (chn != null) {
                cij cij2 = cie.f5600q;
                if (cij2.f5635q != null) {
                    boolean a = cij2.mo2858g(2);
                    cij cij3 = cie.f5600q;
                    chr chr3 = cij3.f5635q;
                    if (chn.f5567g && a) {
                        i2 = 1;
                    }
                    chr3.mo2762a(i2, cij3.mo2851a(chn));
                }
            }
        } else {
            cie.mo2841a(chn, view);
        }
    }
}

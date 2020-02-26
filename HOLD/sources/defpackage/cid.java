package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: cid  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cid implements dav {
    private final cie a;
    private final chn b;
    private final View c;

    public cid(cie cie, chn chn, View view) {
        this.a = cie;
        this.b = chn;
        this.c = view;
    }

    public final void a(day day) {
        cie cie = this.a;
        chn chn = this.b;
        View view = this.c;
        int i = day.a;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                if (i == 2) {
                    cij cij = cie.q;
                    if (cij.q != null) {
                        if (cij.o.b(chn)) {
                            cie.a(chn, 20);
                        } else {
                            cie.a(chn, 19);
                        }
                        cgp cgp = (cgp) cie.q.q;
                        if (!cgp.a.b.b(chn)) {
                            cgp.a.b.k.a(chn);
                        } else {
                            cgp.a.b.a(chn);
                        }
                    }
                } else if (i != 3) {
                    if (cie.q.q != null) {
                        cie.a(chn, 17);
                        chr chr = cie.q.q;
                        String str = chn.c;
                        cgp cgp2 = (cgp) chr;
                        cgp2.a.h = false;
                        if (cgp2.a.b.h(str).h) {
                            Intent intent = new Intent("com.android.tv.applink.action.REMOVE_APP_LINK");
                            intent.putExtra("EXTRA_APP_LINK_ID", str);
                            cgp2.a.startActivityForResult(intent, 0);
                        } else {
                            Intent intent2 = new Intent();
                            intent2.setAction("android.intent.action.UNINSTALL_PACKAGE");
                            String valueOf = String.valueOf(str);
                            intent2.setData(Uri.parse(valueOf.length() == 0 ? new String("package:") : "package:".concat(valueOf)));
                            cgp2.a.startActivity(intent2);
                        }
                        cgp2.a.e.a(false);
                    }
                } else if (cie.q.q != null) {
                    cie.a(chn, 18);
                    chr chr2 = cie.q.q;
                    String str2 = chn.c;
                    cgp cgp3 = (cgp) chr2;
                    cgp3.a.h = false;
                    Intent intent3 = new Intent();
                    intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    String valueOf2 = String.valueOf(str2);
                    intent3.setData(Uri.parse(valueOf2.length() == 0 ? new String("package:") : "package:".concat(valueOf2)));
                    cgp3.a.startActivity(intent3);
                }
            } else if (chn != null) {
                cij cij2 = cie.q;
                if (cij2.q != null) {
                    boolean a2 = cij2.g(2);
                    cij cij3 = cie.q;
                    chr chr3 = cij3.q;
                    if (chn.g && a2) {
                        i2 = 1;
                    }
                    chr3.a(i2, cij3.a(chn));
                }
            }
        } else {
            cie.a(chn, view);
        }
    }
}

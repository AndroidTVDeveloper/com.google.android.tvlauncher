package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.List;

/* renamed from: cka */
/* compiled from: PG */
final class cka extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ cke f5792a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cka(cke cke, Handler handler) {
        super(handler);
        this.f5792a = cke;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        switch (cke.f5795a.match(uri)) {
            case 1:
            case 2:
                this.f5792a.mo2971b();
                return;
            case 3:
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() >= 2) {
                    try {
                        ((ckx) this.f5792a.f5798c).f5845a.f5881i.remove(Long.valueOf(Long.parseLong(pathSegments.get(1))));
                        this.f5792a.mo2971b();
                        return;
                    } catch (NumberFormatException e) {
                        String valueOf = String.valueOf(uri);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("Invalid channel ID in URI: ");
                        sb.append(valueOf);
                        Log.e("DataSourceObserver", sb.toString());
                        return;
                    }
                } else {
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                    sb2.append("Invalid channel logo URI: ");
                    sb2.append(valueOf2);
                    Log.e("DataSourceObserver", sb2.toString());
                    return;
                }
            case 4:
                String queryParameter = uri.getQueryParameter("channel");
                if (queryParameter != null) {
                    try {
                        long parseLong = Long.parseLong(queryParameter);
                        this.f5792a.mo2970a(parseLong);
                        if (this.f5792a.f5798c.mo2966a(parseLong)) {
                            cke cke = this.f5792a;
                            dbc dbc = cke.f5802g;
                            if (dbc != null) {
                                if (dbc.f8134e) {
                                }
                            }
                            cke.f5801f.add(Long.valueOf(parseLong));
                            cke.mo2975e();
                        }
                        this.f5792a.mo2973c();
                        return;
                    } catch (NumberFormatException e2) {
                        String valueOf3 = String.valueOf(uri);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                        sb3.append("Invalid channel ID in URI: ");
                        sb3.append(valueOf3);
                        Log.e("DataSourceObserver", sb3.toString());
                        return;
                    }
                } else {
                    cke cke2 = this.f5792a;
                    if (cke2.f5802g == null) {
                        cke2.f5802g = new dbc();
                        dbc dbc2 = cke2.f5802g;
                        dbc2.f8131b = 3000;
                        dbc2.f8132c = 15000;
                        dbc2.f8130a = -2000;
                        dbc2.mo4061a(cke2.mo2969a());
                    }
                    dbc dbc3 = cke2.f5805j;
                    if (dbc3 != null && dbc3.f8134e) {
                        dbc3.mo4064d();
                    }
                    cke2.f5800e.clear();
                    dbc dbc4 = cke2.f5806k;
                    if (dbc4 != null && dbc4.f8134e) {
                        dbc4.mo4064d();
                    }
                    cke2.f5801f.clear();
                    for (dbc dbc5 : cke2.f5803h.values()) {
                        dbc5.mo4064d();
                        dbc5.mo4062b();
                    }
                    cke2.f5803h.clear();
                    cke2.f5802g.mo4063c();
                    this.f5792a.mo2973c();
                    return;
                }
            case 5:
                try {
                    long parseLong2 = Long.parseLong(uri.getLastPathSegment());
                    cke cke3 = this.f5792a;
                    dbc dbc6 = cke3.f5802g;
                    if (dbc6 != null) {
                        if (dbc6.f8134e) {
                            this.f5792a.mo2973c();
                            return;
                        }
                    }
                    Long b = cke3.f5798c.mo2967b(parseLong2);
                    if (b != null) {
                        cke3.mo2972b(b.longValue());
                    }
                    cke3.f5800e.add(Long.valueOf(parseLong2));
                    if (cke3.f5800e.size() < 100) {
                        if (cke3.f5805j == null) {
                            cke3.f5805j = new dbc();
                            dbc dbc7 = cke3.f5805j;
                            dbc7.f8131b = 1000;
                            dbc7.f8132c = 5000;
                            dbc7.f8130a = -4000;
                            dbc7.mo4061a(cke3.mo2969a());
                        }
                        cke3.f5805j.mo4063c();
                    } else {
                        cke3.mo2974d();
                    }
                    this.f5792a.mo2973c();
                    return;
                } catch (NumberFormatException e3) {
                    String valueOf4 = String.valueOf(uri);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
                    sb4.append("Invalid program ID in URI: ");
                    sb4.append(valueOf4);
                    Log.e("DataSourceObserver", sb4.toString());
                    return;
                }
            case 6:
            case 7:
                cke cke4 = this.f5792a;
                if (cke4.f5804i == null) {
                    cke4.f5804i = dbc.m6076a();
                    dbc dbc8 = cke4.f5804i;
                    dbc8.f8131b = 3000;
                    dbc8.f8132c = 10000;
                    dbc8.f8130a = -3000;
                    dbc8.mo4061a(cke4.mo2969a());
                }
                cke4.f5804i.mo4063c();
                return;
            default:
                return;
        }
    }
}

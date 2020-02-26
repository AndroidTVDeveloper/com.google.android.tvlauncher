package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.List;

/* renamed from: cka  reason: default package */
/* compiled from: PG */
final class cka extends ContentObserver {
    private final /* synthetic */ cke a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cka(cke cke, Handler handler) {
        super(handler);
        this.a = cke;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        switch (cke.a.match(uri)) {
            case 1:
            case 2:
                this.a.b();
                return;
            case 3:
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() >= 2) {
                    try {
                        ((ckx) this.a.c).a.i.remove(Long.valueOf(Long.parseLong(pathSegments.get(1))));
                        this.a.b();
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
                        this.a.a(parseLong);
                        if (this.a.c.a(parseLong)) {
                            cke cke = this.a;
                            dbc dbc = cke.g;
                            if (dbc != null) {
                                if (dbc.e) {
                                }
                            }
                            cke.f.add(Long.valueOf(parseLong));
                            cke.e();
                        }
                        this.a.c();
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
                    cke cke2 = this.a;
                    if (cke2.g == null) {
                        cke2.g = new dbc();
                        dbc dbc2 = cke2.g;
                        dbc2.b = 3000;
                        dbc2.c = 15000;
                        dbc2.a = -2000;
                        dbc2.a(cke2.a());
                    }
                    dbc dbc3 = cke2.j;
                    if (dbc3 != null && dbc3.e) {
                        dbc3.d();
                    }
                    cke2.e.clear();
                    dbc dbc4 = cke2.k;
                    if (dbc4 != null && dbc4.e) {
                        dbc4.d();
                    }
                    cke2.f.clear();
                    for (dbc dbc5 : cke2.h.values()) {
                        dbc5.d();
                        dbc5.b();
                    }
                    cke2.h.clear();
                    cke2.g.c();
                    this.a.c();
                    return;
                }
            case 5:
                try {
                    long parseLong2 = Long.parseLong(uri.getLastPathSegment());
                    cke cke3 = this.a;
                    dbc dbc6 = cke3.g;
                    if (dbc6 != null) {
                        if (dbc6.e) {
                            this.a.c();
                            return;
                        }
                    }
                    Long b = cke3.c.b(parseLong2);
                    if (b != null) {
                        cke3.b(b.longValue());
                    }
                    cke3.e.add(Long.valueOf(parseLong2));
                    if (cke3.e.size() < 100) {
                        if (cke3.j == null) {
                            cke3.j = new dbc();
                            dbc dbc7 = cke3.j;
                            dbc7.b = 1000;
                            dbc7.c = 5000;
                            dbc7.a = -4000;
                            dbc7.a(cke3.a());
                        }
                        cke3.j.c();
                    } else {
                        cke3.d();
                    }
                    this.a.c();
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
                cke cke4 = this.a;
                if (cke4.i == null) {
                    cke4.i = dbc.a();
                    dbc dbc8 = cke4.i;
                    dbc8.b = 3000;
                    dbc8.c = 10000;
                    dbc8.a = -3000;
                    dbc8.a(cke4.a());
                }
                cke4.i.c();
                return;
            default:
                return;
        }
    }
}

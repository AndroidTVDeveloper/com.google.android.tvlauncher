package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.util.List;

/* renamed from: cwz */
/* compiled from: PG */
public final class cwz implements cwi {

    /* renamed from: a */
    public final Context f7802a;

    /* renamed from: b */
    public final cxn f7803b;

    /* renamed from: c */
    public Uri f7804c;

    /* renamed from: d */
    public String f7805d;

    /* renamed from: e */
    public cwh f7806e;

    /* renamed from: f */
    public int f7807f;

    /* renamed from: g */
    public int f7808g = 1;

    /* renamed from: h */
    public boolean f7809h = false;

    /* renamed from: i */
    public boolean f7810i = false;

    /* renamed from: j */
    public long f7811j = 0;

    /* renamed from: k */
    private float f7812k = 1.0f;

    public cwz(Context context, cxn cxn) {
        this.f7802a = context;
        this.f7803b = cxn;
    }

    /* renamed from: a */
    public final int mo3881a() {
        return this.f7808g;
    }

    /* renamed from: a */
    public final void mo3883a(int i, int i2) {
    }

    /* renamed from: b */
    public final Uri mo3886b() {
        return this.f7804c;
    }

    /* renamed from: e */
    public final int mo3889e() {
        return (int) this.f7811j;
    }

    /* renamed from: f */
    public final View mo3890f() {
        return this.f7803b;
    }

    /* renamed from: b */
    public static boolean m5864b(Uri uri) {
        return m5865c(uri) && m5863a(uri, "preview_program");
    }

    /* renamed from: a */
    public static boolean m5862a(Uri uri) {
        return m5865c(uri) && m5863a(uri, "recorded_program");
    }

    /* renamed from: c */
    private static boolean m5865c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "android.media.tv".equals(uri.getAuthority());
    }

    /* renamed from: a */
    private static boolean m5863a(Uri uri, String str) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() != 2 || !str.equals(pathSegments.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo3887c() {
        this.f7809h = true;
        this.f7810i = false;
        this.f7808g = 2;
        this.f7803b.setCallback(new cww(this));
        if (this.f7807f == 2) {
            this.f7803b.setTimeShiftPositionCallback(new cwx(this));
        }
        if (this.f7805d != null) {
            mo3907g();
            this.f7803b.setStreamVolume(0.0f);
        } else if (this.f7807f == 3) {
            Log.e("TvPlayerImpl", "TV input id must be given via URI query parameter");
            mo3888d();
            cwh cwh = this.f7806e;
            if (cwh != null) {
                cwh.mo3879b();
            }
        } else {
            new cwy(this).execute(new Void[0]);
        }
    }

    /* renamed from: g */
    public final void mo3907g() {
        int i = this.f7807f;
        if (i == 1) {
            this.f7803b.tune(this.f7805d, this.f7804c);
        } else if (i == 2) {
            this.f7803b.timeShiftPlay(this.f7805d, this.f7804c);
        } else if (i == 3) {
            this.f7803b.tune(this.f7805d, this.f7804c);
        }
    }

    /* renamed from: a */
    public final void mo3885a(boolean z) {
        this.f7810i = true;
        this.f7803b.setStreamVolume(this.f7812k);
    }

    /* renamed from: a */
    public final void mo3884a(cwh cwh) {
        this.f7806e = cwh;
    }

    /* renamed from: a */
    public final void mo3882a(float f) {
        this.f7812k = f;
        if (this.f7810i) {
            this.f7803b.setStreamVolume(f);
        }
    }

    /* renamed from: d */
    public final void mo3888d() {
        this.f7809h = false;
        this.f7808g = 1;
        this.f7803b.reset();
        this.f7803b.setCallback(null);
        this.f7803b.setTimeShiftPositionCallback(null);
        this.f7811j = 0;
    }
}

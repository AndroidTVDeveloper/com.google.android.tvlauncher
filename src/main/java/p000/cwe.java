package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.tv.TvContract;
import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cwe */
/* compiled from: PG */
public final class cwe implements cvl {

    /* renamed from: n */
    public static /* synthetic */ int f7727n;

    /* renamed from: o */
    private static final String[] f7728o = {"com.google.android.videos", "com.google.android.youtube.tv"};

    /* renamed from: p */
    private static cwe f7729p = null;

    /* renamed from: a */
    public final TvInputManager f7730a;

    /* renamed from: b */
    public final Context f7731b;

    /* renamed from: c */
    public Map f7732c;

    /* renamed from: d */
    public boolean f7733d;

    /* renamed from: e */
    public boolean f7734e;

    /* renamed from: f */
    public boolean f7735f;

    /* renamed from: g */
    public Map f7736g = new LinkedHashMap();

    /* renamed from: h */
    public Map f7737h = new HashMap();

    /* renamed from: i */
    public List f7738i = new ArrayList();

    /* renamed from: j */
    public Map f7739j = new HashMap();

    /* renamed from: k */
    public boolean f7740k;

    /* renamed from: l */
    public boolean f7741l;

    /* renamed from: m */
    public final cwd f7742m = new cwd(this);

    /* renamed from: q */
    private final cwc f7743q = new cwc(this);

    /* renamed from: r */
    private final cwf f7744r;

    /* renamed from: s */
    private final List f7745s = new ArrayList(2);

    /* renamed from: t */
    private AsyncTask f7746t;

    /* renamed from: u */
    private final cvy f7747u = new cwb(this);

    /* renamed from: i */
    public final Uri mo3816i(int i) {
        return null;
    }

    /* renamed from: j */
    public final String mo3817j(int i) {
        return null;
    }

    /* renamed from: k */
    public final void mo3818k(int i) {
    }

    /* renamed from: l */
    public final void mo3819l(int i) {
    }

    private cwe(Context context) {
        dck a = dck.m6123a(context);
        this.f7735f = a.mo4097d();
        this.f7734e = a.mo4096c();
        this.f7733d = a.mo4095b();
        this.f7731b = context;
        this.f7744r = new cwf(context);
        this.f7730a = (TvInputManager) context.getSystemService("tv_input");
        dck.m6123a(context).mo4090a(new cwa(this));
        mo3867h();
    }

    /* renamed from: a */
    public final void mo3862a(TvInputInfo tvInputInfo) {
        int a;
        TvInputInfo tvInputInfo2;
        try {
            int inputState = this.f7730a.getInputState(tvInputInfo.getId());
            if (((cwg) this.f7739j.get(tvInputInfo.getId())) == null) {
                cwg cwg = null;
                if (!(tvInputInfo.getParentId() == null || (tvInputInfo2 = this.f7730a.getTvInputInfo(tvInputInfo.getParentId())) == null)) {
                    cwg cwg2 = (cwg) this.f7739j.get(tvInputInfo2.getId());
                    if (cwg2 == null) {
                        cwg2 = new cwg(tvInputInfo2, (cwg) null, this.f7730a.getInputState(tvInputInfo2.getId()));
                        cwg2.mo3872a(this.f7731b);
                        this.f7739j.put(tvInputInfo2.getId(), cwg2);
                    }
                    cwg = cwg2;
                    cwg.f7758j++;
                }
                cwg cwg3 = new cwg(tvInputInfo, cwg, inputState);
                cwg3.mo3872a(this.f7731b);
                this.f7739j.put(tvInputInfo.getId(), cwg3);
                if (cwg3.f7751c.isHidden(this.f7731b)) {
                    return;
                }
                if (cwg == null || !cwg.f7751c.isHidden(this.f7731b)) {
                    m5771a(cwg3, this.f7738i);
                    cwg cwg4 = cwg3.f7750b;
                    if (!(cwg4 == null || (a = mo3860a(cwg4.f7749a)) == -1)) {
                        this.f7738i.remove(a);
                    }
                    mo3865f();
                }
            }
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(tvInputInfo.getId());
            Log.e("TifInputsManager", valueOf.length() == 0 ? new String("Failed to get state for Input, dropping entry. Id = ") : "Failed to get state for Input, dropping entry. Id = ".concat(valueOf));
        }
    }

    /* renamed from: g */
    public final Drawable mo3814g(int i) {
        cwg cwg = (cwg) this.f7738i.get(i);
        return cwg.mo3870a(this.f7731b, cwg.f7755g);
    }

    /* renamed from: h */
    public final Uri mo3815h(int i) {
        return ((cwg) this.f7738i.get(i)).f7753e;
    }

    /* renamed from: a */
    public final int mo3860a(String str) {
        for (int i = 0; i < this.f7738i.size(); i++) {
            TvInputInfo tvInputInfo = ((cwg) this.f7738i.get(i)).f7751c;
            if (tvInputInfo != null && TextUtils.equals(tvInputInfo.getId(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final String mo3805b(int i) {
        return ((cwg) this.f7738i.get(i)).f7749a;
    }

    /* renamed from: c */
    public final int mo3808c(int i) {
        cwg cwg = (cwg) this.f7738i.get(i);
        if (cwg.mo3874b()) {
            return cwg.f7755g != 1 ? 0 : 1;
        }
        if (!cwg.mo3875c()) {
            return cwg.f7755g;
        }
        return 2;
    }

    /* renamed from: d */
    public final int mo3811d(int i) {
        return ((cwg) this.f7738i.get(i)).f7752d;
    }

    /* renamed from: a */
    public static cwe m5770a(Context context) {
        if (f7729p == null) {
            f7729p = new cwe(context.getApplicationContext());
        }
        return f7729p;
    }

    /* renamed from: d */
    public final int mo3810d() {
        return this.f7738i.size();
    }

    /* renamed from: e */
    public final String mo3812e(int i) {
        return ((cwg) this.f7738i.get(i)).mo3871a();
    }

    /* renamed from: f */
    public final String mo3813f(int i) {
        return ((cwg) this.f7738i.get(i)).f7759k;
    }

    /* renamed from: a */
    private final void m5771a(cwg cwg, List list) {
        int i = 0;
        while (i < list.size() && this.f7744r.compare(cwg, (cwg) list.get(i)) > 0) {
            i++;
        }
        if (!list.contains(cwg)) {
            list.add(i, cwg);
        }
    }

    /* renamed from: a */
    static boolean m5772a(PackageManager packageManager, TvInputInfo tvInputInfo) {
        if (Arrays.asList(f7728o).contains(tvInputInfo.getServiceInfo().packageName) || tvInputInfo.createSetupIntent() == null) {
            return false;
        }
        if (packageManager.checkPermission("com.android.providers.tv.permission.ACCESS_ALL_EPG_DATA", tvInputInfo.getServiceInfo().packageName) == 0) {
            return true;
        }
        try {
            if ((packageManager.getApplicationInfo(tvInputInfo.getServiceInfo().packageName, 0).flags & 129) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo3864e() {
        AsyncTask asyncTask = this.f7746t;
        return asyncTask != null && asyncTask.getStatus() == AsyncTask.Status.RUNNING;
    }

    /* renamed from: a */
    public final void mo3803a(int i) {
        Intent intent;
        cwg cwg = (cwg) this.f7738i.get(i);
        if (cwg.mo3875c() && this.f7734e) {
            String f = dck.m6123a(this.f7731b).mo4099f();
            if (!TextUtils.isEmpty(f)) {
                Toast.makeText(this.f7731b, f, 0).show();
                return;
            }
            return;
        }
        try {
            TvInputInfo tvInputInfo = cwg.f7751c;
            if (tvInputInfo == null) {
                int i2 = cwg.f7752d;
                if (i2 == -7) {
                    intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
                } else if (i2 == -3) {
                    intent = new Intent("android.intent.action.VIEW", TvContract.Channels.CONTENT_URI);
                } else {
                    intent = null;
                }
            } else if (!tvInputInfo.isPassthroughInput()) {
                intent = new Intent("android.intent.action.VIEW", TvContract.buildChannelsUriForInput(cwg.f7751c.getId()));
            } else {
                intent = new Intent("android.intent.action.VIEW", TvContract.buildChannelUriForPassthroughInput(cwg.f7751c.getId()));
            }
            intent.addFlags(268435456);
            this.f7731b.startActivity(intent);
        } catch (Throwable th) {
            Log.e("TifInputsManager", "Could not perform launch:", th);
            Toast.makeText(this.f7731b, (int) R.string.failed_launch, 0).show();
        }
    }

    /* renamed from: b */
    public final void mo3806b() {
        mo3861a();
    }

    /* renamed from: c */
    public final void mo3809c() {
        if (!this.f7741l) {
            mo3861a();
        }
    }

    /* renamed from: f */
    public final void mo3865f() {
        List list = this.f7745s;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cvw) list.get(i)).mo3838e();
        }
    }

    /* renamed from: a */
    public final void mo3861a() {
        AsyncTask asyncTask = this.f7746t;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f7746t = new cvz(this.f7730a, this.f7731b, this.f7747u).execute(new Void[0]);
    }

    /* renamed from: a */
    public final void mo3804a(cvw cvw) {
        TvInputManager tvInputManager;
        if (!this.f7745s.contains(cvw)) {
            this.f7745s.add(cvw);
            if (this.f7745s.size() == 1 && (tvInputManager = this.f7730a) != null) {
                tvInputManager.registerCallback(this.f7743q, this.f7742m);
            }
        }
    }

    /* renamed from: b */
    public final void mo3863b(String str) {
        cwg cwg = (cwg) this.f7739j.get(str);
        if (cwg != null) {
            Iterator it = this.f7739j.entrySet().iterator();
            while (it.hasNext()) {
                cwg cwg2 = ((cwg) ((Map.Entry) it.next()).getValue()).f7750b;
                if (cwg2 != null && TextUtils.equals(cwg2.f7749a, cwg.f7749a)) {
                    it.remove();
                }
            }
            boolean z = false;
            for (int size = this.f7738i.size() - 1; size >= 0; size--) {
                cwg cwg3 = ((cwg) this.f7738i.get(size)).f7750b;
                if (cwg3 != null && TextUtils.equals(cwg3.f7749a, str)) {
                    this.f7738i.remove(size);
                    z = true;
                }
            }
            this.f7739j.remove(str);
            int a = mo3860a(str);
            if (a != -1) {
                this.f7738i.remove(a);
                z = true;
            }
            cwg cwg4 = cwg.f7750b;
            if (cwg4 != null) {
                int max = Math.max(0, cwg4.f7758j - 1);
                cwg4.f7758j = max;
                if (max == 0 && mo3860a(cwg4.f7749a) == -1 && !cwg4.f7751c.isHidden(this.f7731b)) {
                    m5771a(cwg4, this.f7738i);
                    mo3865f();
                }
            }
            if (!z) {
                return;
            }
            mo3865f();
        }
    }

    /* renamed from: h */
    public final void mo3867h() {
        this.f7732c = cvm.m5751a(dck.m6123a(this.f7731b).f8228e.f8283r);
    }

    /* renamed from: g */
    public final void mo3866g() {
        if (!this.f7740k) {
            String e = dck.m6123a(this.f7731b).mo4098e();
            if (TextUtils.isEmpty(e)) {
                e = this.f7731b.getResources().getString(R.string.input_title_bundled_tuner);
            }
            cwg cwg = new cwg("com.google.android.tvlauncher.input.bundled_tuner", e, dck.m6123a(this.f7731b).mo4100g());
            cwg.mo3872a(this.f7731b);
            cwg.mo3873b(this.f7731b);
            m5771a(cwg, this.f7738i);
            mo3865f();
            this.f7740k = true;
        }
    }

    /* renamed from: b */
    public final void mo3807b(cvw cvw) {
        TvInputManager tvInputManager;
        this.f7745s.remove(cvw);
        if (this.f7745s.isEmpty() && (tvInputManager = this.f7730a) != null) {
            tvInputManager.unregisterCallback(this.f7743q);
        }
    }
}

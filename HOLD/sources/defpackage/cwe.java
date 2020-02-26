package defpackage;

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

/* renamed from: cwe  reason: default package */
/* compiled from: PG */
public final class cwe implements cvl {
    public static /* synthetic */ int n;
    private static final String[] o = {"com.google.android.videos", "com.google.android.youtube.tv"};
    private static cwe p = null;
    public final TvInputManager a;
    public final Context b;
    public Map c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Map g = new LinkedHashMap();
    public Map h = new HashMap();
    public List i = new ArrayList();
    public Map j = new HashMap();
    public boolean k;
    public boolean l;
    public final cwd m = new cwd(this);
    private final cwc q = new cwc(this);
    private final cwf r;
    private final List s = new ArrayList(2);
    private AsyncTask t;
    private final cvy u = new cwb(this);

    public final Uri i(int i2) {
        return null;
    }

    public final String j(int i2) {
        return null;
    }

    public final void k(int i2) {
    }

    public final void l(int i2) {
    }

    private cwe(Context context) {
        dck a2 = dck.a(context);
        this.f = a2.d();
        this.e = a2.c();
        this.d = a2.b();
        this.b = context;
        this.r = new cwf(context);
        this.a = (TvInputManager) context.getSystemService("tv_input");
        dck.a(context).a(new cwa(this));
        h();
    }

    public final void a(TvInputInfo tvInputInfo) {
        int a2;
        TvInputInfo tvInputInfo2;
        try {
            int inputState = this.a.getInputState(tvInputInfo.getId());
            if (((cwg) this.j.get(tvInputInfo.getId())) == null) {
                cwg cwg = null;
                if (!(tvInputInfo.getParentId() == null || (tvInputInfo2 = this.a.getTvInputInfo(tvInputInfo.getParentId())) == null)) {
                    cwg cwg2 = (cwg) this.j.get(tvInputInfo2.getId());
                    if (cwg2 == null) {
                        cwg2 = new cwg(tvInputInfo2, (cwg) null, this.a.getInputState(tvInputInfo2.getId()));
                        cwg2.a(this.b);
                        this.j.put(tvInputInfo2.getId(), cwg2);
                    }
                    cwg = cwg2;
                    cwg.j++;
                }
                cwg cwg3 = new cwg(tvInputInfo, cwg, inputState);
                cwg3.a(this.b);
                this.j.put(tvInputInfo.getId(), cwg3);
                if (cwg3.c.isHidden(this.b)) {
                    return;
                }
                if (cwg == null || !cwg.c.isHidden(this.b)) {
                    a(cwg3, this.i);
                    cwg cwg4 = cwg3.b;
                    if (!(cwg4 == null || (a2 = a(cwg4.a)) == -1)) {
                        this.i.remove(a2);
                    }
                    f();
                }
            }
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(tvInputInfo.getId());
            Log.e("TifInputsManager", valueOf.length() == 0 ? new String("Failed to get state for Input, dropping entry. Id = ") : "Failed to get state for Input, dropping entry. Id = ".concat(valueOf));
        }
    }

    public final Drawable g(int i2) {
        cwg cwg = (cwg) this.i.get(i2);
        return cwg.a(this.b, cwg.g);
    }

    public final Uri h(int i2) {
        return ((cwg) this.i.get(i2)).e;
    }

    public final int a(String str) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            TvInputInfo tvInputInfo = ((cwg) this.i.get(i2)).c;
            if (tvInputInfo != null && TextUtils.equals(tvInputInfo.getId(), str)) {
                return i2;
            }
        }
        return -1;
    }

    public final String b(int i2) {
        return ((cwg) this.i.get(i2)).a;
    }

    public final int c(int i2) {
        cwg cwg = (cwg) this.i.get(i2);
        if (cwg.b()) {
            return cwg.g != 1 ? 0 : 1;
        }
        if (!cwg.c()) {
            return cwg.g;
        }
        return 2;
    }

    public final int d(int i2) {
        return ((cwg) this.i.get(i2)).d;
    }

    public static cwe a(Context context) {
        if (p == null) {
            p = new cwe(context.getApplicationContext());
        }
        return p;
    }

    public final int d() {
        return this.i.size();
    }

    public final String e(int i2) {
        return ((cwg) this.i.get(i2)).a();
    }

    public final String f(int i2) {
        return ((cwg) this.i.get(i2)).k;
    }

    private final void a(cwg cwg, List list) {
        int i2 = 0;
        while (i2 < list.size() && this.r.compare(cwg, (cwg) list.get(i2)) > 0) {
            i2++;
        }
        if (!list.contains(cwg)) {
            list.add(i2, cwg);
        }
    }

    static boolean a(PackageManager packageManager, TvInputInfo tvInputInfo) {
        if (Arrays.asList(o).contains(tvInputInfo.getServiceInfo().packageName) || tvInputInfo.createSetupIntent() == null) {
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
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        AsyncTask asyncTask = this.t;
        return asyncTask != null && asyncTask.getStatus() == AsyncTask.Status.RUNNING;
    }

    public final void a(int i2) {
        Intent intent;
        cwg cwg = (cwg) this.i.get(i2);
        if (cwg.c() && this.e) {
            String f2 = dck.a(this.b).f();
            if (!TextUtils.isEmpty(f2)) {
                Toast.makeText(this.b, f2, 0).show();
                return;
            }
            return;
        }
        try {
            TvInputInfo tvInputInfo = cwg.c;
            if (tvInputInfo == null) {
                int i3 = cwg.d;
                if (i3 == -7) {
                    intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
                } else if (i3 == -3) {
                    intent = new Intent("android.intent.action.VIEW", TvContract.Channels.CONTENT_URI);
                } else {
                    intent = null;
                }
            } else if (!tvInputInfo.isPassthroughInput()) {
                intent = new Intent("android.intent.action.VIEW", TvContract.buildChannelsUriForInput(cwg.c.getId()));
            } else {
                intent = new Intent("android.intent.action.VIEW", TvContract.buildChannelUriForPassthroughInput(cwg.c.getId()));
            }
            intent.addFlags(268435456);
            this.b.startActivity(intent);
        } catch (Throwable th) {
            Log.e("TifInputsManager", "Could not perform launch:", th);
            Toast.makeText(this.b, (int) R.string.failed_launch, 0).show();
        }
    }

    public final void b() {
        a();
    }

    public final void c() {
        if (!this.l) {
            a();
        }
    }

    public final void f() {
        List list = this.s;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((cvw) list.get(i2)).e();
        }
    }

    public final void a() {
        AsyncTask asyncTask = this.t;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.t = new cvz(this.a, this.b, this.u).execute(new Void[0]);
    }

    public final void a(cvw cvw) {
        TvInputManager tvInputManager;
        if (!this.s.contains(cvw)) {
            this.s.add(cvw);
            if (this.s.size() == 1 && (tvInputManager = this.a) != null) {
                tvInputManager.registerCallback(this.q, this.m);
            }
        }
    }

    public final void b(String str) {
        cwg cwg = (cwg) this.j.get(str);
        if (cwg != null) {
            Iterator it = this.j.entrySet().iterator();
            while (it.hasNext()) {
                cwg cwg2 = ((cwg) ((Map.Entry) it.next()).getValue()).b;
                if (cwg2 != null && TextUtils.equals(cwg2.a, cwg.a)) {
                    it.remove();
                }
            }
            boolean z = false;
            for (int size = this.i.size() - 1; size >= 0; size--) {
                cwg cwg3 = ((cwg) this.i.get(size)).b;
                if (cwg3 != null && TextUtils.equals(cwg3.a, str)) {
                    this.i.remove(size);
                    z = true;
                }
            }
            this.j.remove(str);
            int a2 = a(str);
            if (a2 != -1) {
                this.i.remove(a2);
                z = true;
            }
            cwg cwg4 = cwg.b;
            if (cwg4 != null) {
                int max = Math.max(0, cwg4.j - 1);
                cwg4.j = max;
                if (max == 0 && a(cwg4.a) == -1 && !cwg4.c.isHidden(this.b)) {
                    a(cwg4, this.i);
                    f();
                }
            }
            if (!z) {
                return;
            }
            f();
        }
    }

    public final void h() {
        this.c = cvm.a(dck.a(this.b).e.r);
    }

    public final void g() {
        if (!this.k) {
            String e2 = dck.a(this.b).e();
            if (TextUtils.isEmpty(e2)) {
                e2 = this.b.getResources().getString(R.string.input_title_bundled_tuner);
            }
            cwg cwg = new cwg("com.google.android.tvlauncher.input.bundled_tuner", e2, dck.a(this.b).g());
            cwg.a(this.b);
            cwg.b(this.b);
            a(cwg, this.i);
            f();
            this.k = true;
        }
    }

    public final void b(cvw cvw) {
        TvInputManager tvInputManager;
        this.s.remove(cvw);
        if (this.s.isEmpty() && (tvInputManager = this.a) != null) {
            tvInputManager.unregisterCallback(this.q);
        }
    }
}

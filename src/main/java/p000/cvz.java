package p000;

import android.content.Context;
import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cvz */
/* compiled from: PG */
final class cvz extends AsyncTask {

    /* renamed from: a */
    private final Map f7710a = new LinkedHashMap();

    /* renamed from: b */
    private final Map f7711b = new HashMap();

    /* renamed from: c */
    private final List f7712c = new ArrayList();

    /* renamed from: d */
    private final Map f7713d = new HashMap();

    /* renamed from: e */
    private boolean f7714e;

    /* renamed from: f */
    private final TvInputManager f7715f;

    /* renamed from: g */
    private final Context f7716g;

    /* renamed from: h */
    private final cvy f7717h;

    /* renamed from: i */
    private final cwf f7718i;

    public cvz(TvInputManager tvInputManager, Context context, cvy cvy) {
        this.f7715f = tvInputManager;
        this.f7716g = context;
        this.f7717h = cvy;
        this.f7718i = new cwf(this.f7716g);
    }

    /* renamed from: a */
    private final void m5768a(TvInputInfo tvInputInfo) {
        TvInputInfo tvInputInfo2;
        try {
            int inputState = this.f7715f.getInputState(tvInputInfo.getId());
            if (((cwg) this.f7713d.get(tvInputInfo.getId())) == null) {
                cwg cwg = null;
                if (!(tvInputInfo.getParentId() == null || (tvInputInfo2 = this.f7715f.getTvInputInfo(tvInputInfo.getParentId())) == null)) {
                    cwg cwg2 = (cwg) this.f7713d.get(tvInputInfo2.getId());
                    if (cwg2 == null) {
                        cwg2 = new cwg(tvInputInfo2, (cwg) null, this.f7715f.getInputState(tvInputInfo2.getId()));
                        cwg2.mo3872a(this.f7716g);
                        this.f7713d.put(tvInputInfo2.getId(), cwg2);
                    }
                    cwg = cwg2;
                    cwg.f7758j++;
                }
                cwg cwg3 = new cwg(tvInputInfo, cwg, inputState);
                cwg3.mo3872a(this.f7716g);
                this.f7713d.put(tvInputInfo.getId(), cwg3);
                if (cwg3.f7751c.isHidden(this.f7716g)) {
                    return;
                }
                if (cwg == null || !cwg.f7751c.isHidden(this.f7716g)) {
                    this.f7712c.add(cwg3);
                    if (cwg != null && cwg.f7751c.getParentId() == null && !this.f7712c.contains(cwg)) {
                        this.f7712c.add(cwg);
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(tvInputInfo.getId());
            Log.e("RefreshTifInputsTask", valueOf.length() == 0 ? new String("Failed to get state for Input, dropping entry. Id = ") : "Failed to get state for Input, dropping entry. Id = ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        TvInputManager tvInputManager;
        List<TvInputInfo> tvInputList;
        Void[] voidArr = (Void[]) objArr;
        if (isCancelled() || (tvInputManager = this.f7715f) == null || (tvInputList = tvInputManager.getTvInputList()) == null) {
            return null;
        }
        for (int i = 0; i < tvInputList.size() && !isCancelled(); i++) {
            TvInputInfo tvInputInfo = tvInputList.get(i);
            if (tvInputInfo != null) {
                if (tvInputInfo.isPassthroughInput()) {
                    m5768a(tvInputInfo);
                } else if (cwe.m5772a(this.f7716g.getPackageManager(), tvInputInfo)) {
                    this.f7710a.put(tvInputInfo.getId(), tvInputInfo);
                    if (cwe.m5770a(this.f7716g).f7733d) {
                        m5768a(tvInputInfo);
                    } else if (!tvInputInfo.isHidden(this.f7716g)) {
                        m5767a();
                    }
                } else {
                    this.f7711b.put(tvInputInfo.getId(), tvInputInfo);
                    if (!tvInputInfo.isHidden(this.f7716g)) {
                        m5767a();
                    }
                }
            }
        }
        this.f7712c.removeIf(cvx.f7709a);
        this.f7712c.sort(this.f7718i);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        cvy cvy = this.f7717h;
        if (cvy != null) {
            Map map = this.f7710a;
            Map map2 = this.f7711b;
            List list = this.f7712c;
            Map map3 = this.f7713d;
            boolean z = this.f7714e;
            cwb cwb = (cwb) cvy;
            cwe cwe = cwb.f7724a;
            cwe.f7736g = map;
            cwe.f7737h = map2;
            cwe.f7738i = list;
            cwe.f7739j = map3;
            cwe.f7740k = z;
            List list2 = cwe.f7738i;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                ((cwg) list2.get(i)).mo3873b(cwb.f7724a.f7731b);
            }
            cwb.f7724a.mo3865f();
            cwb.f7724a.f7741l = true;
        }
    }

    /* renamed from: a */
    private final void m5767a() {
        if (!this.f7714e) {
            String e = dck.m6123a(this.f7716g).mo4098e();
            if (TextUtils.isEmpty(e)) {
                e = this.f7716g.getResources().getString(R.string.input_title_bundled_tuner);
            }
            cwg cwg = new cwg("com.google.android.tvlauncher.input.bundled_tuner", e, dck.m6123a(this.f7716g).mo4100g());
            cwg.mo3872a(this.f7716g);
            this.f7712c.add(cwg);
            this.f7714e = true;
        }
    }
}

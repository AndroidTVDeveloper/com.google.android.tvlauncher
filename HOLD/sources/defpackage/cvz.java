package defpackage;

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

/* renamed from: cvz  reason: default package */
/* compiled from: PG */
final class cvz extends AsyncTask {
    private final Map a = new LinkedHashMap();
    private final Map b = new HashMap();
    private final List c = new ArrayList();
    private final Map d = new HashMap();
    private boolean e;
    private final TvInputManager f;
    private final Context g;
    private final cvy h;
    private final cwf i;

    public cvz(TvInputManager tvInputManager, Context context, cvy cvy) {
        this.f = tvInputManager;
        this.g = context;
        this.h = cvy;
        this.i = new cwf(this.g);
    }

    private final void a(TvInputInfo tvInputInfo) {
        TvInputInfo tvInputInfo2;
        try {
            int inputState = this.f.getInputState(tvInputInfo.getId());
            if (((cwg) this.d.get(tvInputInfo.getId())) == null) {
                cwg cwg = null;
                if (!(tvInputInfo.getParentId() == null || (tvInputInfo2 = this.f.getTvInputInfo(tvInputInfo.getParentId())) == null)) {
                    cwg cwg2 = (cwg) this.d.get(tvInputInfo2.getId());
                    if (cwg2 == null) {
                        cwg2 = new cwg(tvInputInfo2, (cwg) null, this.f.getInputState(tvInputInfo2.getId()));
                        cwg2.a(this.g);
                        this.d.put(tvInputInfo2.getId(), cwg2);
                    }
                    cwg = cwg2;
                    cwg.j++;
                }
                cwg cwg3 = new cwg(tvInputInfo, cwg, inputState);
                cwg3.a(this.g);
                this.d.put(tvInputInfo.getId(), cwg3);
                if (cwg3.c.isHidden(this.g)) {
                    return;
                }
                if (cwg == null || !cwg.c.isHidden(this.g)) {
                    this.c.add(cwg3);
                    if (cwg != null && cwg.c.getParentId() == null && !this.c.contains(cwg)) {
                        this.c.add(cwg);
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(tvInputInfo.getId());
            Log.e("RefreshTifInputsTask", valueOf.length() == 0 ? new String("Failed to get state for Input, dropping entry. Id = ") : "Failed to get state for Input, dropping entry. Id = ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        TvInputManager tvInputManager;
        List<TvInputInfo> tvInputList;
        Void[] voidArr = (Void[]) objArr;
        if (isCancelled() || (tvInputManager = this.f) == null || (tvInputList = tvInputManager.getTvInputList()) == null) {
            return null;
        }
        for (int i2 = 0; i2 < tvInputList.size() && !isCancelled(); i2++) {
            TvInputInfo tvInputInfo = tvInputList.get(i2);
            if (tvInputInfo != null) {
                if (tvInputInfo.isPassthroughInput()) {
                    a(tvInputInfo);
                } else if (cwe.a(this.g.getPackageManager(), tvInputInfo)) {
                    this.a.put(tvInputInfo.getId(), tvInputInfo);
                    if (cwe.a(this.g).d) {
                        a(tvInputInfo);
                    } else if (!tvInputInfo.isHidden(this.g)) {
                        a();
                    }
                } else {
                    this.b.put(tvInputInfo.getId(), tvInputInfo);
                    if (!tvInputInfo.isHidden(this.g)) {
                        a();
                    }
                }
            }
        }
        this.c.removeIf(cvx.a);
        this.c.sort(this.i);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        cvy cvy = this.h;
        if (cvy != null) {
            Map map = this.a;
            Map map2 = this.b;
            List list = this.c;
            Map map3 = this.d;
            boolean z = this.e;
            cwb cwb = (cwb) cvy;
            cwe cwe = cwb.a;
            cwe.g = map;
            cwe.h = map2;
            cwe.i = list;
            cwe.j = map3;
            cwe.k = z;
            List list2 = cwe.i;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((cwg) list2.get(i2)).b(cwb.a.b);
            }
            cwb.a.f();
            cwb.a.l = true;
        }
    }

    private final void a() {
        if (!this.e) {
            String e2 = dck.a(this.g).e();
            if (TextUtils.isEmpty(e2)) {
                e2 = this.g.getResources().getString(R.string.input_title_bundled_tuner);
            }
            cwg cwg = new cwg("com.google.android.tvlauncher.input.bundled_tuner", e2, dck.a(this.g).g());
            cwg.a(this.g);
            this.c.add(cwg);
            this.e = true;
        }
    }
}

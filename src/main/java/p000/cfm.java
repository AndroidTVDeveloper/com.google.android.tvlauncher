package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cfm */
/* compiled from: PG */
public final class cfm extends cfk implements cfp {

    /* renamed from: b */
    private final cfn f5407b;

    /* renamed from: c */
    private final cfo f5408c;

    /* renamed from: d */
    private cfs f5409d;

    /* renamed from: e */
    private List f5410e;

    /* renamed from: f */
    private Handler f5411f;

    public cfm(cfn cfn, cfo cfo) {
        this.f5407b = cfn;
        this.f5408c = cfo;
    }

    /* renamed from: a */
    public final void mo2715a() {
    }

    /* renamed from: b */
    public final void mo2719b() {
        cfs cfs = this.f5409d;
        if (cfs != null) {
            this.f5408c.mo2722a(cfs);
            cfn cfn = this.f5407b;
            cfs cfs2 = this.f5409d;
            cfn.mo2720a(cfs2.f5420c, cfs2.mo2726a());
            this.f5409d = null;
            this.f5410e = null;
        }
    }

    /* renamed from: a */
    public final void mo2716a(cfs cfs) {
        int length;
        if (cfs instanceof cft) {
            cft cft = (cft) cfs;
            cfs cfs2 = this.f5409d;
            if (cfs2 == null) {
                String str = cft.f5438h;
                Log.e("Clearcut-EventLogger", str.length() == 0 ? new String("Unexpected log parameter ") : "Unexpected log parameter ".concat(str));
                return;
            }
            int i = cfs2.f5420c;
            if (i != 0 && i == cft.f5420c) {
                String str2 = cft.f5438h;
                String[] strArr = cfs2.f5419b;
                for (String equals : strArr) {
                    if (equals.equals(str2)) {
                        cfs cfs3 = this.f5409d;
                        cfs3.mo2727b();
                        cfs3.f5424g.mo4366a((dje) cft.mo2726a());
                        this.f5410e.remove(str2);
                        if (this.f5410e.isEmpty()) {
                            mo2719b();
                            return;
                        }
                        return;
                    }
                }
                String str3 = cft.f5438h;
                Log.e("Clearcut-EventLogger", str3.length() == 0 ? new String("Unexpected log parameter ") : "Unexpected log parameter ".concat(str3));
                return;
            }
            int i2 = cft.f5420c;
            if (i2 == 0) {
                throw null;
            } else if (i != 0) {
                StringBuilder sb = new StringBuilder(78);
                sb.append("Parameters for a previous event. Event code: ");
                sb.append(i2);
                sb.append(", expected ");
                sb.append(i);
                Log.e("Clearcut-EventLogger", sb.toString());
            } else {
                throw null;
            }
        } else {
            mo2719b();
            String[] strArr2 = cfs.f5419b;
            if (strArr2 != null && (length = strArr2.length) != 0) {
                this.f5409d = cfs;
                ArrayList arrayList = new ArrayList(length);
                this.f5410e = arrayList;
                Collections.addAll(arrayList, strArr2);
                if (this.f5411f == null) {
                    this.f5411f = new cfl(this, Looper.getMainLooper());
                }
                this.f5411f.removeMessages(1);
                this.f5411f.sendEmptyMessageDelayed(1, 5000);
            } else if (!cfs.f5418a) {
                this.f5408c.mo2722a(cfs);
                this.f5407b.mo2720a(cfs.f5420c, cfs.mo2726a());
            } else {
                this.f5407b.mo2721b(cfs.f5420c, cfs.mo2726a());
            }
        }
    }

    /* renamed from: a */
    public final void mo2717a(boolean z) {
        cfn cfn = this.f5407b;
        cfn.f5413b = z;
        cfn.f5412a.edit().putBoolean("logging_enabled_by_user", z).apply();
    }
}

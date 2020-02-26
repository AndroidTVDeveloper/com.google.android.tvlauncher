package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cfm  reason: default package */
/* compiled from: PG */
public final class cfm extends cfk implements cfp {
    private final cfn b;
    private final cfo c;
    private cfs d;
    private List e;
    private Handler f;

    public cfm(cfn cfn, cfo cfo) {
        this.b = cfn;
        this.c = cfo;
    }

    public final void a() {
    }

    public final void b() {
        cfs cfs = this.d;
        if (cfs != null) {
            this.c.a(cfs);
            cfn cfn = this.b;
            cfs cfs2 = this.d;
            cfn.a(cfs2.c, cfs2.a());
            this.d = null;
            this.e = null;
        }
    }

    public final void a(cfs cfs) {
        int length;
        if (cfs instanceof cft) {
            cft cft = (cft) cfs;
            cfs cfs2 = this.d;
            if (cfs2 == null) {
                String str = cft.h;
                Log.e("Clearcut-EventLogger", str.length() == 0 ? new String("Unexpected log parameter ") : "Unexpected log parameter ".concat(str));
                return;
            }
            int i = cfs2.c;
            if (i != 0 && i == cft.c) {
                String str2 = cft.h;
                String[] strArr = cfs2.b;
                for (String equals : strArr) {
                    if (equals.equals(str2)) {
                        cfs cfs3 = this.d;
                        cfs3.b();
                        cfs3.g.a((dje) cft.a());
                        this.e.remove(str2);
                        if (this.e.isEmpty()) {
                            b();
                            return;
                        }
                        return;
                    }
                }
                String str3 = cft.h;
                Log.e("Clearcut-EventLogger", str3.length() == 0 ? new String("Unexpected log parameter ") : "Unexpected log parameter ".concat(str3));
                return;
            }
            int i2 = cft.c;
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
            b();
            String[] strArr2 = cfs.b;
            if (strArr2 != null && (length = strArr2.length) != 0) {
                this.d = cfs;
                ArrayList arrayList = new ArrayList(length);
                this.e = arrayList;
                Collections.addAll(arrayList, strArr2);
                if (this.f == null) {
                    this.f = new cfl(this, Looper.getMainLooper());
                }
                this.f.removeMessages(1);
                this.f.sendEmptyMessageDelayed(1, 5000);
            } else if (!cfs.a) {
                this.c.a(cfs);
                this.b.a(cfs.c, cfs.a());
            } else {
                this.b.b(cfs.c, cfs.a());
            }
        }
    }

    public final void a(boolean z) {
        cfn cfn = this.b;
        cfn.b = z;
        cfn.a.edit().putBoolean("logging_enabled_by_user", z).apply();
    }
}

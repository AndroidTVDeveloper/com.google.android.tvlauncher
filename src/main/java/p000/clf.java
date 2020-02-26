package p000;

import android.content.Context;
import com.google.android.tvlauncher.application.TvLauncherApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: clf */
/* compiled from: PG */
public final class clf implements cly {

    /* renamed from: a */
    public String f5897a;

    /* renamed from: b */
    public boolean f5898b;

    /* renamed from: c */
    public List f5899c;

    /* renamed from: d */
    public long f5900d;

    /* renamed from: e */
    private Set f5901e;

    /* renamed from: f */
    private cll f5902f;

    public clf() {
    }

    public clf(Context context) {
        cll a = ((TvLauncherApplication) context.getApplicationContext()).mo3214a();
        this.f5901e = new HashSet();
        this.f5900d = -1;
        this.f5902f = a;
    }

    /* renamed from: a */
    public final void mo3084a(long j) {
        long j2 = this.f5900d;
        ArrayList arrayList = new ArrayList();
        List list = this.f5899c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            clw clw = (clw) list.get(i);
            long j3 = clw.f5954b;
            if (j3 > j2 && j3 <= j) {
                arrayList.add(clw.f5953a);
            }
        }
        if (!arrayList.isEmpty()) {
            if (this.f5898b && !this.f5901e.isEmpty()) {
                cll cll = this.f5902f;
                Set set = this.f5901e;
                clr clr = cll.f5917b;
                synchronized (clr.f5926c) {
                    clr.f5927d.removeAll(set);
                }
                this.f5898b = false;
                this.f5901e.clear();
            }
            cll cll2 = this.f5902f;
            cll2.f5918c.mo3105a(new clj(cll2.f5917b, arrayList));
            this.f5900d = j;
            this.f5901e.addAll(arrayList);
        }
    }
}

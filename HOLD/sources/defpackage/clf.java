package defpackage;

import android.content.Context;
import com.google.android.tvlauncher.application.TvLauncherApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: clf  reason: default package */
/* compiled from: PG */
public final class clf implements cly {
    public String a;
    public boolean b;
    public List c;
    public long d;
    private Set e;
    private cll f;

    public clf() {
    }

    public clf(Context context) {
        cll a2 = ((TvLauncherApplication) context.getApplicationContext()).a();
        this.e = new HashSet();
        this.d = -1;
        this.f = a2;
    }

    public final void a(long j) {
        long j2 = this.d;
        ArrayList arrayList = new ArrayList();
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            clw clw = (clw) list.get(i);
            long j3 = clw.b;
            if (j3 > j2 && j3 <= j) {
                arrayList.add(clw.a);
            }
        }
        if (!arrayList.isEmpty()) {
            if (this.b && !this.e.isEmpty()) {
                cll cll = this.f;
                Set set = this.e;
                clr clr = cll.b;
                synchronized (clr.c) {
                    clr.d.removeAll(set);
                }
                this.b = false;
                this.e.clear();
            }
            cll cll2 = this.f;
            cll2.c.a(new clj(cll2.b, arrayList));
            this.d = j;
            this.e.addAll(arrayList);
        }
    }
}

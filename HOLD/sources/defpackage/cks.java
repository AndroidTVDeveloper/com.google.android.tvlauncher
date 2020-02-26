package defpackage;

import android.os.AsyncTask;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cks  reason: default package */
/* compiled from: PG */
final class cks extends AsyncTask {
    private final /* synthetic */ Set a;
    private final /* synthetic */ cla b;

    public cks(cla cla, Set set) {
        this.b = cla;
        this.a = set;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.b.a(this.a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Set set = (Set) obj;
        HashSet<Long> hashSet = new HashSet<>();
        boolean z = false;
        for (Long l : this.a) {
            cla cla = this.b;
            int i = cla.x;
            if (cla.j.containsKey(l)) {
                if (this.b.m.contains(l)) {
                    boolean contains = set.contains(l);
                    if (contains != this.b.l.contains(l)) {
                        if (!contains) {
                            this.b.l.remove(l);
                        } else {
                            this.b.l.add(l);
                        }
                        hashSet.add(l);
                    }
                } else if (set.contains(l)) {
                    this.b.k.add((cxt) this.b.j.get(l));
                    this.b.m.add(l);
                    this.b.l.add(l);
                    cjs cjs = this.b.w;
                    long longValue = l.longValue();
                    if (cjs.e || cjs.d.get(longValue) != null) {
                        z = true;
                    } else {
                        cjs.e = true;
                        z = true;
                    }
                }
            }
        }
        if (z || hashSet.size() > 0) {
            cla cla2 = this.b;
            int i2 = cla.x;
            cla2.a();
            if (z) {
                cla cla3 = this.b;
                cla3.w.a(cla3.k);
            }
            if (hashSet.size() > 0) {
                for (Long longValue2 : hashSet) {
                    Integer a2 = this.b.w.a(longValue2.longValue());
                    if (a2 != null) {
                        this.b.a(a2.intValue());
                    }
                }
            }
            if (z) {
                this.b.e();
            }
        }
    }
}

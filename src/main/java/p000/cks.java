package p000;

import android.os.AsyncTask;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cks */
/* compiled from: PG */
final class cks extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ Set f5829a;

    /* renamed from: b */
    private final /* synthetic */ cla f5830b;

    public cks(cla cla, Set set) {
        this.f5830b = cla;
        this.f5829a = set;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f5830b.mo3048a(this.f5829a);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Set set = (Set) obj;
        HashSet<Long> hashSet = new HashSet<>();
        boolean z = false;
        for (Long l : this.f5829a) {
            cla cla = this.f5830b;
            int i = cla.f5856x;
            if (cla.f5882j.containsKey(l)) {
                if (this.f5830b.f5885m.contains(l)) {
                    boolean contains = set.contains(l);
                    if (contains != this.f5830b.f5884l.contains(l)) {
                        if (!contains) {
                            this.f5830b.f5884l.remove(l);
                        } else {
                            this.f5830b.f5884l.add(l);
                        }
                        hashSet.add(l);
                    }
                } else if (set.contains(l)) {
                    this.f5830b.f5883k.add((cxt) this.f5830b.f5882j.get(l));
                    this.f5830b.f5885m.add(l);
                    this.f5830b.f5884l.add(l);
                    cjs cjs = this.f5830b.f5895w;
                    long longValue = l.longValue();
                    if (cjs.f5743e || cjs.f5742d.get(longValue) != null) {
                        z = true;
                    } else {
                        cjs.f5743e = true;
                        z = true;
                    }
                }
            }
        }
        if (z || hashSet.size() > 0) {
            cla cla2 = this.f5830b;
            int i2 = cla.f5856x;
            cla2.mo3049a();
            if (z) {
                cla cla3 = this.f5830b;
                cla3.f5895w.mo2927a(cla3.f5883k);
            }
            if (hashSet.size() > 0) {
                for (Long longValue2 : hashSet) {
                    Integer a = this.f5830b.f5895w.mo2924a(longValue2.longValue());
                    if (a != null) {
                        this.f5830b.mo3050a(a.intValue());
                    }
                }
            }
            if (z) {
                this.f5830b.mo3070e();
            }
        }
    }
}

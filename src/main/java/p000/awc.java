package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: awc */
/* compiled from: PG */
public abstract class awc implements awv {

    /* renamed from: a */
    public final HashSet f2537a = new HashSet(1);

    /* renamed from: b */
    public final axg f2538b = new axg();

    /* renamed from: c */
    private final ArrayList f2539c = new ArrayList(1);

    /* renamed from: d */
    private Looper f2540d;

    /* renamed from: e */
    private alh f2541e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1465a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1471a(bjf bjf);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1472b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo1474c();

    /* renamed from: a */
    public final void mo1467a(Handler handler, axh axh) {
        axg axg = this.f2538b;
        boolean z = false;
        if (!(handler == null || axh == null)) {
            z = true;
        }
        bks.m3510a(z);
        axg.f2610b.add(new axf(handler, axh));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final axg mo1464a(awt awt) {
        return this.f2538b.mo1516a(awt, 0);
    }

    /* renamed from: b */
    public final void mo1473b(awu awu) {
        boolean isEmpty = this.f2537a.isEmpty();
        this.f2537a.remove(awu);
        if ((!isEmpty) && this.f2537a.isEmpty()) {
            mo1472b();
        }
    }

    /* renamed from: a */
    public final void mo1468a(awu awu) {
        bks.m3507a(this.f2540d);
        boolean isEmpty = this.f2537a.isEmpty();
        this.f2537a.add(awu);
        if (isEmpty) {
            mo1465a();
        }
    }

    /* renamed from: a */
    public final void mo1469a(awu awu, bjf bjf) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f2540d;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        bks.m3510a(z);
        alh alh = this.f2541e;
        this.f2539c.add(awu);
        if (this.f2540d == null) {
            this.f2540d = myLooper;
            this.f2537a.add(awu);
            mo1471a(bjf);
        } else if (alh != null) {
            mo1468a(awu);
            awu.mo413a(this, alh);
        }
    }

    /* renamed from: a */
    public final void mo1466a(alh alh) {
        this.f2541e = alh;
        ArrayList arrayList = this.f2539c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((awu) arrayList.get(i)).mo413a(this, alh);
        }
    }

    /* renamed from: c */
    public final void mo1475c(awu awu) {
        this.f2539c.remove(awu);
        if (this.f2539c.isEmpty()) {
            this.f2540d = null;
            this.f2541e = null;
            this.f2537a.clear();
            mo1474c();
            return;
        }
        mo1473b(awu);
    }

    /* renamed from: a */
    public final void mo1470a(axh axh) {
        axg axg = this.f2538b;
        Iterator it = axg.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            if (axf.f2608b == axh) {
                axg.f2610b.remove(axf);
            }
        }
    }
}

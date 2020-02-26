package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: awc  reason: default package */
/* compiled from: PG */
public abstract class awc implements awv {
    public final HashSet a = new HashSet(1);
    public final axg b = new axg();
    private final ArrayList c = new ArrayList(1);
    private Looper d;
    private alh e;

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(bjf bjf);

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void a(Handler handler, axh axh) {
        axg axg = this.b;
        boolean z = false;
        if (!(handler == null || axh == null)) {
            z = true;
        }
        bks.a(z);
        axg.b.add(new axf(handler, axh));
    }

    /* access modifiers changed from: protected */
    public final axg a(awt awt) {
        return this.b.a(awt, 0);
    }

    public final void b(awu awu) {
        boolean isEmpty = this.a.isEmpty();
        this.a.remove(awu);
        if ((!isEmpty) && this.a.isEmpty()) {
            b();
        }
    }

    public final void a(awu awu) {
        bks.a(this.d);
        boolean isEmpty = this.a.isEmpty();
        this.a.add(awu);
        if (isEmpty) {
            a();
        }
    }

    public final void a(awu awu, bjf bjf) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.d;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        bks.a(z);
        alh alh = this.e;
        this.c.add(awu);
        if (this.d == null) {
            this.d = myLooper;
            this.a.add(awu);
            a(bjf);
        } else if (alh != null) {
            a(awu);
            awu.a(this, alh);
        }
    }

    public final void a(alh alh) {
        this.e = alh;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((awu) arrayList.get(i)).a(this, alh);
        }
    }

    public final void c(awu awu) {
        this.c.remove(awu);
        if (this.c.isEmpty()) {
            this.d = null;
            this.e = null;
            this.a.clear();
            c();
            return;
        }
        b(awu);
    }

    public final void a(axh axh) {
        axg axg = this.b;
        Iterator it = axg.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            if (axf.b == axh) {
                axg.b.remove(axf);
            }
        }
    }
}

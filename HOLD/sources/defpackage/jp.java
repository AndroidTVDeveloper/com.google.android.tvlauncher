package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: jp  reason: default package */
/* compiled from: PG */
public abstract class jp {
    public boolean a = false;
    private final jq b = new jq();

    public abstract int a();

    public int a(int i) {
        return 0;
    }

    public abstract km a(ViewGroup viewGroup, int i);

    public void a(RecyclerView recyclerView) {
    }

    public void a(km kmVar) {
    }

    public abstract void a(km kmVar, int i);

    public long b(int i) {
        return -1;
    }

    public void b(km kmVar) {
    }

    public void c() {
    }

    public void c(km kmVar) {
    }

    public final void O() {
        this.b.b();
    }

    public final void c(int i) {
        this.b.a(i, 1);
    }

    public final void a(int i, Object obj) {
        this.b.a(i, 1, obj);
    }

    public final void d(int i) {
        this.b.a(i);
    }

    public final void b(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void a(int i, int i2) {
        this.b.a(i, i2);
    }

    public final void a(int i, int i2, Object obj) {
        this.b.a(i, i2, obj);
    }

    public final void e(int i) {
        this.b.b(i);
    }

    public void a(km kmVar, int i, List list) {
        a(kmVar, i);
    }

    public final void a(aic aic) {
        this.b.registerObserver(aic);
    }

    public final void a(boolean z) {
        if (!this.b.a()) {
            this.a = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final void b(aic aic) {
        this.b.unregisterObserver(aic);
    }
}

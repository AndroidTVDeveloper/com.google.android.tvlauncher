package p000;

import android.database.Observable;

/* renamed from: jq */
/* compiled from: PG */
public final class C0262jq extends Observable {
    /* renamed from: a */
    public final boolean mo5318a() {
        return !this.mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void mo5319b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).mo310a();
        }
    }

    /* renamed from: b */
    public final void mo5321b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).mo312a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo5316a(int i, int i2) {
        mo5317a(i, i2, null);
    }

    /* renamed from: a */
    public final void mo5317a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).mo313a(i, i2, obj);
        }
    }

    /* renamed from: a */
    public final void mo5315a(int i) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).mo311a(i);
        }
    }

    /* renamed from: b */
    public final void mo5320b(int i) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).mo314b(i);
        }
    }
}

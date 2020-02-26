package defpackage;

import android.database.Observable;

/* renamed from: jq  reason: default package */
/* compiled from: PG */
public final class jq extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).a();
        }
    }

    public final void b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).a(i, i2);
        }
    }

    public final void a(int i, int i2) {
        a(i, i2, null);
    }

    public final void a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).a(i, i2, obj);
        }
    }

    public final void a(int i) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).a(i);
        }
    }

    public final void b(int i) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aic) this.mObservers.get(size)).b(i);
        }
    }
}

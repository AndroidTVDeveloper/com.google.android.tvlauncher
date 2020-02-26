package defpackage;

import android.database.ContentObserver;

/* renamed from: byh  reason: default package */
/* compiled from: PG */
final class byh extends ContentObserver {
    public byh() {
        super(null);
    }

    public final void onChange(boolean z) {
        byi.d.set(true);
    }
}

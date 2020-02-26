package defpackage;

import android.os.Bundle;

/* renamed from: lr  reason: default package */
/* compiled from: PG */
public class lr extends at implements m {
    public y a;

    public lr() {
        new o(this);
        bro.a();
        new lp(this);
        new blk((byte) 0);
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final hc a() {
        return null;
    }

    public final void onBackPressed() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        throw null;
    }

    public final Object onRetainNonConfigurationInstance() {
        lq lqVar;
        y yVar = this.a;
        if (yVar == null && (lqVar = (lq) getLastNonConfigurationInstance()) != null) {
            yVar = lqVar.a;
        }
        if (yVar == null) {
            return null;
        }
        lq lqVar2 = new lq();
        lqVar2.a = yVar;
        return lqVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        j jVar = j.DESTROYED;
        throw null;
    }
}

package p000;

import android.os.Bundle;

/* renamed from: lr */
/* compiled from: PG */
public class C0317lr extends C0021at implements C0326m {

    /* renamed from: a */
    public C0650y f9865a;

    public C0317lr() {
        new C0380o(this);
        bro.m4076a();
        new C0315lp(this);
        new blk((byte) 0);
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: a */
    public final C0194hc mo61a() {
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
        C0316lq lqVar;
        C0650y yVar = this.f9865a;
        if (yVar == null && (lqVar = (C0316lq) getLastNonConfigurationInstance()) != null) {
            yVar = lqVar.f9864a;
        }
        if (yVar == null) {
            return null;
        }
        C0316lq lqVar2 = new C0316lq();
        lqVar2.f9864a = yVar;
        return lqVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0245j jVar = C0245j.DESTROYED;
        throw null;
    }
}

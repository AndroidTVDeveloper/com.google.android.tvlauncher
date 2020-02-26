package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: at */
/* compiled from: PG */
public class C0021at extends Activity implements C0326m, C0094dk {
    public C0021at() {
        new C0087dd();
        new C0380o(this);
    }

    /* renamed from: a */
    public C0194hc mo61a() {
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0095dl.m6944a(decorView, keyEvent)) {
            return C0095dl.m6945a(this, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0095dl.m6944a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0542u(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0245j jVar = C0245j.DESTROYED;
        throw null;
    }

    /* renamed from: a */
    public final boolean mo1311a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}

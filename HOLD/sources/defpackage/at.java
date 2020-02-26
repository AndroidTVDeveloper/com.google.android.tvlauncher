package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: at  reason: default package */
/* compiled from: PG */
public class at extends Activity implements m, dk {
    public at() {
        new dd();
        new o(this);
    }

    public hc a() {
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !dl.a(decorView, keyEvent)) {
            return dl.a(this, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !dl.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new u(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        j jVar = j.DESTROYED;
        throw null;
    }

    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}

package defpackage;

import android.app.Fragment;
import com.google.android.tvlauncher.appsview.AppsViewActivity;

/* renamed from: cgm  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cgm implements Runnable {
    private final AppsViewActivity a;
    private final Fragment b;

    public cgm(AppsViewActivity appsViewActivity, Fragment fragment) {
        this.a = appsViewActivity;
        this.b = fragment;
    }

    public final void run() {
        AppsViewActivity appsViewActivity = this.a;
        appsViewActivity.getFragmentManager().beginTransaction().remove(this.b).commitNow();
    }
}

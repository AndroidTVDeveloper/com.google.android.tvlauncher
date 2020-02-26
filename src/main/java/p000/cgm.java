package p000;

import android.app.Fragment;
import com.google.android.tvlauncher.appsview.AppsViewActivity;

/* renamed from: cgm */
/* compiled from: PG */
public final /* synthetic */ class cgm implements Runnable {

    /* renamed from: a */
    private final AppsViewActivity f5471a;

    /* renamed from: b */
    private final Fragment f5472b;

    public cgm(AppsViewActivity appsViewActivity, Fragment fragment) {
        this.f5471a = appsViewActivity;
        this.f5472b = fragment;
    }

    public final void run() {
        AppsViewActivity appsViewActivity = this.f5471a;
        appsViewActivity.getFragmentManager().beginTransaction().remove(this.f5472b).commitNow();
    }
}

package p000;

import android.os.AsyncTask;
import com.google.android.tvlauncher.MainActivity;

/* renamed from: cfe */
/* compiled from: PG */
public final /* synthetic */ class cfe implements Runnable {

    /* renamed from: a */
    private final MainActivity f5397a;

    public cfe(MainActivity mainActivity) {
        this.f5397a = mainActivity;
    }

    public final void run() {
        new ctc(ctd.m5668a(this.f5397a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}

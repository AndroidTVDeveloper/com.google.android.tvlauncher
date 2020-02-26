package defpackage;

import android.os.AsyncTask;
import com.google.android.tvlauncher.MainActivity;

/* renamed from: cfe  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cfe implements Runnable {
    private final MainActivity a;

    public cfe(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void run() {
        new ctc(ctd.a(this.a)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}

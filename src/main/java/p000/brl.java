package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: brl */
/* compiled from: PG */
public final class brl extends BroadcastReceiver {

    /* renamed from: a */
    public Context f4703a;

    /* renamed from: b */
    private final brk f4704b;

    public brl(brk brk) {
        this.f4704b = brk;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f4704b.mo2357a();
            mo2358a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2358a() {
        Context context = this.f4703a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f4703a = null;
    }
}

package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ccs */
/* compiled from: PG */
public final class ccs extends BroadcastReceiver {

    /* renamed from: a */
    public final cck f5284a;

    /* renamed from: b */
    public final dff f5285b;

    /* renamed from: c */
    private final dff f5286c;

    public ccs(cck cck, dff dff, dff dff2) {
        this.f5284a = cck;
        this.f5285b = dff;
        this.f5286c = dff2;
    }

    public final void onReceive(Context context, Intent intent) {
        dff dff;
        dhe dhe;
        bog.m3832a("PrimesShutdown", "BroadcastReceiver: action = %s", intent.getAction());
        if (this.f5284a.f5274a) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && (dff = this.f5286c) != null && (dhe = (dhe) dff.mo2551a()) != null) {
            dhe.mo2629a(new ccr(this));
        }
    }
}

package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: ccs  reason: default package */
/* compiled from: PG */
public final class ccs extends BroadcastReceiver {
    public final cck a;
    public final dff b;
    private final dff c;

    public ccs(cck cck, dff dff, dff dff2) {
        this.a = cck;
        this.b = dff;
        this.c = dff2;
    }

    public final void onReceive(Context context, Intent intent) {
        dff dff;
        dhe dhe;
        bog.a("PrimesShutdown", "BroadcastReceiver: action = %s", intent.getAction());
        if (this.a.a) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && (dff = this.c) != null && (dhe = (dhe) dff.a()) != null) {
            dhe.a(new ccr(this));
        }
    }
}

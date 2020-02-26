package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aff  reason: default package */
/* compiled from: PG */
final class aff extends BroadcastReceiver {
    private final /* synthetic */ afg a;

    public aff(afg afg) {
        this.a = afg;
    }

    public final void onReceive(Context context, Intent intent) {
        afg afg = this.a;
        boolean z = afg.b;
        afg.b = afg.a(context);
        afg afg2 = this.a;
        boolean z2 = afg2.b;
        if (z != z2) {
            afc afc = afg2.a;
            if (z2) {
                synchronized (((sw) afc).b) {
                    afs afs = ((sw) afc).a;
                    for (agm agm : aie.a(afs.a)) {
                        if (!agm.e() && !agm.f()) {
                            agm.b();
                            if (afs.c) {
                                afs.b.add(agm);
                            } else {
                                agm.a();
                            }
                        }
                    }
                }
            }
        }
    }
}

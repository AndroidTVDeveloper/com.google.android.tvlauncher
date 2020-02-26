package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aff */
/* compiled from: PG */
final class aff extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ afg f229a;

    public aff(afg afg) {
        this.f229a = afg;
    }

    public final void onReceive(Context context, Intent intent) {
        afg afg = this.f229a;
        boolean z = afg.f231b;
        afg.f231b = afg.m289a(context);
        afg afg2 = this.f229a;
        boolean z2 = afg2.f231b;
        if (z != z2) {
            afc afc = afg2.f230a;
            if (z2) {
                synchronized (((C0511sw) afc).f10421b) {
                    afs afs = ((C0511sw) afc).f10420a;
                    for (agm agm : aie.m557a(afs.f248a)) {
                        if (!agm.mo224e() && !agm.mo226f()) {
                            agm.mo217b();
                            if (afs.f250c) {
                                afs.f249b.add(agm);
                            } else {
                                agm.mo215a();
                            }
                        }
                    }
                }
            }
        }
    }
}

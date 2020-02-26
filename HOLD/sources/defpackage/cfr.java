package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;

/* renamed from: cfr  reason: default package */
/* compiled from: PG */
public final class cfr implements cfp {
    private final Fragment a;

    public cfr(Fragment fragment) {
        this.a = fragment;
    }

    public final void a(cfs cfs) {
        Activity activity = this.a.getActivity();
        if (activity == null) {
            String valueOf = String.valueOf(cfs);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
            sb.append("Cannot log fragment event: not attached to activity. Event: ");
            sb.append(valueOf);
            Log.e("EventLogger", sb.toString());
        } else if (!(activity instanceof cfq)) {
            String valueOf2 = String.valueOf(cfs);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 74);
            sb2.append("Cannot log fragment event: activity is not an EventLoggerProvider. Event: ");
            sb2.append(valueOf2);
            Log.e("EventLogger", sb2.toString());
        } else {
            ((cfq) activity).b().a(cfs);
        }
    }
}

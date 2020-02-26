package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: bye  reason: default package */
/* compiled from: PG */
final class bye extends bxw {
    private bye() {
    }

    public /* synthetic */ bye(byte b) {
    }

    public final void a(Status status) {
        if (!status.b()) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("disconnect(): Could not unregister listener: status=");
            sb.append(valueOf);
            Log.e("UsageReportingClientImp", sb.toString());
        }
    }
}

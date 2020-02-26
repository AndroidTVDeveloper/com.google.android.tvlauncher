package defpackage;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import androidx.preference.Preference;
import java.lang.ref.WeakReference;

/* renamed from: cvu  reason: default package */
/* compiled from: PG */
final class cvu extends Handler {
    private final WeakReference a;

    public /* synthetic */ cvu(cvv cvv) {
        this.a = new WeakReference(cvv);
    }

    public final void handleMessage(Message message) {
        Preference c;
        RecyclerView recyclerView;
        cvv cvv = (cvv) this.a.get();
        if (cvv != null) {
            int i = message.what;
            if (i != 2) {
                if (i == 3 && (recyclerView = cvv.c) != null) {
                    recyclerView.d(Integer.valueOf(cvv.i).intValue());
                }
            } else if (cvv.b() != null && (c = cvv.b().c((CharSequence) cvv.i)) != null) {
                c.l();
            }
        }
    }
}

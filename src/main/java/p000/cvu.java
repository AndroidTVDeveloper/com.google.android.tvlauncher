package p000;

import android.os.Handler;
import android.os.Message;
import android.support.p002v7.widget.RecyclerView;
import androidx.preference.Preference;
import java.lang.ref.WeakReference;

/* renamed from: cvu */
/* compiled from: PG */
final class cvu extends Handler {

    /* renamed from: a */
    private final WeakReference f7699a;

    public /* synthetic */ cvu(cvv cvv) {
        this.f7699a = new WeakReference(cvv);
    }

    public final void handleMessage(Message message) {
        Preference c;
        RecyclerView recyclerView;
        cvv cvv = (cvv) this.f7699a.get();
        if (cvv != null) {
            int i = message.what;
            if (i != 2) {
                if (i == 3 && (recyclerView = cvv.f10225c) != null) {
                    recyclerView.mo860d(Integer.valueOf(cvv.f7701i).intValue());
                }
            } else if (cvv.mo5793b() != null && (c = cvv.mo5793b().mo1119c((CharSequence) cvv.f7701i)) != null) {
                c.mo1109l();
            }
        }
    }
}

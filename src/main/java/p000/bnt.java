package p000;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: bnt */
/* compiled from: PG */
final class bnt extends bvm {

    /* renamed from: a */
    private final Context f4491a;

    /* renamed from: b */
    private final /* synthetic */ bnu f4492b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnt(bnu bnu, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f4492b = bnu;
        this.f4491a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int a = this.f4492b.mo2213a(this.f4491a);
        if (bof.m3825b(a)) {
            bnu bnu = this.f4492b;
            Context context = this.f4491a;
            bnu.mo2212a(context, a, bnu.mo2216b(context, a, "n"));
        }
    }
}

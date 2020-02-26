package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: bnt  reason: default package */
/* compiled from: PG */
final class bnt extends bvm {
    private final Context a;
    private final /* synthetic */ bnu b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnt(bnu bnu, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = bnu;
        this.a = context.getApplicationContext();
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
        int a2 = this.b.a(this.a);
        if (bof.b(a2)) {
            bnu bnu = this.b;
            Context context = this.a;
            bnu.a(context, a2, bnu.b(context, a2, "n"));
        }
    }
}

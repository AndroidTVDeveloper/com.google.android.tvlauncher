package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: ciz  reason: default package */
/* compiled from: PG */
public final class ciz extends AsyncTask {
    private ciz() {
    }

    public /* synthetic */ ciz(byte b) {
    }

    public static final void a(Context context) {
        cja a = dbq.a(context);
        a.a();
        if (!a.c) {
            a.a(new ciy(a));
            a.e();
            return;
        }
        a.i();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = ((Context[]) objArr)[0];
        dck a = dck.a(context);
        if (!a.a()) {
            a.a(new cix(a, context));
            return null;
        }
        a(context);
        return null;
    }
}

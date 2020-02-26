package p000;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: ciz */
/* compiled from: PG */
public final class ciz extends AsyncTask {
    private ciz() {
    }

    public /* synthetic */ ciz(byte b) {
    }

    /* renamed from: a */
    public static final void m4843a(Context context) {
        cja a = dbq.m6093a(context);
        a.mo2883a();
        if (!a.f5681c) {
            a.mo2886a(new ciy(a));
            a.mo2897e();
            return;
        }
        a.mo2903i();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = ((Context[]) objArr)[0];
        dck a = dck.m6123a(context);
        if (!a.mo4092a()) {
            a.mo4091a(new cix(a, context));
            return null;
        }
        m4843a(context);
        return null;
    }
}

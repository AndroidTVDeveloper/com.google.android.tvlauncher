package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: akr */
/* compiled from: PG */
public /* synthetic */ class akr {
    public akr() {
    }

    /* renamed from: a */
    public void mo464a(Canvas canvas, RecyclerView recyclerView) {
        throw null;
    }

    /* renamed from: a */
    public void mo465a(Rect rect, View view, RecyclerView recyclerView) {
        ((C0270jy) view.getLayoutParams()).mo5388c();
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: a */
    public static void m788a(View view, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        view.setTooltipText(charSequence);
    }

    public akr(Context context, Handler handler) {
        context.getApplicationContext();
        new air(handler);
    }

    /* renamed from: a */
    public static void m787a(aks aks, alh alh) {
        if (alh.mo524a() == 1) {
            Object obj = alh.mo548a(0, new alg()).f673b;
        }
        aks.mo468b();
    }
}

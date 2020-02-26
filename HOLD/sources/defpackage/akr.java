package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: akr  reason: default package */
/* compiled from: PG */
public /* synthetic */ class akr {
    public akr() {
    }

    public void a(Canvas canvas, RecyclerView recyclerView) {
        throw null;
    }

    public void a(Rect rect, View view, RecyclerView recyclerView) {
        ((jy) view.getLayoutParams()).c();
        rect.set(0, 0, 0, 0);
    }

    public static void a(View view, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        view.setTooltipText(charSequence);
    }

    public akr(Context context, Handler handler) {
        context.getApplicationContext();
        new air(handler);
    }

    public static void a(aks aks, alh alh) {
        if (alh.a() == 1) {
            Object obj = alh.a(0, new alg()).b;
        }
        aks.b();
    }
}

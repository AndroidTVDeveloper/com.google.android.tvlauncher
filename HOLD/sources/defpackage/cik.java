package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.StoreRowButtonView;

/* renamed from: cik  reason: default package */
/* compiled from: PG */
public final class cik extends ViewOutlineProvider {
    private final /* synthetic */ StoreRowButtonView a;

    public cik(StoreRowButtonView storeRowButtonView) {
        this.a = storeRowButtonView;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, this.a.getWidth(), this.a.getHeight(), (float) this.a.b);
    }
}
